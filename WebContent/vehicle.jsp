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
<form action="<%=request.getContextPath()%>/realese" method="post">
<center>
<div class='col-sm-4 col-sm-offset-4'>
<h2>Enter Slot Id To Free The Slot</h2>
        <div class="form-group">
                <input type='text' class="form-control" name="slotid"  id="slotid" required/><br><br>
                <input type="submit" value="Free Slot"  id="btn1" ><br><br><br>
        </div>
</div>
</center>
</form>
</body>
</html>