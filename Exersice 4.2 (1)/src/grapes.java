
public class grapes extends Fruit{
	String color;
	double price;
	public grapes (String name, String color, double price) {
	     super(name);
	     this.color = color;
	     this.price = price;
	     System.out.println();
	    System.out.println("Grapes constructor is invoked");
	  }
}
class Greengrapes extends grapes {
	double weight, price, total ;
	public Greengrapes(String name, String color, double weight, double price) {
	     super (name, color, price);
	     this.weight = weight;
	     this.price = price;
	     this.total = weight * price;
	}
}
class Purplegrapes extends Greengrapes{
	String Type;
	public Purplegrapes(String name, String color, double weight, double price, String Type) {
		super(name, color, weight, price);
		this.Type = Type ;	
	}
}
