public class TypeCasting102
{
    public static void main (String[] args)
    {
       int intVal = 65;
       double doubleVal = 70.999;
       char charVal = 'D';
       
       System.out.println("(double) intVal " + intVal + " becomes " +(double) intVal);
       System.out.println("(char) intVal " + intVal + " becomes " +(char) intVal);
       System.out.println("(int) doubleVal " + doubleVal + " becomes " + (int) doubleVal);
       System.out.println("(char) doubleVal " + doubleVal + " becomes " + (char) doubleVal);
       System.out.println("(int) cahrVal " + charVal + " becomes " + (int) charVal);
       System.out.println("(double) cahrVal " + charVal + " becomes " + (double) charVal);
    }
}