<%@ page language="java" import="java.util.*,java.io.*" 
         contentType="text/html; charset=utf-8"%><%
request.setCharacterEncoding("utf-8");
%><%
out.print("<h1>你提交的内容如下:</h1>");
Enumeration<String> enums=request.getParameterNames(); 
     while(enums.hasMoreElements()){ 
        String name=(String)enums.nextElement(); 
        if (name.equals("group")){
           String[] groups=request.getParameterValues("group");
           out.println(name+":"+Arrays.toString(groups)+"<br />"); 
        }
        else
          out.println(name+":"+request.getParameter(name)+"<br />"); 
     } 

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head><title>
	文件下载
</title></head>
<body>
    <form method="post" action="./Download.aspx?vm1=&amp;filename=%u5728%u7ebf%u8c03%u8bd5%5chtml2%5cedit.jsp&amp;rootindex=3&amp;rootname=%u5728%u7ebf%u8c03%u8bd5" id="form1">
<div class="aspNetHidden">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUJNzgzNDMwNTMzZGTuANhTzPqyDjq35JlTjoV+ynhnoQ/DO5029qkVbH4BOA==" />
</div>

<div class="aspNetHidden">

	<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="8128897D" />
</div>

    </form>
</body>
</html>
