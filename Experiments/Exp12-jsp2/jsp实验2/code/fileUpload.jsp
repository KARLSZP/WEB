<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*,org.apache.commons.io.*"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@ page import="org.apache.commons.fileupload.disk.*"%>
<%@ page import="org.apache.commons.fileupload.servlet.*"%>
<%  request.setCharacterEncoding("utf-8"); %>
<% 
    String imagePath = "";
    String imageName = "";
%>
<!DOCTYPE html>
<html>
<head>
<title>文件上传</title>
</head>
<body>
	<%
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if (isMultipart){
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			List items = upload.parseRequest(request);
			String Id = "";
			for (int i = 0; i < items.size(); i++){
				FileItem fi = (FileItem) items.get(i);
				if (fi.isFormField()){
					if (fi.getFieldName().equals("id")){
						Id = fi.getString("utf-8");
					}
				}else{
					DiskFileItem dfi = (DiskFileItem) fi;
					if (!dfi.getName().trim().equals("")){
						out.print("文件被上传到服务器上的实际位置:");
						String fileName = application.getRealPath("/files")
								+ System.getProperty("file.separator")+Id+"_"
								+FilenameUtils.getName(dfi.getName());
						imagePath = new File(fileName).getAbsolutePath();
						imageName = Id + "_" + FilenameUtils.getName(dfi.getName());
						out.print(imagePath);
						System.out.println(new File(fileName).getAbsolutePath());
						dfi.write(new File(fileName));
					}
				}
			}
		}
	%>
	<p><a href = "<%="/jsp2/files/"+imageName%>"><%=imageName%></a></p>
</body>
</html>