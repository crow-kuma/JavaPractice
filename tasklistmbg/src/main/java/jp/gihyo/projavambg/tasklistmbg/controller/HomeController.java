package jp.gihyo.projavambg.tasklistmbg.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.gihyo.projavambg.tasklistmbg.entity.Tasklist;
import jp.gihyo.projavambg.tasklistmbg.mapper.TasklistMapper;

@Controller
public class HomeController {
	public record TaskItem(String id, String task, String deadline, boolean done) {}

	@Autowired
	private TasklistMapper tasklistMapper;

	@GetMapping("/list")
	String listItems(Model model) {
		model.addAttribute("taskList", tasklistMapper.selectAll());
		return "home";
	}

	@GetMapping("/add")
	String addItem(@RequestParam("task") String task, 
			@RequestParam("deadline") String deadline) {
		Tasklist tasklist = new Tasklist();
		String id = UUID.randomUUID().toString().substring(0, 8);
		boolean done = false;
		tasklist.setId(id);
		tasklist.setTask(task);
		tasklist.setDeadline(deadline);
		tasklist.setDone(done);
		int result = tasklistMapper.insert(tasklist);

		return "redirect:/list";
	}

	@GetMapping("/delete")
	String deleteItem(@RequestParam("id") String id) {
		int result = tasklistMapper.deleteByPrimaryKey(id);
		return "redirect:/list";
	}
	
	@GetMapping("/update")
	String updateItem(@RequestParam("id") String id, 
			@RequestParam("task") String task, 
			@RequestParam("deadline") String deadline, 
			@RequestParam("done") boolean done) {
		Tasklist tasklist = tasklistMapper.selectByPrimaryKey(id);
		tasklist.setTask(task);
		tasklist.setDeadline(deadline);
		tasklist.setDone(done);
		int result = tasklistMapper.updateByPrimaryKey(tasklist);
		return "redirect:/list";
	}
}
