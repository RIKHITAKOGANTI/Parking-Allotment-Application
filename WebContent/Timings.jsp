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

<body >
<center>
<form name="form1" action="list" method="post" onsubmit="return func1()">
<div class="container">
<h3 style="color:white">Select Timings</h3><br>
<p style="color:white">NOTE:The booking of  slot must be done two hours prior to the required time of the slot</p> 
<h5 style="color:white">Enter your Vehicle number</h5>
<div class="input-group form-group">
  <div class="input-group-prepend">
	<span class="input-group-text"><i class="fas fa-car"></i></span></div>
<input type="text" class="form-control" placeholder="vehicle number" name="vehnum">
</div>
<h5 style="color:white">Start Time</h5>
    <div class='col-sm-4 col-sm-offset-4'>
        <div class="form-group">
            <div class='input-group date' id='datetimepicker6'>
                <input type='text' class="form-control" name="stime" id="tx1" required/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div>
    </div><br><br>
<h5 style="color:white">End Time</h5>
    <div class='col-sm-4 col-sm-offset-4'>
        <div class="form-group">
            <div class='input-group date' id='datetimepicker7'>
                <input type='text' class="form-control" name="etime"  id="tx2" required/>
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div>
    </div><br><br>
<div class='col-sm-4 col-sm-offset-4'>
<center><input style="text-align:center" size="40" type="text" id="tx3" name="duration"/><br><br></center>
<button  id="btn1" >Select Slot</button>
</div>
</div>
<script type="text/javascript">
    $(function () {
        $('#datetimepicker6').datetimepicker({
         format: 'MM/DD/YYYY HH:mm' ,
         useCurrent: false
        });
        $('#datetimepicker7').datetimepicker({
             format: 'MM/DD/YYYY HH:mm',
             useCurrent: false
        });
        $("#datetimepicker6").on("dp.change", function (e) {
            $('#datetimepicker7').data("DateTimePicker").minDate(e.date);
        });
        $("#datetimepicker7").on("dp.change", function (e) {
            $('#datetimepicker6').data("DateTimePicker").maxDate(e.date);
        });
    });
function func1()
{
 var s1=document.forms["form1"]["stime"].value;
 var s2=document.forms["form1"]["etime"].value;
 var a=s1.split(" ");
 var b=s2.split(" ");
 var time=diff(a[1],b[1]);
var t2=a[1].split(":");
var t3=b[1].split(":");
var p=time.split(":");
p[0]=p[0]+"hrs";
var m=parseInt(p[0]);
 var today = new Date();
var t =parseInt( today.getHours());
var t1=parseInt(t2[0]);
var t4=parseInt(t3[0]);

if(t == t1 || t+1==t1)
{
	document.getElementById('tx3').value =" Please select timings after 2 hrs";
	return false;
}
else if(m>4)
{
document.getElementById('tx3').value =" Parking lot can be booked only for 4 hrs";
return false;
}
else if(t1==t4)
{
document.getElementById('tx3').value =" Start and end time cannot be same";
return false;
}
else
{
 document.getElementById("tx3").value=p[0];
 return true;
}
}
function diff(start, end)
 {
    start = start.split(":");
    end = end.split(":");
    var startDate = new Date(0, 0, 0, start[0], start[1], 0);
    var endDate = new Date(0, 0, 0, end[0], end[1], 0);
    var diff = endDate.getTime() - startDate.getTime();
    var hours = Math.floor(diff / 1000 / 60 / 60);
    diff -= hours * 1000*60*60;
    var minutes = Math.floor(diff / 1000 / 60);

    if (hours < 0)
{
       hours = hours + 24;
}

    return (hours <= 9 ? "0" : "") + hours + ":" + (minutes <= 9 ? "0" : "") + minutes;
}
</script>
</form>
</center>
</body>
</html>