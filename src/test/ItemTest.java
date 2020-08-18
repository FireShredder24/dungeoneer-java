package test;

import static org.junit.Assert.*;

import org.junit.Test;

import item.Item;

public class ItemTest {
	Item testItem;

	@Test
	public void testConstructor() {
		testItem = new Item(1, 1, "test");
		assertEquals("weight set properly", 1, testItem.weight, 0);
		assertEquals("basePrice set properly", 1, testItem.basePrice, 0);
		assertEquals("name set properly", "test", testItem.name);
	}

}
