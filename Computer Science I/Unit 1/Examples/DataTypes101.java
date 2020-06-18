public class DataTypes101
{
    public static void main(String[] args)
    {
       //int intNum = 1000; // int is too small of a data type for the last operation which leads to "Memory Overflow"
       long intNum  = 1000L; // Long woukd be large enough to hold all the values.
       System.out.println("intNum: " + intNum);
       
       intNum = intNum * 1000;
       //intNum = 1000 * 100;
       System.out.println("intNum: " + intNum);
       
       intNum = intNum * 1000;
       System.out.println("intNum: " + intNum);
       
       intNum = intNum * 1000;
       System.out.println("intNum: " + intNum);
      
       
    }
}