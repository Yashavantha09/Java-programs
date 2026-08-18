package Yashavantha;

class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class MultilevelInheritance extends Parent{

	public static void main(String[] args) {
		MultilevelInheritance  bb= new MultilevelInheritance();
 		bb.bp();
 		bb.cancer();
	}
}
