package YNG;
//module
public class Modulo {
	public static void main(String[] args) {
		int number = 10;
		int remainder = number % 2;
		System.out.println("Remainder:"+remainder);
		if (remainder == 0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
	}

}