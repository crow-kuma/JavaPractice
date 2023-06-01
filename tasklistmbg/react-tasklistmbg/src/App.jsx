import { useEffect, useState } from 'react'
import axios from 'axios'
import Form from './components/Form'
import List from './components/List'
import Update from './components/Update'

import './App.css'

function App() {
  const [tasklists, setTasklists] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/api/list").then((response) => {
      setTasklists(response.data);
    });
  }, []);

  console.log(tasklists);

  const handleSubmit = async (e) => {
    e.preventDefault();

    const task = e.target.elements.task.value;
    const deadline = e.target.elements.deadline.value;

    try {
      const response = await axios.post("http://localhost:8080/api/add", {
        task,
        deadline,
      });

      if (response.status === 200) {
        alert('タスクの登録に成功しました。');
      } else {
        alert('タスクの登録に失敗しました。');
      }
    } catch (error) {
      console.log(error);
    }

    e.target.elements.task.value = "";
    e.target.elements.deadline.value = "";

    axios.get("http://localhost:8080/api/list").then((response) => {
      setTasklists(response.data);
    });
  };


  return (
    <div>
      <h1>Reactで作ったTasklist</h1>
      <Form handleSubmit={handleSubmit}/>
      <List tasklists={tasklists} />
      <Update />
    </div>
  )
}

export default App
