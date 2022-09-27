<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>


<html> 
<body>
  
  		
<h1><b><u>USER DETAILS :</u></b></h1>
<c:if test="${!empty(users)}">
		<section id="user" class="section">
		<c:forEach var="user" items="${users}">

    
    			<label><b>Full name  :  </b></label> ${useru.name}<br><br>
				<label><b>Location   :   </b> ${user.ulocation}</label><br><br>
				<label><b>Occupation :   </b> ${user.uoccupation}</label><br><br>
				<label><b>Age        :   </b> ${user.uage}</label> <br><br>
		
	                        
			</c:forEach>
		</section>
		</c:if>

            
  </body>
</html>

<style>
body{
background:url("https://img.freepik.com/free-vector/hand-painted-watercolor-pastel-sky-background_23-2148902771.jpg?w=2000");}

section{
 font-size: 150%;
 	
 	border: 2px beige;
	padding: 30px

}


</style>