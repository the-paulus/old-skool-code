/*
 * Created on Feb 24, 2004
 */
package com.wickidcool.inventory;

import java.util.ArrayList;
import java.util.Iterator;

import com.wickidcool.inventory.persistence.InventoryItemDbPersistence;

import junit.framework.TestCase;

/**
 * @author windows
 */
public class InventoryItemTest extends TestCase {

	public void testGetInventory() {
		
		ArrayList theInventory = InventoryItemDbPersistence.getAllInventoryItems();
		
		assertTrue( "Empty Inventory collection.", !theInventory.isEmpty() );
		
		boolean itemFound = false;
		
		// make sure the data is getting filled in
		for ( Iterator iter=theInventory.iterator();iter.hasNext(); ) {
			
			InventoryItem theItem = (InventoryItem) iter.next();
			
			if ( theItem.getId() == 1 ) {
				
				itemFound = true;
				
				assertTrue( "SKU is not 5545", theItem.getSku() == 5545 );
				assertTrue( "Description is not My Item", theItem.getDescription().equals( "My Item" ) );
				assertTrue( "Quantity not 12", theItem.getQuantityOnHand() == 12 );
			}
		}
		
		assertTrue( "Item 1 not found.", itemFound );
	
	}
	
	public void testUpdates() {
		
		ArrayList theInventory = InventoryItemDbPersistence.getAllInventoryItems();
		
		// make sure the data is getting filled in
		for ( Iterator iter=theInventory.iterator();iter.hasNext(); ) {
			
			InventoryItem theItem = (InventoryItem) iter.next();
			
			if ( theItem.getId() == 2 ) {
				
				theItem.setDescription( "New Description" );
				theItem.setSku( 9999 );
				theItem.setQuantityOnHand( 45 );
				
				InventoryItemDbPersistence.saveInventoryItem( theItem );
				
				ArrayList newInventory = InventoryItemDbPersistence.getAllInventoryItems();
				
				for ( Iterator iter2= newInventory.iterator();iter2.hasNext(); ) {
					
					theItem = (InventoryItem) iter2.next();
					
					if ( theItem.getId() == 2 ) {
							
						assertTrue( "Updated Description is wrong", theItem.getDescription().equals( "New Description" ));
						assertTrue( "Updated sku is wrong", theItem.getSku() == 9999 );
						assertTrue( "Updated quantity on hand is wrong", theItem.getQuantityOnHand() == 45 );
					}
				}
			}
		}
		
		InventoryItemDbPersistence.shutdown();
	}
}
