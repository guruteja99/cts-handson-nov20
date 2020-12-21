<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<style type="text/css">
.welcome{
	text-align: justify;  /* For Edge */
  text-align-last: right;
}
</style>
<title>Profile</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-success navbar-dark">  
  <div class="container-fluid">  
    <div class="navbar-header">  
      <a class="navbar-brand" href="/dashboard">Academy</a>  
    </div>  
    <ul class="nav navbar-nav">  
      <li class="active"><a href="/dashboard">Profile</a></li>
    </ul>  
  </div> 
  <div class="welcome">Welcome ${student.firstName}</div> 
</nav>  
<table class="table">
<tr><th colspan="2" >YOUR DETAILS</th></tr>
<tr><th>First Name:</th><td>${student.firstName}</td></tr>
<tr><th>Last Name:</th><td>${student.lastName}</td></tr>
<tr><th>Admission Mode:</th><td>${student.admissionMode}</td></tr>
<tr><th>Degree:</th><td>${student.degree}</td></tr>
<tr><th>First Name:</th><td>${student.program}</td></tr>
<tr><th>Program:</th><td>${student.studentType}</td></tr>
</table>
<br>
<br>
<strong style="font-size:20px">Your Tasks</strong>
<table class="table">
<c:choose>
<c:when test="${size>0}">
<tr><th>Task</th><th>Start Date</th><th>Due Date</th></tr>
<tbody>
<c:forEach items="${tasks}" var="task">
<tr>
<td>${task.taskName}</td>
<td>${task.startDate}</td>
<td>${task.dueDate}</td>
</tr>
</c:forEach>
</tbody>
</c:when>
<c:otherwise>
<div>You are not assigned with any tasks</div>
</c:otherwise>
</c:choose>
</table>
</body>
</html>