<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>::Login::</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>
	<div id="site_content">
		<div> 
			<div style="margin-left: 150px">
				<h3>
					<i> User Login Form</i>
				</h3>
				<form:form action="loginprocess" method="get"
					modelAttribute="uobject">
					<table>
						<tr>
							<td><form:label path="userId">UserId</form:label></td>
                           <td><form:input path="userId"  style="height: 20px; width: 100px" /></td>
						</tr>
						<tr>
							   <td><form:label path="userName">UserName*</form:label></td>
                               <td><form:input path="userName" style="height: 20px; width: 100px"  />
                               <form:errors path="userName" cssClass="error"></form:errors></td>
						</tr>
						<tr>
							<td><form:label path="password">Password*</form:label></td>
                             <td><form:input path="password" style="height: 20px; width: 100px"  />
                                 <form:errors path="password" cssClass ="error"></form:errors></td>
						</tr>
						<tr>
							<td><form:button>Login</form:button></td>
							<td><form:button>Reset</form:button></td>
						</tr>
						<tr>
							<td></td>
							<td><h5>Register here</h5><a href="newuserregister.jsp">New User !.. </a></td>
						</tr>
					</table>

				</form:form>
			</div>
		</div>
	</div>
</body>
</html>