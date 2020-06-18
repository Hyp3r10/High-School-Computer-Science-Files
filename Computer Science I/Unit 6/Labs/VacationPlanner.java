import java.util.*;

public class VacationPlanner
{
    private StandardPackage vacationPackage;
    
    public VacationPlanner()
    {
        Scanner keyboard = new Scanner(System.in);
        int pack=0;
        int nights=0;
        
        do
        {
            System.out.println("Select Vacation Package");
            System.out.println("-----------------------");
            System.out.println("1. Standard Package");
            System.out.println("2. Premium Package");
            System.out.println("3. Platinum Package");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Select package --> ");
            pack = keyboard.nextInt();
            
            if(pack < 4)
            {
                System.out.println();
                System.out.println("Enter Vacation Info");
                System.out.println("-------------------");
                System.out.print("Enter number of nights -->");
                nights = keyboard.nextInt();
                System.out.println();   
    
                if(pack == 1)
                {
                    vacationPackage = new StandardPackage(nights);
                }
                if(pack == 2)
                {
                    vacationPackage = new PremiumPackage(nights);
                }
                if(pack == 3)
                {
                    vacationPackage = new PlatinumPackage(nights);           
                }
                
                System.out.println("Vacation Package Summary");
                System.out.println("------------------------");
                System.out.println(vacationPackage);
                System.out.println();
                System.out.println();        
            }           
        }
        while(pack < 4);     
    }
	
    public static void main(String[] args)
    {
        VacationPlanner app = new VacationPlanner();
    }
}