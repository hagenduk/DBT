package dbt.online.delivery;

public class Ingredient extends Product {

	private int INGREDIENT_ID = 0;

	public Ingredient() {
		super();
	}

	public int getINGREDIENT_ID() {
		return INGREDIENT_ID;
	}

	public void setINGREDIENT_ID(int iNGREDIENT_ID) {
		INGREDIENT_ID = iNGREDIENT_ID;
	}

}
