package Demo;

public class Dmeo {
	int a = 66; // instance 
   static	int cc = 99;
	void m1() {
		int a = 10;
		System.out.println("gsdfgsdkl" + a);
	}
	public Dmeo() {
		int b = 10;
		System.out.println("sdf" + b);
	}
	public static void main(String[] args) {
		Dmeo test = new Dmeo();// object
		test.m1();
		System.out.println("tyhank you"+test.a);
		System.out.println(cc);
		System.out.println(Dmeo.cc);

	}
}
