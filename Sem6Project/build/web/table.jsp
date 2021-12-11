<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
    </head>
    <body>
        <%
            Connection c;
            String course = request.getParameter("course");
            Statement s;
            ResultSet r;

            Class.forName("org.h2.Driver");
            c = DriverManager.getConnection("jdbc:h2:C:\\Users\\windows\\Downloads\\New folder", "sa", "123");
            s = c.createStatement();
            System.out.println(course);
            r = s.executeQuery("select * from STUDENT ");
        %>

        <table id="example">
            <thead>
            <th>ID</th> 
            <th>NAME</th>
            <TH>SESSION_ID</TH>
        </thead>
        <tbody>
            <% while (r.next()) {%>
            <Tr>
                <td><%= r.getString(1)%></td>   
                <TD> <%= r.getString(2)%></td>
                <TD> <%= r.getString(3)%></TD>

            </TR>
            <% }%>
        </tbody>
        <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
        <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
        <script>
            $(function () {
                $("#example").dataTable();
            });
        </script>
    </table>
    <br><br><a href="update.jsp"><input type="submit" value="Update" /></a>
    <a href="delete.jsp"><input type="submit" value="Delete"/></a>
</body>
</html>