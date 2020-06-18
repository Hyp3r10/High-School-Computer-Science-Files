public class Bank102Runner
{
    public static void main(String args[])
    {
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        Bank102 idk = new Bank102();
        Bank102 humza = new Bank102("The Amazing Humza");
        Bank102 abin = new Bank102("Awesome Athletic Abin (AKA Triple A)", 50, 100);
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(idk);
        System.out.println(humza);
        System.out.println(abin);
        
        idk.setName("King Tanner");
        idk.depositChecking(2000);
        idk.depositSavings(5000);
        System.out.println(idk);
        
        humza.depositChecking(25);
        humza.depositSavings(350);
        System.out.println(humza);
        
        idk.depositSavings(1000);
        System.out.println(idk);
        
        abin.withdrawChecking(15);
        System.out.println(abin);
        
        humza.depositChecking(25);
        humza.depositSavings(350);
        System.out.println(humza);
        
        idk.transferToChecking(2500);
        System.out.println(idk);
        
        humza.closeChecking();
        humza.closeSavings();
        System.out.println(humza);
        ///////////////////////////////////////////////////////////////////////////////////////////////////
    }
}