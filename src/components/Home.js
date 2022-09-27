import React from 'react';

import {Link} from 'react-router-dom';
const Home = () => {
    return (
      <div>
        <h1>Home Page</h1>
        <br />

        <ul>
        <li><Link to="/">Home</Link></li>
          <li><Link to="/Form">Add New users</Link></li>
            <li><Link to="/userDetails">Existing Users details</Link></li>
              <li><Link to="/userList">Existing UserName</Link></li>
                <li><Link to="/PassParam"> SearchUser  </Link></li>
        </ul>
        </div>
    );
};
export default Home
