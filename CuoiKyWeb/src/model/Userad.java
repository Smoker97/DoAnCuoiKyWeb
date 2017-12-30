package model;

public class Userad {
	int UId;
	String UName, FullName, Pass, Birth, CMND, Tel;
	byte[] Avatar;
	public Userad(int UId, String UName, String FullName,String Pass,String Birth,String CMND,String Tel) {
		this.UId=UId;
		this.UName=UName;
		this.FullName=FullName;
		this.Pass=Pass;
		this.Birth=Birth;
		this.CMND=CMND;
		this.Tel=Tel;
	}
	public int getUId() {
		return UId;
	}
	public void setUId(int uId) {
		UId = uId;
	}
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getBirth() {
		return Birth;
	}
	public void setBirth(String birth) {
		Birth = birth;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public byte[] getAvatar() {
		return Avatar;
	}
	public void setAvatar(byte[] avatar) {
		Avatar = avatar;
	}
}
