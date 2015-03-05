<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form id="loginForm" method="post" commandName action="/EPartage/login.htm">
		<input id="login" name="login" type="text" value="LOGIN"
			onfocus="this.value = '';" /> <input id="password" name="password"
			type="password" value="******" onfocus="this.value = '';" />
		<div class="submit">
			<input type="submit" value="Connexion" />
		</div>
	</form>
	<p class="bottom">
		<a href="/EPartage/login_forgot.htm">Mot de passe oublié ?</a>
	</p>
</body>
</html>