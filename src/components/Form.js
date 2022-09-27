import React, { useState} from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';
function Form(){
    const url="http://localhost:8080/mongo/rest/user/new"
    const [data,setData]=useState ( {
     uname:"",
     ulocation:"",
     uoccupation:"",
     uage:"0"
  })
function submit(event){
   
    event.preventDefault();
    axios.post(url,{
        uname:data.uname,
        ulocation:data.ulocation,
        uoccupation:data.uoccupation,
        uage:data.uage,
        
    })
    
    .then(res=>{
        console.log(res.data)
    })
    
    
     
}
function handle(event){
    const newData={...data};
    newData[event.target.id]=event.target.value
    setData(newData);
    console.log(newData)
}


    
        return(
            <div>
                <h2>Enter New User details here:</h2>
                <form onSubmit={(event)=>submit(event)}>
                    <label>User Name : </label>
                        <input onChange={(event)=>handle(event)} id="uname" value={data.uname} placeholder="name" type="text"/><br/>
                    <label>Location : </label>
                        <input onChange={(event)=>handle(event)} id="ulocation" value={data.ulocation} placeholder="Location" type="text"/><br/>
                    <label>Occupation : </label>    
                        <input onChange={(event)=>handle(event)} id="uoccupation" value={data.uoccupation} placeholder="Occupation" type="text"/><br/> 
                    <label>Age : </label>
                        <input onChange={(event)=>handle(event)} id="uage" value={data.uage} placeholder="age" type="number"/> <br/>
                        <button   >submit</button>
                </form>
                <li>
        
          <Link to="/">Home</Link>
        </li>
            </div>
        );

}
export default Form;