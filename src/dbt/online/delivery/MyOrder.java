package dbt.online.delivery;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class MyOrder {

	private int ORDER_ID=0;
	private Date date = new Date();
	private float totalPrice=0;
	private int CUSTOMER_ID;
	private Set<Pizza> pizzas = new HashSet<Pizza>();
	private Set<Supplement> supplements = new HashSet<Supplement>();
	private Set<SpecialPromotion> specials = new HashSet<SpecialPromotion>();

	
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

	/**
	 * @return the oRDER_ID
	 */
	public int getORDER_ID() {
		return ORDER_ID;
	}

	/**
	 * @param oRDER_ID the oRDER_ID to set
	 */
	public void setORDER_ID(int oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}

	/**
	 * @return the cUSTOMER_ID
	 */
	public int getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	/**
	 * @param cUSTOMER_ID the cUSTOMER_ID to set
	 */
	public void setCUSTOMER_ID(int cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	/**
	 * @return the pizzas
	 */
	public Set<Pizza> getPizzas() {
		return pizzas;
	}

	/**
	 * @param pizzas the pizzas to set
	 */
	public void setPizzas(Set<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	/**
	 * @return the supplements
	 */
	public Set<Supplement> getSupplements() {
		return supplements;
	}

	/**
	 * @param supplements the supplements to set
	 */
	public void setSupplements(Set<Supplement> supplements) {
		this.supplements = supplements;
	}

	/**
	 * @return the specials
	 */
	public Set<SpecialPromotion> getSpecials() {
		return specials;
	}

	/**
	 * @param specials the specials to set
	 */
	public void setSpecials(Set<SpecialPromotion> specials) {
		this.specials = specials;
	}

}
