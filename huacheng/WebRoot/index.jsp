<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty wlist or empty topfiveList}">
<jsp:forward page="showServlet"></jsp:forward>
</c:if>
<html lang="en">
<title>����ũó��Ѷƽ̨��ҳ</title>
  <head>
    <style type="text/css" >
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
        	border: 0px;
        	margin: 20px 50px 0px 50px;
        	height: 100px;
        	
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
            font-family:�����п�;
            color:white;
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
        	border: 0px;
        	margin:  10px 50px 10px 50px;
        	height: 600px;
        	
        }
        #main-left{
        	float: left;
        	border-right:0px;
        	width:160px;
        	height:100%;
        	font-size: 12px;
        	font-family:����;
        	background-color:#049B01;
        	margin-right:30px;
        	color:white;
        }
         #main-left td{
          height: 50px;
          color:white;
          border-top:0px;
          padding-left:23px;
         }
        ul{
        	list-style: none;
        }
        #main-center{
        	float:left;
        	width:700px;
        	height:100%;
            border-right:0px;
            
        }
        .image1{
         width:700px;
         height:440px;
        }
        #temp{
            width: 100%;
            height: 8%;
            margin-bottom:30px;
            padding:0px;
        }
        #temp ul{
        margin:0px 0px 0px 0px;
        width:100%;
        padding:0px 0px 0px 0px;
        }
        #temp li{
        	color:black;
        	float:left;
        	width:19.8%;
        	height:30px;
        	border-left:0px;
        	text-align:center;
        	font-size:20px;
        	padding-top:8px;
        	border-bottom:1px solid black;
        	
        }
       #temp li:hover{
       background-color:#049B01;
        }
       
        #temp li a:hover{
      
       color:white;
        }
      .w2{
       float:left;
       width:30%;
      }
      .w3{
       float:left;
       width:70%;
      }
       .w3 td{
       height:40px;
       text-align:center;
       border:0px;
      }
      #main-left td span{
      font-size:14px;
      }
        .Advertisebox{
        width:100%;
        height:90%;
        margin:0px 0px 0px 0px;
        }
        .Contentbox{
        margin-top:30px;
        }
        .Menubox ul{
        margin-bottom:30px;
        margin:0px 0px 0px 0px;
        padding:0px 0px 0px 0px;
        list-style:none;
        
        }
       
        .Menubox li{
        display:block;
        float:left;
        width:19.6%;
        height:27px;
        cursor:pointer;
        text-align:center;
        color:black;
        font-weight:bold;
        border-bottom:1px solid gray;
        padding-top:10px;
        }
       
        #main-right{
            float: left;
        	width: 24%;
        	height: 100%;
        	
        	margin-left:40px;
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
        border-top: 2px solid gray;
        margin: 5px 50px 0px 50px;
        height: 40px;
       
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
        
        .Menubox li.hover{
        background-color:#049B01;
        color:white;
    
     border-left:1px solid #a8c29f;
     border-right:1px solid #a8c29f;
     border-bottom:1px solid #a8c29f;
     
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
/*���ֲ��css*/
#cover1{
background-color:#F0F8FF;
position:absolute;
top:0px;
left:0px;
z-index:5;
width:100%;
}
#login{
position:absolute;
top:50px;
left:300px;
border:1px solid gray;
background-color:	#9fc5e8;
width:500px;
height:250px;
font-size:16px;
z-index:20;
font-family:����;
}
.close{
cursor:pointer;
margin-left:140px;

}

/*��¼��css*/
.logintitle{
   font-size:28px;
   padding-left:150px;
   font-family:����; 
}

#login td{
    padding-left:20px;
    height:50px;   
     color:#0000ff;
}
.a1{
 width:180px;
}
.a2{
  width:250px;
}
.c1{
 font-size:12px;
}
.c2{
 font-size:12px;
 text-align:right;
 padding-right:20px;
 
}
.c2 a{
color:red;
}
a{
 text-decoration: none;
}
.c3{
  width:200px;
  height:40px;
  font-size:22px;
  background-color:#3c78d8;
  color:white;
  cursor:pointer;
}
.c4{
 text-align:center;
}
.c5{
   height:38px;
   width:240px;
}


.denglu{
	color:black;
}
#shoucang{
   padding-top:20px;
}
</style>
<script type="text/javascript">
//����ͼƬ�л�
 var curindex=1;
function setTab(index){
      var curindex=index;
    for(var i=1;i<=5;i++){
	  var menu=document.getElementById("one"+i);
	  var con=document.getElementById("con_one_"+i);
	  menu.className=i==curindex?"hover":"";
	  con.style.display=i==curindex?"block":"none";
	}     
}
function autochange(){
if(curindex>5){
  curindex=1;
}
setTab(curindex);
curindex++;
setTimeout("autochange()",3000);
}


//���ֲ㷽��
var cover1,cover2;
function init(){
cover1=document.getElementById("cover1");
cover2=document.getElementById("login");
cover1.style.width=document.documentElement.scrollWidth+"px";
cover1.style.height=document.documentElement.scrollHeight+"px";
cover2.style.left="400px";
cover2.style.top="150px";
}
function closeLogin(){
cover1.style.display="none";
cover2.style.display="none";
}
function showLogin(){
cover1.style.display="block";
cover2.style.display="block";
}

//С����
function openwin(){
window.open("jumpServlet","","totalbar=0,location=0,status=0,menubar=0, resizable=no,width=250,height=200,scrollbars=0,left=1065,top=436");
}
 </script>
  </head>
  <body onload="autochange();init();openwin();">
<!--���ֲ�ʵ�ֵ�¼��Ч��  -->
<div id="cover1" style="display:none;">
</div>
<div id="login"  style="display:none;">
  <form name="form2" action="/huacheng/loginServlet" method="post" id="form2"> 
     <table border="1" cellpadding="0" cellspacing="0" width="500px">
     <tr>
     <td colspan="2" ><span class="logintitle">��&nbsp;ӭ&nbsp;��&nbsp;¼</span>
     <span class="close">
     <img src="images/delete.png" width="30px" height="30px" style="float:right;margin-right:2px;"onclick="closeLogin();" alt="�ر�">
     </span>
     </td>
     </tr>
       <tr>
       <td class="a1">�������û���������</td>
        <td class="a2">
        <input type="text" name="userName" id="userName" class="c5"/>
        </td>
       </tr>
        <tr>
        <td >����������</td>
       <td>
        <input type="password" name="pwd" id="pwd" class="c5"/>
        </td>
       </tr>
        <tr>
        <td  class="c1"><input type="checkbox" name="auto" id="auto">�Զ���¼</td>
        <td  class="c2">
        <a href="#">�������룿</a>
        </td>
       </tr>
         <tr >
        <td colspan="2" class="c4">
         <input type="submit" value="��&nbsp;&nbsp;¼" class="c3"/>
        </td>
       </tr>
     </table>
     </form>
     </div>

<!-- ��ҳ��html���� -->
        <div id="wrap">
       	<div id="header">
       		<div id="logo">
       			<img src="images/logo.png">
       		</div>
       		<div id="title">
       			
       		</div>
       		<div id="collect">
       		    <table width="195px" border="0" cellpadding="0" cellspacing="0" id="shoucang">
       		    	<tr>
       		    		<td width="100px">
       		    		<c:if test="${empty usertable}">
       		    		<a href="logincollectServlet1" class="denglu">�ҵ��ղ�</a>
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
       		    	<c:if test="${empty usertable}">
       		    		<td><a href="javascript:showLogin()"   class="denglu">�û���¼</a></td>
       		    		<td colspan="2" ><a href="/huacheng/register.jsp"  class="denglu">ע�����û�</a></td>
       		    		</c:if>
       		    		<c:if test="${not (empty usertable) }">
       		    		<td>��ӭ���ĵ�¼:
       		    		<br>
       		    		${usertable.userName}
       		    		</td>
       		    		
       		    		<td><a href="backloginServlet">�˳���¼</a></td>
       		    		</c:if>
       		    	</tr>
       		    </table>
       		</div>
       	</div>
       	
       	
       	<div id="main">
       		<div id="main-left">
       			<table border="0" cellpadding="0" cellspacing="0" width="100%">
       			<tr>
       			<td ><a href="ProductServlet">ȫ��</a></td>
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
                        <a href="SearchproductServlet?ptypeName=��ʳ">��ʳ</a><br/>
       					<span>�ǹ�</span>
       					<span>÷�Ӹ�</span>
       					<span>����</span>
       					</td>
       				</tr>
       			</table>
       		</div>
       		
       		
       		<div id="main-center">
       		<div id="temp">
       			<ul>
       			<li class="titlestyle1"><a href="index.jsp">���</a></li>
       			<li ><a href="AgriinfoServlet">ũҵ��Ѷ</a></li>
       			<li ><a href="ProductServlet">��Ʒ��ȫ</a></li>
       			<li ><a href="MyagricultureServlet1">�ҵ�ũ��</a></li>
       			<li ><a href="MoreContent.jsp">��������</a></li>
       			</ul>
         </div>
<div class="Advertisebox">
<div class="Menubox">
<ul>
<li id="one1" onclick="setTab(1)">�߲�</li>
<li id="one2" onclick="setTab(2)">�ɹ�</li>
<li id="one3" onclick="setTab(3)">����</li>
<li id="one4" onclick="setTab(4)">�ʹ�</li>
<li id="one5" onclick="setTab(5)">����</li>
</ul>
</div>
<div id="contentbox">
<div class="Contentbox">
<div id="con_one_1" >

<a href="showAdvertiseInfoServlet?adId=${advertise1.adId}"><img src="${advertise1.imageUrl}" width="100%" height="97%" class="image1"></a>

</div>
<div id="con_one_2" style="display:none;">
<a href="showAdvertiseInfoServlet?adId=${advertise2.adId}"><img src="${advertise2.imageUrl}"  width="100%" height="97%" class="image1"></a>
</div>
<div id="con_one_3" style="display:none;">
<a href="showAdvertiseInfoServlet?adId=${advertise3.adId}"><img src="${advertise3.imageUrl}"  width="100%" height="97%" class="image1"></a>
</div>
<div id="con_one_4" style="display:none;">
<a href="showAdvertiseInfoServlet?adId=${advertise4.adId}"><img src="${advertise4.imageUrl}" width="100%" height="97%" class="image1"></a>
</div>
<div id="con_one_5" style="display:none;">
<a href="showAdvertiseInfoServlet?adId=${advertise5.adId}"><img src="${advertise5.imageUrl}"  width="100%" height="97%" class="image1"></a>
</div> 

</div>

</div>

</div>
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
<c:if test="${not (empty wlist) }">
 <form name="wf1" action="weatherServlet" method="post">
  ����:
 <select id="city" name="city">
<option>��ѡ��</option>
 <c:forEach items="${wlist}" var="w">
 <option value="${w.city}">${w.city}</option>
 </c:forEach>
</select>
<input type="submit" value="�ύ" style=" cursor:pointer; background-color:#049B01; color:white;"/>
</form>
</c:if>

 </div>
 <iframe width="146" scrolling="no" height="25" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=10&bdc=%23FF0000&icon=4&py=jingzhou"></iframe>
<c:if test="${empty weather}">
<div class="w2">
 <img src="${defaultweather.wImageUrl}" class="weatherimage">
 
 </div>
 
  <div class="w3">
  <table  width="100%" border="0px" cellpadding="0" cellspacing="0" class="wtab">
       			    <tr>
       			    <td width="50%" height="30px;">���У�</td>
       			    <td  width="50%" height="30px;">${defaultweather.city}</td>
       			    </tr>
       			    <tr>
       			    <td height="30px;">�¶ȣ�</td>
       			    <td height="30px;">${defaultweather.temperature}</td>
       			    </tr>
       			     <tr>
       			    <td height="30px;">����¶ȣ�</td>
       			    <td height="30px;">${defaultweather.maxTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td height="30px;">����¶ȣ�</td>
       			    <td height="30px;">${defaultweather.minTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td height="30px;">ʪ�ȣ�</td>
       			    <td height="30px;">${defaultweather.wetLevel }</td>
       			    </tr>
       			     <tr>
       			    <td height="30px;">�����ߣ�</td>
       			    <td height="30px;">${defaultweather.ultraviolet }</td>
       			    </tr>
       			   </table>
       			   </div>
       			   </c:if>
       			   <c:if test="${not (empty weather)}">
       			  <div  class="w2">
       			   <img src="${weather.wImageUrl}" class="weatherimage">
       			  </div>
       			   <div class="w3">
       			   <table  width="100%" border="0" cellpadding="0" cellspacing="0">
       			    <tr>
       			    <td width="50%" height="30px;">���У�</td>
       			    <td  width="50%"  height="30px;">${weather.city }</td>
       			    </tr>
       			    <tr>
       			    <td height="30px;">�¶ȣ�</td>
       			    <td height="30px;">${weather.temperature }</td>
       			    </tr>
       			     <tr>
       			    <td height="30px;">����¶ȣ�</td>
       			    <td height="30px;">${weather.maxTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td height="30px;">����¶ȣ�</td>
       			    <td height="30px;">${weather.minTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td height="30px;">ʪ�ȣ�</td>
       			    <td height="30px;">${weather.wetLevel }</td>
       			    </tr>
       			     <tr>
       			    <td height="30px;">�����ߣ�</td>
       			    <td height="30px;">${weather.ultraviolet }</td>
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

       			