package dbt.online.delivery;

import java.util.HashSet;
import java.util.Set;

public class Customer extends DBCommunication<Customer>{

	private int CUSTOMER_ID = 0;
	private String name;
	private String address;
	private String email;
	private Set<MyOrder> myOrders = new HashSet<MyOrder>();
	
	public Customer(String gname, String gaddress, String gemail) {
		super();
		this.name=gname;
		this.address=gaddress;
		this.email=gemail;
		this.create(this);
	}

	public int getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}


	public void setCUSTOMER_ID(int cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}



	public Set<MyOrder> getMyOrders() {
		return myOrders;
	}



	public void setMyOrders(Set<MyOrder> myOrders) {
		this.myOrders = myOrders;
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
	
	public String toString(){		
		return "Customer-" + this.CUSTOMER_ID+ "[" + this.name  + "]";
	}
}
