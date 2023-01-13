package com.example.TaskManagementapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TaskController {
	
	@Autowired
	private TaskRepository taskrepository;
	
	@GetMapping("/alltasks")
	public List<Task> allTask(){
		return taskrepository.findAll();
	}
	
	@GetMapping("/getTask")
	public List<Task> getTask(@RequestParam String taskholdername){
		return taskrepository.findByTaskholdername(taskholdername);
	}
	@GetMapping("/saveTask")
	@ResponseBody
	public String addTask() {
		
		String taskid = "12211";
		String taskholdername = "Gowtham I";
		String taskdate = "4/16/2021";
		String taskname = "Spring Projects";
		String taskstatus = "In Progress";
		
		Task cout = new Task(taskid,taskholdername,taskdate,taskname,taskstatus);
		taskrepository.save(cout);
		System.out.println("----------All Data saved into Database--------------");
		return "[{status:inserted}]";
	}
	
	@GetMapping("/changeStatus")
	public String updateTask(@RequestParam String taskid) {
		String taskholdername = "Gowthaman M";
		String taskdate = "4/15/2022";
		String taskname = "Spring Projects";
		String taskstatus = "Completed";
		 
		Task cout = new Task(taskid,taskholdername,taskdate,taskname,taskstatus);
		taskrepository.save(cout);
		return "[{status:edited}]";
	}
	
	@GetMapping("/deletetask")
	public String deleteByBookid(@RequestParam String taskid) {
		System.out.println("taskid"+taskid);
		try {
       taskrepository.deleteByTaskid(taskid);
		}catch(Exception ex) {
			System.out.println(ex);
		}
       return "[{status:deleted}]";
	}
}
