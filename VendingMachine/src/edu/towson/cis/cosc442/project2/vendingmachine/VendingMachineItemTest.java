package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class VendingMachineItemTest {

	/**
	 * Initializes test case variables
	 */
	VendingMachineItem item1, item2;
	
	/**
	 * Initiates test case 1
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		item1 = new VendingMachineItem("Doritos", 1.99);
	}
	
	/**
	 * Test for constructor in VendingMachineItem class
	 * Makes sure exception is thrown
	 */
	@Test(expected = VendingMachineException.class)
	public void testConstructor()
	{
		item1 = new VendingMachineItem("Doritos", 1.99);
		item2 = new VendingMachineItem("Cheetos", -1.59);
	}
	
	/**
	 * Test for getName() method in VendingMachineItem class 
	 */
	@Test
	public void testGetName()
	{
		assertEquals("Doritos", item1.getName());
	}
	
	/**
	 * Test for getPrice method in VendingMachineItem class
	 */
	@Test
	public void testGetPrice()
	{
		assertEquals(1.99, item1.getPrice(), 0.001);
	}
}
