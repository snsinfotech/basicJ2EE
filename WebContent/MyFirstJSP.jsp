<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Date d = new Date();
		out.print(d);
	%>
	<br>
	<br>
	<%=5 + 5 * 5%>

	<form   method="post"  action="kamalhai">

		Principal : <input type="text" name="p" /> <br>
		Rate :<input type="text"
			name="r" /> 
			<br>
			Time <input type="text" name="t" /> <br>
			<input type="submit">
	</form>

</body>
</html>