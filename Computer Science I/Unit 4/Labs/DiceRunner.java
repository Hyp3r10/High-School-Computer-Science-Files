public class DiceRunner
{
	public static void main(String[] args)
	{
		System.out.println("Dice Roller");
		System.out.println("Each number represents a roll on a six sided die.");

		Dice d = new Dice();

		d.printRolls();
	}
}