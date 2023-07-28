package adminDept;

import superDept.SuperDepatment;

public class AdminDepartment extends SuperDepatment {

	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";

	}

}
