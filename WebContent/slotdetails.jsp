<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
body {
  background-image: url('bac.jpg');
}
button
{
border-color: white;
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
<form action="<%=request.getContextPath()%>/lots" method="post">
<div class='col-sm-4 col-sm-offset-4'>
<h2 style="color:white">Enter lot Details</h2><br><br>
<div class="input-group">
      <span class="input-group-addon">Name Of lot</span>
      <input id="msg" type="text" class="form-control" name="sname" required>
</div><br><br>
<div class="input-group">
      <span class="input-group-addon">Status Of Lot</span>
      <input id="msg" type="text" class="form-control" name="status" required>
</div><br><br>
<center><button  id="btn1" >Create lot</button></center>
</div>
</form>
</body>
</html>