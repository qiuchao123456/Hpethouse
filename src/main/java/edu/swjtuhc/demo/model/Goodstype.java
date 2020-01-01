package edu.swjtuhc.demo.model;

public class Goodstype {
	int tID;
	String tName;
	public int gettID() {
		return tID;
	}
	public void settID(int tID) {
		this.tID = tID;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "Goodstype [tID=" + tID + ", tName=" + tName + "]";
	}
	
}
