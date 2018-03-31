<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" 	prefix="c"		%>


<html>
  <head>
    <style type="text/css">
    .a1{
    	font-size:24px;
    	color:blue;
    	font-family:黑体;
    	margin-left:50px;
    }
    #t1{
    	width:400px;
    	height:450px;
    	border:2px solid gray;
    }
    .title{
    	font-size:24px;
    	color:red;
    	text-align:center;
    	width:100%;
    	height:30px;
    	margin-top:20px;
    	padding-bottom:0px;
    	border:1px solid gray;
    }
    .p1{
    	padding-bottom:0px;
    	width:100%;
    }
    .t2{
    	border-top:1px solid gray;
    	height:20px;
    	width:300px;
    }
    a{
    	text-decoration:none;
    	color:black;
    }
    </style>
  </head>
  
  <body>
  <a href="index.jsp" class="a1" ><img src="images/undo.png" width="80" height="80"/></a>
   <center><table id="t1">
   <tr><td class="title">更多内容</td></tr>
   <tr><td height="30%"><img src="images/m1.PNG" class="p1"></td></tr>
   <tr><td class="t2"><img src="images/morecontent/p1.PNG"></td></tr>
   <tr><td class="t2" ><a href="function.jsp"><img src="images/morecontent/p2.PNG" /></a></td></tr>
   <tr><td class="t2"><a href="help.jsp"><img src="images/morecontent/p3.PNG" /></a></td></tr>
   <tr><td class="t2"><a href="feedback.jsp"><img src="images/morecontent/p4.PNG" /></a></td></tr>
   </table></center>
  </body>
</html>
