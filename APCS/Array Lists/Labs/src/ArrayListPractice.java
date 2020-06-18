import java.util.*;      // needed for ArrayList

public class ArrayListPractice
{
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args)
    {
       System.out.println("Method 1");
       System.out.println("--------");
       System.out.println();
       Method1();
       System.out.println();
       System.out.println("Method 2");
       System.out.println("--------");
       System.out.println();
       Method2();       
    }
    public static void Method1()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i = 10; i <= 100; i += 10) {
    		list.add(i);
    	}
    	for(int i = 0; i < list.size(); i++) {
    		System.out.println(list.get(i));
    	}
    	System.out.println();
    	for(Integer num : list) {
    		System.out.println(num);
    	}
    }
    public static void Method2()
    {
    	ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String response = "";
        int index = -1;
        do {
        	System.out.print("Enter a word --> ");
        	list.add(scan.nextLine());
        	index++;
        } while(!list.get(index).equalsIgnoreCase("exit"));
        list.remove(index);
        System.out.println();
        for(int i = 0; i < list.size(); i++) {
    		System.out.println(list.get(i));
    	}
    	System.out.println();
    	for(String str : list) {
    		System.out.println(str);
    	}
    }
}