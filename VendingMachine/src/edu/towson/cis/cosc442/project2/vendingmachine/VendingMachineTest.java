package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class VendingMachineTest {

	/**
	 * Initializes test case variables
	 */
	VendingMachine array1 = new VendingMachine();
	VendingMachineItem item1, item2;
	
	/**
	 * Initiates values for items
	 */
	@Before
	public void setUp() throws Exception {
		item1 = new VendingMachineItem("Doritos", 1.99);
		item2 = new VendingMachineItem("Cheetos", 1.59);
	}
	
	/**
	 * Test for addItem() method for VendingMachine class
	 * Makes sure exception goes through
	 */
	@Test(expected = VendingMachineException.class)
	public void testAddItem() 
	{
		array1.addItem(item1, "B");
		array1.addItem(item2, "B");
	}
	
	/**
	 * Test for removeItem() method for VendingMachine class
	 * Makes sure exception goes through
	 */
	@Test(expected = VendingMachineException.class)
	public void testRemoveItem()
	{
		array1.addItem(item1, "B");
		array1.addItem(item2, "C");
		array1.removeItem("D");
		array1.removeItem("C");
	}
	
	/**
	 * Test for insertMoney() method for VendingMachine class
	 * Makes sure exception goes through
	 */
	@Test(expected = VendingMachineException.class)
	public void testInsertMoney()
	{
		array1.insertMoney(2);
		array1.insertMoney(-1);
	}
	
	/**
	 * Test for getBalance() method for VendingMachine class
	 */
	@Test
	public void testGetBalance()
	{
		array1.insertMoney(2);
		assertEquals(2, array1.getBalance(), 0.0001);
	}
	
	/**
	 * Tests true for makePurchase() method for VendingMachine class
	 */
	@Test
	public void testMakePurchaseTrue()
	{
		array1.addItem(item1, "B");
		array1.insertMoney(2);
		assertTrue(array1.makePurchase("B"));
	}
	
	/**
	 * Tests false for makePurchase() method for VendingMachine class
	 */
	@Test
	public void testMakePurchaseFalse()
	{
		array1.addItem(item1, "B");
		array1.insertMoney(1);
		assertFalse(array1.makePurchase("B"));
	}
	
	/**
	 * Test for returnChange() method for VendingMachine class
	 */
	@Test
	public void testReturnChange()
	{
		array1.insertMoney(2);
		assertEquals(2, array1.returnChange(), 0.001);
	}
}
