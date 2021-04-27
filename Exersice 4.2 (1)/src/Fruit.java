
public class Fruit {
	String name;
    public Fruit(String name) {
    this.name = name;   
    
    System.out.println("Fruit constructor is invoked");
    }
}
    
    class Apple extends Fruit{
    	double price;
    	public Apple(String name, double price) {
    		super(name);
    		this.price = price;	
    		System.out.println();
    		System.out.println(this.name + " constructor is invoke");
 
    	}
    }

    class redApple extends Apple{
    	String color;
    	public redApple(String name, String color, double price) {
    		super(name,price);
    		this.color = color; 
    		System.out.println();
    		System.out.println("Color : " + this.color);
    		
    	}
    }

    class greenApple extends Apple{
    	String color;
    	public greenApple(String name, String color, double price) {
    		super(name,price);
    		this.color = color; 
    		System.out.println();
    		System.out.println("Color : " + this.color);
    	}
}
