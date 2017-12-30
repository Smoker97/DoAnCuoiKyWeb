package model;

public class DeThi{
	private String TestId;
	private String TestName;
	private String TimeTest;
	private String SubjectName;

	public DeThi (){
	}

	public DeThi (String TestId, String TestName, String TimeTest) {
		this.TestId = TestId;
		this.TestName = TestName;
		this.TimeTest = TimeTest;
		
	}

	public String getTestId() {
		return TestId;
	}

	public void setTestId(String TestId) {
		this.TestId = TestId;
	}
	
	public String getTestName() {
		return TestName;
	}

	public void setTestName(String TestName) {
		this.TestName = TestName;
	}

	public String getTimeTest() {
		return TimeTest;
	}

	public void setTimeTest(String TimeTest) {
		this.TimeTest = TimeTest;
	}
	
	
}
