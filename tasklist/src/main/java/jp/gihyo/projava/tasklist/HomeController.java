package jp.gihyo.projava.tasklist;

// import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	// create record for TaskItem
	record TaskItem(String id, String task, String deadline, boolean done) {}
	// create list of TaskItem
	// private List<TaskItem> taskItems = new ArrayList<>();
	// declare TaskListDao as dao
	private final TaskListDao dao;

	// Constructor to initialize dao with the annotation Autowired
	@Autowired
	HomeController(TaskListDao dao) {
		this.dao = dao;
	}

	// Endpoint to display the taskItems list
	@GetMapping("/list")
	String listItems(Model model) {
		// define a new List of TaskItems and get all taskItems from dao by findAll method
		List<TaskItem> taskItems = dao.finadAll();
		// add taskItems to model
		model.addAttribute("taskList", taskItems);
		// return home.html
		return "home";
	}

	// Endpoitn to add taskItems to the list
	@GetMapping("/add")
	String addItem(@RequestParam("task") String task, @RequestParam("deadline") String deadline) {
		// random UUID to String and get the first 8 characters
		String id = UUID.randomUUID().toString().substring(0, 8);
		// Create a new TaskItem object
		TaskItem item = new TaskItem(id, task, deadline, false);
		// add item to dao
		dao.add(item);

		// Return the id of the TaskItem object
		return "redirect:/list";
	}
}
