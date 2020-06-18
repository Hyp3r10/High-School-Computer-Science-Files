import java.util.*;

public class IESTriangle{
    private int side1;
    private int side2;
    private int side3;
    private String triangle;
    public IESTriangle(){
        setSides(0,0,0);
    }
    public IESTriangle(int s1, int s2, int s3){
        setSides(s1,s2,s3);
    }
    public void setSides(int s1, int s2, int s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    public String getTriangleType(){
        if((side1 == side2) && (side2 == side3) && (side3 == side1)){
            triangle = "equilateral";
        }
        else if((side1 == side2) ^ (side2 == side3) ^ (side1 == side3)){
            triangle = "isosceles";
        }
        else if((side1 != side2) && (side2 != side3) && (side1 != side3)){
            triangle = "scalene";
        }
        return triangle;
    }
}