package dbt.online.delivery;

import java.util.HashSet;
import java.util.Set;

public class Menu extends DBCommunication<Menu>{

	private int MENU_ID = 0;
	private String name;
	private float price;
	private int discount;
	private Set<Product> products = new HashSet<Product>();

	public Menu(String name, int discount) {
		super();
		this.name = name;		
		this.discount = discount;
		this.create(this);
	}
	
	public void addProduct(Product prod){
		products.add(prod);
		this.price = this.price + prod.getPrice() * (100-discount)/100;
	}
	
	public void remiverProduct(Product prod){
		products.remove(prod);
		this.price = this.price - prod.getPrice();
	}

	
	public int getMENU_ID() {
		return MENU_ID;
	}


	public void setMENU_ID(int mENU_ID) {
		MENU_ID = mENU_ID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

		
	
	public float getPrice() {		
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	/**
	 * @return the Products
	 */
	public Set<Product> getProducts() {
		return products;
	}

	/**
	 * @param Products the Products to set
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public String toString(){
		String returnString = "Menu-" + this.MENU_ID + "[" ;
		for(Product prod : products){
			returnString += prod.toString();
		}
		return returnString + "]";
	}
}
