
public class MonsterRunner
{

	public static void main(String[] args)
	{
		Monster billy = new Monster("One-eyed", 2, 2.6);
		Monster sully = new Monster("Furry", 9, 6.5);
		Monster joe = new Monster("Furry", 4, 3.3);
		Monster al = new Monster("One-eyed", 5, 2.6);
		
		System.out.print("Billy and Sully should NOT be equal and they are ");
		
		if(billy.equals(sully))
			System.out.println("equal.\n\n");
		else
			System.out.println("NOT equal.\n\n");
		
		System.out.print("Sully and Joe should NOT be equal and they are ");
		
		if(sully.equals(joe))
			System.out.println("equal.\n\n");
		else
			System.out.println("NOT equal.\n\n");
		
		System.out.print("Billy and Al should be equal and they are ");
		
		if(billy.equals(al))
			System.out.println("equal.\n\n");
		else
			System.out.println("NOT equal.\n\n");
	}

}