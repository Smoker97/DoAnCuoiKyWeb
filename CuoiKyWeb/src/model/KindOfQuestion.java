package model;

public class KindOfQuestion {
	private String kindId;
	private String kindName;

	public KindOfQuestion() {
	}

	public KindOfQuestion(String kindId, String kindName) {
		this.kindId = kindId;
		this.kindName = kindName;
	}

	public String getKindId() {
		return kindId;
	}

	public void setKindId(String kindId) {
		this.kindId = kindId;
	}

	public String getKindName() {
		return kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
}
