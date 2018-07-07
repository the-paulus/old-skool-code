/*
 * Created on Apr 1, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package net.paulslinuxbox.POS;

import junit.framework.*;
import java.util.*;
import java.sql.*;

/**
 * @author paulus
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class DBDriverTest extends TestCase {

	/**
	 * Constructor for DBDriverTest.
	 * @param arg0
	 */
	DBDriver db_driver = null;
	public DBDriverTest(String arg0) {
		super(arg0);
	}

	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		db_driver = new DBDriver();
	}
	
	public void testCreateTable()
	{
		ArrayList inventory = new ArrayList();
		ArrayList customers = new ArrayList();
		ArrayList orders = new ArrayList();
		ArrayList quotes = new ArrayList();
		try
		{
			inventory = db_driver.retrieveInventoryTable();
			customers = db_driver.retrieveCustomersTable();
			orders = db_driver.retrieveOrderTable();
			quotes = db_driver.retrieveQuoteTable();
		}
		catch(SQLException sqlex)
		{
		}
		
		if( inventory.isEmpty() )
		{
			fail("Inventory DB was not created!");
		}
		
		if( customers.isEmpty() )
		{
			fail("Customers DB was not created!");
		}
		
		if( orders.isEmpty() )
		{
			fail("Orders DB was not created!");
		}
		
		if( quotes.isEmpty() )
		{
			fail("Quotes DB was not created!");
		}
	}

}
