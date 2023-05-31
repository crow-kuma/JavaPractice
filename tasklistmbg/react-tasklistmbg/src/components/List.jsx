const List = (props) => {
	return (
		<div>
			<h2>現在のタスク一覧</h2>
			<table>
				<thead>
					<tr>
						<th className="hidden">ID</th>
						<th>タスク</th>
						<th style={{width: '150px'}}>期限</th>
						<th style={{width: '100px'}}>状態</th>
					</tr>
				</thead>
				<tbody>
					{props.tasklists.map((tasklist, index) => (
						<tr key={index}>
							<td className="hidden">{tasklist.id}</td>
							<td>{tasklist.task}</td>
							<td>{tasklist.deadline}</td>
							<td>{tasklist.done ? "完了" : "未完了"}</td>
						</tr>
					))}
				</tbody>
			</table>
		</div>
	);
}

export default List;