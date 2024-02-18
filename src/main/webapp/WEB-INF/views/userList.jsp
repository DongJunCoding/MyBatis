<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.example.dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
ArrayList<UserDTO> userList = (ArrayList) request.getAttribute("userList");

System.out.println(userList.get(0));

StringBuilder sb = new StringBuilder();

for(UserDTO user : userList) {

	sb.append("<tr>");
	sb.append("<td>" + user.getSeq() + "</td>");
	sb.append("<td>" + user.getName() + "</td>");
	sb.append("<td>" + user.getAge() + "</td>");
	sb.append("<td>" + user.getSex() + "</td>");
	sb.append("<td>" + user.getAddress() + "</td>");
	sb.append("</tr>");

}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>나이</td>
			<td>성별</td>
			<td>주소</td>
		</tr>
		<%=sb%>
		
	</table>

</body>
</html>