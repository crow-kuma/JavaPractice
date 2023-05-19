package jp.gihyo.projava.tasklist;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import jp.gihyo.projava.tasklist.HomeController.TaskItem;

@Service
public class TaskListDao {
	private final JdbcTemplate jdbcTemplate;

	// Constructor to initialize jdbcTemplate with AutoWired
	@Autowired
	TaskListDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// Method to add a new task to the database
	public void add(TaskItem taskItem) {
		// define param by SQL parameter source
		SqlParameterSource param = new BeanPropertySqlParameterSource(taskItem);
		// insert into tasklist table by SimpleJdbcInsert
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate).withTableName("tasklist");
		// execute insert
		insert.execute(param);
	}

	// findAll method to register TaskItem to tasklist table
	public List<TaskItem> finadAll() {
		// define query to select all from tasklist table
		String query = "SELECT * FROM tasklist";
		// define result of a List that has a Map of String and Object
		List<Map<String, Object>> result = jdbcTemplate.queryForList(query);
		// define taskItems. This is a stream of result.
		List<TaskItem> taskItems = result.stream()
				.map((Map<String, Object> row) -> new TaskItem(
							// get id from row and cast to String
							row.get("id").toString(),
							// get task from row and cast to String
							row.get("task").toString(),
							// get deadline from row and cast to String
							row.get("deadline").toString(),
							// get done from row and cast to boolean
							(Boolean) row.get("done")))
					// toList to return a List of TaskItem
					.toList();
		// return taskItems
		return taskItems;
	}
}
