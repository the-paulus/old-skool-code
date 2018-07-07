import net.paulslinuxbox.POS;

import java.sql.*;
import java.util.*;

/**
 * @author paulus
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
 
 public class DBDriver 
 {
	static final String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	static final String url = "jdbc:odbc:POS";
	private static Connection connection;
	private static ArrayList allCustomers = new ArrayList();
	private static ArrayList allOrders = new ArrayList();
	private static ArrayList allItems = new ArrayList();
	private Item item;
	
	public static ArrayList getAllCustomers()
	{
		if( allCustomers.isEmpty() )
		{
			loadCustomers();
		}
		
		return allCustomers;
	}
	
	private static void loadCustomers()
	{
		Statement statement;
		ResultSet results;
		
		try
		{
			statement = getConnection().createStatement();
			results = statement.executeQuery( "SELECT * FROM CUSTOMERS");
		}
		catch( SQLException sqlex)
		{
			sqlex.printStackTrace();
		}
	}
	
	private static void loadOrders()
	{
		Statement statement;
		ResultSet results;
		
		try
		{
			statement = getConnection().createStatement();
			results = statement.executeQuery( "SELECT * FROM ORDERS");
		}
		catch( SQLException sqlex)
		{
			sqlex.printStackTrace();
		}
	}
	
	private static Connection getConnection()
	{
		return connection;
	}
	
	private static void initConnection()
	{
		Statement statement = getConnection().createStatement();
		try 
		{
			Class.forName(driver);
			connection = DriverManager.getConnection(url);
			connection.setAutoCommit(false);
		}
		catch(ClassNotFoundException classex)
		{
			System.err.println( "Loading JDBC/ODBC driver has failed." );
			classex.printStackTrace();
			exit(1);
		}
		catch( SQLException sqlex )
		{
			System.err.println( "Failed to connect." );
			sqlex.printStackTrace();
		}
	}
	
	//The following functions are for items only.
	
	private static void loadInventory()
	{
		Statement statement;
		ResultSet results;
		
		try
		{
			statement = getConnection().createStatement();
			results = statement.executeQuery( "SELECT * FROM INVENTORY" );
			statement.close();
			buildInventoryArray( results );
		}
		catch( SQLException sqlex )
		{
			sqlex.printStackTrace();
		}
	}
	
	private static void buildInventoryArray( ResultSet aresultset ) throws SQLException 
	{
		Item theitem;
		
		while ( aresultset.next() )
		{
			theitem = new Item();
			theitem.setID( aresultset.getInt("ID") );
			theitem.setSKU( aresultset.getInt("SKU") );
			theitem.setDescription( aresultset.getString("DESCRIPTION") );
			theitem.setCost( aresultset.getFloat("COST") );
			theitem.setPrice( aresultset.getFloat("PRICE") );
			theitem.setQuantity( aresultset.getInt("QUANTITY") );
			
			allIitems.add( theitem );
		}
	}
	
	public static void saveItem( Item anItem )
	{
		if( anItem.getID() == -1 )
		{
			add( anItem );
		}
		else
		{
			update( anItem );
		}
	}
	
	private static void add( Item anItem )
	{
		Statement statement;
		try
		{
			statement = getConnection().createStatement();
			statement.executeUpdate( "INSERT INTO INVENTORY ( ID, SKU, DESCRIPTION, COST, PRICE, QUANTITY ) VALUES ( " + anItem.getID() + ", " + anItem.getSKU() + ", '" + anItem.getDecription() + "', " + anItem.getCost() + ", " + anItem.getPrice() + ", " + anItem.getQuantity() + " )";
			statement.close();
		}
		catch( SQLException sqlex ) 
		{
			sqlex.printStackTrace();
		}
	}
	
	private static void update( Item anItem )
	{
		Statement statement;
		try
		{
			statement = getConnection().createStatement();
			statement.executeUpdate( "UPDATE INVENTORY SET SKU=" + anItem.getSKU() + ", DESCRIPTION='" + anItem.getDescription() + "', COST=" + anItem.getCost() + ", PRICE=" + anItem.getPrice() + ", QUANTITY=" + anItem.getQuantity() + " )";
			statement.close();
		}
		catch( SQLException sqlex ) 
		{
			sqlex.printStackTrace();
		}
	}
	
	private static void close()
	{
		try
		{
			connection.close();
		}
		catch( SQLException sqlex ) 
		{
		}
		finally
		{
			connection = null;
		}
	}	
}