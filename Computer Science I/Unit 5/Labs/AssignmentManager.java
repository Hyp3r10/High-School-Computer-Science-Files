import java.util.*;

public class AssignmentManager
{  
   /**
    * @method app.change[Type, Name, Score]([String, int]) :: ask Stites for clearification on the changing;
    * i.e. do we go from test to quiz, or stay the same?
    */
    public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       ////////////////////////////////////////////////////////////////////////////////////////////////////
       System.out.println("/**************************************/");
       System.out.println("/*     Test Default Constructor       */");
       System.out.println("/*     and Accessor methods           */");
       System.out.println("/**************************************/");
       Assignment app = new Assignment();
       System.out.println(app.toString());
       ////////////////////////////////////////////////////////////////////////////////////////////////////
       System.out.println("/**************************************/");
       System.out.println("/*     Test 2nd Constructor           */");
       System.out.println("/*     and Accessor methods           */");
       System.out.println("/**************************************/");
       app = new Assignment("Test", "Chaper 1 Test", 95);
       System.out.println(app.toString());
       
       app = new Assignment("Quiz", "Chaper 1 Quiz", 83);
       System.out.println(app.toString());
       ////////////////////////////////////////////////////////////////////////////////////////////////////
       System.out.println("/**************************************/");
       System.out.println("/*     Test Mutator methods           */");
       System.out.println("/*     and Accessor methods           */");
       System.out.println("/**************************************/");
       app = new Assignment("", "", 0);
       app.changeType("Quiz");
       app.changeName("Chapter 1 Quiz");
       app.changeScore(30);
       System.out.println(app.toString());
       
       app = new Assignment("", "", 0);
       app.changeType("Test");
       app.changeName("Chapter 1 Test");
       app.changeScore(75);
       System.out.println(app.toString());
       ////////////////////////////////////////////////////////////////////////////////////////////////////
   }    
}