/*
 * A start of a unit test for class GameTree in the Game of 20 questions project.
 *
 * This class contains @Test methods to get you started and to explain some behavior.
 *
 *---@BeforeClass public static void setUp() throws FileNotFoundException
 * This setUp() method contains code that write a new file at
 * the beginning so that file always will have the same exact questions and answers.
 * Any method with @BeforeClass executes before any @Test method.
 *
 *---@Test public void testSaveGame() {
 * Test the save method after everything else is working!!!!!
 * Use testSaveGame to test your GameTree save method (you need to remove comments)
 * Method testSaveGame is a large test method that writes a new file, adds
 * questions and answers, saves the modified gGameTree and reads the new
 * game back to ensure save is working correctly.
 *
 * @author Rick Mercer (modified by Mr. Bunn)
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //run methods in numerical order
public class GameTreeTest
{
	static final String PATH = ""; //change if your data files are stored in another directory
	static GameTree aGame;

	// This code executes once and only once before an @Test method runs.
	// Good for initialization.
	// This allows you to ALWAYS begin with the same exact questions and answers.
	@BeforeClass
	public static void setUp() throws FileNotFoundException {
		// Let outfile be an object like System.out. You can send println messages to outfile
		PrintWriter outFile = new PrintWriter(new FileOutputStream(PATH + "animals.txt"));

		// Write seven lines to an output file:
		outFile.println("Has feathers?");
		outFile.println("Barnyard?");
		outFile.println("chicken");
		outFile.println("owl");
		outFile.println("Is it a mammal?");
		outFile.println("tiger");
		outFile.println("rattlesnake");
		outFile.close(); // Make sure you close() the file

		/*
		 * This test uses the following input file animals.txt :
		 * Has feathers?
		 * Barnyard?
		 * chicken
		 * owl
		 * Is it a mammal?
		 * tiger
		 * rattlesnake
		 */
		aGame = new GameTree(PATH + "animals.txt");

		// Output from toString()
		// - - chicken
		// - Barnyard?
		// - - owl
		// Has feathers?
		// - - tiger
		// - Is it a mammal?
		// - - rattlesnake
	}

	@Test
	public void test01_rootNodeAtStart() {
		//root node should be the first question in the file
		assertEquals("Has feathers?", aGame.getCurrent());
	}

	@Test
	public void test02_foundAnswerAtStart() {
		assertFalse("Found answer should be false", aGame.foundAnswer());
	}

	@Test
	public void test03_makeFirstYesChoice() {
		//a yes choice should go left
		aGame.playerSelected(Choice.Yes);
		assertEquals("Barnyard?", aGame.getCurrent());
	}

	@Test
	public void test04_checkFoundAnswerAgain() {
		assertFalse("Should not be at a leaf node yet", aGame.foundAnswer());
	}

	@Test
	public void test05_makeNoChoice() {
		//a no choice should go right
		aGame.playerSelected(Choice.No);
		assertEquals("owl", aGame.getCurrent());
	}

	@Test
	public void test06_foundAnAnswerNode() {
		//should be at a leaf (a guess, not a question) node at this point
		assertTrue(aGame.foundAnswer());
	}

//	@Test
//	public void test07_testSaveGame() {
//		GameTree aGame = new GameTree(PATH + "animals.txt");
//		aGame.playerSelected(Choice.Yes);
//		aGame.playerSelected(Choice.Yes);
//		// Add new question and make the current data the new answer
//		aGame.add("Can it swim?", "goose");
//		assertEquals("Can it swim?", aGame.getCurrent());
//		aGame.saveGame();
//
//		// Add another answer
//		aGame.reStart();
//		aGame.playerSelected(Choice.Yes);
//		aGame.playerSelected(Choice.Yes);
//		aGame.playerSelected(Choice.Yes);
//		assertEquals("goose", aGame.getCurrent());
//		assertTrue(aGame.foundAnswer());
//		aGame.add("Does it croak?", "frog");
//
//		// Read from a changed file and verify the same questions/answers
//		aGame.saveGame();
//		GameTree anotherGame = new GameTree(PATH + "animals.txt");
//
//		anotherGame.playerSelected(Choice.Yes);
//		anotherGame.playerSelected(Choice.Yes);
//		aGame.add("Can it swim?", "goose");
//		assertEquals("Can it swim?", aGame.getCurrent());
//		anotherGame.playerSelected(Choice.Yes);
//		assertEquals("Does it croak?", anotherGame.getCurrent());
//		assertFalse(anotherGame.foundAnswer());
//		anotherGame.playerSelected(Choice.No);
//		assertTrue(anotherGame.foundAnswer());
//		assertEquals("goose", anotherGame.getCurrent());
//
//		anotherGame.reStart();
//		anotherGame.playerSelected(Choice.Yes);
//		anotherGame.playerSelected(Choice.Yes);
//		anotherGame.playerSelected(Choice.Yes);
//		assertEquals("Does it croak?", anotherGame.getCurrent());
//		assertFalse(anotherGame.foundAnswer());
//		anotherGame.playerSelected(Choice.No);
//		assertTrue(anotherGame.foundAnswer());
//		assertEquals("goose", anotherGame.getCurrent());
//	}
}
