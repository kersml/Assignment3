package decoratordesignpattern;
/**
 * Sports car vehicle object
 * @author miller
 */
public class SportsCar extends Vehicle {
	//constructor
	public SportsCar()
	{
		this.description = "Sports Car";
		this.cost = 30000;
	}
	/**
	 * gets the cost of the sports car vehicle object
	 * @return cost of sports car
	 */
	public double getCost()
	{
		return this.cost;
	}
}
