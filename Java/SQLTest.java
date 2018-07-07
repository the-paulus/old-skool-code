import java.sql.*;
import java.util.*;

public class SQLTest 
{
	private static Connection connection;
	private ArrayList inventory = new ArrayList();
	private ArrayList item = new ArrayList();
	
	public static void main(String args[])
	{
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		String url = "jdbc:odbc:POS";
		
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			connection = DriverManager.getConnection(url);
			statement = connection.createStatement();
			
			results = statement.executeQuery("SELECT * FROM INVENTORY");
			
			while(results.next())
			{
				System.out.println(results.getInt("sku") + ", " + results.getString("description") + ", " + results.getFloat("cost") + ", " + results.getFloat("price") + ", " + results.getInt("stock"));
			}
		}
		catch(ClassNotFoundException classex)
		{
		}
		
		catch( SQLException sqlex)
		{
			sqlex.printStackTrace();
		}
	}
}
		