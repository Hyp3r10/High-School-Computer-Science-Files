import java.util.*;

public class StudentCouncil
{ 
    // Instance Variables
    private Dance dance;
    private Scanner scan;
    
    // Constructor
    public StudentCouncil()
    {
        dance = new Dance();
        scan = new Scanner(System.in);
    }
    
    // Methods
    public void mainMenu()
    {
        int ans=0;
        
        do
        {
            System.out.println("======================");
            System.out.println("        Main Menu");
            System.out.println("======================");
            System.out.println("1. Buy a Ticket");
            System.out.println("2. Print Summary Report");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Selection --> ");
            ans = scan.nextInt();
            System.out.println();
            
            if(ans == 1)
            {
                buyTicket();
            }
            else if (ans == 2)
            {
                printSummary();
            }
        
        }
        while(ans != 3);
        
    }
    
    /** precondition:  none
     *  postcondition: prints a menu of ticket options and allows the 
     *     user to select one of the items in the menu. It purchases 
     *     a ticket according to ticket type selected.
     */
    public void buyTicket()  {
    	System.out.println("===================" + 
    					 "\n     Buy Ticket" + 
    					 "\n===================" + 
    					 "\n1. Gold Pass" + 
    					 "\n2. Silver Pass" + 
    					 "\n3. Bronze Pass" + 
    					 "\n4. No Pass");
    	System.out.print("\n\nSelection --> ");
    	int choice = scan.nextInt();
    	dance.buyTicket(choice);
    }
    
    /** precondition:  none
     *  postcondition: prints a summary report that includes the
     *     current number of students attending the dance and the 
     *     current amount of money made from ticket sales.
     */   
    public void printSummary() {
    	System.out.println("===========================" + 
    					 "\n        Summary Report" + 
    					 "\n===========================" + 
    					 "\nTotal Attendance =   " + dance.getAttendance() + 
    					 "\nTicket Sales     = $ " + dance.getTicketSales());
    }
	
    public static void main(String[] args)
    {
        StudentCouncil app = new StudentCouncil();
        app.mainMenu();
    }
}