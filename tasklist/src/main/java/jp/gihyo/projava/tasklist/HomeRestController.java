package jp.gihyo.projava.tasklist;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	// record of id, task, deadline, and done
	record TaskItem(String id, String task, String deadline, boolean done) {}
	// List field for TaskItem
	private List<TaskItem> taskItems = new ArrayList<>();

	// End point that receives taskItems as HTTP request from the client
	@GetMapping("/restadd")
	String addItem(@RequestParam("task") String task,
			@RequestParam("deadline") String deadline) {
		// random UUID to String and get the first 8 characters
		String id = UUID.randomUUID().toString().substring(0, 8);
		// Create a new TaskItem object
		TaskItem item = new TaskItem(id, task, deadline, false);
		// Add the TaskItem object to the taskItems list
		taskItems.add(item);
		// Return the id of the TaskItem object
		return "タスクを追加しました。";
	}

	// End point to display the taskItems list
	@GetMapping("/restlist")
	String listItems() {
		// define result as a String.
		String result = taskItems.stream()
				.map(TaskItem::toString)
				.collect(Collectors.joining(", "));
		// Return the result
		return result;
	}
}
