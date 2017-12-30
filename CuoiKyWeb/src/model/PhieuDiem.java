package model;

public class PhieuDiem {
	String TName, Date, TrueAnswer, AnswerSize;
	float Point;
	public PhieuDiem(String TName, String Date, String TrueAnswer, String AnswerSize, float Point) {
		this.TName = TName;
		this.Date = Date;
		this.TrueAnswer = TrueAnswer;
		this.AnswerSize = AnswerSize;
		this.Point = Point;
	}
	public String getTName() {
		return TName;
	}
	public void setTName(String tName) {
		TName = tName;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTrueAnswer() {
		return TrueAnswer;
	}
	public void setTrueAnswer(String trueAnswer) {
		TrueAnswer = trueAnswer;
	}
	public String getAnswerSize() {
		return AnswerSize;
	}
	public void setAnswerSize(String answerSize) {
		AnswerSize = answerSize;
	}
	public float getPoint() {
		return Point;
	}
	public void setPoint(float point) {
		Point = point;
	}
}
