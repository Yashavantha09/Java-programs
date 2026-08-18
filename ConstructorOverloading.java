package Yashavantha;

public class ConstructorOverloading {
public ConstructorOverloading() {
System.out.println("Hello world");
} 
public ConstructorOverloading(int a) {
	System.out.println("Hello world contr");
} 
	
public static void main(String[] args) {
	ConstructorOverloading gg = new ConstructorOverloading();
	ConstructorOverloading gf = new ConstructorOverloading(3);

}
}