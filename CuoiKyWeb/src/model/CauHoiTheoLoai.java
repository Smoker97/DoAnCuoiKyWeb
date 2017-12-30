package model;

public class CauHoiTheoLoai {
	private String kindId;
	private String questionId;

	public CauHoiTheoLoai() {
	}

	public CauHoiTheoLoai(String questionId, String kindId) {
		this.kindId = kindId;
		this.questionId = questionId;
	}

	public String getKindId() {
		return kindId;
	}

	public void setKindId(String kindId) {
		this.kindId = kindId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
}
