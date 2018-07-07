/*
 * Created on Mar 27, 2004
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
public class TestCustomerAccount extends TestCase 
{
	/**
	 * This is a unique identifer for each customer who purchases something at the store.
	 */
	private int accountID = 10201;

	private String account_name = "Lyon, Paul";
	/**
	 * Customer's last name
	 */
	private String last_name = "Lyon";

	/**
	 * Customer's first name.
	 */
	private String first_name = "Paul";

	/**
	 * The customers address.
	 */
	private String address = "12345 Street";

	/**
	 * Holds where the city where the customer lives.
	 */
	private String city = "City";

	/**
	 * Holds the zip code fo the customer.
	 */
	private int zip = 12345;

	/**
	 * Customer's main phone number.
	 */
	private String main_phone = "(123) 123- 1234";

	/**
	 * Secondary phone number to reach the customer at.
	 */
	private String secondary_phone = "(234) 112-1234";

	/**
	 * An alternative way to contact the customer.
	 */
	private String email = "me@home.com";
	
	private String state = "WI";
	
	private CustomerAccount customer_account = null;

	public void setUp()
	{
		customer_account = new CustomerAccount(accountID, "Lyon, Paul", "Lyon", "Paul", "12345 Street", "City", "WI", 12345, "(123) 123-1234", "(234) 112-1234", "me@home.com");
	}
	
	public void testGetters()
	{
		if( customer_account.getAccountID() != accountID )
		{
			fail("accountID getter failed!");
		}
		
		if( account_name.compareTo(customer_account.getAccountName()) != 0 )
		{
			assertNotSame("getAccountName() failed!", account_name, customer_account.getAccountName());
		}
		
		if( last_name.compareTo(customer_account.getLast_name()) != 0 )
		{
			assertNotSame("getLast_name() failed!", last_name, customer_account.getLast_name());
		}
		
		if( first_name.compareTo(customer_account.getFirst_name()) != 0 )
		{
			assertNotSame("getFirst_name() failed!", first_name, customer_account.getFirst_name());
		}
		
		if( address.compareTo(customer_account.getAddress()) != 0 )
		{
			assertNotSame("getAddress() failed!", address, customer_account.getAddress());
		}
		
		if( city.compareTo(customer_account.getCity()) != 0 )
		{
			assertNotSame("getCity() failed!", city, customer_account.getCity());
		}
		
		if ( customer_account.getZip() != zip )
		{
			fail("getZip() failed!");
		}
		
		if( main_phone.compareTo(customer_account.getMain_phone()) != 0) 
		{
			assertNotSame("getMain_phone() failed!", main_phone, customer_account.getMain_phone());
		}
 
		if( secondary_phone.compareTo(customer_account.getSecondary_phone()) != 0 )
		{
			assertNotSame("getSecondary_phone() failed!", secondary_phone, customer_account.getSecondary_phone());
		} 
		
		if( email.compareTo(customer_account.getEmail()) != 0 )
		{
			assertNotSame("getEmail() failed!", email, customer_account.getEmail());
		}
		
		if( state.compareTo(customer_account.getState()) != 0 )
		{
			assertNotSame("getState() failed!", state, customer_account.getState());
		} 
	}
	
	public void testSetters()
	{
		accountID = 10;
		account_name = "Lyon, Paul2";
		last_name = "Lyon";
		first_name = "Paul";
		address = "123 Fake Street";
		city = "Fake City";
		zip = 54321;
		main_phone = "(262)253-1499";
		secondary_phone = "(262)253-1766";
		email = "plyon@milwaukeepc.com";
		state = "TX";
		
		customer_account.setAccountID(accountID);
		customer_account.setAccountName(account_name);
		customer_account.setLast_name(last_name);
		customer_account.setFirst_name(first_name);
		customer_account.setAddress(address);
		customer_account.setCity(city);
		customer_account.setZip(zip);
		customer_account.setMain_phone(main_phone);
		customer_account.setSecondary_phone(secondary_phone);
		customer_account.setEmail(email);
		customer_account.setState(state);
		
		if( customer_account.getAccountID() != accountID )
		{
			fail("accountID setter failed!");
		}
		
		if( account_name.compareTo(customer_account.getAccountName()) != 0 )
		{
			assertNotSame("getAccountName() failed!", account_name, customer_account.getAccountName());
		}
		
		if( last_name.compareTo(customer_account.getLast_name()) != 0 )
		{
			assertNotSame("getLast_name() failed!", last_name, customer_account.getLast_name());
		}
		
		if( first_name.compareTo(customer_account.getFirst_name()) != 0 )
		{
			assertNotSame("getFirst_name() failed!", first_name, customer_account.getFirst_name());
		}
		
		if( address.compareTo(customer_account.getAddress()) != 0 )
		{
			assertNotSame("getAddress() failed!", address, customer_account.getAddress());
		}
		
		if( city.compareTo(customer_account.getCity()) != 0 )
		{
			assertNotSame("getCity() failed!", city, customer_account.getCity());
		}
		
		if ( customer_account.getZip() != zip )
		{
			fail("getZip() failed!");
		}
		
		if( main_phone.compareTo(customer_account.getMain_phone()) != 0) 
		{
			assertNotSame("getMain_phone() failed!", main_phone, customer_account.getMain_phone());
		}
 
		if( secondary_phone.compareTo(customer_account.getSecondary_phone()) != 0 )
		{
			assertNotSame("getSecondary_phone() failed!", secondary_phone, customer_account.getSecondary_phone());
		} 
		
		if( email.compareTo(customer_account.getEmail()) != 0 )
		{
			assertNotSame("getEmail() failed!", email, customer_account.getEmail());
		}
		
		if( state.compareTo(customer_account.getState()) != 0 )
		{
			assertNotSame("getState() failed!", state, customer_account.getState());
		} 
	}
}
