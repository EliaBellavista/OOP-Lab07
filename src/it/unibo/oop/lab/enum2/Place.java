package it.unibo.oop.lab.enum2;

public enum Place {
	INDOOR("Indoor"),
	OUTDOOR("Outdoor");
	
	private String s;
	
	private Place(String s) {
		this.s = s;
	}
	
	public String toString() {
		return this.s;
	}
	
}
