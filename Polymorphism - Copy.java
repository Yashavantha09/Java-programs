package Yashavantha;
class Parents
{
   void property()
   {
	   System.out.println("Property");
   }
   void marry()
   {
	   System.out.println("famaily selected girl/boy");
   }
}
public class Polymorphism extends Parents {
	void marry()
	{
		System.out.println("campus selected girl/boy");
	}
	public static void main(String[] args) {
		Polymorphism test = new Polymorphism();// object
		test.marry();
		test.property();
	}
}