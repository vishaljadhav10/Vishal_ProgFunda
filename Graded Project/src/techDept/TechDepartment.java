package techDept;

import superDept.SuperDepatment;

public class TechDepartment extends SuperDepatment {
	
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

}
