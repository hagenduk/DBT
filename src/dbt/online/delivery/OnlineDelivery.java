package dbt.online.delivery;

public class OnlineDelivery {

	public OnlineDelivery() {
		firstTest();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new OnlineDelivery();
	}
	
	@SuppressWarnings("unused")
	public void firstTest(){
		
		Customer customer = new Customer("Robot", "Neverwinterland", "robot@gmail.com");
		
		//add ingredients
		Ingredient i1 = new Ingredient(2, "Schinken");
		Ingredient i2 = new Ingredient(1, "K�se");
		Ingredient i3 = new Ingredient(3, "Tomatensauce");
		Ingredient i4 = new Ingredient(1, "Pizzateig");
		Ingredient i5 = new Ingredient(4, "Annanas");
		
		//add Products
		Product s1 = new Product(2, "Sprite 1l");
		Product s2 = new Product(2, "Cola 0,75l");
		Product s3 = new Product(4, "Pizza SuperMario");
		s3.addIngredient(i1);
		s3.addIngredient(i4);
		Product s4 = new Product(5, "Pizza Annanas");
		s4.addIngredient(i4);
		s4.addIngredient(i5);
		
		//add Menus
		Menu sp1 = new Menu("Menu Supermario", 10);
		sp1.addProduct(s3);
		sp1.addProduct(s2);
		Menu sp2 = new Menu("Pizza Annanas", 0);
		sp2.addProduct(s4);
		
		//add order
		MyOrder myOrder = new MyOrder(customer);
		myOrder.addMenu(sp1);
		myOrder.addMenu(sp2);
		//Doppeltes Hinzufuegen funktioniert nicht
		myOrder.update(myOrder);
		
		MyOrder myOrder2 = new MyOrder(customer);
		myOrder2.addMenu(sp2);
		myOrder2.update(myOrder2);
		
		System.out.print(myOrder.toString());
		System.out.print(myOrder2.toString());
	}
		
}
