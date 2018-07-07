/*
 * Created on Mar 2, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package net.paulslinuxbox.InventoryProject;

import java.sql.*;
import java.util.*;
import junit.framework.*;

/**
 * @author paulus
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestItemDataBase extends TestCase 
{
	static final String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	static final String url = "jdbc:odbc:Inventory";
	private Connection connection;
	private Statement statement;
	private ArrayList db = new ArrayList();
	private Item item;
	
	public void setUp() 
	{
		item = new Item(100000, "Floppy", 10);
		assertNotNull(item);
		try
		{
			connection = DriverManager.getConnection(url);
			connection.setAutoCommit(false);
		}
		
	}
	
	public void tearDown() throws SQLException
	{
		connection.close();
	}
	
	public void testInitialize()
	{
		try
		{
			Class.forName(driver);
		}
		catch( ClassNotFoundException classnotfoundexception)
		{
			Assert.fail(classnotfoundexception.getMessage());
		}
		
//		try
//		{
//			connection = DriverManager.getConnection(url);
//			connection.setAutoCommit(false);
//		}
//		catch(SQLException sqlexception)
//		{
//			Assert.assertNull("Connection is null!", connection);
//		}
	}
	
//	public void testGetItem()
//	{
//		
//	}

	public void testRetrieveTable()
	{
		ResultSet results = null;
	
		try
		{
			results = statement.executeQuery("SELECT * FROM InventoryTable");
		}
		catch( SQLException sqlexception)
		{
			fail(sqlexception.getMessage());
		}
		
		Integer sku = null;
		Integer quantity = null;
		String product = null;
		Item i = null;
		try 
		{
			while(results.next())
			{
				sku = new Integer(results.getInt("sku"));
				if( sku == null )
				{
					Assert.fail("sku is null");
				}
				quantity = new Integer(results.getInt("quantity"));
				if ( quantity == null)
				{
					Assert.fail("quanitiy is null");
				}
				product = results.getString("product");
				if( product == null)
				{
					Assert.fail("product is null");	
				}
				i = new Item(sku.intValue(),product,quantity.intValue());
				if( i == null)
				{
					Assert.fail("item is null");
				}
				db.add(new Item(sku.intValue(),product,quantity.intValue()));
			}
		
			results.close();
		} catch(SQLException sqlexcaption)
		{
			fail(sqlexcaption.getMessage());
		}
	}
}
