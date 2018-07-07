package com.wickidcool.inventory.ui;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.wickidcool.inventory.InventoryItem;
import com.wickidcool.inventory.persistence.InventoryItemDbPersistence;

public class TableDisplay extends JFrame {

   private JTable table;

   public TableDisplay() {

      buildTable();

      setSize( 450, 150 );
      show();
   }

   private void buildTable() {

    ArrayList theInventoryItems = InventoryItemDbPersistence.getAllInventoryItems();

    setTitle( "InventoryItems" );

    Vector columnHeads = new Vector();
    columnHeads.add( "SKU" );
    columnHeads.add( "Description" );
    columnHeads.add( "Quantity on Hand" );

    Vector rows = new Vector();
    Vector currentRow = null;
    
    InventoryItem theInventoryItem = null;

    for( Iterator iter = theInventoryItems.iterator();iter.hasNext(); ) {

      theInventoryItem = (InventoryItem) iter.next();

      currentRow = new Vector();
      currentRow.add( new Integer( theInventoryItem.getSku() ) );
      currentRow.add( theInventoryItem.getDescription() );
      currentRow.add( new Integer( theInventoryItem.getQuantityOnHand() ));

      rows.add( currentRow );
    }

    // display table with ResultSet contents
    table = new JTable( rows, columnHeads );
    JScrollPane scroller = new JScrollPane( table );
    getContentPane().add( scroller, BorderLayout.CENTER );
    validate();
  }

   public void shutDown() {

     InventoryItemDbPersistence.shutdown();
   }

   public static void main( String args[] )
   {
      final TableDisplay app = new TableDisplay();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               app.shutDown();
               System.exit( 0 );
            }
         }
      );
   }
}