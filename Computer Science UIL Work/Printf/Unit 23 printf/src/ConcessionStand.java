import java.util.*;

public class ConcessionStand
{
    private int burgers = 0;
    private int hotdogs = 0;
    private int chips = 0;
    private int candy = 0;
    private int drinks = 0;

    private double burgersTotal = 0;
    private double hotdogsTotal = 0;
    private double chipsTotal = 0;
    private double candyTotal = 0;
    private double drinksTotal = 0;
    private double grandTotal = 0;

    /* This method prompts the user to enter in the number of 
     * items sold for each food type.
     */
    public void enterPurchases()
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("burgers -->");
    	burgers = scan.nextInt();
    	System.out.print("hot dogs -->");
    	hotdogs = scan.nextInt();
    	System.out.print("chips -->");
    	chips = scan.nextInt();
    	System.out.print("candy -->");
    	candy = scan.nextInt();
    	System.out.print("drinks -->");
    	drinks = scan.nextInt();
    	scan.close();
    }
	
    /* This method calculates the total amount purchased for
     * each food type. It also calculates the total cost of
     * all the food purchase.
     */
    public void calculateTotals()
    {
    	burgersTotal = burgers * 2.00;
    	hotdogsTotal = hotdogs * 1.50;
    	chipsTotal = chips * 0.50;
    	candyTotal = candy * 1.00;
    	drinksTotal = drinks * 1.00;
    	grandTotal = (burgersTotal + hotdogsTotal + chipsTotal + candyTotal + drinksTotal);
    }

    /* This method prints a receipt showing the totals for
     * food type purchased along with the total cost of all
     * the food.
     */
    public void printReceipt()
    {
    	System.out.println("\n\n         Receipt");
    	System.out.println("------------------------");
    	if(burgersTotal > 0) {
    		System.out.printf("%-16s%.2f%n", "burgers", burgersTotal);
    	}
    	if(hotdogsTotal > 0) {
    		System.out.printf("%-16s%.2f%n", "hotdogs", hotdogsTotal);
    	}
    	if(chipsTotal > 0) {
    		System.out.printf("%-16s%.2f%n", "chips", chipsTotal);
    	}
    	if(candyTotal > 0) {
    		System.out.printf("%-16s%.2f%n", "candy", candyTotal);
    	}
    	if(drinksTotal > 0) {
    		System.out.printf("%-16s%.2f%n", "drinks", drinksTotal);
    	}
    	System.out.println("------------------------");
    	System.out.printf("%-16s%.2f%n", "grand total", grandTotal);
    }

    public static void main(String[] args)
    {
        ConcessionStand app = new ConcessionStand();
        app.enterPurchases();
        app.calculateTotals();
        app.printReceipt();
    }
}