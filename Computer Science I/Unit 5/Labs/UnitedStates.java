public class UnitedStates
{
   public static void main(String[] args)
   {
       State blankState = new State();
       State Texas = new State("Texas", "mockingbird", "bluebonnet", "Texas, Our Texas", "friendship", "pecan");
       State Oklahoma = new State("Oklahoma", "scissor-tailed flycatcher", "Oklahoma Rose", "Oklahoma", "labor omnia vincit (labor conquers all things)", "redbud");
       
       System.out.println("****************************");
       System.out.println("  Test Default Constructor");
       System.out.println("****************************");
       System.out.println(blankState);  // call toString method
       System.out.println();
       System.out.println("****************************");
       System.out.println("    Test 2nd Constructor");
       System.out.println("****************************");
       System.out.println(Texas);       // call toString method
       System.out.println();
       System.out.println("****************************");
       System.out.println("    Test 2nd Constructor");
       System.out.println("****************************");
       System.out.println(Oklahoma);    // call toString method
       System.out.println();
   }    
}