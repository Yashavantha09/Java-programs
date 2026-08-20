package YNG;
import java.util.ArrayList;
public class ArrayLIst {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println("Initial size of ArrayLIst before adding elemnt:"+list.size());
		System.out.println("ArrayLIst is empty before adding values:"+list.isEmpty());
		System.out.println("Contents of ArrayList before addingvalues:"+list);
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("D");
		list.add("F");
		list.add("A");
		list.add(null);
		System.out.println("Size of ArrayLIst after adding elements:"+list.size());
		System.out.println("ArrayList is empty sfter adding values:"+list.isEmpty());
		System.out.println("Contents of ArrayLIst after adding values:"+list);
		boolean b1 = list.contains("E");
		System.out.println("Value E is present:" +b1);
		boolean b2 = list.contains("R");
		System.out.println("Value R is present:" +b2);
		list.remove("B");
		System.out.println("Size of ArrayList after deletion:"+list.size());
		System.out.println("contents of ArrayList after deletion:"+list);
		list.clear();
		System.out.println("Size of ArrayList after cleaning:"+list.size());
		System.out.println("contents of ArrayList after cleaning:"+list);
		
	}

}
