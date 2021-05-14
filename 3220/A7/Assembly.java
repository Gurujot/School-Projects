package code;

import java.util.ArrayList;

public class Assembly extends Item {
	
	// initialize arraylist of type Item
	private ArrayList<Item> items;
	
	public Assembly(String description) {
		super(description, 0);
		this.items = new ArrayList<Item>();
	}
	
	// method to add item
	public void addItem(Item item) {
		items.add(item);
	}
	// method to remove item
	public void removeItem(Item item) {
		items.remove(item);
	}
	// method to get cost
	public double getCost() {
		double cost = 0;
		
		for (int i=0; i<items.size(); i++) {
			cost += items.get(i).getCost();
		}
		return cost;
	}
	
	// method to get items 
	public String getItems() {
		
		if (items.size() == 0) {
			return getDescription() + " has no items";
		}
		else if (items.size() == 1) {
			return getDescription() + " has " + items.get(0).getDescription();
		}
		else {
			String desc = "";
			for (int i=0; i<items.size()-1; i++) {
				desc += items.get(i).getDescription() + ", ";
			}
			desc += "and " + items.get(items.size() -1 ).getDescription();
			return getDescription() + " has " + desc;
		}
	}
}
