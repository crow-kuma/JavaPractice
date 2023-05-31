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

  return (
    <div>
      <h1>Reactで作ったTasklist</h1>
      <Form />
      <List tasklists={tasklists} setTasklists={setTasklists}/>
      <Update />
    </div>
  )
}

export default App
