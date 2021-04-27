
public class Mango extends Fruit{
	String taste;
	double price;
	public Mango(String name, String taste, double price) {
		super(name);
		this.taste = taste;
		this.price = price;
		System.out.println();
		System.out.println("Mango constructor is invoked");
	}
}
