package decoratordesignpattern;
/**
 * Vehicle sound system class
 * @author miller
 */
public class SoundSystem extends VehicleDecorator{
	Vehicle vehicle;
	//constructor
	public SoundSystem(Vehicle vehicle)
	{
		this.description = vehicle.description + ", awesome sound";
		this.cost = vehicle.cost + 350;
	}
	/**
	 * gets the string description of the vehicle with an upgraded sound system
	 * @return description of vehicle with sound system
	 */
	public String toString()
	{
		return this.description;
	}
	/**
	 * gets the updated cost of the vehicle with an upgraded sound system
	 * @return updated cost
	 */
	public double getCost()
	{
		return this.cost;
	}
}
