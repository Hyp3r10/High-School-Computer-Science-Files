public class Box
{
   // Instance Variables
	int side;
   // Constructors
    public Box(int val) {
    	side = val;
    }
   // Methods
   /** precondition: none
    *  postcondition: calculates and returns the area of
    *     the box (A = 6 * side * side)
    *  @return the area of the box
    */
   public int calculateArea()
   {
        int area = 0;
        area = 6 * side * side;
        return area;
   }
    
   /** precondition: none
    *  postcondition: calculates and returns the volume of 
    *     the box (V = side * side * side)
    *  @return the volume of the box
    */
   public int calculateVolume()
   {
       int volume = 0;
       volume = (side * side * side);
       return volume;
   }
}
