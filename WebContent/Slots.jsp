<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Dynamic Drop Down List Demo - CodeJava.net</title>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js"></script>
<style>
body {
  background-image: url('cars.jpg');
}
</style>
</head>
<body>
 
<div align="center">
<br><br><br><br>
    <h2>Please select a slot</h2>
    <form action="<%=request.getContextPath()%>/book" method="post">
    <select name="category" style="width:150px;">
        <c:forEach items="${listCategory}" var="category">
            <option value="${category.id}" name="${category.id}">${category.name}</option>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="hidden" value="<%= session.getAttribute("starttime") %>" id="stime" name="stime">
    <input type="hidden" value="<%= session.getAttribute("endtime") %>" id="etime" name="etime">
    <input type="hidden" value="<%= session.getAttribute("vehnum") %>" id="vehno" name="vehnum">
    <input type="hidden" value="<%= session.getAttribute("duration") %>" id="duration" name="duration">
    
    <button class="btn btn-primary" type="submit">Confirm Slot</button><br><br><br>
</form>
<form action="ReadyQu.jsp" method="post">
<button class="btn btn-warning" type="submit">Required Slot Not Available Please Click Here</button><br><br><br>
</form>
</div>
</body>
</html>