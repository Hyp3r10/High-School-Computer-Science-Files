public class RaceHorseTest
{
    public RaceHorseTest()
    {
        RaceHorse horse1 = new RaceHorse("John Wayne", 3, 250000, 2);
        System.out.println(horse1);

        System.out.println();

        RaceHorse horse2 = new RaceHorse("Jimmy Stewart", 4, 325000, 8);
        System.out.println(horse2);

        System.out.println();
    }
	
    public static void main(String[] args)
    {
        RaceHorseTest app = new RaceHorseTest();
    }
}