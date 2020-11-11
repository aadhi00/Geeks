package org.geeks;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enum {
	
public static void main(String[] args) {
	Vector<Integer> v = new Vector<Integer>();
	v.add(10);
	v.add(20);
	v.add(50);
	v.add(66);
	v.add(55);
ListIterator<Integer> lit = v.listIterator();
///forward case
 while(lit.hasNext()) {
	 Integer k = lit.next();

	 System.out.print(k+" ");
 }
 System.out.println(" ");
//backward case
while(lit.hasPrevious()) {
	Integer l = lit.previous();
	System.out.print(l+" ");
}
}
}
