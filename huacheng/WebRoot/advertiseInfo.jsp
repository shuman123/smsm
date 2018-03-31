<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>¹ã¸æÏêÇé</title>
  <style type="text/css">
 #box{
 text-align:center;
 }
  
  </style>
  </head>
  
  <body>
       <a href="javascript:history.go(-1)"  style="float:left;"><img src="images/undo.png" width="40" height="40"/></a>
       <h1 align="center">${advertise.title}</h1>
       <div id="box">
        <img src="${advertise.content}" width="1168px" height="495px">
       
       </div>
  </body>
</html>
