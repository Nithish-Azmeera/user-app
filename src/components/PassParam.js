import React, { useState } from "react"
import { Link } from "react-router-dom"
const PassParam = () => {
  const [users, setUsers] = useState([])

  const fetchData = e => {
    const query = e.target.value
    fetch(`http://localhost:8080/mongo/rest/search/?name=${query}`)
      .then(response => {
        return response.json()
      })
      .then(data => {
        setUsers(data)
      })
  }
 

  return (
    <div><label for ="name">user Name : </label>
      <input onChange={fetchData} label="Search User" placeholder="name"  />
    
      {users.length > 0 && (
        <ul>
          {users.map(user => (
            <li key={user.id}>Name:{user.uname}<br/>
           Location: {user.ulocation}<br/>
           Ocuppation: {user.uoccupation}<br/>
            Age:{user.uage}</li>
          ))}
        </ul>
      )}
      <li> <Link to="/">Home</Link ></li>
    </div>
  )
}

export default PassParam
