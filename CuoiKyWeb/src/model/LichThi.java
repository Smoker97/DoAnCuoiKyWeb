package model;

public class LichThi {
	int UId, CId, TId, Time_Test;
	String TimeStart, TimeClose, TName,Date;
	int InTest;
	
	public LichThi(int UId, int CId, int TId, String TimeStart, String TimeClose, String TName, String Date, int Time_Test, int InTest) {
		this.UId = UId;
		this.CId = CId;
		this.TId = TId;
		this.TimeStart = TimeStart;
		this.TimeClose = TimeClose;
		this.TName = TName;
		this.Date = Date;
		this.Time_Test = Time_Test;
		this.InTest = InTest;
	}

	public int getUId() {
		return UId;
	}

	public void setUId(int uId) {
		UId = uId;
	}

	public int getCId() {
		return CId;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public int getTId() {
		return TId;
	}

	public void setTId(int tId) {
		TId = tId;
	}

	public String getTimeStart() {
		return TimeStart;
	}

	public void setTimeStart(String timeStart) {
		TimeStart = timeStart;
	}

	public String getTimeClose() {
		return TimeClose;
	}

	public void setTimeClose(String timeClose) {
		TimeClose = timeClose;
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

	public int getTime_Test() {
		return Time_Test;
	}

	public void setTime_Test(int time_Test) {
		Time_Test = time_Test;
	}

	public int getInTest() {
		return InTest;
	}

	public void setInTest(int inTest) {
		InTest = inTest;
	}
}
