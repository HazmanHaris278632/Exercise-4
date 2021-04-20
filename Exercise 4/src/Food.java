package Exercise4;

import java.util.Scanner;
public class Food {
	
	Scanner s = new Scanner(System.in);
	
	private String name;
	private String taste;
	private int quantity;
	private double price;
	
	
	public Food(String n, String t, int q, double p) {
		name = n;
		taste = t;
		quantity = q;
		price = p;
	}
	public String getName() {
		return name;
	}
	public String getTaste() {
		return taste;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	

}
