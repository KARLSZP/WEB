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
<title>Session Z</title>
</head>
<body>
  <h1>Session Z</h1>
  <p>session ID: <%=id%></p>
  <p>course: <%=course%></p>
  <p><a href="X.jsp">X.jsp</p>
  <p><a href="Y.jsp">Y.jsp</p>  

</body>
</html>