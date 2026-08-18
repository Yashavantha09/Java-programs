package Yashavantha;

interface Atm
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
	}

public class Interface1 extends Abc{

	public	void with()
	{
		System.out.println("With");
	}

	
public static void main(String[] args) {
	Interface1  v = new Interface1();
	v.depo();
	v.with();
}
}