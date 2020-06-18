public class MyRectangle
{
   // instance variables
   private int length;     // rectangle's length
   private int width;      // rectangle's width
   private int perimeter;
   private int area;
   // constructor
   public MyRectangle(int len, int wid)
   {
       length = len;
       width = wid;
   }
   // accessor methods
   public int getLength()
   {
       return length;
   }
   public int getWidth()
   {
       return width;
   }
   // mutator methods
   public void setLength(int l)
   {
       length = l;
   }
   public void setWidth(int w)
   {
       width = w;
   }
   // other methods
   public int getPerimeter()
   {
       perimeter = (2 * length) + (2 * width);
       return perimeter;
   }
   public int getArea()
   {
       area = length * width;
       return area;
   }
   public String toString()
   {
       return "\nLength == " + getLength() + 
               "\nWidth == " + getWidth() + 
           "\nPerimeter == " + getPerimeter() + 
                "\nArea == " + getArea() + 
                "\n";
   }
}