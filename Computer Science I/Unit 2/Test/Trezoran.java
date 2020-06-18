
public class Trezoran
{
	public Trezoran()
	{
		System.out.println("You come up on your own house, along with a shack.\n");
		execute();
	}
	
	public static void execute()
	{
		Everlight.prompt();
		switch(Everlight.getOutput())
			{
			case "5jA":
			{
				House house=new House();
				break;
			}
			case "5jA0":
			{
				House house=new House();
				break;
			}
			case "5jB":
			{
				Shack shack=new Shack();
				break;
			}
			case "2lC":
			{
				System.out.println("You never were good at blowing. The light disappeared for only an instant, revealing to you what it means to be in true darkness, only to pop back into the lamp to faithfully show you the way. Maybe you should simply let it guide you down the path.");
				execute();
				break;
			}
			case "2lC2":
			{
				System.out.println("You never were good at blowing. The light disappeared for only an instant, revealing to you what it means to be in true darkness, only to pop back into the lamp to faithfully show you the way. Maybe you should simply let it guide you down the path.");
				execute();
				break;
			}
			case "4lC":
			{
				System.out.println("You never were good at blowing. The light disappeared for only an instant, revealing to you what it means to be in true darkness, only to pop back into the lamp to faithfully show you the way. Maybe you should simply let it guide you down the path.");
				execute();
				break;
			}
			case "4lC2":
			{
				System.out.println("You never were good at blowing. The light disappeared for only an instant, revealing to you what it means to be in true darkness, only to pop back into the lamp to faithfully show you the way. Maybe you should simply let it guide you down the path.");
				execute();
				break;
			}
			default:
			{
				System.out.println("I do not understand.");
				Everlight.prompt();
				execute();
				break;
			}
			}
	}
}
