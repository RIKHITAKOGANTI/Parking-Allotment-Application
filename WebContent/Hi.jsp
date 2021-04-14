<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:declaration>
	String starttime="";
	String endtime="";
</jsp:declaration>
<jsp:scriptlet>
	starttime=request.getParameter("stime");
	endtime=request.getParameter("etime");
</jsp:scriptlet>
<strong>Startime is<jsp:expression>starttime</jsp:expression></strong>
</body>
</html>