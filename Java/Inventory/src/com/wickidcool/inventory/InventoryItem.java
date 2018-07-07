/*
 * Created on Feb 24, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.wickidcool.inventory;

import java.util.ArrayList;

import com.wickidcool.inventory.persistence.InventoryItemDbPersistence;

/**
 * @author windows
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class InventoryItem {

	private int sku;

	private int quantityOnHand;

	private String description;

	private int id;

	/**
	 * @return
	 */
	public int getId() {

		return id;
	}

	/**
	 * 
	 */
	public String getDescription() {

		return description;
	}

	/**
	 * @return
	 */
	public int getQuantityOnHand() {
		
		return quantityOnHand;
	}

	/**
	 * @param aDescription
	 */
	public void setDescription(String aDescription) {
		
		description = aDescription;
	}

	/**
	 * @param anId
	 */
	public void setId(int anId) {
		
		id = anId;
	}

	/**
	 * @param aQuantity
	 */
	public void setQuantityOnHand(int aQuantity) {
		
		quantityOnHand = aQuantity;
	}

	/**
	 * @return
	 */
	public int getSku() {

		return sku;
	}

	/**
	 * @param aSku
	 */
	public void setSku(int aSku) {
		
		sku = aSku;
	}

}
