///*
// * Created on Mar 29, 2004
// *
// * To change the template for this generated file go to
// * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
// */
//package net.paulslinuxbox.POS;
//
//import java.sql.*;
//import java.util.*;
//
///**
// * @author paulus
// *
// * To change the template for this generated type comment go to
// * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
// */
//public class DBDriver 
//{
//	static final String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
//	static final String url = "jdbc:odbc:POS";
//	private static Connection connection;
//	private static ArrayList allCustomers = new ArrayList();
//	private static ArrayList allOrders = new ArrayList();
//	private static ArrayList allItems = new ArrayList();
//	private Item item;
//	
//	public static ArrayList getAllCustomers()
//	{
//		if( allCustomers.isEmpty() )
//		{
//			loadCustomers();
//		}
//		
//		return allCustomers;
//	}
//	
//	private static void loadCustomers()
//	{
//		Statement statement;
//		ResultSet results;
//		
//		try
//		{
//			statement = getConnection().createStatement();
//			results = statement.executeQuery( "SELECT * FROM CUSTOMERS");
//		}
//		catch( SQLException sqlex)
//		{
//			sqlex.printStackTrace();
//		}
//	}
//	
//	private static void loadOrders()
//	{
//		Statement statement;
//		ResultSet results;
//		
//		try
//		{
//			statement = getConnection().createStatement();
//			results = statement.executeQuery( "SELECT * FROM ORDERS");
//		}
//		catch( SQLException sqlex)
//		{
//			sqlex.printStackTrace();
//		}
//	}
//	
//	private static Connection getConnection()
//	{
//		return connection;
//	}
//	
//	public void initialize() throws SQLException
//	{
//		Statement statement = getConnection().createStatement();
//		try 
//		{
//			Class.forName(driver);
//		}
//		catch(ClassNotFoundException classex)
//		{
//		}
//		
//		connection = DriverManager.getConnection(url);
//		connection.setAutoCommit(false);
//		statement = connection.createStatement();
//		ResultSet rs = statement.executeQuery("SELECT * FROM INVENTORY;");
//		
//		//if( !rs.absolute(0) )
//		//{
//			createInventoryTable();
//		//} 
//		
//		rs = statement.executeQuery("SELECT * FROM CUSTOMER;");
//		
//		if( !rs.absolute(0) )
//		{
//			createCustomerTable();
//		}
//		
//		rs = statement.executeQuery("SELECT * FROM ORDERS;");
//		
//		if( !rs.absolute(0) ) 
//		{
//			createOrderTable();
//		} 
//		
//		rs = statement.executeQuery("SELECT * FROM QUOTES;");
//		
//	}
//	
//	private void createInventoryTable() throws SQLException
//	{
//		Statement statement = getConnection().createStatement();
//		statement.executeUpdate("CREATE TABLE INVENTORY(SKU INT NOT NULL PRIMARY KEY, PRODUCT CHAR(128) NOT NULL, COST DOUBLE NOT NULL, PRICE DOUBLE NOT NULL, QUANTITY INT NOT NULL);");
//		//statement.executeUpdate("INSERT INTO INVENTORY(100000, Test, 1.99, 2.99, 10);");
//		statement.close();
//	}
//	
//	private void createCustomerTable() throws SQLException
//	{
//		Statement statement = getConnection().createStatement();
//		statement.executeUpdate("CREATE TABLE CUSTOMERS(ID INT NOT NULL PRIMARY KEY, ACCOUNTNAME CHAR(128) NOT NULL, LASTNAME CHAR(64) NOT NULL, FIRSTNAME CHAR(64) NOT NULL, ADDRESS CHAR(128), CITY CHAR(64), STATE CHAR(2), ZIP INT, MAINPHONE CHAR(16), SECONDARYPHONE CHAR(16), EMAIL CHAR(32));");
//		statement.close();
//	}
//	private void createOrderTable() throws SQLException
//	{
//		Statement statement = getConnection().createStatement();
//		statement.executeUpdate("CREATE TABLE ORDERS(ID INT NOT NULL PRIMARY KEY, ORDERTYPE CHAR(64) NOT NULL, ACCOUNT CHAR(128) NOT NULL, LASTNAME CHAR(64) NOT NULL, FIRSTNAME CHAR(64) NOT NULL, ORDER DISTINCT NOT NULL);");
//		statement.close();
//	}
//	
//	public void addCustomer(ArrayList customerdata) throws SQLException
//	{
//		Statement statement = getConnection().createStatement();
//		statement.executeUpdate("INSERT INTO CUSTOMERS VALUES (\'" + customerdata.get(CustomerAccount.ACCOUNT_ID) + "\', \'" + customerdata.get(CustomerAccount.ACCOUNT_NAME) + "\', \'" + customerdata.get(CustomerAccount.LAST_NAME) + "\', \'" + customerdata.get(CustomerAccount.FIRST_NAME) + "\', \'" + customerdata.get(CustomerAccount.ADDRESS) + "\', \'" + customerdata.get(CustomerAccount.CITY) + "\', \'" + customerdata.get(CustomerAccount.ZIP) + "\', \'" + customerdata.get(CustomerAccount.STATE) + "\', \'" + customerdata.get(CustomerAccount.MAIN_PHONE) + "\', \'" + customerdata.get(CustomerAccount.SECONDARY_PHONE) + "\', \'" + customerdata.get(CustomerAccount.EMAIL) + "\';");
//		statement.close();
//	}
//	
//	public void addProduct(ArrayList productdata) throws SQLException
//	{
//		Statement statement = getConnection().createStatement();
//		statement.executeUpdate("INSERT INTO INVENTORY VALUES ( " + productdata.get(Item.SKU) + ", \'" + productdata.get(Item.DESCRITPION) + "\', " + productdata.get(Item.COST) + ", " + productdata.get(Item.PRICE) + ", " + productdata.get(Item.QUANTITY) + ");");
//		statement.close();
//	}
//	
//	public void removeOrder(String keyword, String column) throws SQLException
//	{
//		statement.executeUpdate("DELETE FROM ORDERS WHERE " + column + " = " + keyword);
//	}
//	
//	public void removeProduct(String keyword, String column) throws SQLException
//	{
//		statement.executeUpdate("DELETE FROM INVENTORY WHERE " + column + " = " + keyword);
//	}
//	
//	public void modifyCustomer(String accountname, ArrayList updates) throws SQLException
//	{
//		statement.executeUpdate("UPDATE CUSTOMERS SET ID = " + updates.get(CustomerAccount.ACCOUNT_ID) + ", ACCOUNTNAME = \'" + updates.get(CustomerAccount.ACCOUNT_NAME) + "\', LASTNAME = \'" + updates.get(CustomerAccount.LAST_NAME) + "\', FIRSTNAME = \'" + updates.get(CustomerAccount.FIRST_NAME) + "\', ADDRESS = \'" + updates.get(CustomerAccount.ADDRESS) + "\', CITY = \'" + updates.get(CustomerAccount.CITY) + "\', STATE = \'" + updates.get(CustomerAccount.STATE) + "\', ZIP = " + updates.get(CustomerAccount.ZIP) + ", MAINPHONE = \'" + updates.get(CustomerAccount.MAIN_PHONE) + "\', SECONDARYPHONE = \'" + updates.get(CustomerAccount.SECONDARY_PHONE) + "\', EMAIL = \'" + updates.get(CustomerAccount.EMAIL) + "\' WHERE ACCOUNTNAME = " + accountname);
//	}
//	public void modifyOrder(int id, ArrayList updates) throws SQLException
//	{
//		statement.executeUpdate("UPDATE ORDERS SET ORDER = " + updates.get(1) + " WHERE ID = " + id + ";");
//	}
//	public void modifyProduct(int sku, ArrayList updates) throws SQLException
//	{
//		statement.executeUpdate("UPDATE INVENTORY SET SKU = " + updates.get(0) + ", PRODUCT = \'" + updates.get(1) + "\', COST = " + updates.get(2) + ", PRICE = " + updates.get(3) + ", QUANTITY = " + updates.get(4) + ";");
//	}
//	public ArrayList searchCustomers(String keyword, String column) throws SQLException
//	{
//		ResultSet results = statement.executeQuery("SELECT * FROM CDUSTOMERS WHERE " + column + " LIKE " + keyword + ";");
//		int id = 0;
//		String accountname = null;
//		String lastname = null;
//		String firstname = null;
//		String address = null;
//		String city = null;
//		String state = null;
//		int zip = 0;
//		String mainphone = null;
//		String secondaryphone = null;
//		String email = null;
//		ArrayList return_array = new ArrayList();
//		
//		while( results.next() )
//		{
//			id = results.getInt("ID");
//			accountname = results.getString("ACCOUNTNAME");
//			lastname = results.getString("LASTNAME");
//			firstname = results.getString("FIRSTNAME");
//			address = results.getString("ADDRESS");
//			city = results.getString("CITY");
//			state = results.getString("STATE");
//			zip = results.getInt("ZIP");
//			mainphone = results.getString("MAINPHONE");
//			secondaryphone = results.getString("SECONDARYPHONE");
//			email = results.getString("EMAIL");
//			return_array.add(new CustomerAccount(new Integer(id), accountname, lastname, firstname, address, city, state, new Integer(zip), mainphone, secondaryphone, email));
//		}
//		
//		return return_array;
//	}
//	
//	public ArrayList searchQuote(String keyword, String column) throws SQLException
//	{
//		ResultSet results = statement.executeQuery("SELECT * FROM QUOTES WHERE " + column + " LIKE " + keyword + ";");
//		CustomerOrder order = null;
//		ArrayList db = new ArrayList();
//		
//		while( results.next() )
//		{
//			order = (CustomerOrder)results.getObject("ORDER");	
//			db.add(new CustomerOrder(order));	
//		}
//		return db;
//	}
//	
//	public ArrayList searchOrder(String keyword, String column) throws SQLException
//	{
//		ResultSet results = statement.executeQuery("SELECT * FROM INVENTORY WHERE " + column + " LIKE " + keyword + ";");
//		int id = 0;
//		CustomerOrder order = null;
//		ArrayList db = new ArrayList();
//		
//		while( results.next() )
//		{
//			id = results.getInt("ID");
//			order = (CustomerOrder)results.getObject("ORDER");	
//			db.add(new CustomerOrder(order));	
//		}
//		
//		return db;	
//		
//	}
//	
//	public ArrayList retrieveQuoteTable() throws SQLException
//	{
//		ResultSet results = statement.executeQuery("SELECT * FROM QUOTES;");
//		int id = 0;
//		CustomerOrder order = null;
//		ArrayList db = new ArrayList();
//		
//		while( results.next() )
//		{
//			id = results.getInt("ID");
//			order = (CustomerOrder)results.getObject("ORDER");	
//			db.add(new CustomerOrder(order));	
//		}
//		
//		return db;
//	}
//	
//	public ArrayList retrieveOrderTable() throws SQLException
//	{
//		ResultSet results = statement.executeQuery("SELECT * FROM INVENTORY;");
//		int id = 0;
//		CustomerOrder order = null;
//		ArrayList db = new ArrayList();
//		
//		while( results.next() )
//		{
//			id = results.getInt("ID");
//			order = (CustomerOrder)results.getObject("ORDER");	
//			db.add(new CustomerOrder(order));	
//		}
//		return db;
//	}
//	
//	public ArrayList retrieveInventoryTable() throws SQLException
//	{
//		ResultSet results = statement.executeQuery("SELECT * FROM INVENTORY;");
//
//		int sku = 0;
//		int quantity = 0;
//		String product = null;
//		double cost = 0.00;
//		double price = 0.00;
//		ArrayList db = new ArrayList();
//		
//		while(results.next())
//		{
//			sku = results.getInt("sku");
//			quantity = results.getInt("quantity");
//			product = results.getString("product");	
//			cost = results.getDouble("cost");
//			price = results.getDouble("price");
//			db.add(new Item(sku,product,cost,price,quantity));
//		}
//		
//		results.close();
//		
//		return db;
//	}
//	
//	public ArrayList retrieveCustomersTable() throws SQLException
//	{
//		
//		Integer id = null;
//		String accountname = null;
//		String lastname = null;
//		String firstname = null;
//		String address = null;
//		String city = null;
//		String state = null;
//		Integer zip = null;
//		String mainphone = null;
//		String secondaryphone = null;
//		String email = null;
//		ArrayList db = new ArrayList();
//		
//		ResultSet results = statement.executeQuery("SELECT * FROM INVENTORY;");
//		
//		while( results.next() )
//		{
//			id = new Integer(results.getInt("ID"));
//			accountname = results.getString("ACCOUNTNAME");
//			lastname = results.getString("LASTNAME");
//			firstname = results.getString("FIRSTNAME");
//			address = results.getString("ADDRESS");
//			city = results.getString("CITY");
//			state = results.getString("STATE");
//			zip = new Integer(results.getInt("ZIP"));
//			mainphone = results.getString("MAINPHONE");
//			secondaryphone = results.getString("SECONDARYPHONE");
//			email = results.getString("EMAIL");
//			db.add(new CustomerAccount(id, accountname, lastname, firstname, address, city, state, zip, mainphone, secondaryphone, email));
//		}
//		
//		return db;
//	}
//	
//	// this function is for testing only!! 
//	public ResultSet sendQuery(String query) throws SQLException
//	{
//		return statement.executeQuery(query);
//	}
//}