import java.util.*;

public class ArrayPractice
{
    public void method1()
    {
        int[] A = new int[5];
        A[0] = 2;
        A[1] = 4;
        A[2] = 6;
        A[3] = 8;
        A[4] = 10;
        System.out.println(A[0] + " " + A[1] + " " + A[2] + " " + A[3] + " " + A[4]);
    }
    public void method2()
    {
        int[] B = {10, 20, 30, 40, 50};
        System.out.println(B[0] + " " + B[1] + " " + B[2] + " " + B[3] + " " + B[4]);
    }
    public void method3()
    {
        double[] C = new double[4];
        C[0] = 5.6;
        C[1] = 9.9;
        System.out.println(C[0] + " " + C[1] + " " + C[2] + " " + C[3]);
    }
    public void method4()
    {
        String[] D = new String[3];
        D[0] = "Dog";
        D[2] = "Cat";
        System.out.println(D[0] + " " + D[1] + " " + D[2]);
    }
    public static void main(String[] args)
    {
       ArrayPractice app = new ArrayPractice();

       app.method1();
       app.method2();
       app.method3();
       app.method4();
    }
}