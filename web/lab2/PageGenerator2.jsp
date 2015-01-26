<%-- 
    Document   : PageGenerator2
    Created on : Jan 22, 2015, 2:08:00 PM
    Author     : tim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   String color = request.getParameter("color");
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="color:<%= color %>">This is a JSP table</h1>
    </body>
</html>
