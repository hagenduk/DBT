package dbt.online.delivery;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private int CUSTOMER_ID = 0;
	private String name;
	private String address;
	private String email;
	private Set<MyOrder> myOrders = new HashSet<MyOrder>();
	
	public Customer(String gname, String gaddress, String gemail) {
		this.name=gname;
		this.address=gaddress;
		this.email=gemail;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return CUSTOMER_ID;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.CUSTOMER_ID = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the myOrders
	 */
	public Set<MyOrder> getOrders() {
		return myOrders;
	}

	/**
	 * @param myOrders the myOrders to set
	 */
	public void setOrders(Set<MyOrder> myOrders) {
		this.myOrders = myOrders;
	}

}
