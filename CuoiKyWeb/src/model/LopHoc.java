package model;

public class LopHoc {
	int CId;
	String CName;
	public LopHoc(int CId, String CName) {
		this.CId=CId;
		this.CName=CName;
		
	}
	
	public int getCId() {
		return CId;
	}
	public void setCId(int cId) {
		CId = cId;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	
}
