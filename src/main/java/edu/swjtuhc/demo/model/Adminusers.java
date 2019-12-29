package edu.swjtuhc.demo.model;

public class Adminusers {
	int u_id;
	String aName;
	String aPwd;
	int age;
	String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaPwd() {
		return aPwd;
	}
	public void setaPwd(String aPwd) {
		this.aPwd = aPwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Adminusers [u_id=" + u_id + ", aName=" + aName + ", aPwd=" + aPwd + ", age=" + age + ", gender="
				+ gender + "]";
	}
	
}
