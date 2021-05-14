package code;

public abstract class Item {
	
	// initialize variables
	private String description;
	private double cost;
	
	// constructor
	public Item(String description, double cost) {
		this.description = description;
		this.cost = cost;
	}
	
	// get method for description
	public String getDescription() {
		return description;
	}
	
	// get method for cost
	public double getCost() {
		return cost;
	}
	
	// method to convert to string
	public String toString() {
		return description + " costs " + String.format("%.2f", getCost()) + " CAD";
	}
}
