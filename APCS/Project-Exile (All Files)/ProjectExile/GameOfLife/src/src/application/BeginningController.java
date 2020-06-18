package application;


//Creators: Diya, Athira, Aneka, Gabby (6-1-18)

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BeginningController
{
	/*
	 * An FXML file controls the entirety of the features of scenes, while controller classes control 
	 * data and actions associated with the features
	 */
	
	//ActionEvent event refers to user interaction 
	
	@FXML
	public void start(ActionEvent event) //when button is clicked, start() is called and TwoPlayerScreen is pulled up
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("/application/TwoPlayerScreen.fxml"));

			Scene scene = new Scene(root);

			//This line gets Stage info; retrieving primaryStage
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