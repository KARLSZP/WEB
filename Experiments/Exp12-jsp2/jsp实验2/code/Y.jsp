<%@ page language="java" import="java.util.*,java.io.*" pageEncoding="utf-8" 
contentType="text/html;charset=utf-8"%>

<%
String user = (String)session.getAttribute("user");
String course = (String)session.getAttribute("course");
String id = session.getId();

%>

<!DOCTYPE  html>
<html  lang="zh-cn">
<head>
<title>Session Y</title>
</head>
<body>
  <h1>Session Y</h1>
  <p>session ID: <%=id%></p>
  <p>course: <%=course%></p>
  <p><a href="X.jsp">X.jsp</p>
  <p><a href="Z.jsp">Z.jsp</p>

</body>
</html>