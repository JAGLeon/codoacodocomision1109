<%-- 
    Document   : pagina
    Created on : 9 nov 2021, 11:25:58
    Author     : Antony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String saludo = "Hola";
            String nombre = "Leon";
            
        %>
        <h1>Heasdsa!</h1>
        <p> <%=saludo+" "+nombre %> </p>
        <p> <%= new java.util.Date()%> </p>
        
    </body>
</html>
