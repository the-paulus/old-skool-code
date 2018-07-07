/*
 * Created on Feb 26, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package net.paulslinuxbox.InventoryProject;

/**
 * @author paulus
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Item {

	private int sku = 0;
	private String name;
	private int amount;

	/**
	 * 
	 */
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(int s, String n, int a){
		this.sku = s;
		this.name = n;
		this.amount = a;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

//	public ItemDataBase getItemDataBase() {
//		return itemDataBase;
//	}
//
//	public void setItemDataBase(ItemDataBase itemDataBase) {
//		this.itemDataBase = itemDataBase;
//	}

}
