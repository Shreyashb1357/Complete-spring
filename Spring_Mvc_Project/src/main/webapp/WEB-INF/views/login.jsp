<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
		<h1>Please Sign-In</h1>	
		<form action="validate" method="post">
			<pre>
				Username: <input type="text" name="uid"/>
				
				Password: <input type="password" name="pwd"/>
				
				<input type="submit" value="Sign-In"/>
			</pre>
		</form>
	</body>
</html>