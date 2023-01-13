package com.example.TaskManagementapp;

import jakarta.persistence.Entity;

@Entity
public class Task {
	
	@jakarta.persistence.Id
	private String taskid;
	private String taskholdername;
	private String taskdate;
	private String taskname;
	private String taskstatus;
	
	public Task() {}

	
	public Task(String taskid, String taskholdername, String taskdate, String taskname, String taskstatus) {
		super();
		this.taskid = taskid;
		this.taskholdername = taskholdername;
		this.taskdate = taskdate;
		this.taskname = taskname;
		this.taskstatus = taskstatus;
	}


	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public String getTaskholdername() {
		return taskholdername;
	}

	public void setTaskholdername(String taskholdername) {
		this.taskholdername = taskholdername;
	}

	public String getTaskdate() {
		return taskdate;
	}

	public void setTaskdate(String taskdate) {
		this.taskdate = taskdate;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getTaskstatus() {
		return taskstatus;
	}

	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}

	

}
