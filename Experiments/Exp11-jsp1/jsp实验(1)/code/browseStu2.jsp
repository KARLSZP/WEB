<%@ page language="java" import="java.util.*,java.sql.*" 
         contentType="text/html; charset=utf-8"%>
    <%
	request.setCharacterEncoding("utf-8");
	String msg ="";
	String connectString = "jdbc:mysql://localhost:3306/teaching"
					+ "?autoReconnect=true&useUnicode=true"
					+ "&characterEncoding=UTF-8"; 
    StringBuilder table=new StringBuilder("");
    table.append("<table>");
    table.append("<tr> <th>id</th><th>学号</th><th>姓名</th><th>操作</th> </tr>");
        
	try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(connectString, 
	                 "user", "123");
        Statement stmt=con.createStatement();
        String ps = "select * from stu where num like ? and name like ?";
        PreparedStatement q = con.prepareStatement(ps);
        q.setString(1,"4%");
        q.setString(2,"s%");
	    ResultSet rs=q.executeQuery();
	    while(rs.next()) {
            table.append("<tr>");
            table.append("<td>"+rs.getString("id")+"</td>");
            table.append("<td>"+rs.getString("num")+"</td>");
            table.append("<td>"+rs.getString("name")+"</td>");
            table.append("<td>"+
	            		 "<a href='updateStu.jsp?pid="+rs.getString("id")+"'>修改</a>"+"		"+
	            		 "<a href='deleteStu.jsp?pid="+rs.getString("id")+"'>删除</a>"+
	             		 "</td>");
            table.append("</tr>");
        }
        table.append("</table>");
        rs.close();
        stmt.close();
        con.close();
    }
	catch (Exception e){
        msg = e.getMessage();
	}
%>
        <!DOCTYPE HTML>
        <html>
        <style>
            td,
            th {
                width: 10rem;
                height: 2rem;
                border: solid 1px black
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
            
            table {
                border-collapse: collapse
            }
        </style>

        <head>
            <title>浏览学生名单</title>
        </head>

        <body>
            <div class="container">
                <h1>浏览学生名单</h1>
                <%=table%><br><br>
                    <div style="text-align : left ">
                        <a href="addStu.jsp">新增</a>
                    </div><br><br>
            </div>
        </body>

        </html>