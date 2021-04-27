
public class Main {

	public static void main(String[] args) {
		Fruit a = new Fruit("grapes, Apple, Mango, Strawberry.");
		System.out.println("Fruit: " + a.name);
		
		Apple g = new Apple("Apple", 12);
		System.out.println("Fruit :" + g.name);
		System.out.println("Fruit :" + g.price);
		
		greenApple h = new greenApple("Green Apple", "Green", 14);
		System.out.println("Fruit :" + h.name);
		System.out.println("Fruit :" + h.price);
		
		redApple r = new redApple("Red Apple", "red", 12);
		System.out.println("Fruit :" + r.name);
		System.out.println("Fruit :" + r.price);
		
		Strawberry e = new Strawberry("Strawberry", "Sweet");
		System.out.println("Fruit : " + e.name);
		System.out.println("Fruit : " + e.taste);
		
		Mango f = new Mango("Mango", "Sweet", 10);
		System.out.println("Fruit : " + f.name);
		System.out.println("Fruit : " + f.taste);
		System.out.println("Fruit : " + f.price);
		
		grapes b = new grapes("grapes ", "Purple, Green", 15); 
		System.out.println("Fruit : " + b.name);
		System.out.println("Color fruit :" + b.color);
		System.out.println("Fruit : " + b.price);
		
		Greengrapes c = new Greengrapes("grapes", "Green", 2, 18); 
		System.out.println("Fruit :" + c.name);
		System.out.println("Color:" + c.color);
		System.out.println("Weight:" + c.weight + "Kg");
		System.out.println("Price : RM" +  c.price);
		System.out.println("Total price:RM " + c.total);
		
		Purplegrapes d = new Purplegrapes("Concord grapes", "Purple", 3, 20, "gred AA");
		System.out.println("Fruit :" + d.name);
		System.out.println("Color:" + d.color);
		System.out.println("Weight:" + d.weight + "Kg");
		System.out.println("Price : RM" +  d.price);
		System.out.println("Total price:RM " + d.total);
		System.out.println("Type : " + d.Type);
	}

}
