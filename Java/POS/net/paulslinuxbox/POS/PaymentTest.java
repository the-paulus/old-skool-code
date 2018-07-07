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
public class PaymentTest extends TestCase {

	private String type;
	private double amount;
	private Payment payment;
	
	public void testGetters()
	{
		if( type.compareTo(payment.getType()) != 0 )
		{
			fail("getType has failed!");
		}
		
		if( amount != payment.getAmount() )
		{
			fail("getAmount() has failed!");
		}
	}
	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		type = "Cash";
		amount = 5.00;
		payment = new Payment(type, amount);
	}

}
