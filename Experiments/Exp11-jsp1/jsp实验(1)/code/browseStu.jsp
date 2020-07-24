<%@ page language="java" import="java.util.*,java.sql.*"
		 contentType="text/html; charset=utf-8"%>
    <% 
	request.setCharacterEncoding("utf-8");
	String msg ="";
	Integer pgno = 0; //��ǰҳ��
	Integer pgcnt = 4; //ÿҳ����
	String param = request.getParameter("pgno");
	if(param != null && !param.isEmpty()){
		pgno = Integer.parseInt(param);
	}
	
	param = request.getParameter("pgcnt");
	if(param != null && !param.isEmpty()){
		pgcnt = Integer.parseInt(param);
	}
	
	int pgprev = (pgno>0)?pgno-1:0;
	int pgnext = pgno+1;
	
	String connectString = "jdbc:mysql://localhost:3306/teaching"
	+ "?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8"; 
	String user="user";
	String pwd="123";
	
	StringBuilder table = new StringBuilder();
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(connectString, user, pwd);
		Statement stmt=con.createStatement();
		
		String sql=String.format("select * from stu limit %d,%d", pgno*pgcnt,pgcnt);
		ResultSet rs=stmt.executeQuery(sql);
		
		table.append("<table><tr><th>id</th><th>ѧ��</th><th>����</th>"+
		"<th>-</th></tr>");
		int pgcount = 0;
		
		while(rs.next()) {
			pgcount++;
			table.append(String.format(
			"<tr><td>%s</td><td>%s</td><td>%s</td><td>%s %s</td></tr>",
			rs.getString("id"),rs.getString("num"),rs.getString("name"),
			"<a href='updateStu.jsp?pid="+rs.getString("id")+"'>�޸�</a>",
			"<a href='deleteStu.jsp?pid="+rs.getString("id")+"'>ɾ��</a>"	));
		}
		
		if(pgcount < 4) {
			pgprev = (pgno>0)?pgno-1:0;
			pgnext = pgno;
		}
		
		table.append("</table>");
		rs.close(); stmt.close(); con.close();
	}
	catch (Exception e){
		msg = e.getMessage();
	}
%>
        <!DOCTYPE HTML>
        <html>

        <head>
            <title>���ѧ������</title>
            <style>
                table {
                    border-collapse: collapse;
                }
                
                td,
                th {
                    border: solid grey 1px;
                    width: 10rem;
                    height: 2rem;
                }
                
                a:link,
                a:visited {
                    color: blue
                }
                
                .container {
                    margin: 0 auto;
                    width: 500px;
                    text-align: center;
                }
                
                div {
                    margin-top: 20px;
                }
            </style>
        </head>

        <body>
            <div class="container">
                <h1>���ѧ������</h1>
                <%=table%>

                    <div style="float:left">
                        <a href="addStu.jsp">����</a>
                    </div>

                    <div style="float:right">
                        <a href="browseStu.jsp?pgno=<%=pgprev%>&pgcnt=<%=pgcnt%>">��һҳ</a>
                        <a href="browseStu.jsp?pgno=<%=pgnext%>&pgcnt=<%=pgcnt%>">��һҳ</a>
                    </div>

                    <br><br>
                    <%=msg%><br><br>
            </div>
        </body>

        </html>