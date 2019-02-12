<%--
  Created by IntelliJ IDEA.
  User: San9
  Date: 11.02.2019
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Testing JSP</h1>
   <p>
       <%
           java.util.Date now = new java.util.Date();
           String someString = "Текущая дата : " + now;
       %>
   </p>

<p>  <%= "Hello world jsp" %> </p>
<p>  <%= someString %> </p>

 <% out.println("Hi out.println"); %>


<% for (int i = 0; i < 10; i++){
    out.println("<p>" + "Hello: " +i + "</p>");
} %>

</body>
</html>
