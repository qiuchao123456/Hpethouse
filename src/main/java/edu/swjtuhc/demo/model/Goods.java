package edu.swjtuhc.demo.model;

public class Goods {
	 int gdID;
	 int tID;
	 int gdCode;
	 String gdName;
	 int gdPrice;
	 int gdQuantity;
	 int gdSaleQty;
	 String gdImage;
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
	public int getGdCode() {
		return gdCode;
	}
	public void setGdCode(int gdCode) {
		this.gdCode = gdCode;
	}
	public String getGdName() {
		return gdName;
	}
	public void setGdName(String gdName) {
		this.gdName = gdName;
	}
	
	public int getGdPrice() {
		return gdPrice;
	}
	public void setGdPrice(int gdPrice) {
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
	public String getGdImage() {
		return gdImage;
	}
	public void setGdImage(String gdImage) {
		this.gdImage = gdImage;
	}
	@Override
	public String toString() {
		return "Goods [gdID=" + gdID + ", tID=" + tID + ", gdCode=" + gdCode + ", gdName=" + gdName + ", gdPrice="
				+ gdPrice + ", gdQuantity=" + gdQuantity + ", gdSaleQty=" + gdSaleQty + ", gdImage=" + gdImage + "]";
	}
	
	
}
