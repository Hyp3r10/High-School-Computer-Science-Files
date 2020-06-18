package application;


//Creators: Diya, Athira, Aneka, Gabby (6-1-18)

import java.util.ArrayList; 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
/*
 * This class deals with the spinner, movement of cars, action Events, displaying the appropriate cards, 
 * and displaying user information on the menu.
 */

public class Board2Controller 
{
	private int count; //used to determine if player1 or player2 is to move (based on mod. division-refer to spin())
	private boolean notRetired; //makes sure both players are not retired
	private int locPlayer1;  //location of player1 in terms of its index  
	private int locPlayer2;  //location of player2 in terms of its index  
	private Image image;    //image of action card

	private ArrayList<Coordinates> listA = new ArrayList<Coordinates>();  //Path of player1
	private ArrayList<Coordinates> listB = new ArrayList<Coordinates>();  //Path of player2

	//Array of actionCards in terms of their resource name 
	private String[] actionCards = {"100Fbank.jpg", "120Fbank.jpg", 
			"20Fplayer.jpg", "20Tbank.jpg", "30Tbank.jpg", 
			"30Tbank2.jpg", "30Tbank3.jpg", "30Tbank4.jpg", 
			"40Fbank.jpg", "40Fbank3.jpg", "40Fbank4.jpg",
			"40fbank2.jpg", "50FPlayer.jpg",
			"50Fbank.jpg", "50Fbank2.jpg", "50Tbank.jpg", 
			"50Tbank2.jpg", "50Tbank3.jpg",	"50Tbank4.jpg", 
			"50Tbank5.jpg", "50Tbank6.jpg", "70Fbank.jpg", 
	"70Fbank2.jpg"}; 

	private ArrayList<House> houses = new ArrayList<House>();  //list of possible Houses

	public Board2Controller()
	{
		count = 0; 
		notRetired = true; 
		locPlayer1 = -1; //initialized to -1 bc the first space is at index 0 of list
		locPlayer2 = -1; //initialized to -1 bc the first space is at index 0 of list


		//Coordinates for Path A - new Coordinate(int spot, int xCoord, int yCoord, & String identification)
		listA.add(new Coordinates(1, -39, -157, "y"));  
		listA.add(new Coordinates(2, -38, -216, "y"));  
		listA.add(new Coordinates(3, -68, -277, "y"));
		listA.add(new Coordinates(4, -112, -318, "y"));
		listA.add(new Coordinates(5, -164, -332, "y"));
		listA.add(new Coordinates(6, -224, -340, "y"));
		listA.add(new Coordinates(7, -280, -326, "y"));
		listA.add(new Coordinates(8, -325, -284, "y"));
		listA.add(new Coordinates(9, -352, -232, "y"));
		listA.add(new Coordinates(10, -362, -176, "y"));
		listA.add(new Coordinates(11, -346, -126, "y"));
		listA.add(new Coordinates(12, -324, -81, "y"));
		listA.add(new Coordinates(13, -284, -42, "y"));
		listA.add(new Coordinates(14, -299, -16, "y")); 
		listA.add(new Coordinates(15, -332, 15, "g"));
		listA.add(new Coordinates(16, -382, 25, "y"));
		listA.add(new Coordinates(17, -430, 13, "y"));
		listA.add(new Coordinates(18, -471, -17, "y"));
		listA.add(new Coordinates(19,-523, -27, "y"));
		listA.add(new Coordinates(20, -572, -10, "g"));
		listA.add(new Coordinates(21, -619, 14, "y"));
		listA.add(new Coordinates(22, -677, 3, "y"));
		listA.add(new Coordinates(23, -716, -35, "y"));
		listA.add(new Coordinates(24, -732, -79, "y"));
		listA.add(new Coordinates(25, -718, -124, "y"));
		listA.add(new Coordinates(26, -684, -157, "y"));
		listA.add(new Coordinates(27, -647, -188, "y"));
		listA.add(new Coordinates(28, -650, -238, "y"));
		listA.add(new Coordinates(29, -663, -279, "y"));
		listA.add(new Coordinates(30, -682, -322, "g"));
		listA.add(new Coordinates(31, -694, -364, "y"));
		listA.add(new Coordinates(32, -712, -413, "y"));
		listA.add(new Coordinates(33, -724, -453, "y"));
		listA.add(new Coordinates(34, -732, -505, "h"));
		listA.add(new Coordinates(35, -684, -516, "y"));
		listA.add(new Coordinates(36, -649, -519, "y"));
		listA.add(new Coordinates(37, -608, -530, "y"));
		listA.add(new Coordinates(38, -577, -557, "y"));
		listA.add(new Coordinates(39, -555, -596, "y"));
		listA.add(new Coordinates(40, -547, -641, "y"));
		listA.add(new Coordinates(41, -532, -688, "g"));
		listA.add(new Coordinates(42, -488, -696, "y"));
		listA.add(new Coordinates(43, -442, -683, "y"));
		listA.add(new Coordinates(44, -404, -652, "y"));
		listA.add(new Coordinates(45, -393, -606, "h"));
		listA.add(new Coordinates(46, -393, -558, "y"));
		listA.add(new Coordinates(47, -408, -514, "g"));
		listA.add(new Coordinates(48, -436, -478, "t"));
		listA.add(new Coordinates(49, -475, -453, "y"));
		listA.add(new Coordinates(50, -515, -434, "y"));
		listA.add(new Coordinates(51, -552, -413, "y"));
		listA.add(new Coordinates(52, -584, -383, "y"));
		listA.add(new Coordinates(53, -595, -340, "h"));
		listA.add(new Coordinates(54, -595, -291, "g"));
		listA.add(new Coordinates(55, -595, -250, "y"));
		listA.add(new Coordinates(56, -595, -211, "y"));
		listA.add(new Coordinates(57, -585, -175, "y"));
		listA.add(new Coordinates(58, -564, -139, "t"));
		listA.add(new Coordinates(59, -541, -110, "h"));
		listA.add(new Coordinates(60, -503, -84, "b"));
		listA.add(new Coordinates(61, -453, -79, "t"));
		listA.add(new Coordinates(62, -417, -96, "g"));
		listA.add(new Coordinates(63, -400, -138, "b"));
		listA.add(new Coordinates(64, -400, -182, "b"));
		listA.add(new Coordinates(65, -399, -232, "y"));
		listA.add(new Coordinates(66, -393, -272, "y"));
		listA.add(new Coordinates(67, -393, -308, "y"));
		listA.add(new Coordinates(68, -393, -364, "y"));
		listA.add(new Coordinates(69, -393, -412, "y"));
		listA.add(new Coordinates(70, -343, -417, "y"));
		listA.add(new Coordinates(71, -332, -448, "b"));
		listA.add(new Coordinates(72, -341, -498, "y"));
		listA.add(new Coordinates(73, -340, -548, "h"));
		listA.add(new Coordinates(74, -343, -603, "g"));
		listA.add(new Coordinates(75, -341, -651, "b"));
		listA.add(new Coordinates(76, -338, -702, "y"));
		listA.add(new Coordinates(77, -285, -705, "y"));
		listA.add(new Coordinates(78, -242, -687, "y"));
		listA.add(new Coordinates(79, -193, -702, "y"));
		listA.add(new Coordinates(80, -145, -712, "y"));
		listA.add(new Coordinates(81, -98, -717, "y"));
		listA.add(new Coordinates(82, -55, -717, "h"));
		listA.add(new Coordinates(83, -1, -706, "y"));
		listA.add(new Coordinates(84, 9, -664, "g"));
		listA.add(new Coordinates(85, 9, -615, "y"));
		listA.add(new Coordinates(86, 9, -570, "y"));
		listA.add(new Coordinates(87, 9, -530, "y"));
		listA.add(new Coordinates(88, 9, -491, "y"));
		listA.add(new Coordinates(89, 9, -445, "y"));
		listA.add(new Coordinates(90, 9, -400, "y"));
		listA.add(new Coordinates(91, 9, -353, "y"));
		listA.add(new Coordinates(92, -31, -340, "y"));
		listA.add(new Coordinates(93, -65, -364, "g"));
		listA.add(new Coordinates(94, -104, -379, "y"));
		listA.add(new Coordinates(95, -150, -381, "y"));
		listA.add(new Coordinates(96, -193, -381, "y"));
		listA.add(new Coordinates(97, -230, -382, "y"));
		listA.add(new Coordinates(98, -278, -385, "h"));
		listA.add(new Coordinates(99, -278, -427, "g"));
		listA.add(new Coordinates(100, -237, -435, "y"));
		listA.add(new Coordinates(101, -196, -437, "y"));
		listA.add(new Coordinates(102, -157, -450, "y"));
		listA.add(new Coordinates(103, -157, -486, "y"));
		listA.add(new Coordinates(104, -198, -498, "g"));
		listA.add(new Coordinates(105, -238, -498, "y"));
		listA.add(new Coordinates(106, -286, -507, "y"));
		listA.add(new Coordinates(107, -284, -543, "y"));
		listA.add(new Coordinates(108, -200, -590, "y"));
		listA.add(new Coordinates(109, -273, -638, "r"));

		//Coordinates for Path B - new Coordinate(int spot, int xCoord, int yCoord, & String identification)
		listB.add(new Coordinates(1, -153, -56, "y"));
		listB.add(new Coordinates(2, -209, -49, "g"));
		listB.add(new Coordinates(3, -263, -73, "y"));
		listB.add(new Coordinates(4, -278, -42, "y"));
		listB.add(new Coordinates(5, -308, -5, "g"));
		listB.add(new Coordinates(6, -356, -8, "y"));
		listB.add(new Coordinates(7, -402, -13, "y"));
		listB.add(new Coordinates(8, -454, -40, "y"));
		listB.add(new Coordinates(9, -502, -56, "y"));
		listB.add(new Coordinates(10, -548, -25, "g"));
		listB.add(new Coordinates(11, -608, -20, "y")); 
		listB.add(new Coordinates(12, -655, -24, "y"));
		listB.add(new Coordinates(13, -687, -56, "y"));
		listB.add(new Coordinates(14, -701, -100, "y"));
		listB.add(new Coordinates(15, -695, -145, "y")); 
		listB.add(new Coordinates(16, -664, -184, "y"));
		listB.add(new Coordinates(17, -629, -213, "y"));
		listB.add(new Coordinates(18, -631, -264, "y"));
		listB.add(new Coordinates(19, -642, -305, "y"));
		listB.add(new Coordinates(20, -663, -350, "g"));
		listB.add(new Coordinates(21, -678, -389, "y"));
		listB.add(new Coordinates(22, -687, -434, "y"));
		listB.add(new Coordinates(23, -701, -476, "y"));
		listB.add(new Coordinates(24, -705, -527, "h"));
		listB.add(new Coordinates(25, -666, -541, "y"));
		listB.add(new Coordinates(26, -624, -543, "y"));
		listB.add(new Coordinates(27, -617, -510, "y"));
		listB.add(new Coordinates(28, -588, -482, "y"));
		listB.add(new Coordinates(29, -550, -482, "y"));
		listB.add(new Coordinates(30, -521, -508, "y"));
		listB.add(new Coordinates(31, -496, -549, "y"));
		listB.add(new Coordinates(32, -443, -547, "g"));
		listB.add(new Coordinates(33, -435, -586, "y"));
		listB.add(new Coordinates(34, -453, -629, "y"));
		listB.add(new Coordinates(35, -438, -677, "y"));
		listB.add(new Coordinates(36, -424, -709, "y"));
		listB.add(new Coordinates(37, -385, -673, "y"));
		listB.add(new Coordinates(38, -363, -626, "h"));
		listB.add(new Coordinates(39, -373, -587, "y"));
		listB.add(new Coordinates(40, -384, -536, "g"));
		listB.add(new Coordinates(41, -414, -499, "t"));
		listB.add(new Coordinates(42, -451, -471, "y"));
		listB.add(new Coordinates(43, -489, -455, "y"));
		listB.add(new Coordinates(44, -531, -435, "y"));
		listB.add(new Coordinates(45, -561, -404, "y"));
		listB.add(new Coordinates(46, -573, -364, "h"));
		listB.add(new Coordinates(47, -573, -310, "g"));
		listB.add(new Coordinates(48, -574, -275, "y"));
		listB.add(new Coordinates(49, -573, -235, "y"));
		listB.add(new Coordinates(50, -527, -238, "y"));
		listB.add(new Coordinates(51, -499, -271, "y"));
		listB.add(new Coordinates(52, -498, -323, "y"));
		listB.add(new Coordinates(53, -498, -371, "y"));
		listB.add(new Coordinates(54, -472, -397, "y"));
		listB.add(new Coordinates(55, -438, -374, "g"));
		listB.add(new Coordinates(56, -403, -339, "y"));
		listB.add(new Coordinates(57, -373, -345, "y"));
		listB.add(new Coordinates(58, -373, -382, "y"));
		listB.add(new Coordinates(59, -373, -435, "y"));
		listB.add(new Coordinates(60, -324, -439, "y"));
		listB.add(new Coordinates(61, -308, -472, "b"));
		listB.add(new Coordinates(62, -321, -522, "y"));
		listB.add(new Coordinates(63, -321, -573, "h"));
		listB.add(new Coordinates(64, -319, -619, "g"));
		listB.add(new Coordinates(65, -317, -673, "b"));
		listB.add(new Coordinates(66, -308, -731, "y"));
		listB.add(new Coordinates(67, -261, -731, "y"));
		listB.add(new Coordinates(68, -224, -712, "y"));
		listB.add(new Coordinates(69, -176, -731, "y"));
		listB.add(new Coordinates(70, -121, -740, "y"));
		listB.add(new Coordinates(71, -77, -740, "y"));
		listB.add(new Coordinates(72, -31, -740, "h"));
		listB.add(new Coordinates(73, 22, -740, "y"));
		listB.add(new Coordinates(74, 34, -689, "g"));
		listB.add(new Coordinates(75, 37, -638, "y"));
		listB.add(new Coordinates(76, 33, -593, "y"));
		listB.add(new Coordinates(77, -9, -600, "y"));
		listB.add(new Coordinates(78, -48, -593, "+200K"));
		listB.add(new Coordinates(79, -89, -593, "y"));
		listB.add(new Coordinates(80, -82, -555, "-100K"));
		listB.add(new Coordinates(81, -41, -513, "+300K"));
		listB.add(new Coordinates(82, -51, -468, "-200K"));
		listB.add(new Coordinates(83, -82, -439, "g"));
		listB.add(new Coordinates(84, -89, -397, "y"));
		listB.add(new Coordinates(85, -130, -397, "y"));
		listB.add(new Coordinates(86, -171, -407, "y"));
		listB.add(new Coordinates(87, -214, -397, "y"));
		listB.add(new Coordinates(88, -258, -409, "h"));
		listB.add(new Coordinates(89, -267, -455, "g"));
		listB.add(new Coordinates(90, -218, -462, "y"));
		listB.add(new Coordinates(91, -172, -460, "y"));
		listB.add(new Coordinates(92, -137, -471, "y"));
		listB.add(new Coordinates(93, -135, -513, "y"));
		listB.add(new Coordinates(94, -171, -522, "g"));
		listB.add(new Coordinates(95, -218, -528, "y"));
		listB.add(new Coordinates(96, -262, -534, "y"));
		listB.add(new Coordinates(97, -262, -575, "y"));
		listB.add(new Coordinates(98, -184, -606, "y"));
		listB.add(new Coordinates(99, -121, -662, "r"));


		//House ArrayList - new House(String type, double cost, String description)
		houses.add(new House("House Boat", 200000.00, "gh1.jpg")); 
		houses.add(new House("Teepee", 100000.00, "gh2.jpg")); 
		houses.add(new House("Farm House", 300000.00, "gh3.jpg")); 
		houses.add(new House("Eco House", 200000.00, "gh4.jpg" )); 
		houses.add(new House("Beach Hut", 100000.00, "gh5.jpg")); 
		houses.add(new House("City Penthouse", 600000.00, "gh6.jpg")); 
		houses.add(new House("Idio Apartment", 100000.00, "gh7.jpg")); 
		houses.add(new House("Family House", 250000.00, "gh8.jpg")); 
		houses.add(new House("Ranch House", 600000.00, "gh9.jpg")); 
		houses.add(new House("Luxury Apartment", 250000.0, "gh10.jpg")); 
		houses.add(new House("Windmill", 350000.00, "gh11.jpg")); 
		houses.add(new House("Cozy Cottage", 150000.00, "gh12.jpg")); 
		houses.add(new House("Dream Villa", 300000.00, "gh13.jpg")); 

	}


	@FXML
	private ImageView playerOne;  //image of red car

	@FXML 
	private ImageView playerTwo;  //image of blue car



	@FXML
	private ImageView actionCard; //image of action card

	@FXML
	private ImageView houseCard;  //image of house card


	//Labels on Menu: Player 1
	@FXML 
	private Label namePlayer1; 

	@FXML 
	private Label homePlayer1; 

	@FXML
	private Text careerPlayer1; 

	@FXML
	private Label moneyPlayer1; 

	@FXML 
	private Label childrenPlayer1; 

	@FXML 
	private Label player1Info; 


	//Labels on Menu: Player 2
	@FXML 
	private Label namePlayer2; 

	@FXML 
	private Label homePlayer2; 

	@FXML
	private Text careerPlayer2; 

	@FXML
	private Label moneyPlayer2; 

	@FXML 
	private Label childrenPlayer2; 

	@FXML 
	private Label player2Info; 


	//Labels associated with Spinner
	@FXML
	private Label action;  //label for "Spin" button

	@FXML
	private Label spin;  // label for actual Spinner (displayed number) 


	public void spin(ActionEvent event) //spin() is the most important method when the "Spin" button is clicked, spin() is called
	{
		if(notRetired)    //makes sure that neither of the cars are retired 
		{
			if(count == 0)   //only needs to be initialized at beginning of game 
			{
				careerPlayer1.setText("Career: " + TwoPlayerScreenController.getOne().getCareer()); //displays career info. for player1
				careerPlayer2.setText("Career: " + TwoPlayerScreenController.getTwo().getCareer()); //displays career info. for player2
				player1Info.setText("Hello " + TwoPlayerScreenController.getOne().getName() + ", you're in the red car!");
				player2Info.setText("Hello " + TwoPlayerScreenController.getTwo().getName() + ", you're in the blue car!");
			}

			int rand = (int)(Math.random()*10)+1;  //random number between 1 and 10 is generated
			spin.setText(""+rand);                 //number is displayed on "spinner" (Label spin)

			if(count % 2 == 0 && locPlayer1 < listA.size()) //player1 goes first
			{
				movePlayer1(rand); //calls method that moves player1
				action(TwoPlayerScreenController.getOne(), listA, locPlayer1); //calls method that performs action
			}
			else if(count % 2 == 1 && locPlayer2 < listB.size()) //player 2 goes second 
			{
				movePlayer2(rand); //calls method that moves player2
				action(TwoPlayerScreenController.getTwo(), listB, locPlayer2); //calls method that performs action
			}

			count++; //count is incremented to represent the number of spins and dictates which player will move the next time spin is clicked

			getIsFinished(); //calls this method to check if both players are retired, thus ending the game 
		}
	}


	//really intense Action method adds/subtracts, gives kids, salary 
	private void action(Player play, ArrayList<Coordinates>list, int loc)
	{
		if(list.get(loc).getIdentifaction().equals("y"))  //if the space is yellow, a new action card will be displayed
		{
			int choose = (int)(Math.random()*actionCards.length); //random number is generated
			image = new Image(actionCards[choose]);               //number is used as index to pick a random action card from the array
			actionCard.setImage(image);                           //new random action card is shown 

			//Based on index (random number generated in ln 384) money will be added or subtracted in accordance with info on action card 
			if(choose == 0) //Skateboarding Competition 
				play.addMoney(100000);
			else if(choose == 1) //Pet Goat 
				play.addMoney(120000); 
			else if(choose == 2 || choose == 3)  //Lawsuit //Other
				play.subtractMoney(20000);
			else if(choose == 4 || choose == 5 || choose == 6 || choose == 7) //Mt. Everest //Family Band //Designer Suit //Adventure Playground
				play.subtractMoney(30000);
			else if(choose == 8 || choose == 9 || choose == 10 || choose == 11)// Family of the Year //Children's Book //Set up School //Beautiful forehead
				play.addMoney(40000);
			else if(choose == 12 || choose == 13 || choose == 14)//Lawsuit //Tax Refund //Maze
				play.addMoney(50000);
			else if(choose == 15 || choose == 16 || choose ==17 || choose == 18 || choose == 19 || choose == 20)//Sail Around World //Pass Driving test //Snail farm //Home Cinemea //Online Business
				play.subtractMoney(50000);
			else if(choose == 21 || choose == 22) //Family Tree //Sell flowers
				play.addMoney(70000);

			//Lables must be refreshed to display new money totals 
			refreshMoneyLabel(play); 

		}
		else if(list.get(loc).getIdentifaction().equals("h"))   //if it is a house space, a new house card will be shown & home info. will be changed 
		{
			int choose = (int)(Math.random()*houses.size());             //random number generated 
			image = new Image(houses.get(choose).getDescription());      //number is used as index to pick a random house card from the arrayList
			houseCard.setImage(image);                                   //new random house card is shown 

			//appropriate changes are made to the player class when House is bought 
			play.setCostOfHouse(houses.get(choose).getCost());           //house info. is updated for player 
			play.subtractMoney(houses.get(choose).getCost());            //cost of House is subtracted 

			if(play.getName().equals(TwoPlayerScreenController.getOne().getName())) //based on player, refreshes house label 

				homePlayer1.setText("You got a " + houses.get(choose).getType() + " for " + houses.get(choose).getCost() + "!");
			else
				homePlayer2.setText("You got a " + houses.get(choose).getType() + " for " + houses.get(choose).getCost() + "!");

			refreshMoneyLabel(play); 

		}
		else if(list.get(loc).getIdentifaction().equals("t"))  //if it is a twins space, appropriate changes are made 
		{
			play.addChildren(2); //player class is updated, children added 

			if(play.getName().equals(TwoPlayerScreenController.getOne().getName())) //Children label is refreshed to display player's new number of children 
				childrenPlayer1.setText("Children # : " + TwoPlayerScreenController.getOne().getNumOfChildren());
			else
				childrenPlayer2.setText("Children # : " + TwoPlayerScreenController.getTwo().getNumOfChildren());	
		}
		else if(list.get(loc).getIdentifaction().equals("b")) //if it is a baby space, appropriate changes are made 
		{
			play.addChildren(1);  //player class is updated, children added 

			if(play.getName().equals(TwoPlayerScreenController.getOne().getName())) //Children label is refreshed to display player's new number of children 
				childrenPlayer1.setText("Children # : " + TwoPlayerScreenController.getOne().getNumOfChildren());
			else
				childrenPlayer2.setText("Children # : " + TwoPlayerScreenController.getTwo().getNumOfChildren());	

		}
		else if(list.get(loc).getIdentifaction().equals("g")) //if it is a payday space, appropriate changes are made 
		{
			play.addMoney(play.getSalary()); //player recieves salary 
			refreshMoneyLabel(play); 
		}
		else if(list.get(loc).getIdentifaction().equals("+200K")) //risky road space
		{
			play.addMoney(200000); //money added
			refreshMoneyLabel(play); 
		}
		else if(list.get(loc).getIdentifaction().equals("-100K"))  //risky road space
		{
			play.subtractMoney(100000);  //money subtracted
			refreshMoneyLabel(play); 

		}
		else if(list.get(loc).getIdentifaction().equals("+300K"))   //risky road space
		{
			play.addMoney(300000); //money added
			refreshMoneyLabel(play); 

		}
		else if(list.get(loc).getIdentifaction().equals("-200K")) //risky road space 
		{
			play.subtractMoney(200000); //money subtracted
			refreshMoneyLabel(play); 

		}

	}

	private void refreshMoneyLabel(Player play) //refreshes Money label 
	{
		 //if player being refered to is "one" (based on identifaction of name), the label associated with the player will be refreshed, else player two's label will be refreshed 
		if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
			moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney()); 
		else
			moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());
	}


	//Two individual movePlayer() methods were created for ease of testing 
	private void movePlayer1(int spaces)  //moves player1 the # of spaces 
	{
		locPlayer1+= spaces; //location in incremented (remember location refers to index in ArrayList) 
		if(locPlayer1 >= listA.size())   //if locPlayer1 is greater than highest index, coordinates are set to "retirement" location 
		{
			playerOne.setX(listA.get(listA.size()-1).getCoordX());
			playerOne.setY(listA.get(listA.size()-1).getCoordY());
			locPlayer1 = listA.size()-1;                           //makes sure loc stays in bounds
		}
		else
		{
			playerOne.setX(listA.get(locPlayer1).getCoordX());     //moving image to new location 
			playerOne.setY(listA.get(locPlayer1).getCoordY());     //moving image to new location 

		}

	}

	private void movePlayer2(int spaces)  //moves player2 the # of spaces 
	{
		locPlayer2+= spaces;   //location in incremented (remember location refers to index in ArrayList) 
		if(locPlayer2 >= listB.size())  //if locPlayer2 is greater than highest index, coordinates are set to "retirement" location 
		{
			playerTwo.setX(listB.get(listB.size()-1).getCoordX()); 
			playerTwo.setY(listB.get(listB.size()-1).getCoordY());
			locPlayer2 = listB.size()-1;                           //makes sure loc stays in bounds
		}
		else
		{
			playerTwo.setX(listB.get(locPlayer2).getCoordX());    //moving image to new location 
			playerTwo.setY(listB.get(locPlayer2).getCoordY());    //moving image to new location 
		}

	}


	private void getIsFinished() //checks to see if both players are retired && will end the game 
	{
		if(locPlayer1 >= listA.size()-1 && locPlayer2 >= listB.size()-1)
		{
			//Additional money is awarded for # of kids && for selling the player's LAST recieved House 
			TwoPlayerScreenController.getOne().addMoney(TwoPlayerScreenController.getOne().getCostOfHouse() + (TwoPlayerScreenController.getOne().getNumOfChildren()*100000));
			TwoPlayerScreenController.getTwo().addMoney(TwoPlayerScreenController.getTwo().getCostOfHouse() + (TwoPlayerScreenController.getTwo().getNumOfChildren()*100000));
 
			//Money labels are refreshed 
			moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney()); 
			moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());

			//if player1 has more money than player2....will output that player1 won and player2 lost 
			if(TwoPlayerScreenController.getOne().getTotalMoney() > TwoPlayerScreenController.getTwo().getTotalMoney())
			{
				player1Info.setText("Congrats " + TwoPlayerScreenController.getOne().getName() + ", you've won the game!");
				player2Info.setText("Sorry " + TwoPlayerScreenController.getTwo().getName() + ", you weren't so lucky...YOU LOST!");
			}
			//if player1 has less money than player2....will output that player2 won and player1 lost 
			else if(TwoPlayerScreenController.getOne().getTotalMoney() < TwoPlayerScreenController.getTwo().getTotalMoney())
			{
				player1Info.setText("Sorry " + TwoPlayerScreenController.getOne().getName() + ", you weren't so lucky...YOU LOST!");
				player2Info.setText("Congrats " + TwoPlayerScreenController.getTwo().getName() + ", you've won the game!");
			}
			//if players are tied both win :) 
			else
			{
				player1Info.setText("It's a tie, " + TwoPlayerScreenController.getOne().getName() + " & " + TwoPlayerScreenController.getTwo().getName());
				player2Info.setText("It's a tie, " + TwoPlayerScreenController.getTwo().getName() + " & " + TwoPlayerScreenController.getOne().getName());
			}

			notRetired = false; //prevents spin() from working 
		}
	}
}





