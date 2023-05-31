const Form = () => {
	return (
		<div>
			<h2>タスクの登録</h2>
			<form>
				<label>タスク</label>
				<input type="text" name="task" />
				<label>期限</label>
				<input type="date" name="deadline" />
				<input type="submit" value="登録" />
			</form>
		</div>
	);
}

export default Form;