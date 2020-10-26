/**
 * This class represents an event driven graphical interface for your GameTree class
 *
 * @author Rick Mercer
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GameOf20GUI extends JFrame {

	public static void main(String[] args) {
		GameOf20GUI view = new GameOf20GUI();
		view.setVisible(true);
	}

	// GUI Objects
	private JButton yesButton = new JButton("Yes");

	private JButton noButton = new JButton("No");

	private JButton restartButton = new JButton("Restart");

	private JButton saveButton = new JButton("Save");

	private JTextArea IOarea = new JTextArea();

	private JTextArea gameTreeArea = new JTextArea();

	private boolean couldBeSaved;

	// Model objects

	private GameTree theGame;

	public GameOf20GUI() {
		layoutGUI();
		setUpModel();
		registerListeners();
	}

	private void layoutGUI() {
		setTitle("Game of 20 Questions");
		setSize(880, 630);
		setLocation(20, 40);
		setResizable(false);
		JPanel buttonPanel = new JPanel();
		yesButton.setPreferredSize(new Dimension(80, 20));
		noButton.setPreferredSize(new Dimension(80, 20));
		restartButton.setPreferredSize(new Dimension(80, 20));
		saveButton.setPreferredSize(new Dimension(80, 20));
		buttonPanel.setPreferredSize(new Dimension(90, 90));
		// buttonPanel.setLayout(new GridLayout(3, 1));
		buttonPanel.add(yesButton);
		buttonPanel.add(noButton);
		buttonPanel.add(restartButton);
		buttonPanel.add(saveButton);
		getContentPane().add(buttonPanel, BorderLayout.WEST);
		IOarea.setFont(new Font("Fixed", Font.BOLD, 14));
		gameTreeArea.setFont(new Font("Fixed", Font.PLAIN, 10));
		getContentPane().add(IOarea, BorderLayout.CENTER);
		getContentPane().add(gameTreeArea, BorderLayout.EAST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setUpModel() {
		String fileName = JOptionPane.showInputDialog(null,
				"Enter file name with questions.");
		theGame = new GameTree(fileName);
		IOarea.setText(theGame.getCurrent() + "\n");
		gameTreeArea.setText(theGame.toString());
	}

	private void registerListeners() {
		couldBeSaved = false;
		ButtonListener buttonListener = new ButtonListener();
		yesButton.addActionListener(buttonListener);
		noButton.addActionListener(buttonListener);
		restartButton.addActionListener(buttonListener);
		saveButton.addActionListener(new SaveButtonListener());
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (couldBeSaved) {
					runSaveGameDialog();
				}
			}
		});
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			JButton button = (JButton) event.getSource();

			if (button == restartButton) {
				theGame.reStart(); // and append root question
				IOarea.setText("");
				IOarea.append(" " + theGame.getCurrent() + "\n");
				gameTreeArea.setText(theGame.toString());
			}
			else if (button == yesButton) {
				theGame.playerSelected(Choice.Yes);
				if (!theGame.foundAnswer())
					IOarea.append(" " + theGame.getCurrent() + "\n");
			}
			else if (button == noButton) {
				theGame.playerSelected(Choice.No);
				if (!theGame.foundAnswer())
					IOarea.append(" " + theGame.getCurrent() + "\n");
			}
			else
				throw new IllegalArgumentException(
						"Some button clicked that is not being handled");

			if (theGame.foundAnswer()) {
				doNewQuestionDialog();
			}
		}

		private void doNewQuestionDialog() {
			int option = JOptionPane.showConfirmDialog(null,
					"Were you thinking of a " + theGame.getCurrent() + "");
			if (option == 0) {
				JOptionPane.showMessageDialog(null,
						"I knew what you were thinking (or almost)\nGame Over !");
			}
			else if (option == 2)
				return;
			else {
				String oldAnswer = theGame.getCurrent();
				String newAnswer = "";
				String newQuestion = null;
				do {
					newAnswer = "";
					newAnswer = JOptionPane.showInputDialog(null,
							"I give up, what were you thinking of?");
				} while (newAnswer.length() < 1);

				do {
					newQuestion = "";
					newQuestion = JOptionPane.showInputDialog(null,
							"Give me a yes answer for your '" + newAnswer
							+ "'\nthat is also a no answer for '" + oldAnswer + "'");
				} while (newQuestion.length() < 1);

				if (!newQuestion.endsWith("?"))
					newQuestion += "?";
				theGame.add(newQuestion, newAnswer);
				couldBeSaved = true;
			}
			theGame.reStart();
			IOarea.setText(" " + theGame.getCurrent() + "\n");
			gameTreeArea.setText(theGame.toString());
		}
	}

	private class SaveButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			runSaveGameDialog();
		}
	}

	private void runSaveGameDialog() {
		if (couldBeSaved) {
			int option = JOptionPane.showConfirmDialog(null,
					"Overwrite old version with\nyour new question and answers?");
			if (option == 0) {
				theGame.saveGame();
				couldBeSaved = false;
			}
			else
				JOptionPane.showMessageDialog(null,
						"Any new questions and answers will not be saved.");
		}
		else
			JOptionPane.showMessageDialog(null, "No new questions to save.");
	}


	private static final long serialVersionUID = 1426849838578967838L;

}
