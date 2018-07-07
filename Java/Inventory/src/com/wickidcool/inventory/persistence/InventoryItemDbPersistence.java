package com.wickidcool.inventory.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import java.util.ArrayList;

import com.wickidcool.inventory.InventoryItem;

public class InventoryItemDbPersistence {

  /**
   * The single connection to the database.
   */
  private static Connection connection;

  /**
   * The list of all the authors.
   */
  private static ArrayList allInventoryItems = new ArrayList();

  /**
   * Get all of the authors.
   *
   * @return The list of all authors.
   */
  public static ArrayList getAllInventoryItems() {

    if ( allInventoryItems.isEmpty() ) {
      loadInventoryItems();
    }

    return allInventoryItems;
  }

  /**
   * Get the connection to the database.
   *
   * @return The connection to the database.
   */
  private static Connection getConnection() {

    if ( connection == null ) {
      initializeConnection();
    }

    return connection;
  }

  public static void saveInventoryItem( InventoryItem anInventoryItem ) {

    if ( anInventoryItem.getId() == -1 ) {
      insert( anInventoryItem );
    }
    else {
      update( anInventoryItem );
    }
  }

  private static void insert( InventoryItem anInventoryItem ) {

    Statement statement;

    try {
      String insertStatement = "insert into InventoryItem ( id, sku, description, quantityOnHand ) values( " +
                               anInventoryItem.getId() + ", " +
                               anInventoryItem.getSku() + ", '" +
                               anInventoryItem.getDescription() + "', " +
							   anInventoryItem.getQuantityOnHand() + " )";
							   
      statement = getConnection().createStatement();
      statement.executeUpdate( insertStatement );

      statement.close();

      //updateId( anInventoryItem );
    }
    catch ( SQLException sqlex ) {
      sqlex.printStackTrace();
    }
  }

  private static void update( InventoryItem anInventoryItem ) {

    Statement statement;

    try {
      String updateStatement = "update InventoryItem set sku=" + anInventoryItem.getSku() +
                               ", description='" + anInventoryItem.getDescription() +
                               "', quantityOnHand=" + anInventoryItem.getQuantityOnHand() +
                               " where id=" + anInventoryItem.getId();

      statement = getConnection().createStatement();
      statement.executeUpdate( updateStatement );

      statement.close();
    }
    catch ( SQLException sqlex ) {
      sqlex.printStackTrace();
    }
  }

  /**
   * Method provided to close the database connection.
   */
  public static void shutdown() {

    try {
      connection.close();
    }
    catch ( SQLException e ) {
    }
    finally {
    	connection = null;
    }
  }

  /**
   * Get all of the authors out of the database into the list of all authors.
   */
  private static void loadInventoryItems() {

    Statement statement;
    ResultSet resultSet;

    try {
     String query = "SELECT * FROM InventoryItem";

     statement = getConnection().createStatement();
     resultSet = statement.executeQuery( query );
     buildInventoryItems( resultSet );
     statement.close();
    }
    catch ( SQLException sqlex ) {
       sqlex.printStackTrace();
    }
  }

  /**
   * Load the database driver and open a connection to the Books database.
   */
  private static void initializeConnection() {
    // The URL specifying the Books database to which
    // this program connects using JDBC to connect to a
    // Microsoft ODBC database.
    String url = "jdbc:odbc:Inventory";
    String username = "anonymous";
    String password = "guest";

    // Load the driver to allow connection to the database
    try {
       Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );

       connection = DriverManager.getConnection(
          url, username, password );
    }
    catch ( ClassNotFoundException cnfex ) {
       System.err.println(
          "Failed to load JDBC/ODBC driver." );
       cnfex.printStackTrace();
       System.exit( 1 );  // terminate program
    }
    catch ( SQLException sqlex ) {
       System.err.println( "Unable to connect" );
       sqlex.printStackTrace();
    }
  }
//
//  private static void updateId( Author anAuthor ) {
//
//    Statement statement;
//    ResultSet resultSet;
//
//    try {
//     String query = "SELECT authorid FROM Authors where firstName='" + anAuthor.getFirstName() +
//                    "' and lastName='" + anAuthor.getLastName() + "'";
//
//     statement = getConnection().createStatement();
//     resultSet = statement.executeQuery( query );
//
//     if (resultSet.next()) {
//       anAuthor.setId( resultSet.getInt( "authorid" ) );
//     }
//
//     statement.close();
//    }
//    catch ( SQLException sqlex ) {
//       sqlex.printStackTrace();
//    }
//  }

  /**
   * Create a new instance of an author for each row in the result set. Add each
   * author to the allAuthors list.
   */
  private static void buildInventoryItems( ResultSet aResultSet ) throws SQLException {

    InventoryItem theInventoryItem;

    while ( aResultSet.next() ) {

      theInventoryItem = new InventoryItem();
      theInventoryItem.setId( aResultSet.getInt( "id" ) );
      theInventoryItem.setSku( aResultSet.getInt( "sku") );
      theInventoryItem.setDescription( aResultSet.getString( "description") );
      theInventoryItem.setQuantityOnHand( aResultSet.getInt( "quantityOnHand") );

      allInventoryItems.add( theInventoryItem );
    }
  }

  public InventoryItemDbPersistence() {
  }


}