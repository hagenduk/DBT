package dbt.online.delivery;

public class Ingredient{

	private int INGREDIENT_ID = 0;
	private float price;
	private String name;

	public Ingredient(float price, String name) {
		this.price = price;
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getINGREDIENT_ID() {
		return INGREDIENT_ID;
	}

	public void setINGREDIENT_ID(int iNGREDIENT_ID) {
		INGREDIENT_ID = iNGREDIENT_ID;
	}

}
