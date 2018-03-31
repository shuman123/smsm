<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
  <head>
    <title>农资详情</title>
    <style type="text/css">
    body{
    background:url("images/b2.jpg");
    }
  #box{
  		width:100%;
  		font-family:黑体;
  }
  #title{
  		margin-left:400px;
  		font-size:24px;
  }
  #rollback{
  		font-size:24px;
  		color:red;
  		padding-left:250px;
  }
  #content{
  		width:1000px;
  		border:3px solid gray;
  		margin-left:180px;
  		margin-top:20px;
  }
  .h6{
  		margin-left:180px;
  		margin-top:20px;
  }
  #input{
  		width:1000px;
  		height:300px;
  		border:3px solid gray;
  		margin-left:180px;
  }
  #submit{
   		margin-top:10px;
  		margin-left:1100px;
  }
  #t1{
     		border:1px solid gray;
     		width:1000px;
     		margin-left:180px;
     }
  </style> 
  </head>
  
  <body>
     
  <div id="box">
   <div><span id="title">${agriinfo.atitle }</span><span id="rollback"><a href="javascript:history.go(-1)"><img src="images/undo.png" width="40" height="40"/></a></span></div>
   <center><h6>作者/来源：${agriinfo.author }  <a href="CollectAgriinfoServlet?id=${agriinfo.aId }"><img src="images/agrimages/collect.png" width="25" height="25"></a> 收藏</h6></center>
  <center><img src="${agriinfo.aimageUrl}" /></center>
   
   <div id="content">
  
  
   <table>
  <tr><td> ${agriinfo.content}</td></tr>
   </table>
  
  
   </div>
   
   <div>
   <h4 class="h6">评论区：</h4>
   <form name="form1" action="agricommandServlet?aId=${agriinfo.aId }"  method="post">
   <textarea name="input" wrap="physical"  id="input">
   		
   </textarea><br/>
   <input type="submit" name="submit" value="" style="background: url(images/submit2.JPG);width:83px;height:27px; "  id="submit" />
   </form>
   </div>
   
   <div>
   <h4 class="h6">历史评论：</h4>
  <table id="t1">
       		<c:forEach var="comment" items="${commentList }" varStatus="varIndex" >
				<tr>
						<td width="5%"><img src="images/agrimages/c1.PNG"  width="20px" height="20px"/></td>
						<td width="95%">${comment.content }</td>
				</tr>
			</c:forEach>
	</table>
   </div>
   
   </div>
     
  </body>
</html>
