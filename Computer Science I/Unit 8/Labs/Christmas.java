import java.util.*;

public class Christmas
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int count = 1;
        for(int d = 1; d <= 12; d++) {
            if(d==1) {
                System.out.println("On the first day of Christmas my true love gave to me");
            }
            if(d==2) {
                System.out.println("On the second day of Christmas my true love gave to me");
            }
            if(d==3) {
                System.out.println("On the third day of Christmas my true love gave to me");
            }
            if(d==4) {
                System.out.println("On the fourth day of Christmas my true love gave to me");
            }
            if(d==5) {
                System.out.println("On the fifth day of Christmas my true love gave to me");
            }
            if(d==6) {
                System.out.println("On the sixth day of Christmas my true love gave to me");
            }
            if(d==7) {
                System.out.println("On the seventh day of Christmas my true love gave to me");
            }
            if(d==8) {
                System.out.println("On the eighth day of Christmas my true love gave to me");
            }
            if(d==9) {
                System.out.println("On the ninth day of Christmas my true love gave to me");
            }
            if(d==10) {
                System.out.println("On the tenth day of Christmas my true love gave to me");
            }
            if(d==11) {
                System.out.println("On the eleventh day of Christmas my true love gave to me");
            }
            if(d==12) {
                System.out.println("On the twelfth day of Christmas my true love gave to me");
            }
            for(int m = d; m >= 1; m--) {  
                if(m==1 && count==1) {
                    System.out.println("a partridge in a pear tree.");
                }
                if(m==1 && count>1) {
                    System.out.println("and a partridge in a pear tree.");
                }
                if(m==2) {
                    System.out.println("two turtledoves,");
                }
                if(m==3) {
                    System.out.println("three French hens,");
                }
                if(m==4) {
                    System.out.println("four calling birds,");
                }
                if(m==5) { 
                    System.out.println("five gold rings,"); 
                }
                if(m==6) { 
                    System.out.println("six geese a-laying,");
                }
                if(m==7) { 
                    System.out.println("seven swans a-swimming,"); 
                } 
                if(m==8) { 
                    System.out.println("eight maids a-milking,");
                }
                if(m==9) {
                    System.out.println("nine ladies waiting,");
                }
                if(m==10) {
                    System.out.println("ten lords-a-leaping,");
                }
                if(m==11) { 
                    System.out.println("eleven pipers piping,");
                }
                if(m==12) { 
                    System.out.println("twelve drummers drumming,");
                }
            }
            count++;
             String pause = keyboard.nextLine();  // pause : Press Enter to continue
        }    
    }
}