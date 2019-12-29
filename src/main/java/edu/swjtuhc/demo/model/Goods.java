package edu.swjtuhc.demo.model;

public class Goods {
	 int gdID;
	  int tID;
	  @Override
	public String toString() {
		return "Goods [gdID=" + gdID + ", tID=" + tID + ", gdCode=" + gdCode + ", gdName=" + gdName + ", gdPrice="
				+ gdPrice + ", gdQuantity=" + gdQuantity + ", gdSaleQty=" + gdSaleQty + ", gdInfo=" + gdInfo + "]";
	}
	public int getGdID() {
		return gdID;
	}
	public void setGdID(int gdID) {
		this.gdID = gdID;
	}
	public int gettID() {
		return tID;
	}
	public void settID(int tID) {
		this.tID = tID;
	}
	public String getGdCode() {
		return gdCode;
	}
	public void setGdCode(String gdCode) {
		this.gdCode = gdCode;
	}
	public String getGdName() {
		return gdName;
	}
	public void setGdName(String gdName) {
		this.gdName = gdName;
	}
	public String getGdPrice() {
		return gdPrice;
	}
	public void setGdPrice(String gdPrice) {
		this.gdPrice = gdPrice;
	}
	public int getGdQuantity() {
		return gdQuantity;
	}
	public void setGdQuantity(int gdQuantity) {
		this.gdQuantity = gdQuantity;
	}
	public int getGdSaleQty() {
		return gdSaleQty;
	}
	public void setGdSaleQty(int gdSaleQty) {
		this.gdSaleQty = gdSaleQty;
	}
	public String getGdInfo() {
		return gdInfo;
	}
	public void setGdInfo(String gdInfo) {
		this.gdInfo = gdInfo;
	}
	String gdCode;
	  String gdName;
	  String gdPrice;
	  int gdQuantity;
	  int gdSaleQty;
	  String gdInfo;

}
