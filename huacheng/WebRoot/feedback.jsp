<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" 	prefix="c"		%>

<html>
  <head>
     <style type="text/css">
     div{
     	text-align:center;
     }
     #input{
  		width:400px;
  		height:300px;
  		border:3px solid gray;
  		margin-bottom:10px;
  }
  a{
    	text-decoration:none;
    	font-size:24px;
    }
     </style>
  </head>
  
  <body>
  <a href="MoreContent.jsp"><img src="images/undo.png" width="80" height="80"/></a>
  <div>
   <form name="form1" action="FeedbackServlet"  method="post">
   <textarea name="input" wrap="physical"  id="input" >
   		
   </textarea><br/>
   <input type="submit" name="submit" value="" style="background: url(images/submit2.JPG);width:83px;height:27px;" id="submit" />&nbsp;&nbsp;<input type="reset" name="reset" value="" style="background: url(images/reset.JPG);width:81px;height:27px;" id="reset">
   </form>
   </div>
  </body>
</html>
