package application;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//Creators: Diya, Athira, Aneka, Gabby (6-1-18)


public class TwoPlayerScreenController
{

	//Names of User Inputed Text Fields
	@FXML
	private TextField name1;
	@FXML
	private TextField gender1;

	@FXML
	private TextField name2;
	@FXML
	private TextField gender2;

	//Player 1 and Player 2 
	private static Player one;
	private static Player two;


	@FXML
	public void addPlayer1(ActionEvent event) //when "Enter" Button is pressed, it initializes player1
	{
		one = new Player(name1.getText(),gender1.getText()); 
		getCollegeCareer(); 
	}

	@FXML
	public void addPlayer2(ActionEvent event) //when "Enter" Button is pressed, it initializes player1
	{
		two = new Player(name2.getText(),gender2.getText());
		getNonCollegeCareer(); 
	}


	public static Player getOne()  //getter method to access private player1
	{
		return one; 
	}

	public static Player getTwo()  //getter method to access private player2
	{
		return two; 
	}

	public static void getCollegeCareer() //career is randomly set for player1
	{
		//An ArrayList of Career Colleges are made - new Career(String type, double salary) 
		ArrayList<Career> collegeCareer = new ArrayList<Career>(); 
		collegeCareer.add(new Career("Doctor", 130000));
		collegeCareer.add(new Career("Scientist", 100000));
		collegeCareer.add(new Career("Veterinarian", 100000));
		collegeCareer.add(new Career("Lawyer", 120000));
		collegeCareer.add(new Career("Fashion Designer", 80000));
		collegeCareer.add(new Career("Game Designer", 110000));
		collegeCareer.add(new Career("Secret Agent", 100000));
		collegeCareer.add(new Career("Mr.Stites", 1000000));
		collegeCareer.add(new Career("Extra", 1000000));

		int rand = (int)(Math.random()*collegeCareer.size()-1); //random num generated 
		one.setCareer(collegeCareer.get(rand));                 //num above is used to pick a a random career, and is "set" for the player 
		one.setSalary(collegeCareer.get(rand).getSalary());     //salary (seperate variable) for player is set based on career 


	}

	public static void getNonCollegeCareer()  //career is randomly set for player2
	{
		//An ArrayList of non-Career Colleges are made - new Career(String type, double salary) 
		ArrayList<Career> nonCollegeCareer = new ArrayList<Career>(); 
		nonCollegeCareer.add(new Career("Dancer", 50000));
		nonCollegeCareer.add(new Career("Athlete", 50000));
		nonCollegeCareer.add(new Career("Chef", 50000));
		nonCollegeCareer.add(new Career("Athlete", 50000));
		nonCollegeCareer.add(new Career("Race Car Driver", 60000));
		nonCollegeCareer.add(new Career("Police Officer", 50000));
		nonCollegeCareer.add(new Career("Inventor", 80000));
		nonCollegeCareer.add(new Career("Extra", 80000));

		int rand = (int)(Math.random()*nonCollegeCareer.size()-1); //random num generated 
		two.setCareer(nonCollegeCareer.get(rand));                 //num above is used to pick a a random career, and is "set" for the player 
		two.setSalary(nonCollegeCareer.get(rand).getSalary());     //salary (seperate variable) for player is set based on career 

	}

	@FXML
	public void openBoard(ActionEvent event)  //When "done" button is clicked, Board 2 screen pops up (refer to info on Main class) 
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("/application/Board2.fxml"));

			Scene scene = new Scene(root);

			//This line gets Stage info
			Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
			window.setScene(scene);
			window.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}