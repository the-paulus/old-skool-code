/*
 * Created on Mar 23, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package net.paulslinuxbox.POS;

import java.lang.String;
/**
 * @author paulus
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Item {

	/**
	 * The unique idtentifier for this item.
	 */
	private int sku;

	/**
	 * Item's description.
	 */
	private String description;

	/**
	 * The cost to purchase of each of this item.
	 */
	private double cost;

	private int quantity;

	/**
	 * how man of these itmes there are.
	 */
	private double price;

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item(
		int input_sku,
		String input_description,
		double input_cost,
		double input_price,
		int input_quantity) 
	{
		this.setSku(input_sku);
		this.setDescription(input_description);
		this.setCost(input_cost);
		this.setPrice(input_price);
		this.setQuantity(input_quantity);	
	}

	Item(Item input_item) 
	{
		this.sku = input_item.getSku();
		this.description = input_item.getDescription();
		this.cost = input_item.getCost();
		this.price = input_item.getPrice();
		this.quantity = input_item.getQuantity();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
