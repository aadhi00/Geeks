package org.geeks;

public class SingleBoy {
	private static SingleBoy s=null;
	public String str;
	private SingleBoy() {
		str="java program";
		System.out.println("Constructor:"+str);
	}
	public static SingleBoy createInst() {
		if(s==null)
			s=new SingleBoy();
		return s;	
	}
}
