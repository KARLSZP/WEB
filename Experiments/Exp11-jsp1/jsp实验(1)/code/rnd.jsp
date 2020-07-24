<%@ page language="java" import="java.util.*,java.io.*,java.util.Random"
contentType="text/html;charset=utf-8"%>
    <!DOCTYPE  html>
    <html lang="zh-cn">

    <head>
        <meta charset="utf-8">
        <title>40个随机数</title>
    </head>

    <body>
        <h1>40个随机数</h1>
        <%
            Random rnd= new Random(50);
        
            for(int i =0;i<40;i++){
                out.print(rnd.nextInt(1000));
                out.print(" ");
            }
        %>
    </body>

    </html>