import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;

/**
 * A GUI for the MelodyMaker project (was previously console-based)
 *
 * @author Andrew Sen, Liberty student 2019
 *
 * parts of GUI code borrowed from the MazeSolver project
 * very minor modificaitons by Mr. Bunn
 */
public class MelodyMainGUI extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 6228378229836664288L; //not using

    // Fields for internal data representation
    private Melody  melody;
    private Melody  melodyCopy;
    private double  currTempo;

    // Fields for GUI interface
    private JTextField fileName;
    private JTextField tempo;
    private JLabel     duration;
    private JTextArea  printDisplay;
    private JButton    loadButton;
    private JButton    playButton;
    private JButton    stopButton;
    private JButton    reverseButton;
    private JButton    saveButton;
    private JButton    printButton;
    private JButton    appendButton;
    private JButton    clearButton;
    private JButton    resetButton;

    // thread to handle playing/pausing/stopping the music
    private Thread musicThread;

    private MelodyMainGUI()
    {
        // Set up the frame
        super("Melody Maker");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Field for the maze file name
        fileName = new JTextField(10);
        fileName.setEditable(false);
        fileName.setText("<no song loaded>");

        // Glue text and input together
        JPanel filenamePanel = new JPanel(new BorderLayout());
        filenamePanel.add(new JLabel("File: "), "West");
        filenamePanel.add(fileName, "Center");

        // Field for the tempo
        tempo = new JTextField(5);
        tempo.setEditable(true);
        tempo.setText("1.0");

        JPanel tempoPanel1 = new JPanel(new GridLayout(1, 3));
        tempoPanel1.add(new JLabel("Tempo: "), "West");
        tempoPanel1.add(tempo, "West");
        tempo.setToolTipText("0.5 makes half as long, 2.0 makes twice as long");

        JPanel tempoPanel = new JPanel(new GridLayout(1, 3));
        tempoPanel.add(tempoPanel1);

        // this "pushes" tempoPanel1 leftwards, so it looks a little nicer
        tempoPanel.add(new JPanel(new GridLayout(1, 2))); tempoPanel.add(new JPanel(new GridLayout(1, 2)));

        // Create the buttons
        loadButton     = new JButton("load");
        playButton     = new JButton("play");
        stopButton     = new JButton("stop");
        reverseButton  = new JButton("reverse");
        printButton    = new JButton("print"); printButton.setToolTipText("Print the contents of the melody to the output pane below");
        appendButton   = new JButton("append");
        saveButton     = new JButton("save");
        clearButton    = new JButton("clear"); clearButton.setToolTipText("Clear the output pane below");
        resetButton    = new JButton("reset");

        this.setInitialButtonEnabledState(); // enable/disable buttons as needed to begin

        // places to put all the top menu items
        JPanel buttons1  = new JPanel(new GridLayout(1, 3)); // top row of buttons
        JPanel buttons2  = new JPanel(new GridLayout(1, 3)); // middle row of buttons
        JPanel buttons3  = new JPanel(new GridLayout(1, 3)); // bottom row of buttons
        JPanel buttonBar = new JPanel(new GridLayout(3, 2)); // combined layout of buttons

        // load up the buttons in L to R order
        buttons1.add(loadButton);
        buttons1.add(saveButton);
        buttons1.add(resetButton);

        buttons2.add(playButton);
        buttons2.add(stopButton);
        buttons2.add(reverseButton);

        buttons3.add(appendButton);
        buttons3.add(printButton);
        buttons3.add(clearButton);

        // Glue the components together row by row
        buttonBar.add(filenamePanel);  // top left
        buttonBar.add(buttons1);       // top right
        buttonBar.add(tempoPanel);     // mid left
        buttonBar.add(buttons2);       // mid right
        duration = new JLabel("Duration: ");
        buttonBar.add(duration);       // bottom left
        buttonBar.add(buttons3);       // bottom right

        // add padding from edges
        buttonBar.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));

        //set up area where the melody is printed
        printDisplay = new JTextArea(20, 30);
        printDisplay.setToolTipText("Print the melody to the pane below");
        printDisplay.setEditable(false);
        printDisplay.setLineWrap(true);

        JPanel pane = new JPanel(new BorderLayout());
        pane.setBorder(BorderFactory.createEmptyBorder(
                10,   //top
                10,   //left
                10,   //bottom
                10)); //right
        pane.add(new JScrollPane(printDisplay), "South");


        // Create the overall layout (buttons on top, maze info below)
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(buttonBar,"North");
        panel.add(pane);

        // add to the frame
        this.getContentPane().add(panel);

        // shrink wrap and display
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null); //center on screen
        this.setVisible(true);

        this.addButtonListeners(); //register all the listeners

        // Set up the class variables
        currTempo = 1.0;
    }

    /** set the enabled/disabled properties of all the buttons upon load */
    private void setInitialButtonEnabledState()
    {
    	loadButton.setEnabled(true);
        playButton.setEnabled(false);
        stopButton.setEnabled(false);
        reverseButton.setEnabled(false);
        stopButton.setEnabled(false);
        appendButton.setEnabled(false);
        printButton.setEnabled(false);
        tempo.setEnabled(false);
        saveButton.setEnabled(false);
        clearButton.setEnabled(true);
        resetButton.setEnabled(true);
    }

    /** register the button listeners */
    private void addButtonListeners()
    {
        loadButton.addActionListener(this);
        playButton.addActionListener(this);
        reverseButton.addActionListener(this);
        stopButton.addActionListener(this);
        appendButton.addActionListener(this);
        printButton.addActionListener(this);
        tempo.addActionListener(this);
        saveButton.addActionListener(this);
        clearButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    /**
     * Collection of handlers to deal with GUI events.
     *
     * (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == loadButton)
            loadFile();

        if (e.getSource() == playButton) {
        	// playButton does a different action depending on state of musicThread, signified by playButton's text:

        	// if musicThread is not running, doPlay() will be called
        	if (playButton.getText().equalsIgnoreCase("play"))
        		doPlay();

        	// if musicThread is running, doPause() will be called
        	else if (playButton.getText().equalsIgnoreCase("pause"))
        		doPause();

        	// if musicThread is paused, doResume() will be called
        	else if (playButton.getText().equalsIgnoreCase("resume"))
        		doResume();
        }

        if (e.getSource() == stopButton)
            doStop();

        if (e.getSource() == tempo)
        	changeTempo();

        if (e.getSource() == reverseButton)
            doReverse();

        if (e.getSource() == appendButton)
        	appendSong();

        if (e.getSource() == printButton)
        	printSong();

        if (e.getSource() == saveButton)
        	doSave();

        if (e.getSource() == clearButton)
        	doClear();

        if (e.getSource() == resetButton)
        	reset();
    }

    /**
     *  plays the melody
     *  initializes a separate thread to contain the actual playing process
     */
    private void doPlay()
    {
    	this.loadButton.setEnabled(false);
        this.stopButton.setEnabled(true);
        this.appendButton.setEnabled(false);
        this.reverseButton.setEnabled(false);
        this.tempo.setEnabled(false);
        this.saveButton.setEnabled(false);
        this.resetButton.setEnabled(false);

        // creates a copy of melody so that melody can be reset to its original state if musicThread.stop() is called
        melodyCopy = copyMelody(melody);

        // initialize and start musicThread to contain melody.play() process
        musicThread = new Thread() {
        	@Override
        	public void run() {
        		melody.play();

        		// reset buttons to ready state if/when melody.play() finishes
        		loadButton.setEnabled(true);
                stopButton.setEnabled(false);
                appendButton.setEnabled(true);
                reverseButton.setEnabled(true);
                tempo.setEnabled(true);
                saveButton.setEnabled(true);
                resetButton.setEnabled(true);
                melodyCopy = null;
                playButton.setText("play");
        	}
        };
        musicThread.start();
        playButton.setText("pause");
    }

    @SuppressWarnings("deprecation")
    /** pauses the melody */
	private void doPause() {
    	musicThread.suspend();
    	playButton.setText("resume");
    }

    @SuppressWarnings("deprecation")
    /** Resumes the melody */
	private void doResume() {
    	musicThread.resume();
    	playButton.setText("pause");
    }

	@SuppressWarnings("deprecation")
	/**
	 * stops the melody
	 * resets melody, StdAudio, and buttons back to a ready state
	 */
	private void doStop()
    {
    	musicThread.stop();

    	// reinitializes all of StdAudio's fields
    	StdAudio.init();

    	//reset melody
    	melody = melodyCopy;
    	melodyCopy = null;

    	// resets buttons to ready state
    	loadButton.setEnabled(true);
    	playButton.setEnabled(true);
        stopButton.setEnabled(false);
        appendButton.setEnabled(true);
        reverseButton.setEnabled(true);
        tempo.setEnabled(true);
        saveButton.setEnabled(true);
        resetButton.setEnabled(true);
        playButton.setText("play");
    }

	/** changes tempo according to user input */
    private void changeTempo()
    {
    	// get new tempo
    	Scanner input = new Scanner(tempo.getText());
    	Double inTempo = null;
    	if (input.hasNextDouble())
    		inTempo = input.nextDouble();

    	// ingore bad user input
    	if (inTempo == null || inTempo <= 0)
    		tempo.setText(currTempo+"");

    	else{
    		// inputs new tempo proportional to the old tempo
    		// the new duration will always be proportional to the original duration
    		// makes it such that if 1.0 is entered, the new duration will be the original duration
    		double newTempo = currTempo / inTempo;
    		this.melody.changeTempo(newTempo);

    		currTempo = inTempo;
    		duration.setText("Duration: "+this.melody.getTotalDuration()+" seconds");
    	}
    	input.close();
    }

    /** reverses the melody with call to melody.reverse() */
    private void doReverse()
    {
        //flip text so user knows if they have reversed once already
        if (this.reverseButton.getText().equals("reverse"))
            this.reverseButton.setText("re-reverse");
        else
            this.reverseButton.setText("reverse");

        this.melody.reverse();
    }

    /** allows user to pick a melody to append */
    private void appendSong()
    {
    	// Let the user pick from a filtered list of files
        JFileChooser chooser = new JFileChooser(new File(".")); //use current working directory as starting location

        chooser.setDialogTitle("Append a song");

        chooser.setFileFilter(new FileFilter() { //control what files will be "acceptable"
            @Override
            public boolean accept(File f) {
                if (f.isDirectory())
                    return true;


                if (f.getName().endsWith(".txt"))
                    return true;

                return false;
            }

            @Override
            public String getDescription() {
                return "Song files";
            }
        });

        File   newFile     = null;
        String newFileName = null;

        int returnVal = chooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            newFile     = chooser.getSelectedFile();
            newFileName = newFile.getName();
        }
        else
            return; // if they didn't pick a file, cancel the rest of the update

        Scanner input = null;

        // Try to load it
        try {
            input = new Scanner(newFile);
            this.melody.append(new Melody(read(input)));
            duration.setText("Duration: "+this.melody.getTotalDuration()+" seconds");
            tempo.setText("1.0");
            currTempo = 1.0;
            reverseButton.setText("reverse");
        }
        catch (FileNotFoundException e) {
            System.out.println("Can't find file: " + newFileName);
            //e.printStackTrace();
        }
    }

    /** prints the melody */
    private void printSong()
    {
    	String str = "";
    	Melody temp;
    	if (melodyCopy != null)
    		temp = copyMelody(melodyCopy);
    	else
    		temp = copyMelody(melody);
    	for (Note n : temp.getNotes())
    		str += n.toString() + "\n";
    	printDisplay.setText(printDisplay.getText()+str+"\n");
    }

    /** returns a string of the melody */
    private String melodyString() {
    	String str = "";
    	Melody temp = copyMelody(melody);
    	Queue<Note> notes = temp.getNotes();
    	while (!notes.isEmpty()) {
    		str += notes.poll().toString() + "\n";
    	}
    	return str;
    }

    /** allows user to save the current melody, including all changes applied to it */
    private void doSave()
    {
    	JFileChooser saver = new JFileChooser(new File("."));
    	saver.setDialogTitle("Save song as .txt file");

    	File newFile;
    	String newFileDir;
    	String newFileName;

    	// being up save dialog and save file
    	int returnVal = saver.showSaveDialog(this);

    	if (returnVal == JFileChooser.APPROVE_OPTION) {
    		newFile = saver.getSelectedFile();
    		newFileDir = newFile.toString();

    		// adds ".txt" file extension if not already there
    		if (!newFileDir.endsWith(".txt")) {
    			File newFile2 = new File(newFileDir + ".txt");
    			try {
    				Files.move(newFile.toPath(), newFile2.toPath(), StandardCopyOption.REPLACE_EXISTING);
    			}
    			catch (IOException e) {
    				//e.printStackTrace();
    			}
    			newFile = newFile2;
    		}

    		newFileName = newFile.getName();
    	}

    	// returns if no file was saved
    	else
    		return;

    	// writes the melody to the new file
    	try {
    		BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
    		writer.write(melodyString());
    		writer.close();
    		loadFile(newFile);
    	}
    	catch(IOException e) {
    		System.out.println("Can't find file: " + newFileName);
    		//e.printStackTrace();
    	}
    }

    /** clears the display of all text */
    private void doClear()
    {
    	printDisplay.setText("");
    }

    /**
     * Set everything back to the ready state.  Called by the "reset" button
     */
    private void reset()
    {
        setInitialButtonEnabledState();
        fileName.setText("<no song loaded>");
        reverseButton.setText("reverse");
        tempo.setText("1.0");
        currTempo = 1.0;
        duration.setText("Duration: ");
        printDisplay.setText("");
    }

    /** allows user to pick a file to load */
    private void loadFile()
    {
        // Let the user pick from a filtered list of files
        JFileChooser chooser = new JFileChooser(new File(".")); //use current working directory as starting location

        chooser.setFileFilter(new FileFilter() { //control what files will be "acceptable"
            @Override
            public boolean accept(File f) {
                if (f.isDirectory())
                    return true;

                if (f.getName().endsWith(".txt"))
                    return true;

                return false;
            }

            @Override
            public String getDescription() {
                return "Song files";
            }
        });

        File   newFile     = null;
        String newFileName = null;

        int returnVal = chooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            newFile     = chooser.getSelectedFile();
            newFileName = newFile.getName();
        }
        else
            return; // if they didn't pick a file, cancel the rest of the update

        Scanner input = null;

        // Try to load it
        try {
            input = new Scanner(newFile);
            this.melody = new Melody(read(input));
            this.fileName.setText(newFileName);
            this.playButton.setEnabled(true);
            this.reverseButton.setEnabled(true);
            this.appendButton.setEnabled(true);
            this.tempo.setEnabled(true);
            this.printButton.setEnabled(true);
            this.saveButton.setEnabled(true);
            this.duration.setText("Duration: "+this.melody.getTotalDuration()+" seconds");
            this.tempo.setText("1.0");
            currTempo = 1.0;
            this.reverseButton.setText("reverse");
        }
        catch (FileNotFoundException e) {
            System.out.println("Can't find file: " + newFileName);
            //e.printStackTrace();
        }
    }

    /**
     * load the provided file
     * used by save() to load the file that was just saved
     */
    private void loadFile(File file) {
    	try {
            Scanner input = new Scanner(file);
            this.melody = new Melody(read(input));
            this.fileName.setText(file.getName());
        }
        catch (FileNotFoundException e) {
            System.out.println("Can't find file: " + file.getName());
            //e.printStackTrace();
        }
    }

    /**
     * returns a Queue filled with the notes specified in the passed in
     * Scanner. The notes will appear in the same order in the Queue
     * as they did in the file.
     */
    private static Queue<Note> read(Scanner input)
    {
        Queue<Note> song = new LinkedList<Note>();

        while (input.hasNext()) {
            double duration = input.nextDouble();
            Pitch pitch = Pitch.valueOf(input.next());
            if(pitch.equals(Pitch.R)) {
                song.add(new Note(duration, pitch, input.nextBoolean()));
            } else {
                song.add(new Note(duration, pitch, input.nextInt(),
                    Accidental.valueOf(input.next()), input.nextBoolean()));
            }
        }

        return song;
    }

    /**
     * returns a copy of the given melody with a new Queue,
     * containing references to the same Notes
     * used to create a copy of melody stored in melodyCopy
     */
    private Melody copyMelody(Melody other) {
    	Queue<Note> notes = other.getNotes();
    	Queue<Note> notesCopy = new LinkedList<>();
    	for (Note note : notes) {
    		notesCopy.offer(note);
    	}
    	return new Melody(notesCopy);
    }

    public static void main(String[] args)
    {
        System.out.println("WORKING"); //to bring up console, for easy quitting

        try { //use OS-native look and feel (for buttons, file chooser, etc.)
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) { }

        new MelodyMainGUI();
    }
}
