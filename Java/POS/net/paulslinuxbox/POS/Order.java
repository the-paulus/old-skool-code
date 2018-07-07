/*
 * Created on Mar 25, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package net.paulslinuxbox.POS;

import java.util.ArrayList;

/**
 * @author paulus
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Order 
{
	/**
	 * Holds the Customer's information.
	 */
	CustomerAccount account = null;
	
	/**
	 * Holds all the customers payments.
	 */
	ArrayList payments = new ArrayList();
	/**
	 * Holds all the items that the customer has purchased.
	 */
	ArrayList items = new ArrayList();

	/**
	 * 
	 * @param caccount
	 * @param pay
	 * @param i
	 */
	public Order(CustomerAccount caccount, Payment pay, ArrayList i)
	{
		account = caccount;
		payments.add(pay);
		items.addAll(i);
	}
	/**
	 * 
	 * @param caccount
	 */
	public void setCustomerAccount(CustomerAccount caccount)
	{
		account = caccount;
	}
	
	/**
	 * 
	 * @param pay
	 */
	public void addPayment(Payment pay)
	{
		payments.add(pay);
	}
	
	/**
	 * 
	 * @param it
	 */
	public void addItem(Item it)
	{
		items.add(it);
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList getPayments()
	{
		return this.payments;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList getItems()
	{
		return this.items;
	}
}
