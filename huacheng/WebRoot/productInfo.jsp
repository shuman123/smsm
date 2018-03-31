<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
  <title>产品详情</title>
    <style type="text/css">
    body{
     background:url("images/b4.png");
    }
        #main{
        	margin: 30px auto;
        	width:1060px;
  		font-family:黑体;
        }
        #main1{
         width:300px;
         border-right:1px solid black;
         float:left;
        
        }
        .im1{
          width:300px;
          height:200px;
          
        }
        #main2{
         width:750px;
         float:left;
          
         height:200px;
        }
         #main3{
         width:1058px;
         float:left;
         border-top: 1px solid black;
          border-bottom: 1px solid black;
         height:270px; 
         
        }
        
         #main2 td{
         width:200px;
         height:40px;
        
        }
        .a1{
         font-size:26px;
         padding-left:300px;
         
        }
        .a2{
        font-size:20px;
          padding-left:20px;
          
        }
        #m1{
         padding-top:50px;
         padding-left:30px;
         width:170px;
         height:120px;
         float:left;
        }
        .im2{
          
          width:170px;
          height:120px;
          
        }
        #m2{
         width:800px;
         
         height:200px;
         float:left;

         padding-left:30px;
        }
        .b1{
          text-align:right;
          font-size:18px;
          margin-left:270px;
         
        }
        #m1 a{
         text-decoration: none;
        }
         #main4{
         width:1058px;
         border-bottom: 1px solid black;
        
        }
    </style>

    <title>产品详情</title>
  </head>
  <body>
     
       
       	<div id="main">
       	   <div id="main1">
       	   
       	   <img src="${company.cimageUrl}" class="im1">
       	   </div>
       	   <div id="main2">
       	     <table width="750px" border="0" cellpading="4" cellspacing="4" height="200px">
       	         <tr>
       	        <td colspan="2" class="a1">公司简介<span class="b1"><a href="javascript:history.go(-1)"><img src="images/undo.png" width="40" height="40"/></a></span></td>
       	        </tr>
       	        <tr>
       	        <td colspan="2" class="a2">公司名称:   ${company.cName}</td>
       	        </tr>
       	         <tr>
       	        <td class="a2">行业类别:    ${company.businessType }</td>
       	        <td class="a2">企业性质:    ${company.cProperty }</td>
       	        </tr>
       	         <tr>
       	        <td class="a2">所在区域：         ${company.cregion }</td>
       	        <td class="a2">公司地址：         ${company.cAddress }</td>
       	        </tr>
       	       </table>
       	   </div>
       	    <div id="main3">
       	    <div id="m1">
       	    <img src="${product.pimageUrl}" class="im2">&nbsp;<br>&nbsp;&nbsp;&nbsp;
       	          收藏: <a href="CollectProductServlet?pid=${product.pId}"> 
       	    <img src="images/proimages/collect.png"  width="25px" height="26px"/></a>
       	    </div>
       	     <div id="m2">
       	     <br>
       	     ${company.introduce}
       	   </div>
       	     
       	     </div>
       	    
       	    <div id="main4">
       	       <h2>评论：</h2>
       	       <div id="d1">
       	         <form action="proCommandServlet" method="post" name="n1" style="text-align:left">
       	         <input type="hidden" name="pid" value="${product.pId}">
       	          <textarea name="content" style="width:100%; height:170px;border:1;">
       	          </textarea>&nbsp;<br>
       	          <input type="submit" value="" style="background: url(images/submit2.JPG);width:83px;height:27px;" />
       	         </form>
       	         
       	       </div>
       	         <h2>  评论历史：</h2>
       	       <div id="d2">
       	         <table width="100%" border="1" cellpading="0" cellspacing="0" >
       	         <tr>
       	        
       	         </tr>
       	         <tr>
       	         
       	         <td>用户</td><td>评论内容</td>
       	         
       	         </tr>
       	         <c:forEach items="${pclist}" var="procommand">
       	          <tr>
       	         <td>${procommand.userName }</td>
       	         <td>${procommand.content }</td>
       	         
       	         </tr>
       	         </c:forEach>
       	         </table>
       	       
       	       
       	       </div>
       	    </div>
       	    
       	    
       	    
       	    
       	   </div>
     
       
       	
  </body>
</html>