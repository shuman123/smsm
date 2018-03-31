<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<html>
  <head>
  <title>��Ʒ��ȫ</title>
    <style type="text/css">
        a{
        	text-decoration: none;
        }
          #main-left a{
         color:#064679;
         }
        #main-left a:hover{
        color:white;
        }
         #wrap{
          background:url("images/bg3.jpg");
          font-family:����;
        }
        #header{
        	margin: 20px 50px 0px 50px;
        	height: 100px;
        }
         .denglu{
	     color:black;
       }
      #shoucang{
       padding-top:20px;
       }
         #logo{
        	height:100px;
        	width:281px;
        	float: left;
        }
       #title{
        	font-size: 38px;
        	float: left;
        	width: 650px;
        	height: 77px;
        	text-align: center;
            padding-top:20px;
        }
        #collect{
        	width:195px;
        	float:left;
            text-align: center;
            height:100px;
        }
       #collect td{
        font-size:15px;
        font-family:����;
        height:30px;
        text-align: center;
        }
         #collect a:hover{
        color:white;
        }
         #main{
        	margin:  10px 50px 10px 50px;
        	height:620px;
        }
         #main-left{
        	float: left;
        	width:160px;
        	height:100%;
        	font-size: 12px;
        	font-family:����;
        	background-color:#049B01;
        	margin-right:30px;
        	color:white;
        }
          #main-left td{
          width:100%;
          height: 50px;
           color:black;
            padding-left:23px;
         }
         ul{
        	list-style: none;
        }
        #main-center{
        	float:left;
        	width:700px;
        	height:100%;
        }
         .w2{
       float:left;
       width:30%;
      }
      .w3{
       float:left;
       width:70%
      }
       .w3 td{
       height:40px;
       text-align:center;
       border:0px;
      }
       #main-left td span{
      font-size:14px;
      }
      
        #main-right{
            float: left;
        	width: 24%;
        	height: 100%;
        	
        	margin-left:40px;
        }
        #newsbox{
        height:40%;
      margin-top:10px;
        }
         .news{
font-size: 18px;
background-color:#049B01;
width:300px;
height:30px;
padding-top:8px;

padding-left:10px;

 }
 .news a{
  color:white;
  }
 
 .newsinfo td{
font-size:14px;
 height:30px;       
 font-family:����; 
 }
  .newsinfo td a{
  color:black;
  }
  .newsinfo td a:hover{
  color:white;
  }
 
        #weatherbox{
        height:60%;
        font-family:����;
        }
       .weatherimage{
        width:70px;
        height:70px;
        }
       #fonter{
        margin: 5px 50px 0px 50px;
        height: 40px;
        border-top:2px solid gray;
        }
        #fonter a{
        color:gray;
        }
        #fonter{
        font-size:10px;
        text-align:center;
        padding-top:10px;
        color:gray;
        }
      
       
        .imagestyle{
          width:80px;
          height:60px;
        }
        .pro td{
         text-align:center;
         height:40px;
        
        }
         .pro td a{
          color:black;
        }
         .pro td a:hover{
          color:white;
        }
        
        .s{
          width:100%
          height:80px;
          font-size:16px;
          padding-top:10px;
         
         
        }
        .type1{
        text-align:center;
        margin-bottom:0px;
        }
        #important{
         font-size:6px;
         color:red;
         padding-left:180px;
         padding-top:0px;
         margin-top:0px;
         height:15px;
         
        }
        .typestyle{
        width:300px;
        height:35px;
        }
         .pagestyle{
        position:absolute;
        left:450px;
        top:720px;
        }
    </style>
    <script type="text/javascript">
    function hightLight(id){
        document.getElementById("important").innerHTML="�߲��ࡢ�Ϲ��ࡢˮ���ࡢˮ���ࡢ�ݵ�������Ʒ";
    }
     function NOLight(id){
        document.getElementById("important").innerHTML="";
    }

    </script>
  </head>
  <body>
        <div id="wrap">
       	<div id="header">
       		<div id="logo">
       			<img src="images/logo.png">
       		</div>
       		<div id="title">
       			
       		</div>
       		<div id="collect" >
       		    <table width="195px" border="0" cellpading="0" cellspacing="0" id="shoucang">
       		    	<tr>
       		    		<td width="100px"><c:if test="${empty usertable}">
       		    		<a href="logincollectServlet1"  class="denglu">�ҵ��ղ�</a>
       		    		</c:if>
       		    		<c:if test="${not (empty usertable) }">
       		    		<a href="MyagricultureServlet" class="denglu">�ҵ��ղ�</a>
       		    		</c:if>
       		    		</td>
       		    		<td width="80px">
       		    		<c:if test="${empty usertable}">
       		    		<a href="logincollectServlet1" class="denglu">��������</a>
       		    		</c:if>
       		    		<c:if test="${not (empty usertable) }">
       		    		<a href="feedback.jsp" class="denglu">��������</a>
       		    		</c:if>
       		    		</td>
       		    	</tr>
       		    	<tr>
       		    	<c:if test="${empty usertable}" >
       		    		<td><a href="/huacheng/login.jsp" class="denglu">�û���¼|</a></td>
       		    		<td colspan="2"><a href="/huacheng/register.jsp" class="denglu">ע�����û�</a></td>
       		    		</c:if>
       		    		<c:if test="${not (empty usertable) }">
       		    		<td>��ӭ���ĵ�¼:<br>
       		    		${usertable.userName}</td>
       		    		<td><a href="backloginServlet">�˳���¼</a></td>
       		    		</c:if>
       		    	</tr>
       		    </table>
       		</div>
       	</div>
       	<div id="main">
       		<div id="main-left">
       			<table  border="0" cellpadding="0" cellspacing="0" width="100%">
       			<tr>
       			<td><a href="ProductServlet">ȫ��</a></td>
       			
       			</tr>
       				<tr>
       					<td>
       					<a href="SearchproductServlet?ptypeName=�߲���">�߲���</a><br/>
       					<span>����</span>
       					<span>���</span>
       					<span>�ײ�</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=�Ϲ���">�Ϲ���</a><br/>
       					<span>�ƹ�</span>
       					<span>����</span>
       					<span>������</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=ˮ����">ˮ����</a><br/>
       					<span>��ݮ</span>
       					<span>���</span>
       					<span>����</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=ˮ����">ˮ����</a><br/>
       					<span>��Ϻ</span>
       					<span>�ȱ�</span>
       					<span>����</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=�ݵ���">�ݵ���</a><br/>
       					<span>����</span>
       					<span>Ѽ��</span>
       					<span>Ƥ��</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=���༰��Ʒ">���༰��Ʒ</a><br/>
       					<span>ţ��</span>
       					<span>����</span>
       					<span>����</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=������Ʒ">������Ʒ</a><br/>
       					<span>����</span>
       					<span>������</span>
       					<span>������</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=����Ʒ">����Ʒ</a><br/>
       					<span>����</span>
       					<span>����</span>
       					<span>��Ƥ</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=��ʳ">��ʳ</a><br/>
       					<span>����</span>
       					<span>Ѽ��</span>
       					<span>ţ��</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=���ز�">���ز�</a><br/>
       					<span>����</span>
       					<span>�㹽</span>
       					<span>������</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=���ز�">��ʳ</a><br/>
       					<span>�ǹ�</span>
       					<span>÷�Ӹ�</span>
       					<span>����</span>
       					</td>
       				</tr>
       			</table>
       		</div>
       		
       		
       		
       		<div id="main-center">
       		 <div class="s">
       		 <div class="type1">
       		 <form name="f1" action="SearchproductServlet" method="post">
       		     ���<input type="text" name="ptypeName" onfocus="hightLight('important')" onblur="NOLight('important')" class="typestyle"/>
       		     <input type="submit" style="width:60px;height:25px;background:url(images/search.jpg);padding-top:5px;cursor:pointer;" value="" />
       		     <a href="index.jsp"><img src="images/undo.png" width="25" height="25"/></a>
       		 </form>
       		 
       		</div>
             <div id="important"></div>
       		 </div>
       			<table border="0" cellspacing="2" cellpadding="2" width="100%" class="pro">
       			<tr>
       			<td >ͼƬ</td>
       			<td >��Ʒ���</td>
       			<td >��Ʒ����</td>
       			<td >��Ʒ�۸�</td>
       			<td >��Ʒ�����</td>
       			<td >�ղ�</td>
       			</tr>
       			<c:forEach var="product" items="${pmlist}">
       			<tr>
       			<td ><a href="ProductInfoServlet?pid=${product.pId}">
       			<img src="${product.pimageUrl}" class="imagestyle"></a></td>
       			<td >${product.pId}</td>
       			<td ><a href="ProductInfoServlet?pid=${product.pId}">
       			${product.pName}</a></td>
       			<td >${product.price}</td>
       			<td >${product.quantity}</td>
       			<td ><a href="CollectProductServlet?pid=${product.pId}">
       			<img src="images/proimages/collect.png" width="25px" height="25px"/></a></td>
       			</tr>
       			</c:forEach>
       			<tr align="center" class="pagestyle">
               <td colspan="6">
               <!-- 
               <c:forEach var="page" items="${pagecounts}">
               <a href="ProductServlet?how=${page}">��${page}ҳ</a> 
       		   </c:forEach>
       		   <a href="ProductServlet?how=${fn:length(pagecounts)}">βҳ</a>
       		    ���С�${fn:length(pagecounts)}��ҳ
       		   -->
       		  <a href="ProductServlet?showpage=1">��ҳ</a> 
       		  <a href="ProductServlet?showpage=${showpage-1}" >��һҳ</a>
       		  <a href="ProductServlet?showpage=${showpage+1}" >��һҳ</a>
       		  <a href="ProductServlet?showpage=${pagecount }" >βҳ</a>
       		    ���С�${pagecount }��ҳ
       		   <span><a href="javascript:history.go(-1)">����</a></span>
               </td>
             </tr>
              </table>
       		</div>
       		<div id="main-right">
       		
       		<div id="newsbox">
<div class="news"><a href="AgriinfoServlet">ũ������</a></div>
<table  class="newsinfo">
<c:forEach var="topfive" items="${topfiveList }" varStatus="varIndex" >
<tr>
<td ><a href="DetailServlet?id=${topfive.aId }">${topfive.atitle }</a></td>
</tr>
</c:forEach>
</table>
</div>
       			
       			
       			
       			<div id="weatherbox">
       			  <div class="w1">
       			  <form name="wf" action="ProductServlet" method="post">
       			  <c:if test="${not (empty wlist)}">
       			    ����:
       			  <select id="city" name="city">
       				<option>��ѡ��</option>
       				    <c:forEach items="${wlist}" var="w">
       				    <option value="${w.city}">${w.city}</option>
       				    </c:forEach>
       				</select>
       				</c:if>
       					<input type="submit" value="�ύ" style=" cursor:pointer; background-color:#049B01; color:white;"/>
                  </form>
       			  </div>
       			  <iframe width="146" scrolling="no" height="25" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=10&bdc=%23FF0000&icon=4&py=jingzhou"></iframe>
       			  <c:if test="${empty weather }">
       			  <div class="w2">
       			   <img src="${defaultweather.wImageUrl}" class="weatherimage">
       			  </div>
       			   <div class="w3">
       			   <table  width="100%" border="0" cellpadding="0" cellspacing="0">
       			    <tr>
       			    <td >���У�</td>
       			    <td  >${defaultweather.city }</td>
       			    </tr>
       			    <tr>
       			    <td>�¶ȣ�</td>
       			    <td>${defaultweather.temperature }</td>
       			    </tr>
       			     <tr>
       			    <td>����¶ȣ�</td>
       			    <td>${defaultweather.maxTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td>����¶ȣ�</td>
       			    <td>${defaultweather.minTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td>ʪ�ȣ�</td>
       			    <td>${defaultweather.wetLevel }</td>
       			    </tr>
       			     <tr>
       			    <td>�����ߣ�</td>
       			    <td>${defaultweather.ultraviolet }</td>
       			    </tr>
       			   </table>
       			   </div>
       			   </c:if>
       			   
       			    <c:if test="${not (empty weather)}">
       			     <div class="w2">
       			   <img src="${weather.wImageUrl}" class="weatherimage">
       			  </div>
       			   <div class="w3">
       			   <table  width="100%" border="0" cellpadding="0" cellspacing="0">
       			    <tr>
       			    <td >���У�</td>
       			    <td  >${weather.city }</td>
       			    </tr>
       			    <tr>
       			    <td>�¶ȣ�</td>
       			    <td>${weather.temperature }</td>
       			    </tr>
       			     <tr>
       			    <td>����¶ȣ�</td>
       			    <td>${weather.maxTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td>����¶ȣ�</td>
       			    <td>${weather.minTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td>ʪ�ȣ�</td>
       			    <td>${weather.wetLevel }</td>
       			    </tr>
       			     <tr>
       			    <td>�����ߣ�</td>
       			    <td>${weather.ultraviolet }</td>
       			    </tr>
       			   </table>
       			   </div>
       			    </c:if>
       		    </div>
             

       		</div>
       	</div>
       	<div id="fonter">
      <a href="#">��������</a>
        |<a href="#">��ȫ����</a>
        |<a href="#">360��Ƹ</a>|
        <a href="#">��ϵ����</a><br>
     <a href="#">����ũ�����ٱ�����</a>
     �绰��010-58541935 �ٱ����䣺239report@239.cn
    
     </div>
       </div>
  </body>
</html>