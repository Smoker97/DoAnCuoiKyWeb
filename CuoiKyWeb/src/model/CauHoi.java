package model;

import java.util.ArrayList;
import java.util.List;

public class CauHoi {
	int QId, EId;
	String QContent;
	List<CauTraLoi> CacCauTraLoi = new ArrayList<CauTraLoi>();
	public CauHoi(int QId, String QContent, int EId, List<CauTraLoi> CacCauTraLoi) {
		this.QId = QId;
		this.QContent = QContent;
		this.EId = EId;
		this.CacCauTraLoi = CacCauTraLoi;
	}
	public int getQId() {
		return QId;
	}
	public void setQId(int qId) {
		QId = qId;
	}
	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}
	public String getQContent() {
		return QContent;
	}
	public void setQContent(String qContent) {
		QContent = qContent;
	}
	public List<CauTraLoi> getCacCauTraLoi() {
		return CacCauTraLoi;
	}
	public void setCacCauTraLoi(List<CauTraLoi> cacCauTraLoi) {
		CacCauTraLoi = cacCauTraLoi;
	}
}
