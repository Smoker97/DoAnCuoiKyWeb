package model;

public class Subject {
	private String SubId;
	private String SubName;

	public Subject() {
	}

	public Subject(String SubId, String SubName) {
		this.SubId = SubId;
		this.SubName = SubName;
	}

	public String getSubId() {
		return SubId;
	}

	public void setSubId(String SubId) {
		this.SubId = SubId;
	}

	public String getSubName() {
		return SubName;
	}

	public void setSubName(String SubName) {
		this.SubName = SubName;
	}
}
