﻿<%@ page language="java" import="java.util.*"
contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
	<head>
	<title>注册</title>
	<script>
	function disapear(Obj){
		var txt1=document.getElementById(Obj.id);
		if (txt1.value=="张三")
		{
			txt1.value="";
			txt1.focus();
		}
	}
 
	</script>
	</head>
	<body>
		<form action="register2.jsp?user=karl" method="post">
		<input type="hidden" name="stuid" value="12345" />
		同学名: <input type="text" id="txt1" name="name" value="张三" οnfοcus="disapear(this)"/>
		<br><br>
		密码：<input type="password" name="password" /><br>
		校区: 
      南校区<input type="radio" name="campus" value="south"/>
      东校区<input type="radio" name="campus" value="east"/>
			北校区<input type="radio" name="campus" value="north"/>
      珠海校区<input type="radio" name="campus" value="zhuhai"/>
			深圳校区<input type="radio" name="campus" value="shenzhen"/><br><br>
		年级：<select name="grade">
				    <option value="freshman">大学一年级</option>
				    <option value="sophomore">大学二年级</option>
					<option value="junior">大学三年级</option>
					<option value="senior">大学四年级</option>
			  </select>	<br><br>
        社团 :舞蹈队<input type="checkbox" name="club" value="dance"/>
               摄影<input type="checkbox" name="club" value="photo"/>
               篮球<input type="checkbox" name="club" value="basketball"/><br><br>
        <table>
				<tr>
					<td valign="top">说明:    </td>
					<td><textarea rows="5" cols="30" name="explain" >我学过Web程序设计</textarea></td>
				</tr>
		</table>
        <input type="submit" name="submit1" value="保存" />
        <input type="submit" name="submit2" value="退出" /><br>
		</form>
	</body>
</html>