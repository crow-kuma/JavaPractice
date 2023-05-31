package jp.gihyo.projavambg.tasklistmbg.controller;

import java.util.Map;

import org.h2.util.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.gihyo.projavambg.tasklistmbg.entity.Tasklist;
import jp.gihyo.projavambg.tasklistmbg.mapper.TasklistMapper;

@RestController
@CrossOrigin(origins = "*")
public class ReactRestController {

	@Autowired
	private TasklistMapper tasklistMapper;

	@GetMapping("/api/list")
	@ResponseBody
	public Iterable<Tasklist> restListItems() {
		return tasklistMapper.selectAll();
	}

	@PostMapping("/api/add")
	public ResponseEntity<Tasklist> restAddItem(@RequestBody Map<String, String> newTaskData) {
		Tasklist tasklist = new Tasklist();
		String id = java.util.UUID.randomUUID().toString().substring(0, 8);
		boolean done = false;
		tasklist.setId(id);
		tasklist.setTask(newTaskData.get("task"));
		tasklist.setDeadline(newTaskData.get("deadline"));
		tasklist.setDone(done);
		int result = tasklistMapper.insert(tasklist);

		return ResponseEntity.ok(tasklist);
	}


		// 	@PostMapping("/tasks")
		// public ResponseEntity<Task> createTask(@RequestBody Map<String, String> task) {
		// 		Task taskData = new Task();
		// 		taskData.setTask(task.get("task"));
		// 		taskData.setDeadline(task.get("deadline"));
		// 		taskRepository.save(taskData);
		// 		return ResponseEntity.ok(taskData);
		// }

// 	@PostMapping("/tasklists")
// public ResponseEntity<TaskList> createTaskList(@RequestBody TaskList taskList) {

//   // IDとdoneを書き換える
//   taskList.setId(UUID.randomUUID().toString());
//   taskList.setDone(true);

//   // タスクリストを保存する
//   taskListRepository.save(taskList);

//   // タスクリストを返す
//   return ResponseEntity.ok(taskList);
// }
	
}
