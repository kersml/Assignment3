package decoratordesignpattern;
/**
 * Vehicle decorator
 * @author miller
 */
public class VehicleDecorator extends Vehicle{
	/**
	 * gets the string description of the vehicle object
	 * @return vehicle description
	 */
	public String toString()
	{
		return this.description;
	}
}
