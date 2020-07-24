<%@ page language="java" import="java.util.*,java.sql.*"
		 contentType="text/html; charset=utf-8"%>
    <% 
	request.setCharacterEncoding("utf-8");
	String msg = "";
	String connectString = "jdbc:mysql://localhost:3306/teaching"
							+ "?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8";
	String user="user"; 
	String pwd="123";
 
	String param = request.getParameter("pid");
	
	String pid = "";
	if(param != null && !param.isEmpty()){
		pid += param;
	}
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(connectString,user, pwd);
		Statement stmt = con.createStatement();
		
		String fmt="delete from stu where id=%s";
		String sql = String.format(fmt,pid);
		int cnt = stmt.executeUpdate(sql);
		if(cnt>0) msg = "删除成功!";
		
		stmt.close();
		con.close();
 	    }
	catch (Exception e){
		msg = e.getMessage();
	}
	
	
%>

        <!DOCTYPE HTML>
        <html>

        <head>
            <title>删除学生记录</title>
            <style>
                body {
                    font-family: 微软雅黑, 宋体;
                }
                
                a:link,
                a:visited {
                    color: blue;
                }
                
                .container {
                    margin: 0 auto;
                    width: 500px;
                    text-align: center;
                }
                
                form {
                    line-height: 50px;
                }
            </style>
        </head>

        <body>
            <div class="container">
                <h1>删除学生记录</h1>

                <p>
                    <%=msg%>
                </p><br>
                <a href='browseStu.jsp'>返回</a>
            </div>
        </body>

        </html>