package org.geeks;

public class Rick {
	public static void main(String[] args) {
		SingleBoy a = SingleBoy.createInst();
		SingleBoy b = SingleBoy.createInst();
		SingleBoy c = SingleBoy.createInst();
		a.str= (a.str).toUpperCase();
		System.out.println("The String from instance a is "+a.str);
		System.out.println("The String from instancce b is "+b.str);
		System.out.println("The String from instance c is "+c.str);
		b.str=(b.str).toLowerCase();
		System.out.println("The String from instance b is "+b.str);
		System.out.println("The String from instane a is "+a.str);
		System.out.println("The String from instance c is "+c.str);
	}
}
