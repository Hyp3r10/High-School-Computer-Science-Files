
public class Car
{
    // Constants
    public final double capacity = 22;   // number of gallons the gas
                                         // tank can hold when full
    // Instance Variables
    private double startMiles;
    private double endMiles;
    private double gallons;
    // Constructors
    public Car(double startMiles, double endMiles, double gallons) {
    	this.startMiles = startMiles;
    	this.endMiles = endMiles;
    	this.gallons = gallons;
    }
    // Methods
    
    /** precondition:  gallons > 0
     *  postcondition: calculates and returns the cars MPG (miles per gallon)
     *     for the current odometer readings.
     *  @return the car's MPG
     */
    public double calculateMPG()
    {
    	double milesTraveled = endMiles - startMiles;
    	double refill = gallons;
        double mPG = milesTraveled / refill;
        return mPG;
    }
    
    /** precondition:  none
     *  postcondition: calculates and returns the number of miles the car
     *     can travel before its gas tank is empty.
     *  @return number of miles car can travel before tank is empty
     */
    public double milesToEmpty()
    {
    	double milesToEmpty;
    	milesToEmpty = calculateMPG() * (capacity - gallons);
    	return milesToEmpty;
    }
}