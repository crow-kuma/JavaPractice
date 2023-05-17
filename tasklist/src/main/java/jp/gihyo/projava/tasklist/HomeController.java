package jp.gihyo.projava.tasklist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	// create record for TaskItem
	record TaskItem(String id, String task, String deadline, boolean done) {}
	// create list of TaskItem
	private List<TaskItem> taskItems = new ArrayList<>();

	// Endpoint to display the taskItems list
	@GetMapping("/list")
	String listItems(Model model) {
		// add taskItems to model
		model.addAttribute("taskList", taskItems);
		// return home.html
		return "home";
	}

	// Endpoitn to add taskItems to the list
	@GetMapping("/add")
	String addItem(@RequestParam("task") String task, @RequestParam("deadline") String deadline) {
		// random UUID to String and get the first 8 characters
		String id = java.util.UUID.randomUUID().toString().substring(0, 8);
		// Create a new TaskItem object
		TaskItem item = new TaskItem(id, task, deadline, false);
		// Add the TaskItem object to the taskItems list
		taskItems.add(item);
		// Return the id of the TaskItem object
		return "redirect:/list";
	}
}
