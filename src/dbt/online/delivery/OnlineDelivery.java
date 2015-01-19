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
		
		Customer customer1 = new Customer("Hans Müller", "Hamburg", "robot@gmail.com");
		Customer customer2 = new Customer("Herbert Schäfer", "Hamburg", "robot@gmail.com");
		Customer customer3 = new Customer("Gregor Bauer", "Hannover", "robot@gmail.com");
		Customer customer4 = new Customer("Stefanie Meier", "Hannover", "robot@gmail.com");
		Customer customer5 = new Customer("Bernd Stromberg", "Hameln", "robot@gmail.com");
		
		//add ingredients
		Ingredient i1 = new Ingredient(1, "Pizzateig");
		Ingredient i2 = new Ingredient(2, "Tomatensauce");
		Ingredient i3 = new Ingredient(3, "Käse");
		Ingredient i4 = new Ingredient(4, "Annanas");
		Ingredient i5 = new Ingredient(5, "Schinken");
		Ingredient i6 = new Ingredient(5, "Pilze");
		Ingredient i7 = new Ingredient(5, "Salami");
		
		//add Products
		Product s1 = new Product(2, "Sprite 1l");
		Product s2 = new Product(2, "Cola 0,75l");
		Product s3 = new Product(4, "Pizza Salami");
		s3.addIngredient(i1);
		s3.addIngredient(i2);
		s3.addIngredient(i3);
		s3.addIngredient(i7);
		Product s4 = new Product(5, "Pizza Hawai");
		s4.addIngredient(i1);
		s4.addIngredient(i2);
		s4.addIngredient(i3);
		s4.addIngredient(i4);
		s4.addIngredient(i5);
		Product s5 = new Product(5, "Pizza Pilze");
		s5.addIngredient(i1);
		s5.addIngredient(i2);
		s5.addIngredient(i3);
		s5.addIngredient(i6);
		
		
		//add Menus
		Menu sp1 = new Menu("Pizza Salami", 0);
		sp1.addProduct(s3);
		Menu sp2 = new Menu("Pizza Hawawi", 0);
		sp2.addProduct(s4);
		Menu sp3 = new Menu("Pizza Pilze", 0);
		sp3.addProduct(s5);
		
		Menu sp4 = new Menu("Menu Pizza Salami", 10);
		sp4.addProduct(s3);
		sp4.addProduct(s2);
		Menu sp5 = new Menu("Menu Pizza Hawai", 10);
		sp5.addProduct(s4);
		sp5.addProduct(s2);
		
		Menu sp6 = new Menu("Getränk Cola", 1);
		sp6.addProduct(s2);
		sp6.update(sp6);
		Menu sp7 = new Menu("Getränk Sprite", 0);
		sp7.addProduct(s1);
		
		
		//add order
		MyOrder myOrder1 = new MyOrder(customer1);
		myOrder1.addMenu(sp1);
		myOrder1.addMenu(sp2);
		myOrder1.addMenu(sp3);
		myOrder1.addMenu(sp4);
		myOrder1.update(myOrder1);
		
		MyOrder myOrder2 = new MyOrder(customer2);
		myOrder2.addMenu(sp2);
		myOrder2.update(myOrder2);
		
		MyOrder myOrder3 = new MyOrder(customer2);
		myOrder3.addMenu(sp2);
		myOrder3.addMenu(sp4);
		myOrder3.addMenu(sp1);
		myOrder3.update(myOrder3);
		
		System.out.print(myOrder3.toString());
		//System.out.print(myOrder2.toString());
	}
		
}
