<!DOCTYPE html>
<html>
<body> 

<h1><b><u>Enter New User Details :</u></b></h1>

<form action="/savedata" method="post"  modelAttribute = "newuser">
  <label for="uname">Full name:</label>
  <br>
  <input type="text" id="uname" name="uname" value="" minlength="3">
  <br>
  <br>
   <label for="ulocation">Location:</label>
  <br>
  <input type="text" id="ulocation" name="ulocation" value=""  minlength="3">
  <br>
  <br>
 
  <label for="uoccupation">Occupation:</label>
  <br>
  <input type="text" id="uoccupation" name="uoccupation" value=""  minlength="3">
  <br>
  <br>
 
  <label for="uage">Age:</label>
  <br>
  <input type="number" id="uage" name="uage" value="0">
  <br>
  <br>
 
      <button href="/save">SUBMIT</button>
</form>
<li><a href="/showdata">EXISTING USER DETAILS</a></li>

</body>
</html>

<style>
body{
	background:url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTl3p-eVw9TkyBJSkBNhSnYzUMSm-ehVsAbOA&usqp=CAU");

  	background-size: cover;
}

form{
 	font-size: 100%;
 	font-color:crimson ;
 	border: 2px beige;
	padding: 50px;
  	
 	background-color:MintCream;
  

}

}
button {
  transition-duration: 0.4s;
}

button:hover {
  background-color: #4CAF50; /* Green */
  color: white;
}

</style>