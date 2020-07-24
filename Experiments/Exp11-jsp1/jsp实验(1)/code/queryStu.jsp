<%@ page language="java" import="java.util.*,java.sql.*" 
         contentType="text/html; charset=utf-8"%>
    <%
	request.setCharacterEncoding("utf-8");
	String msg ="";
	String connectString = "jdbc:mysql://localhost:3306/teaching"
					+ "?autoReconnect=true&useUnicode=true"
                    + "&characterEncoding=UTF-8"; 
                    

    
    StringBuilder table=new StringBuilder("");

        
	try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(connectString, 
	                 "user", "123");
        Statement stmt=con.createStatement();
        String ps = "select * from stu where num like ? or name like ?";
        PreparedStatement q = con.prepareStatement(ps);
        String pattern=request.getParameter("query");
        if (pattern != null) {
            table.append("<table>");
            table.append("<tr> <th>id</th><th>学号</th><th>姓名</th><th>操作</th> </tr>");
            out.print(pattern);
            q.setString(1,"%"+pattern+"%");
            q.setString(2,"%"+pattern+"%");
            ResultSet rs=q.executeQuery();
            while(rs.next()) {
                table.append("<tr>");
                table.append("<td>"+rs.getString("id")+"</td>");
                table.append("<td>"+rs.getString("num")+"</td>");
                table.append("<td>"+rs.getString("name")+"</td>");
                table.append("<td>"+
                             "<a href='updateStu17341137.jsp?pid="+rs.getString("id")+"'>修改</a>"+"		"+
                             "<a href='deleteStu17341137.jsp?pid="+rs.getString("id")+"'>删除</a>"+
                              "</td>");
                table.append("</tr>");
            }
            table.append("</table>");
            rs.close();
            stmt.close();
            con.close();
        }
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
            <title>查询学生名单</title>
        </head>

        <body>
            <div class="container">
                <h1>查询学生名单</h1>
                <div id="search" style="margin:10px; text-align: center; display: inline-block;">
                    <form action="queryStu17341137.jsp">
                        <label>输入查询:</label>
                        <input name="query" type="text" style="width: 200px;">
                        <input type="submit" value="查询">
                    </form>

                </div>
                <%=table%><br><br>
                    <div style="text-align : left ">
                        <a href="addStu.jsp">新增</a>
                        <a href="queryStu17341137.jsp">返回</a>
                    </div><br><br>
            </div>
        </body>

        </html>