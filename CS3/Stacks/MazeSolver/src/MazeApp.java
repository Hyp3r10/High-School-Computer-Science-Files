/**
 * The CSCI 151 Amazing Maze Solver GUI application.
 * 
 * Students should not need to modify anything in this file.
 * 
 * @author Benjamin Kuperman (Spring 2012)
 *
 */

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class MazeApp extends JFrame implements ActionListener {

	// Initial font size for the display
	private static int fontSize = 16;

	// Initial interval between animation in milliseconds
	private static int timerInterval = 500; 

	private static final long serialVersionUID = 6228378229836664288L;

	// Fields for internal data representation
	Maze maze;
	MazeSolver solver;
	boolean mazeLoaded;

	// Fields for GUI interface
	JTextField filename;
	JTextField timerField;
	JTextField fontField;
	JTextArea  mazeDisplay;
	JTextArea  pathDisplay;
	JButton    loadButton;
	JButton    solveButton;
	JButton    stepButton;
	JButton    solverType;
	JButton    resetButton;
	JButton    quitButton;
	Timer      timer;

	/**
	 * Constructor -- does most of the work setting up the GUI.
	 */
	public MazeApp() {
		// Set up the frame
		super("Amazing Maze Solver");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Field for the maze file name
		filename = new JTextField(10);
		filename.setEditable(false);
		filename.setText("<no maze loaded>");

		// Timer and font size fields
		timerField = new JTextField(5);
		fontField  = new JTextField(5);

		// Glue text and input together
		JPanel filenamePanel = new JPanel(new BorderLayout());
		filenamePanel.add(new JLabel("File: "), "West");
		filenamePanel.add(filename, "Center");

		JPanel fontPanel = new JPanel(new BorderLayout());
		fontPanel.add(new JLabel("Font size:"), "West");
		fontPanel.add(fontField, "Center");

		JPanel timerPanel = new JPanel(new BorderLayout());
		timerPanel.add(new JLabel("Timer (ms):"), "West");
		timerPanel.add(timerField, "Center");

		JPanel controls = new JPanel(new FlowLayout());
		controls.add(timerPanel);
		controls.add(fontPanel);

		// Create the buttons
		loadButton = new JButton("load");
		resetButton = new JButton("reset");
		quitButton = new JButton("quit");
		solverType = new JButton("stack");
		solveButton = new JButton("start");
		stepButton = new JButton("step");

		// places to put all the top menu items
		JPanel buttons1 = new JPanel(new GridLayout(1, 3));  // top row of buttons
		JPanel buttons2 = new JPanel(new GridLayout(1, 3));  // bottom row of buttons
		JPanel buttonBar = new JPanel(new GridLayout(2, 2)); // combined layout of buttons
		// and text

		// load up the buttons in L to R order
		buttons1.add(loadButton);
		buttons1.add(resetButton);
		buttons1.add(quitButton);
		buttons2.add(solverType);
		buttons2.add(solveButton);
		buttons2.add(stepButton);

		// Glue the components together row by row
		buttonBar.add(filenamePanel); // top left
		buttonBar.add(buttons1);      // top right
		buttonBar.add(controls);      // bottom left
		buttonBar.add(buttons2);      // bottom right
		// add padding from edges
		buttonBar.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));

		// Timer for the animations
		timer = new Timer(timerInterval, this);


		// Set up the bottom area to show the maze and path
		mazeDisplay = new JTextArea(20, 30);
		mazeDisplay.setEditable(false);
		pathDisplay = new JTextArea(4, 30);
		pathDisplay.setEditable(false);
		JPanel pane = new JPanel(new BorderLayout());
		pane.setBorder(BorderFactory.createEmptyBorder(
				10, //top
				10, //left
				10, //bottom
				10) //right
				);
		pane.add(new JScrollPane(mazeDisplay), "Center"); // let's maze be biggest
		pane.add(new JScrollPane(pathDisplay), "South");

		// Create the overall layout (buttons on top, maze info below)
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(buttonBar,"North");
		panel.add(pane);

		// add to the frame
		this.getContentPane().add(panel);

		// shrink wrap and display
		this.pack();
		this.setLocationRelativeTo(null);	// center
		this.setVisible(true);

		// Actionlisteners
		loadButton.addActionListener(this);
		filename.addActionListener(this);
		solveButton.addActionListener(this);
		solverType.addActionListener(this);
		stepButton.addActionListener(this);
		resetButton.addActionListener(this);
		quitButton.addActionListener(this);

		timerField.addActionListener(this);
		fontField.addActionListener(this);

		// Set up the class variables
		doTimer();
		doFontSize();
		mazeLoaded = false;
		this.maze = new Maze();
		makeNewSolver();
	}

	/*
	 * Collection of handlers to deal with GUI events.
	 * 
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if ( (e.getSource() == loadButton) || (e.getSource() == filename) ){
			loadFile();
		}
		if (e.getSource() == solveButton) {
			if (mazeLoaded) {
				makeNewSolver();
				solveButton();
			}
		}
		if (e.getSource() == resetButton) {
			reset();
		}
		if (e.getSource() == solverType) {
			toggleSolverType();
			makeNewSolver();
		}
		if (e.getSource() == quitButton) {
			doQuit();
		}
		if (e.getSource() == timerField) {
			doTimer();
		}
		if (e.getSource() == fontField) {
			doFontSize();
		}
		if (e.getSource() == stepButton) {
			if (mazeLoaded)
				doStep();
		}
		if (e.getSource() == timer) {
			// animate a step
			if (mazeLoaded) {
				doStep();
			}
		}
	}

	/**
	 * Allow the user to change the timer interval. 
	 */
	private void doTimer() {
		int newValue = -1;
		try {
			newValue = Integer.parseInt(timerField.getText());
		} catch (NumberFormatException nfe) {
			// do nothing
		}
		if (newValue>0)
			timerInterval = newValue;
		timerField.setText(Integer.toString(timerInterval));
		timer.setDelay(timerInterval);
	}


	/**
	 * Allow the user to change the font size. 
	 */
	private void doFontSize() {
		int newValue = -1;
		try {
			newValue = Integer.parseInt(fontField.getText());
		} catch (NumberFormatException nfe) {
			// do nothing
		}
		if (newValue>0)
			fontSize = newValue;
		fontField.setText(Integer.toString(fontSize));
		mazeDisplay.setFont(new Font("Courier New",Font.BOLD, fontSize));
		pathDisplay.setFont(new Font("Courier New",Font.BOLD, fontSize));

	}

	/**
	 * Allow the user to quit via button.
	 */
	private void doQuit() {
		System.exit(0);
	}

	/**
	 * Set things back to the ready state.  Called by the "reset" button
	 * as well as many other methods.
	 */
	private void reset() {
		maze.reset();
		makeNewSolver();
		updateMaze();
	}

	/**
	 * Performs a single step of the MazeSolver.  Called when the
	 * user clicks on "Step" as well as by the interval timer.
	 */
	private void doStep() {
		if (mazeLoaded && !solver.isSolved()) {
			solver.step();
			if (solver.isSolved()) { //WASN'T DISPLAYING LAST GETPATH() CALL, FIX
				solveButton();
				timer.stop();
				updateMaze();
			}
		}
		updateMaze();
	}

	/**
	 * Handles the user clicking on the solver type button.
	 */
	private void toggleSolverType() {
		//nothing to see here
		reset();
	}

	/**
	 * Builds a new MazeSolver of the type displayed on the button.
	 */
	private void makeNewSolver() {
		solver = new MazeSolverStack(this.maze);
	}

	/**
	 * Handles the starting/stopping of the timer.
	 */
	private void solveButton() {
		String label = solveButton.getText();
		if (solver.isSolved()) {
			solveButton.setBackground(Color.white);
			solveButton.setText("start");
			return;
		}
		if (label.equalsIgnoreCase("start")) {
			if ( mazeLoaded ) {
				solveButton.setText("stop");
				solveButton.setBackground(Color.red);
				timer.start();
			}
		} else if (label.equalsIgnoreCase("stop")) {
			solveButton.setText("start");
			solveButton.setBackground(Color.green);
			timer.stop();
		}
	}

	/**
	 * Load a maze file into the solver.
	 */
	private void loadFile() {

		// Let the user pick from a filtered list of files
		JFileChooser chooser = new JFileChooser(new File("."));
		chooser.setFileFilter(new FileFilter() {
			String description = "Maze files";

			@Override
			public boolean accept(File f) {
				if (f.isDirectory()) 
					return true;
				
				
				if (f.getName().startsWith("maze-"))
					return true;
				
				return false;
			}

			@Override
			public String getDescription() {
				return this.description;
			}

		});
		File newFile = null;
		String newFileName = null;
		int returnVal = chooser.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			newFile = chooser.getSelectedFile();
			newFileName = newFile.getName();
		} else {
			// if they didn't pick a file, cancel the rest of the update
			return;
		}

		// Try to load it
		if (! maze.loadMaze(newFile.getPath()) ) {
			JOptionPane.showMessageDialog(this, "Cannot load file: "+newFileName);
		} else {
			// update name without path
			filename.setText(newFileName);

			// set things up as ready to go
			solveButton.setText("start");
			solveButton.setBackground(Color.green);
			mazeLoaded=true;
			timer.stop();
			reset();
		}
	}

	/**
	 * Update both the maze and the path text areas.
	 */
	private void updateMaze() {
		if (mazeLoaded) {  // leave blank until first maze is loaded

			// update the maze
			mazeDisplay.setText(maze.toString());

			// update the path
			pathDisplay.setText(solver.getPath());
//			if (solver.isSolved()) {
//				pathDisplay.setText(solver.getPath());
//			} else {
//				pathDisplay.setText("Maze is unsolved");
//			}
		}
	}

	public static void main(String[] args) {
		System.out.println("WORKING"); //to bring up console, for easy quitting
		new MazeApp();
	}

}

