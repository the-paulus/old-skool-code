/*
 * Created on Mar 29, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package net.paulslinuxbox.POS;

import junit.framework.TestCase;

/**
 * @author paulus
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ItemTest extends TestCase 
{
	private int tsku;
	private String tdescription;
	private double tcost;
	private double tselling;
	private int tamount;
	private Item item;
	
	public void setUp()
	{
		tsku = 10238;
		tdescription = "Floppy";
		tcost = 6.99;
		tamount = 2;
		tselling = 12.99;
		item = new Item( tsku, tdescription, tcost, tselling, tamount );
	}
	
	public void testGetters()
	{
		if( tsku != item.getSku() )
		{
			fail("getSku() has failed!");
		}
		
		if( tdescription != item.getDescription() )
		{
			fail("getDescription() has failed!");
		}
		
		if( tcost != item.getCost() )
		{
			fail("getCost() has failed!");
		}
		
		if( tamount != item.getAmount() )
		{
			fail("getAmount has failed!");
		}
		
		if( tselling != item.getSelling_price() )
		{
			fail("getSelling_price() has failed!");
		}
	}
	
	public void testSettings()
	{
		tsku = 2;
		tdescription = "hot dogs!";
		tcost = 2.99;
		tamount = 2;
		tselling = 3.99;
		
		item.setSku(tsku);
		item.setDescription(tdescription);
		item.setCost(tcost);
		item.setSelling_price(tselling);
		item.setAmount(tamount);
		
		if( tsku != item.getSku() )
		{
			fail("setSku() has failed!");
		}
		
		if( tdescription != item.getDescription() )
		{
			fail("setDescription() has failed!");
		}
		
		if( tcost != item.getCost() )
		{
			fail("setCost() has failed!");
		}
		
		if( tamount != item.getAmount() )
		{
			fail("setAmount has failed!");
		}
		
		if( tselling != item.getSelling_price() )
		{
			fail("setSelling_price() has failed!");
		}
	}
	

}
