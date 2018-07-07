/*
 * Created on Mar 29, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package net.paulslinuxbox.POS;

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
	final String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	final String url = "jdbc:odbc:POS";
	private Connection connection;
	private Statement statement;
	private Item item;
	
	public DBDriver()
	{
		try 
		{
			initialize();	
		} 
		catch (SQLException sqlex)
		{
			
		}
		
	}
	
	public void initialize() throws SQLException
	{
		try 
		{
			Class.forName(driver);
		}
		catch(ClassNotFoundException classex)
		{
		}
		
		connection = DriverManager.getConnection(url);
		connection.setAutoCommit(false);
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM INVENTORY;");
		
		//if( !rs.absolute(0) )
		//{
			createInventoryTable();
		//} 
		
		rs = statement.executeQuery("SELECT * FROM CUSTOMER;");
		
		if( !rs.absolute(0) )
		{
			createCustomerTable();
		}
		
		rs = statement.executeQuery("SELECT * FROM ORDERS;");
		
		if( !rs.absolute(0) ) 
		{
			createOrderTable();
		} 
		
		rs = statement.executeQuery("SELECT * FROM QUOTES;");
		
		if( !rs.absolute(0) )
		{
			createQuoteTable();
		}
	}
	
	private void createInventoryTable() throws SQLException
	{
		statement.executeUpdate("CREATE TABLE INVENTORY(SKU INT NOT NULL PRIMARY KEY, PRODUCT CHAR(128) NOT NULL, COST DOUBLE NOT NULL, PRICE DOUBLE NOT NULL, QUANTITY INT NOT NULL);");
		statement.executeUpdate("INSERT INTO INVENTORY(100000, Test, 1.99, 2.99, 10);");
	}
	
	private void createCustomerTable() throws SQLException
	{
		statement.executeUpdate("CREATE TABLE CUSTOMER(ID INT NOT NULL PRIMARY KEY, ACCOUNTNAME CHAR(128) NOT NULL, LASTNAME CHAR(64) NOT NULL, FIRSTNAME CHAR(64) NOT NULL, ADDRESS CHAR(128), CITY CHAR(64), STATE CHAR(2), ZIP INT, MAINPHONE CHAR(16), SECONDARYPHONE CHAR(16), EMAIL CHAR(32));");
	}
	private void createOrderTable() throws SQLException
	{
		statement.executeUpdate("CREATE TABLE ORDERS(ID INT NOT NULL PRIMARY KEY, ORDER DISTINCT NOT NULL);");
	}
	private void createQuoteTable() throws SQLException
	{
		statement.executeUpdate("CREATE TABLE QUOTES(ID INT NOT NULL PRIMARY KEY, QUOTE DISTINCT NOT NULL);");
	}
	public void addCustomer(ArrayList customerdata) throws SQLException
	{
		statement.executeUpdate("INSERT INTO CUSTOMERS VALUES (\'" + customerdata.get(0) + "\', \'" + customerdata.get(1) + "\', \'" + customerdata.get(2) + "\', \'" + customerdata.get(3) + "\', \'" + customerdata.get(4) + "\', \'" + customerdata.get(5) + "\', \'" + customerdata.get(6) + "\', \'" + customerdata.get(7) + "\', \'" + customerdata.get(8) + "\', \'" + customerdata.get(9) + "\', \'" + customerdata.get(10) + "\';");
	}
	public void addProduct(ArrayList productdata) throws SQLException
	{
		statement.executeUpdate("INSERT INTO INVENTORY VALUES ( " + productdata.get(0) + ", \'" + productdata.get(1) + "\', " + productdata.get(2) + ", " + productdata.get(3) + ", " + productdata.get(4) + ");");
	}
	
	public void removeQuote(String keyword, String column) throws SQLException
	{
		statement.executeUpdate("DELETE FROM QUOTES WHERE " + column + " = " + keyword);
	}
	
	public void removeOrder(String keyword, String column) throws SQLException
	{
		statement.executeUpdate("DELETE FROM ORDERS WHERE " + column + " = " + keyword);
	}
	
	public void removeProduct(String keyword, String column) throws SQLException
	{
		statement.executeUpdate("DELETE FROM INVENTORY WHERE " + column + " = " + keyword);
	}
	
	public void modifyCustomer(String accountname, ArrayList updates) throws SQLException
	{
		statement.executeUpdate("UPDATE CUSTOMERS SET ID = " + updates.get(0) + ", ACCOUNTNAME = \'" + updates.get(1) + "\', LASTNAME = \'" + updates.get(2) + "\', FIRSTNAME = \'" + updates.get(3) + "\', ADDRESS = \'" + updates.get(4) + "\', CITY = \'" + updates.get(5) + "\', STATE = \'" + updates.get(6) + "\', ZIP = " + updates.get(7) + ", MAINPHONE = \'" + updates.get(8) + "\', SECONDARYPHONE = \'" + updates.get(9) + "\', EMAIL = \'" + updates.get(10) + "\' WHERE ACCOUNTNAME = " + accountname);
	}
	public void modifyOrder(int id, ArrayList updates) throws SQLException
	{
		statement.executeUpdate("UPDATE ORDERS SET ORDER = " + updates.get(1) + " WHERE ID = " + id + ";");
	}
	public void modifyQuote(int id, ArrayList updates) throws SQLException
	{
		statement.executeUpdate("UPDATE ORDERS SET ORDER = " + updates.get(1) + " WHERE ID = " + id + ";");
	}
	public void modifyProduct(int sku, ArrayList updates) throws SQLException
	{
		statement.executeUpdate("UPDATE INVENTORY SET SKU = " + updates.get(0) + ", PRODUCT = \'" + updates.get(1) + "\', COST = " + updates.get(2) + ", PRICE = " + updates.get(3) + ", QUANTITY = " + updates.get(4) + ";");
	}
	public ArrayList searchCustomers(String keyword, String column) throws SQLException
	{
		ResultSet results = statement.executeQuery("SELECT * FROM CDUSTOMERS WHERE " + column + " LIKE " + keyword + ";");
		int id = 0;
		String accountname = null;
		String lastname = null;
		String firstname = null;
		String address = null;
		String city = null;
		String state = null;
		int zip = 0;
		String mainphone = null;
		String secondaryphone = null;
		String email = null;
		ArrayList return_array = new ArrayList();
		
		while( results.next() )
		{
			id = results.getInt("ID");
			accountname = results.getString("ACCOUNTNAME");
			lastname = results.getString("LASTNAME");
			firstname = results.getString("FIRSTNAME");
			address = results.getString("ADDRESS");
			city = results.getString("CITY");
			state = results.getString("STATE");
			zip = results.getInt("ZIP");
			mainphone = results.getString("MAINPHONE");
			secondaryphone = results.getString("SECONDARYPHONE");
			email = results.getString("EMAIL");
			return_array.add(new CustomerAccount(id, accountname, lastname, firstname, address, city, state, zip, mainphone, secondaryphone, email));
		}
		
		return return_array;
	}
	
	public ArrayList searchQuote(String keyword, String column) throws SQLException
	{
		ResultSet results = statement.executeQuery("SELECT * FROM QUOTES WHERE " + column + " LIKE " + keyword + ";");
		Order order = null;
		ArrayList db = new ArrayList();
		
		while( results.next() )
		{
			order = (Order)results.getObject("ORDER");	
			db.add(new Order(order));	
		}
		return db;
	}
	
	public ArrayList searchOrder(String keyword, String column) throws SQLException
	{
		ResultSet results = statement.executeQuery("SELECT * FROM INVENTORY WHERE " + column + " LIKE " + keyword + ";");
		int id = 0;
		Order order = null;
		ArrayList db = new ArrayList();
		
		while( results.next() )
		{
			id = results.getInt("ID");
			order = (Order)results.getObject("ORDER");	
			db.add(new Order(order));	
		}
		
		return db;	
		
	}
	
	public ArrayList retrieveQuoteTable() throws SQLException
	{
		ResultSet results = statement.executeQuery("SELECT * FROM QUOTES;");
		int id = 0;
		Order order = null;
		ArrayList db = new ArrayList();
		
		while( results.next() )
		{
			id = results.getInt("ID");
			order = (Order)results.getObject("ORDER");	
			db.add(new Order(order));	
		}
		
		return db;
	}
	
	public ArrayList retrieveOrderTable() throws SQLException
	{
		ResultSet results = statement.executeQuery("SELECT * FROM INVENTORY;");
		int id = 0;
		Order order = null;
		ArrayList db = new ArrayList();
		
		while( results.next() )
		{
			id = results.getInt("ID");
			order = (Order)results.getObject("ORDER");	
			db.add(new Order(order));	
		}
		return db;
	}
	
	public ArrayList retrieveInventoryTable() throws SQLException
	{
		ResultSet results = statement.executeQuery("SELECT * FROM INVENTORY;");

		int sku = 0;
		int quantity = 0;
		String product = null;
		double cost = 0.00;
		double price = 0.00;
		ArrayList db = new ArrayList();
		
		while(results.next())
		{
			sku = results.getInt("sku");
			quantity = results.getInt("quantity");
			product = results.getString("product");	
			cost = results.getDouble("cost");
			price = results.getDouble("price");
			db.add(new Item(sku,product,cost,price,quantity));
		}
		
		results.close();
		
		return db;
	}
	
	public ArrayList retrieveCustomersTable() throws SQLException
	{
		
		int id = 0;
		String accountname = null;
		String lastname = null;
		String firstname = null;
		String address = null;
		String city = null;
		String state = null;
		int zip = 0;
		String mainphone = null;
		String secondaryphone = null;
		String email = null;
		ArrayList db = new ArrayList();
		
		ResultSet results = statement.executeQuery("SELECT * FROM INVENTORY;");
		
		while( results.next() )
		{
			id = results.getInt("ID");
			accountname = results.getString("ACCOUNTNAME");
			lastname = results.getString("LASTNAME");
			firstname = results.getString("FIRSTNAME");
			address = results.getString("ADDRESS");
			city = results.getString("CITY");
			state = results.getString("STATE");
			zip = results.getInt("ZIP");
			mainphone = results.getString("MAINPHONE");
			secondaryphone = results.getString("SECONDARYPHONE");
			email = results.getString("EMAIL");
			db.add(new CustomerAccount(id, accountname, lastname, firstname, address, city, state, zip, mainphone, secondaryphone, email));
		}
		
		return db;
	}
}