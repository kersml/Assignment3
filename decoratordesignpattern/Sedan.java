package decoratordesignpattern;
/**
 * Sedan vehicle object
 * @author miller
 */
public class Sedan extends Vehicle{
	//constructor
	public Sedan()
	{
		this.description = "Sedan";
		this.cost = 20000;
	}
	/**
	 * gets the cost of the sedan vehicle object
	 * @return cost of the sedan 
	 */
	public double getCost()
	{
		return this.cost;
	}
}
