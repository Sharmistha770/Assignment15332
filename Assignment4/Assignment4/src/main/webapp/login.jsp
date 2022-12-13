<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<div>
  <form action="<%= request.getContextPath() %>/user" method="post">
	<table>
    	<tr>
     		<td>UserName</td>
     		<td><input type="text" name="username" /></td>
    	</tr>
    	<tr>
    		<td>Password</td>
     		<td><input type="password" name="password" /></td>
    	</tr>
 		<tr></tr>
    	<tr>
    		<td><input type="submit" value="Submit" /></td>
    	</tr>
   </table>
  </form>
</div>
</body>
</html>