<!DOCTYPE html>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<html>
<body>
<h3><b><u>USER NAMES:</u></b></h3>
		<c:if test="${!empty(users)}">
		<section id="users" class="section">
		<c:forEach var="user" items="${users}">
		<div class="userContainer">
	                           
			<div class="userContainerItem">
			${user.uname}<br />
	
		</div>
	                        
			</c:forEach>
			</div>
	           
		</section>
		</c:if>
            
   <br><br><br><br>
           <h2><b><u>User Details</u></b></h2>
  		<form action="/searchdata" method = "post">
    	<div class="user-box">
	<label>Enter UserName : </label>
      	<input path="name" name="name" >
      	 <button href="/searchdata" >Search</button>
    </div>
  </form>

            
            
  </body>
</html>


<style>


button {
  transition-duration: 0.4s;
}

body{
background:url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSj29P7NfLsP0yuMy07pJ7tBwC6A3oXDJzpQ&usqp=CAU");
	background-size: cover;
	}
button:hover {
  background-color: #4CAF50; /* Green */
  color: white;
}
section{
 font-size: 132%;
 
 	border: 2px beige;
	padding: 10px
}
</style>
