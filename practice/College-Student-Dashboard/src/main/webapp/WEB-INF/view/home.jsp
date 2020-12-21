<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<style type="text/css">
.failure{
color:red
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
</nav>
<center><form method="post">
<label for "id">RollNumber:</label>
<input type="number" id="id" name="id"></br>
<input type="submit" value="Submit">
</form></center>  
</body>
</html>