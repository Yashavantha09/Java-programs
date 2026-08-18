package Yashavantha;

public class Instancevariable { 
	int a = 20; 
 
	void m1(int b) { 
		System.out.println("dfasdf "+b); 
		System.out.println("dfasdf "+a); 
	} 
 
	public static void main(String[] args) { 
		Instancevariable   vv = new Instancevariable(); 
		vv.m1(4); 
	} 
}                           