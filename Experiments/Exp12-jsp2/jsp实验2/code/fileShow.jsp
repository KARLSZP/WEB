<%@ page language="java" import="java.util.*" contentType="text/html;
    charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%
        request.setCharacterEncoding("utf-8");
        %>
        <!DOCTYPE html>
        <html>

        <head>
            <title>实现文件上传</title>
        </head>

        <body>
            <form name="fileupload" action="fileUpload.jsp" method="POST" enctype="multipart/form-data">
                <p>id: <input type="text" name="id"> </p>
                <p>文件名: <input type="file" name="file" size=24></p>
                <input type="submit" name="submit" value="ok">
            </form>
        </body>

        </html>