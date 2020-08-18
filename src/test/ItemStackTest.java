package test;

import static org.junit.Assert.*;

import org.junit.Test;

import item.Item;
import item.ItemStack;

public class ItemStackTest {
	
	@Test
	public void testDefaultConstructor() {
		ItemStack testItemStack = new ItemStack();
		assertEquals("weight set properly", 1, testItemStack.weight, 0);
		assertEquals("basePrice set properly", 1, testItemStack.basePrice, 0);
		assertEquals("name set properly", "item", testItemStack.name);
		assertEquals("quantity set properly", 0, testItemStack.quantity);
	}
	@Test
	public void testConstructor() {
		ItemStack testItemStack = new ItemStack(1, 1, "item", 0);
		assertEquals("weight set properly", 1, testItemStack.weight, 0);
		assertEquals("basePrice set properly", 1, testItemStack.basePrice, 0);
		assertEquals("name set properly", "item", testItemStack.name);
		assertEquals("quantity set properly", 0, testItemStack.quantity);
	}
	@Test
	public void getTotalWeight() {
		ItemStack testItemStack = new ItemStack();
		assertEquals(0, testItemStack.getTotalWeight(), 0);
	}
	@Test
	public void getTotalPrice() {
		ItemStack testItemStack = new ItemStack();
		assertEquals(0, testItemStack.getTotalPrice(), 0);
	}
	@Test
	public void getItem() {
		ItemStack testItemStack = new ItemStack();
		assertEquals(new Item(), testItemStack.getItem());
	}
}
