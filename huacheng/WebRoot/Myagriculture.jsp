<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>�ҵ�ũ��</title>
  </head>
  <style type="text/css">
  body{
  background:url("images/b2.jpg");
  }
   a{
        	text-decoration: none;
        }
       #main{
        	margin: 10px 75px 75px;
        	height:1400px;
        	width:1060px;
        	font-family:����;
        }
        
        #main1{
          text-align:center;
          border-bottom:2px solid #049B01;
          width:1060px;
        }
         #main2{
          width:350px;
          height:250px;
          float:left;
        }
        #m1{
          width:200px;
          float:left; 
        }
        #m2{
          width:200px;
          padding-left:100px;
          float:left;
          height:110px;
          
        }
        .imagestyle{
         width:110px;
         height:110px;
        }
        #main0{
         border-bottom:2px solid #049B01;
         width:1060px;
         height:250px;
        }
        #main3{
         border-left:2px solid #049B01;
         width:708px;
         float:left;
         height:250px;
        }
        #main3 td{
          width:150px;
          height:35px;
          padding-left:30px;
        }
        .a1{
         font-size:26px;
         padding-left:10px;
        
        }
        #main4{
         width:1058px;
         border-bottom:2px solid  #049B01;
         height:630px;
        }
       
         #main4 td{
         
         height:30px;
         padding-left:60px;
        }
        .c3{
        width:70px;
        height:30px;
        font-size:22px;
        background-color:#fe2222;
        color:white;
        margin-left:10px;
        }
        .b6{
         padding-right:1150px;
         font-size:20px;
        }
        #main5{
         width:1058px;
         border-bottom:2px solid  #049B01;
         height:540px;
        }
        #main5 td{
         width:300px;
         height:30px;
         text-align:center;
        }
         #headimages{
        padding-top:5px;
        padding-left:100px;
        margin-bottom:20px;
        }
        #upload{
        position: absolute;
        left:120px;
        top:287px;
        }
        .f1{
        width:1058px;
        height:280px;
        border:1px solid #049B01;
        margin-top:5px;
        }
        .f1 td a{
        color:black;
        }
        .f1 td a:hover{
        color:blue;
        }
        #pagestyle{
        position:absolute;
        left:180px;
        top:700px;
        }
        #pagestyle td{
        width:800px;
        }
        #pagestyle1{
        position:absolute;
        left:180px;
        top:970px;
        }
         #pagestyle1 td{
        width:800px;
        }
        .f2{
        width:1058px;
        height:240px;
        border:1px solid #049B01;
        margin-top:5px;
        }
        </style>
  <body id="bg">
  <%
    request.setCharacterEncoding("gbk");
   %>
   <span class="b6"></span><a href="index.jsp"><img src="images/undo.png" width="40" height="40"/></a>
   	<div id="main">
       	   <div id="main1">
       	    <h1>�ҵ�ũ�� </h1>
       	   </div>
       	   <div id="main0">
       	   <div id="main2">
       	     <div id="m1">
       	      <div><img src="${picAddress}" >
       	   
       	     </div>
       	     <!-- �ϴ�ͼƬ -->	    
   <div id="headimages">
    <img src="${usershow.headimageUrl}" width="140px" height="140px" >
  </div>
  <div id="upload">	    
       	     <form action="uploadheadimageServlet" method="post" enctype="multipart/form-data"> 
  <input type="file" name="myimage"/><input type="submit" value="�ϴ�"/> 
</form> 

 </div>
  
       	     </div>
       	     <br>
       	      <div id="m2">
       	       <h3>�ҵ��˺�:${usertable.userName } </h3>
       	       <h3>�ȼ�:    ${usertable.vipLevel }</h3>
       	     </div>
       	   </div>
       	   <div id="main3">
       	   <form name="f3" action="Myagriculture.jsp" method="post">
       	   <table border="0" cellpadding="0" cellspacing="0" width="700px" height="250px">
       	   <tr>
       	   <td colspan="4" class="a1"><a href="usershow.jsp">��������</a></td>
       	   </tr>
       	   <tr>
       	   <td>�ǳƣ�</td><td>${usershow.nickName}</td>
       	   <td>�Ա�</td><td>${usershow.sex}</td>
       	   </tr>
       	    <tr>
       	   <td>���䣺</td><td>${usershow.age}</td>
       	   <td>������</td><td>${usershow.cons}</td>
       	   </tr>
       	    <tr>
       	   <td>ְҵ��</td><td>${usershow.job}</td>
       	   <td>��˾��</td><td>${usershow.company}</td>
       	   </tr>
       	    <tr>
       	   <td>ѧУ��</td><td>${usershow.school}</td>
       	   <td>���ڵأ�</td><td>${usershow.address}</td>
       	   </tr>
       	   <tr>
       	   <td>���䣺</td><td>${usertable.email}</td>
       	   <td>��Ȥ��</td><td>${usershow.interest}
       	   </td>
       	   </tr>
       	   </table>
       	   </form>
       	   </div> 
       	   </div>
       	   
       	   
       	   <div id="main4">
       	   <h2>�ҵ��ղ�</h2>
       	   <div class="f1">
       	   <table border="0" cellpadding="2" cellspacing="2" width="100%" >
       	   <tr align="center">
       	   <td width="150px">ũ�ʱ��</td>
       	   <td  width="200px">ũ������</td>
       	   <td  width="150px">ũ��ͼƬ</td> 
       	   <td class="titleword"  width="150px">ȡ���ղ�</td>
       	   </tr>
       	   <c:forEach items="${alist}" var="agriinfo">
       	   <tr>
       	   <td align="center">${agriinfo.aId}</td>
       	   <td style="padding-left:90px;"><a href="DetailServlet?id=${agriinfo.aId }">${agriinfo.atitle}</a></td>
       	   <td align="center"><a href="DetailServlet?id=${agriinfo.aId }"><img src="${agriinfo.aimageUrl}" width="35px" height="35px"></a></td>
       	   <td align="center"><a href="CancelAgriCollectServlet?acollectId=${agriinfo.acollectId }"><img src="images/agrimages/collect.png" width="25" height="25"></a></td>
       	   </tr>
       	   </c:forEach>
       	   <tr align="center" id="pagestyle">
           <td colspan="4">
             <a href="MyagricultureServlet?showpage=1">��ҳ</a> 
       		  <a href="MyagricultureServlet?showpage=${showpage-1}" >��һҳ</a>
       		  <a href="MyagricultureServlet?showpage=${showpage+1}" >��һҳ</a>
       		  <a href="MyagricultureServlet?showpage=${pagecount }" >βҳ</a>
       		    ���С�${pagecount }��ҳ
       		   <span><a href="javascript:history.go(-1)">����</a></span>
               </td>
             </tr>
       	   
       	   </table>
       	   
       	   
       	   
       	   </div>
       	   <div class="f1">
       	 
       	   <table border="0" cellpadding="2" cellspacing="2" width="100%" >
       	   <tr align="center">
       	   <td width="150px">��Ʒ���</td>
       	   <td width="420px">��Ʒ����</td>
       	   <td width="170px">��ƷͼƬ</td>
       	   <td class="titleword"  width="150px">ȡ���ղ�</td>
       	   </tr>
       	   <c:if test="${not (empty pcolist)}">
       	   <c:forEach items="${pcolist}" var="product">
       	   <tr align="center">
       	   <td>${product.pId}</td>
       	   <td><a href="ProductInfoServlet?pid=${product.pId}">${product.pName}</a></td>
       	   <td><a href="ProductInfoServlet?pid=${product.pId}"><img src="${product.pimageUrl}" width="35px" height="35px"></a></td>
       	   <td><a href="CancelProductcollectServlet?pcollectId=${product.pcollectId }"><img src="images/agrimages/collect.png" width="25px" height="25px"></a></td>
       	   </tr>
       	   </c:forEach>
       	   </c:if>
       	   <tr align="center" id="pagestyle1">
           <td colspan="4">
             <a href="MyagricultureServlet?showpage1=1">��ҳ</a> 
       		  <a href="MyagricultureServlet?showpage1=${showpage1-1}" >��һҳ</a>
       		  <a href="MyagricultureServlet?showpage1=${showpage1+1}" >��һҳ</a>
       		  <a href="MyagricultureServlet?showpage1=${pagecount1 }" >βҳ</a>
       		    ���С�${pagecount1 }��ҳ
       		   <span><a href="javascript:history.go(-1)">����</a></span>
               </td>
             </tr>
       	   </table>
       	   
       	  </div>
       	   </div>
       	   
       	  
       	   <div id="main5">
           <h2>�ҵ�������ʷ</h2> 
           <div class="f2" >
       	   <table border="0" cellpadding="1" cellspacing="1" width="100%">
       	   <tr>
       	   <td class="">ũҵ��Ѷ����</td>
       	   <td class="">��������</td>
       	   </tr>
       	   
       	    <c:forEach items="${aclist}" var="acommand1">
       	    <tr>
       	   <td class="">${acommand1.atitle }</td>
       	   <td class="">${acommand1.content }</td>
       	   </tr>
       	   </c:forEach>
       	   </table>
       	   </div>
       	  <div class="f2">
       	   <table border="0" cellpadding="1" cellspacing="1" width="100%">
       	   <tr>
       	   <td class="">��Ʒ����</td>
       	   <td class="">��������</td>
       	   </tr>
       	   <c:forEach items="${pclist}" var="pcommand1">
       	    <tr>
       	   <td class="">${pcommand1.pName }</td>
       	   <td class="">${pcommand1.content }</td>
       	   </tr>
       	   </c:forEach>
       	   </table>
       	   </div>
       	   
       	   
       	   
       	   </div>
       </div>
  </body>
</html>
       	   