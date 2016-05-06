<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
   <head>
   <title>Spring MVC Demo</title>
   </head>
   <body>
   
   <h2>Good Register!</h2>
   <h3>${regState}</h3>
   
   <% String state = (String)session.getAttribute("regState");
   System.out.println("..."+state);
   
   if (state.equals("Registration done.")) {%>
   <h4>user name=${user.getUserName()}</h4>
   <%} %>
  
   <br>
   <p>Author: Tong, Jiawen</p>
   </body>
</html>