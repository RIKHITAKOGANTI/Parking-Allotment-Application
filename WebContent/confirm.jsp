<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js"></script>
<style type="text/css">
body {
  background-image: url('cars.jpg');
}
</style>
</head>
<body>
<div class='col-sm-4 col-sm-offset-4'>
<form action="<%=request.getContextPath()%>/Email" method="post">
<h6>Your Slot Has Been Reserved Confirmation Will Be Sent To Your Email</h6><br><br>
<b>Enter Your Email id<b></b><input  size="40" type="text" id="recipient" name="recipient"/><br><br>
<button  id="btn1" >Confirm Booking</button>
</form>
</div>
</body>
</html>