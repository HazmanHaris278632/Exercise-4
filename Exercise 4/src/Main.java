package Exercise4;

public class Main {

	public static void main(String[] args) {
		
		Burger objBurger = new Burger("Burger Daging", "pedas", 3.50, 5);
		
		System.out.println("Food name : " + objBurger.getName());
		System.out.println("Taste : " + objBurger.getTaste());
		System.out.printf("Food price : RM%.2f",objBurger.getPrice());
		System.out.println("\nQuantitiy to buy : " + objBurger.getQuantity());
		System.out.printf("Total price : RM%.2f",objBurger.totalPrice());
		System.out.println();
		
		Waffle objWaffle = new Waffle("American Waffle", "Coklat", 5.00, 10);
		
		System.out.println("\nFood name : " + objWaffle.getName());
		System.out.println("Taste : " + objWaffle.getTaste());
		System.out.printf("Food price : RM%.2f",objWaffle.getPrice());
		System.out.println("\nQuantity to buy : " + objWaffle.getQuantity());
		System.out.printf("Total price : RM%.2f",objWaffle.totalPrice());
		
		

	}

}
