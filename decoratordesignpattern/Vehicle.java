package decoratordesignpattern;
/**
 * vehicle object
 * @author miller
 */
public class Vehicle {
	String description;
	double cost;
	/**
	 * generates a string description of the vehicle
	 * @return description of the vehicle
	 */
	public String toString()
	{
		return description;
	}
	/**
	 * gets the cost of the vehicle
	 * @return cost of vehicle
	 */
	public double getCost()
	{
		return cost;
	}
}
