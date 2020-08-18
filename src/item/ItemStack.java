package item;

public class ItemStack extends Item {
	public int quantity;
	
	public ItemStack() {
		super();
		quantity = 0;
	}
	
	public ItemStack(double weight, double basePrice, String name, int quantity) {
		super(weight, basePrice, name);
		this.quantity = quantity;
	}
	
	public double getTotalWeight() {
		return weight * quantity;
	}
	
	public double getTotalPrice () {
		return basePrice * quantity;
	}
	
	public Item getItem() {
		return new Item(weight, basePrice, name);
	}
}
