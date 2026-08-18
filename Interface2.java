package Yashavantha;
interface Atm {
	abstract void depo();
}
interface Atm1 {
	abstract void min();
}
public class Interface2 implements Atm, Atm1 {
	public void depo() {
		System.out.println("dep");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		Interface2 v = new Interface2();
		v.min();
		v.depo();
	}
}