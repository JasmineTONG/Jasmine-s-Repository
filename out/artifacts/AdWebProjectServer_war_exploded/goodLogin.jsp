<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
   <head>
   <title>Spring MVC Demo</title>
   </head>
   <body>
   
   <h2>Good Login!</h2>
   <h3>${loginState}</h3>
   
   <% String state = (String)session.getAttribute("loginState");
   System.out.println("..."+state);
   
   if (state.equals("Welcome!")) {%>
   <h4>user name=${user.userName}</h4>
   <%} %>
  
   <br>
   <p>Author: Tong, Jiawen</p>
   </body>
</html>