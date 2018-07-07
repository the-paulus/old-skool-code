/*
 * Created on Feb 26, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package net.paulslinuxbox.InventoryProject;

import java.util.*;
import java.sql.*;

/**
 * @author paulus
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ItemDataBase 
{
	static final String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	static final String url = "jdbc:odbc:Inventory";
	private Connection connection;
	private Statement statement;
	private ArrayList db = new ArrayList();
	private Item item;

	/**
	 * 
	 */
	public ItemDataBase() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void initialize() throws SQLException, ClassNotFoundException
	{
		Class.forName(driver);
		connection = DriverManager.getConnection(url);
		connection.setAutoCommit(false);
	}

//	public ArrayList getItem() {
//		ArrayList al = new ArrayList();
//		al.add(new Integer(item.getSku()));
//		al.add(new String(item.getName()));
//		al.add(new Integer(item.getAmount()));
//		return al;
//	}

	private ArrayList retreiveTable() throws SQLException
	{
		ResultSet results = statement.executeQuery("SELECT * FROM INVENTORY");

		int sku = 0;
		int quantity = 0;
		String product = null;
		
		while(results.next())
		{
			sku = results.getInt("sku");
			quantity = results.getInt("quantity");
			product = results.getString("product");	
			db.add(new Item(sku,product,quantity));
		}
		results.close();
		
		return db;
	}
	
	public void renewData()
	{
		try
		{
			db.clear();
			retreiveTable();
		}
		catch( SQLException exception)
		{
			System.out.println(exception.getCause());
		}
	}
	
	private void createTable() throws SQLException
	{
		statement = connection.createStatement();
		statement.executeUpdate("CREATE TABLE INVENTORY(ID INT NOT NULL PRIMARY KEY, SKU INT NOT NULL, PRODUCT CHAR(128) NOT NULL, QUANTITY INT NOT NULL);");
	}
}
