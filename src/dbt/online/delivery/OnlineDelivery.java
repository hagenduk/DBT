package dbt.online.delivery;

public class OnlineDelivery {

	public OnlineDelivery() {
		firstTest();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineDelivery od = new OnlineDelivery();
	}
	
	public void firstTest(){
		
		
		//add ingredients
		Ingredient i1 = new Ingredient(2, "Schinken");
		Ingredient i2 = new Ingredient(1, "Käse");
		Ingredient i3 = new Ingredient(3, "Tomatensauce");
		Ingredient i4 = new Ingredient(1, "Pizzateig");
		Ingredient i5 = new Ingredient(4, "Annanas");
		
		//add supplements
		Supplement s1 = new Supplement(2, "Sprite");
		Supplement s2 = new Supplement(2, "Cola");
		Supplement s3 = new Supplement(4, "Chips");
		Supplement s4 = new Supplement(4, "Potato with sourcream");
		Supplement s5 = new Supplement(1, "Bread");
		Supplement s6 = new Supplement(1, "Sauce");
		Supplement s7 = new Supplement(1, "Extra-Cheese");
		
		//add pizzas
		Pizza p1 = new Pizza(10, "Hawaii");
		Pizza p2 = new Pizza(10, "Magheritta");
		
		//add special
		SpecialPromotion sp1 = new SpecialPromotion(15, "Hawaii Supreme");
		SpecialPromotion sp2 = new SpecialPromotion(7, "Plain Menu");
		
		//add order
		
		
		
	}

}
