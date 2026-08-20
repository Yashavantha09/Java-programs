package YNG;

import java.util.HashSet;

public class PatternRecognization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {20,20,30,20,40};
		HashSet<Integer> set = new HashSet<>();
		for (int number : numbers) {
			if (set.contains(number)) {
				System.out.println("Duplicate:" +number);
			}else {
				set.add(number);
			}
		}
 	}

}
