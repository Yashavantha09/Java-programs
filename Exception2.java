package Yashugowa;

public class Exception2 {
	public class Demo {
		public static void main(String[] args) {
			System.out.println("Hello");

			try {
				System.out.println(10 / 2);
				int[] a = { 10, 20, 30 };
				System.out.println(a[0]);
				System.out.println(a[1]);
				System.out.println(a[2]);
				System.out.println(a[3]);
			}

			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" Array handle");
}
			System.out.println("Hello sir");
		}

	
	}
}