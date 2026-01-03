<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
		<h1>Person Entry Page</h1>
		<h1>Enter Details:</h1>	
		<form action="bmi" method="post">
			<pre>
				Name: <input type="text" name="name"/>
				
				Height (Cm): <input type="text" name="height"/>
				
				Weight (Kg): <input type="text" name="weight"/>
				
				<input type="submit" value="GET BMI"/>
			</pre>
		</form>
	</body>
</html>