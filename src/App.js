// import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Routes,Route} from "react-router-dom";
import Home from './components/Home';


import Form from './components/Form';
import UserDetails from './components/UserDetail';
import UserList from './components/UserList';
import PassParam from './components/PassParam';
function App()
 {
  return (
    <div className="App">


      
           

      
     <Router>
      <Routes>
        <Route exact path="/" element={<Home/>}/>
        <Route exact path="/Form" element={<Form/>}/>
        <Route exact path="/UserDetails" element={<UserDetails/>}/>
        <Route exact path="/UserList" element={<UserList/>}/>
        
        <Route exact path="/PassParam" element={<PassParam/>}/>
      </Routes>
      </Router> 
    
   

    </div>
  );
}

export default App;
