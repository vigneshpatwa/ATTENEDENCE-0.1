<%-- 
    Document   : teacherupdate
    Created on : Dec 10, 2021, 11:58:04 PM
    Author     : windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="updateval.jsp" method="post">
            <input type="text" name="cid" placeholder= "Enter Id"/><br><br>
            <input type="text" name="cnm" placeholder="Enter the change name"/><br><br>
            <input type="text" name="csesid" placeholder="Enter the change password"/><br><br>
            <input type="submit" title="update"/>
        </form>
    </body>
</html>
