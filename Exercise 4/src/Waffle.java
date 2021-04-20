package Exercise4;

public class Waffle extends Food {
	
	private double totalprice;
	
	public Waffle(String n, String t, double p, int q) {
		super(n,t,q,p);
		
		
	}
	public double totalPrice() {
		return getQuantity()*getPrice();
	}

}
