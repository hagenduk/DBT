package dbt.online.delivery;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


public class MyOrder extends DBCommunication<MyOrder>{

	private int MYORDER_ID=0;
	private String orderDate;
	private float totalPrice;
	private Customer customer;
	private Set<Menu> menus = new HashSet<Menu>();
	
	public MyOrder(Customer customer) {
		super();
		orderDate = (new Timestamp(System.currentTimeMillis())).toString();
		this.customer = customer;
		this.create(this);
	}
	
	public void addMenu(Menu menu){
		menus.add(menu);
		this.totalPrice = this.totalPrice + menu.getPrice();
	}
	
	public void remiveMenu(Menu menu){
		menus.remove(menu);
		this.totalPrice = this.totalPrice - menu.getPrice();
	}
	
	public int getMYORDER_ID() {
		return MYORDER_ID;
	}
	public void setMYORDER_ID(int oRDER_ID) {
		MYORDER_ID = oRDER_ID;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String date) {
		this.orderDate = date;
	}
	
	private float getMenusPrice(){
		float menuPrice = 0;
		if (!this.menus.isEmpty()){
			for (Menu menu : this.menus){
				menuPrice = menuPrice + menu.getPrice();
			}
		}
		return menuPrice;
	}
	
	public float getTotalPrice() {
		if (totalPrice == 0) setTotalPrice(65);
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = getMenusPrice();
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Set<Menu> getMenus() {
		return menus;
	}
	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}

	public String toString(){
		String returnString = "Order-" + this.MYORDER_ID + "[" ;
		for(Menu menu : menus){
			returnString += menu.toString();
		}
		return returnString + "]";
	}	
}
