package Yashugowa;
public class Multitrading  extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++);{
		String i;
	}
}
public static void main(String[] args) {
	Multitrading bb = new Multitrading ();
	bb.start();
	for(int i = 0; i < 5; i++) {
		System.out.println("main method" +i);
	}
}
}
