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
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>
<style>
body {
  background-image: url('bac.jpg');
}
h3
{
color:white;
}
button
{
border-color: yellow;
  color: black;
  padding: 8px 22px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}
</style>
</head>
<body>
<center>
<form action="<%=request.getContextPath()%>/waiting" method="post">
<h5 style="color:white">Enter Slot Id</h5>
    <div class='col-sm-4 col-sm-offset-4'>
        <div class="form-group">
                <input type='text' class="form-control" name="slotid" id="slotid" required/>
        </div>
    </div><br><br>
<h5 style="color:white">Enter Email Id</h5>
    <div class='col-sm-4 col-sm-offset-4'>
        <div class="form-group">
                <input type='text' class="form-control" name="email" id="email" required/>
                <input type="hidden" value="<%= session.getAttribute("vehnum") %>" id="vehnum" name="vehnum">
                <button  id="btn1" >Notify Me When Free</button>
        </div>
    </div><br><br>
</form>
</center>
</body>
</html>