package model;

public class CauTraLoi {
	int AId, QId, IsTrue,IsCheck = 0;
	String AContent;
	
	public CauTraLoi(int AId, String AContent, int QId, int IsTrue) {
		this.AId = AId;
		this.AContent = AContent;
		this.QId = QId;
		this.IsTrue = IsTrue;
	}

	public int getAId() {
		return AId;
	}

	public void setAId(int aId) {
		AId = aId;
	}

	public int getQId() {
		return QId;
	}

	public void setQId(int qId) {
		QId = qId;
	}

	public int getIsTrue() {
		return IsTrue;
	}

	public void setIsTrue(int isTrue) {
		IsTrue = isTrue;
	}

	public String getAContent() {
		return AContent;
	}

	public void setAContent(String aContent) {
		AContent = aContent;
	}
}
