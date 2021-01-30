package decoratordesignpattern;
/**
 * Vehicle rims class
 * @author miller
 */
public class Rims extends VehicleDecorator{
	Vehicle vehicle;
	//constructor
	public Rims(Vehicle vehicle)
	{
		this.description = vehicle.description + ", cool rims";
		this.cost = vehicle.cost + 200;
	}
	/**
	 * gets the string description of the vehicle after getting new rims
	 * @return description of vehicle with rims
	 */
	public String toString()
	{
		return this.description;
	}
	/**
	 * gets the updated cost of the vehicle with rims
	 * @return updated cost 
	 */
	public double getCost()
	{
		return this.cost;
	}
}
