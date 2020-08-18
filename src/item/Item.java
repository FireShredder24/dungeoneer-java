package item;

public class Item {
	public double weight;
	public double basePrice;
	public String name;
	
	public Item() {
		weight = 1;
		basePrice = 1;
		name = "item";
	}
	
	public Item(double weight, double basePrice, String name) {
		this.weight = weight;
		this.basePrice = basePrice;
		this.name = name;
	}
	
	public Item(Item item) {
		this.weight = item.weight;
		this.basePrice = item.basePrice;
		this.name = item.name;
	}
}
