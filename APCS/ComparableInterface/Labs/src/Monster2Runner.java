import static java.lang.System.*;

public class Monster2Runner
{
   public static void main( String args[] )
   {
		Monster2 zero = new Monster2();
		Monster2 one = new Monster2(8);
		Monster2 sue = new Monster2(9, 4);
		Monster2 harry = new Monster2(1, 2, 3);
		
		out.println("\nzero Monster :: " + zero);		
		out.println("\none Monster :: " + one);
		out.println("\nsue Monster :: " + sue);
		out.println("\nharry Monster :: " + harry);

		out.println("\nchanging harry's properties ");				
		harry.setMyHeight(7);
		harry.setMyWeight(6);
		harry.setMyAge(5);
		out.println("\nharry Monster :: " + harry);

		out.println("\ncloning harry");	
		sue = (Monster2)harry.clone();
		out.println("\nsue Monster :: " + sue);

		Monster2 mOne = new Monster2(33,33,11);
		Monster2 mTwo = new Monster2(55,33,11);

		out.println("\nMonster 1 :: " + mOne);
		out.println("\nMonster 2 :: " + mTwo);

		out.print("\nmOne.equals(mTwo) == ");
		out.println(mOne.equals(mTwo));

		out.print("\nmOne.compareTo(mTwo) == ");
		out.println(mOne.compareTo(mTwo));
		out.print("\nmTwo.compareTo(mOne) == ");
		out.println(mTwo.compareTo(mOne));
	}
}