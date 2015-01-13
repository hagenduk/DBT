package dbt.online.delivery;

import java.util.HashSet;
import java.util.Set;

public class Product extends DBCommunication<Product>{

	private int PRODUCT_ID = 0;
	private float price;
	private String name;
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
		
	public Product(float gprice, String gname) {
		super();
		this.price=gprice;
		this.name=gname;
		this.create(this);
	}
	
	public void addIngredient(Ingredient ing){
		ingredients.add(ing);
		this.price = this.price + ing.getPrice();
	}
	
	public void removeIngredient(Ingredient ing){
		ingredients.remove(ing);
		this.price = this.price - ing.getPrice();
	}

	public int getPRODUCT_ID() {
		return PRODUCT_ID;
	}

	public void setPRODUCT_ID(int pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	/**
	 * @return the price
	 */
	public float getPrice() {		
		return this.price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
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

	public String toString(){
		String returnString = "\t\tProduct-" + this.PRODUCT_ID + "->" + this.name + "\n\t\t[\n" ;
		for(Ingredient ing : ingredients){
			returnString += ing.toString();
		}
		return returnString + "\n\t\t]\n";
	}
}
