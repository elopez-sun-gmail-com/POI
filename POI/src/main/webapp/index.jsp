<%-- 
    Document   : index
    Created on : 16 jun. 2022, 10:27:24
    Author     : elopez
--%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <form action="<%=basePath%>MyServlet">
            <input type="submit" value="Excel" name="excel" />            
        </form>
    </body>
</html>
