package decoratordesignpattern;
/**
 * vehicle paint-job class
 * @author miller
 */
public class Paint extends VehicleDecorator{
	Vehicle vehicle;
	//constructor
	public Paint(Vehicle vehicle)
	{
		this.description = vehicle.description + ", fancy paint";
		this.cost = vehicle.cost + 150;
	}
	/**
	 * gets the string description of the vehicle paint-job
	 * @return description of paint-job modification
	 */
	public String toString()
	{
		return this.description;
	}
	/**
	 * gets the updated cost of the vehicle after the paint-job
	 * @return updated cost
	 */
	public double getCost()
	{
		return this.cost;
	}
}
