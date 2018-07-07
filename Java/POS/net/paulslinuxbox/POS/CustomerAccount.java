/*
 * Created on Mar 23, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

package net.paulslinuxbox.POS;

/**
 * @author Paul Lyon
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

public class CustomerAccount {

	/**
	 * This is a unique identifer for each customer who purchases something at the store.
	 */
	private int accountID;

	/**
	 * The name of the account.
	 */
	private String accountname;
	
	/**
	 * Customer's last name
	 */
	private String last_name;

	/**
	 * Customer's first name.
	 */
	private String first_name;

	/**
	 * The customers address.
	 */
	private String address;

	/**
	 * Holds where the city where the customer lives.
	 */
	private String city;

	/**
	 * Holds the zip code fo the customer.
	 */
	private int zip;

	/**
	 * Holds the state that the customer resides in.
	 */
	private String state;
	
	/**
	 * Customer's main phone number.
	 */
	private String main_phone;

	/**
	 * Secondary phone number to reach the customer at.
	 */
	private String secondary_phone;

	/**
	 * An alternative way to contact the customer.
	 */
	private String email;

	public CustomerAccount(int input_accountid, 
						   String input_account_name,
						   String input_last_name,
						   String input_first_name,
						   String input_address,
						   String input_city,
						   String input_state,
						   int input_zip,
						   String input_main_phone,
						   String input_secondary_phone,
						   String input_email)
	{
		this.setAccountID(input_accountid);
		this.setAccountName(input_account_name);
		this.setLast_name(input_last_name);
		this.setFirst_name(input_first_name);
		this.setAddress(input_address);
		this.setCity(input_city);
		this.setState(input_state);
		this.setZip(input_zip);
		this.setMain_phone(input_main_phone);
		this.setSecondary_phone(input_secondary_phone);
		this.setEmail(input_email);

	}
	
	public CustomerAccount(CustomerAccount customeraccount)
	{
		this.accountID = customeraccount.getAccountID();
		this.accountname = customeraccount.getAccountName();
		this.last_name = customeraccount.getLast_name();
		this.first_name = customeraccount.getFirst_name();
		this.address = customeraccount.getAddress();
		this.city = customeraccount.getCity();
		this.zip = customeraccount.getZip();
		this.state = customeraccount.getState();
		this.main_phone = customeraccount.getMain_phone();
		this.secondary_phone = customeraccount.getSecondary_phone();
		this.email =customeraccount.getEmail();
	}
	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountName()
	{
		return this.accountname;
	}
	
	public void setAccountName(String accountname)
	{
		this.accountname = accountname;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String City) {
		this.city = City;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getMain_phone() {
		return main_phone;
	}

	public void setMain_phone(String main_phone) {
		this.main_phone = main_phone;
	}

	public String getSecondary_phone() {
		return secondary_phone;
	}

	public void setSecondary_phone(String secondary_phone) {
		this.secondary_phone = secondary_phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getState()
	{
		return this.state;
	}
}
