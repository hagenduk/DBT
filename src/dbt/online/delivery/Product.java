package dbt.online.delivery;

import java.util.HashSet;
import java.util.Set;

public class Product {

	private int PRODUCT_ID = 0;
	private float price;
	private String name;
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
		
	public Product(float gprice, String gname) {
		this.price=gprice;
		this.name=gname;
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
	
	private float getIngredientsPrice(){
		float ingPrice = 0;
		if (!this.ingredients.isEmpty()){
			for (Ingredient ing : this.ingredients){
				ingPrice = ingPrice + ing.getPrice();
			}
		}
		return ingPrice;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {		
		return (this.ingredients.isEmpty()) ? this.price : (this.price + getIngredientsPrice());
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

}
