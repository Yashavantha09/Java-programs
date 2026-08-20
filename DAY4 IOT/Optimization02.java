package YNG;

public class Optimization02 {
	public static void main(String[] args) {
		int n=100000;
		int[] students=new int[n];
		int target=1000;	
		for(int i=0;i<n;i++) {
			if(n>target) {
				boolean found=true;
				System.out.println("Student Found: "+found);
				break;
			}else if (n<target) {
				boolean found=false;
				System.out.println("Student Found: "+found);
				break;
			}
		}
	}
}