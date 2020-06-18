public class Bank101Runner
{
    public static void main(String args[])
    {
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        Bank101 idk = new Bank101();
        Bank101 humza = new Bank101("The Amazing Humza");
        Bank101 abin = new Bank101("Awesome Athletic Abin (AKA Triple A)", 50, 100);
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Name :: " + idk.getName());
        System.out.println(idk.getName() + " checking account balance is :: $" +  idk.getChecking());
        System.out.println(idk.getName() + " savings account balance is :: $" +  idk.getSavings());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Name :: " + humza.getName());
        System.out.println(humza.getName() + " checking account balance is :: $" +  humza.getChecking());
        System.out.println(humza.getName() + " savings account balance is :: $" +  humza.getSavings());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Name :: " + abin.getName());
        System.out.println(abin.getName() + " checking account balance is :: $" +  abin.getChecking());
        System.out.println(abin.getName() + " savings account balance is :: $" +  abin.getSavings());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        idk.setName("King Tanner");
        idk.depositChecking(2000);
        idk.depositSavings(5000);
        
        System.out.println("Name :: " + idk.getName());
        System.out.println(idk.getName() + " checking account balance is :: $" +  idk.getChecking());
        System.out.println(idk.getName() + " savings account balance is :: $" +  idk.getSavings());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        humza.depositChecking(25);
        humza.depositSavings(350);
        
        System.out.println("Name :: " + humza.getName());
        System.out.println(humza.getName() + " checking account balance is :: $" +  humza.getChecking());
        System.out.println(humza.getName() + " savings account balance is :: $" +  humza.getSavings());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        idk.depositSavings(1000);
        
        System.out.println("Name :: " + idk.getName());
        System.out.println(idk.getName() + " checking account balance is :: $" +  idk.getChecking());
        System.out.println(idk.getName() + " savings account balance is :: $" +  idk.getSavings());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        abin.withdrawChecking(15);
        
        System.out.println("Name :: " + abin.getName());
        System.out.println(abin.getName() + " checking account balance is :: $" +  abin.getChecking());
        System.out.println(abin.getName() + " savings account balance is :: $" +  abin.getSavings());
        System.out.println(abin.getName() + " total account balance is :: $" +  abin.getCombined());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        idk.transferToChecking(2500);
        
        System.out.println("Name :: " + idk.getName());
        System.out.println(idk.getName() + " checking account balance is :: $" +  idk.getChecking());
        System.out.println(idk.getName() + " savings account balance is :: $" +  idk.getSavings());
        System.out.println(idk.getName() + " total account balance is :: $" +  idk.getCombined());
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        humza.closeChecking();
        humza.closeSavings();
        
        System.out.println("Name :: " + humza.getName());
        System.out.println(humza.getName() + " checking account balance is :: $" +  humza.getChecking());
        System.out.println(humza.getName() + " savings account balance is :: $" +  humza.getSavings());
        System.out.println(humza.getName() + " total account balance is :: $" +  idk.getCombined());
        System.out.println();
    }
}