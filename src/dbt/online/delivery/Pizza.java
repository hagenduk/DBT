package dbt.online.delivery;

import java.util.HashSet;
import java.util.Set;

public class Pizza extends Product{

	private int PIZZA_ID=0;
	private int size;
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();
	
	public Pizza() {
		super();
	}

	/**
	 * @return the PIZZA_ID
	 */
	public int getId() {
		return PIZZA_ID;
	}

	/**
	 * @param PIZZA_ID the PIZZA_ID to set
	 */
	public void setId(int id) {
		this.PIZZA_ID = id;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the ingredients
	 */
	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
