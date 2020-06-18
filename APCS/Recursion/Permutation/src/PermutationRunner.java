import java.util.*;
import static java.lang.System.*;

public class PermutationRunner
{
   public static void main( String args[] )
   {
	    Permutation p = new Permutation("ABC");
	    p.permutation();
	    System.out.println(p);
	    
	    p = new Permutation("abc");
	    p.permutation();
	    System.out.println(p);
	    
	    p = new Permutation("boat");
	    p.permutation();
	    System.out.println(p);
	    
	    p = new Permutation("it");
	    p.permutation();
	    System.out.println(p);
	}
}