/**
 * Choice is an enum to be used by users of any class that implements
 * class GameOf20. It is used to signify the user entered input indicating
 * a Yes or No answer. Sample code:
 *
 *  Choice userSelection = Choice.Yes; // Can only assign Choice.Yes and Choice.No
 *
 *  if(userSelection == Choice.No)
 *     System.out.println("This will not be printed");
 *
 *  if(userSelection == Choice.Yes)
 *     System.out.println("This WILL be printed");
 *
 * @author mercer
 */
public enum Choice {
  Yes, No;
};
