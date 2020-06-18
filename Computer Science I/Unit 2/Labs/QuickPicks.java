public class QuickPicks
{
    public static void main (String[] args)
    {
        int qp1 = ((int)(Math.random()*(50))+1);
        int qp2 = ((int)(Math.random()*(50))+1);
        int qp3 = ((int)(Math.random()*(50))+1);
        int qp4 = ((int)(Math.random()*(50))+1);
        int qp5 = ((int)(Math.random()*(50))+1);
        int qp6 = ((int)(Math.random()*(50))+1);
        
        System.out.println("Texas Lottery - Quick Pick");
        System.out.println("=============================");
        System.out.println(qp1 + "  " + qp2 + "  " + qp3 + "  " + qp4 + "  " + qp5 + "  " + qp6);
        System.out.println("\n\nQuick Pick - Winning Numbers");
        System.out.println("=============================");
        System.out.println("48  3  39  2  15  45");
    }
}