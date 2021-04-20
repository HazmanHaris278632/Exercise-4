package Exercise4;

public class Burger extends Food {
	
	private double totalprice;
	
	public Burger(String n, String t, double p, int q) {
		super(n,t,q,p);
		
		
	}
	public double totalPrice() {
		return getQuantity()*getPrice();
	}

}
