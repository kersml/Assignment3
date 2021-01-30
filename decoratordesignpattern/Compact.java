package decoratordesignpattern;
/**
 * Compact vehicle object
 * @author miller
 */
public class Compact extends Vehicle{
	//constructor
	public Compact()
	{
		this.description = "Compact";
		this.cost = 15000;
	}
	/**
	 * gets the cost of the compact vehicle object
	 * @return cost of compact vehicle
	 */
	public double getCost()
	{
		return this.cost;
	}
}
