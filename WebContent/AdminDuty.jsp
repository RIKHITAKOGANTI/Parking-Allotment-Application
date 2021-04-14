<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<title>Start Page</title>
  
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
<style>
body {
  background-image: url('cars.jpg');
}
.button {
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.button1 {background-color: #4CAF50;} /* Green */
.button2 {background-color: #008CBA;} /* Blue */
.button3 {background-color: #FF3377 ;}/*Pink*/
.button4 {background-color:#FFF633;}/*yellow*/
.button5 {background-color:#DB3434;}/*red*/
</style>
</head>
<body>
<br><br><br>
<form action="slotdetails.jsp" method="post">
<center><button class="button button1" >Add A Slot</button></center><br>
</form>
<form action="viewslots.jsp" method="post">
<center><button class="button button3" >View Slots Booked</button></center><br>
</form>
<form action="vehicle.jsp" method="post">
<center><button class="button button2" >Free A Slot</button></center><br>
</form>
<form action="ReadyQueue.jsp" method="post">
<center><button class="button button4" >Show Waiting Customers</button></center><br>
</form>
<form action="index.jsp" method="post">
		<center><button class="button button5" >LOGOUT</button></center><br>
</form>
</body>
</html>