package application;

//Creators: Diya, Athira, Aneka, Gabby (6-1-18) 

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{   
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/BeginningScreen.fxml"));   //get Beginning Screen 
			Parent root = loader.load(); //fxml root
			Scene scene = new Scene(root);  //taking all info from fxml and turning it into a scene/window
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); //just for style purposes (turns button red)
			primaryStage.setScene(scene); //sets scence
			primaryStage.show(); //show
		} 
		catch(Exception e) //prevent an error from occurring (kept for saftey purposes)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) //main method launches everything 
	{
		launch(args);	
	}
}