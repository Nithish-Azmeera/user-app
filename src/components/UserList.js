
import React from 'react'
import{Link} from 'react-router-dom'
import axios from 'axios';

function UserList (){
//class UserList extends Component(){
// extends Component
//  {
//   constructor(props){
//     super(props);
    // this.state={
    //   items:[],
    //   isLoaded:false,
//     }
//   }
//   componentDidMount(){
//     fetch('http://localhost:8080/mongo/rest/userall')
//     .then(res=>res.json())
//     .then(json=>{
//       this.setState({
//         isLoaded:true,
//         items:json
//       })
//     });
  
//   }

// render(){
//   var {isLoaded , items}=this.state;

  // if(!isLoaded){
  //   return <div>loading...</div>
  // }

  const baseURL="http://localhost:8080/mongo/rest/userall";
  const [post, setPost] = React.useState(null);

React.useEffect(() => {
  axios.get(baseURL).then((response) => {
    setPost(response.data);
  });
}, []);


  if (!post) 
      return <div>loading...</div>;
  else{
      return(
        <div>
          <h2>User names:</h2>
            <ul>
              {post.map(post=>(
                <li key={post.id}> {post.uname}  <br></br>
                </li>
               
              ))}
            </ul>

              <li><Link to="/">back to Home</Link></li>
        </div>
      );
      } 
}

 
export default UserList;


