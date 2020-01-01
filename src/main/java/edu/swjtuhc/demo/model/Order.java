package edu.swjtuhc.demo.model;

public class Order {
	int oId;
	String oName;
	String oUser;
	String oComment;
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getoUser() {
		return oUser;
	}
	public void setoUser(String oUser) {
		this.oUser = oUser;
	}
	public String getoComment() {
		return oComment;
	}
	public void setoComment(String oComment) {
		this.oComment = oComment;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", oName=" + oName + ", oUser=" + oUser + ", oComment=" + oComment + "]";
	}
	
	
}
