// import logo from './logo.svg';
import React, { Component } from 'react'
import {Link} from 'react-router-dom';
import axios from 'axios'

// class UserDetails extends Component
//  {
//   constructor(props){
//     super(props);
//     this.state={
//       users:[],
//       isLoaded:false,
//     }
//   }
//   componentDidMount(){
//     fetch('http://localhost:8080/mongo/rest/userall')
//     .then(res=>res.json())
//     .then(json=>{
//       this.setState({
//         isLoaded:true,
//         users:json
//       })
//     });
  
//   }

// render(){
//   var {isLoaded , users}=this.state;

function UserDetails(){


  const baseURL="http://localhost:8080/mongo/rest/userall";
  const [users, setPost] = React.useState(null);

React.useEffect(() => {
  axios.get(baseURL).then((response) => {
    setPost(response.data);
  });
}, []);

  if(!users){
    return <div>loading...</div>
  }
  else{
      return(
        <div>

            <ul>
              {users.map(user=>(
                <li key={user.id}> name:{user.uname}  <br></br>
                Location:{user.ulocation}  <br></br>
                Occupation:{user.uoccupation}  <br></br>
                Age:{user.uage}  <br></br>
                </li>
               
              ))}
            </ul>

            <li>
        
        <Link to="/">back to Home</Link>
      </li>
        </div>
      );
      } 
}


export default UserDetails;
