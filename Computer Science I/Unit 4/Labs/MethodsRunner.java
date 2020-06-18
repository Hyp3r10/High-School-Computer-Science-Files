public class MethodsRunner
{
    public static void main(String[] args)
    {
        Methods app = new Methods();

        System.out.println("Test square method");
        System.out.println("==================");
        System.out.println("The square of 5 is " + app.square(5));
        System.out.println("The square of 12 is " + app.square(12));

        System.out.println();
        System.out.println("Test sumThree method");
        System.out.println("====================");
        System.out.println("The sum of 10, 20, 30 is " + app.sumThree(10, 20, 30));
        System.out.println("The sum of 15, 100, 75 is " + app.sumThree(15, 100, 75));

        System.out.println();
        System.out.println("Test average method");
        System.out.println("===================");
        System.out.println("The average of 50 and 100 is " + app.average(50, 100));
        System.out.println("The average of 1271 and 5446 is " + app.average(1271, 5446));

        System.out.println();
        System.out.println("Test smaller method");
        System.out.println("===================");
        System.out.println("The smaller of 34 and 90 is " + app.smaller(34, 90));
        System.out.println("The smaller of 125 and 2 is " + app.smaller(125, 2));

        System.out.println();
        System.out.println("Test randomInt method");
        System.out.println("=====================");
        System.out.println("An integer random number in range of [1..3] = " + app.randomInt(3));
        System.out.println("An integer random number in range of [1..50] = " + app.randomInt(50));

        System.out.println();
        System.out.println("Test evenOdd method");
        System.out.println("===================");
        System.out.println("The number 84 is " + app.evenOdd(84));
        System.out.println("The number 27 is " + app.evenOdd(27));

        System.out.println();
        System.out.println("Test getLetterGrade method");
        System.out.println("==========================");
        System.out.println("The grade 75 is a " + app.getLetterGrade(75));
        System.out.println("The grade 89 is a " + app.getLetterGrade(89));

        System.out.println("Test greeting method");
        System.out.println("====================");
        app.greeting("John");
        app.greeting("Sarah");

        System.out.println();
        System.out.println("Test firstLetter method");
        System.out.println("=======================");
        System.out.println("The first letter of honor is " + app.firstLetter("honor"));
        System.out.println("The first letter of courage is " + app.firstLetter("courage"));

        System.out.println();
        System.out.println("Test lastLetter method");
        System.out.println("=======================");
        System.out.println("The last letter of honor is " + app.lastLetter("honor"));
        System.out.println("The last letter of courage is " + app.lastLetter("courage"));

        System.out.println();
        System.out.println("Test removeFirst method");
        System.out.println("=======================");
        System.out.println("With first letter of respect removed is " + app.removeFirst("respect"));
        System.out.println("With first letter of integrity removed is " + app.removeFirst("integrity"));

        System.out.println();
        System.out.println("Test removeLast method");
        System.out.println("======================");
        System.out.println("With last letter of respect removed is " + app.removeLast("respect"));
        System.out.println("With last letter of integrity removed is " + app.removeLast("integrity"));

        System.out.println();
        System.out.println("Test merge method");
        System.out.println("=================");
        System.out.println("The merge of faith, hope, love is " + app.merge("faith", "hope", "love"));
        System.out.println("The merge of forgiveness, compassion, mercy is  " + app.merge("forgiveness", "compassion", "mercy"));

        System.out.println();
        System.out.println("Test repeatFirst method");
        System.out.println("=======================");
        System.out.println("Repeat first letter of sacrifice is " + app.repeatFirst("sacrifice"));
        System.out.println("Repeat first letter of commitment is " + app.repeatFirst("commitment"));

        System.out.println();
        System.out.println("Test repeatLast method");
        System.out.println("======================");
        System.out.println("Repeat last letter of sacrifice is " + app.repeatLast("sacrifice"));
        System.out.println("Repeat last letter of commitment is " + app.repeatLast("commitment"));
    }
}