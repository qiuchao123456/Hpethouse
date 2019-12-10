package edu.swjtuhc.demo.model;

public class Users {
	int uID;//用户ID
	String uName;//用户名
	String uPwd;//密码
	String uSex;//性别
	String uPhone;//电话
	String uEmail;//邮箱
	String uQQ;//QQ
	String uImage;//头像
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String getuSex() {
		return uSex;
	}
	public void setuSex(String uSex) {
		this.uSex = uSex;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuQQ() {
		return uQQ;
	}
	public void setuQQ(String uQQ) {
		this.uQQ = uQQ;
	}
	public String getuImage() {
		return uImage;
	}
	public void setuImage(String uImage) {
		this.uImage = uImage;
	}
	@Override
	public String toString() {
		return "Users [uID=" + uID + ", uName=" + uName + ", uPwd=" + uPwd + ", uSex=" + uSex + ", uPhone=" + uPhone
				+ ", uEmail=" + uEmail + ", uQQ=" + uQQ + ", uImage=" + uImage + "]";
	}
	
}
