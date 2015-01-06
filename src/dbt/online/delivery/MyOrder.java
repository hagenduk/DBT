package dbt.online.delivery;

import java.util.Date;


public class MyOrder {

	private int ORDER_ID=0;
	private Date date = new Date();
	private float totalPrice=0;
	private int CUSTOMER_ID;
	
	public MyOrder(int CUSTOMER_ID) {
		this.CUSTOMER_ID=CUSTOMER_ID;
	}

	/**
	 * @return the ORDER_ID
	 */
	public int getId() {
		return ORDER_ID;
	}

	/**
	 * @param ORDER_ID the ORDER_ID to set
	 */
	public void setId(int id) {
		this.ORDER_ID = id;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the totalPrice
	 */
	public float getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the CUSTOMER_ID
	 */
	public int getCustomerId() {
		return CUSTOMER_ID;
	}

	/**
	 * @param CUSTOMER_ID the CUSTOMER_ID to set
	 */
	public void setCustomerId(int customerId) {
		this.CUSTOMER_ID = customerId;
	}

}
