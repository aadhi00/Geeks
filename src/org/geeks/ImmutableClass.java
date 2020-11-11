package org.geeks;

public final class ImmutableClass {
	
	private final int i;
	
	public ImmutableClass(int x) {
		this.i=x;
	}
	public int returnValue() {
		return i;
	}

}
