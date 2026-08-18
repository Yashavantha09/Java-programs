package Yashavantha;

public class Overriding {
	void minbal() {
		System.out.println("sdfa");
	}
	void minbal(int a) {
	
		System.out.println("dfasdfasdfasfas");
	}
	public static void main(String[] args) {
		Overriding test = new Overriding();// object
		test.minbal();
		test.minbal(3);
	}
}
