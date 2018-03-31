<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<html>
  <head>
  <title>产品大全</title>
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
          font-family:黑体;
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
        font-family:黑体;
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
        	font-family:黑体;
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
 font-family:黑体; 
 }
  .newsinfo td a{
  color:black;
  }
  .newsinfo td a:hover{
  color:white;
  }
 
        #weatherbox{
        height:60%;
        font-family:黑体;
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
        document.getElementById("important").innerHTML="蔬菜类、瓜果类、水果类、水产类、禽蛋、豆制品";
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
       		    		<a href="logincollectServlet1"  class="denglu">我的收藏</a>
       		    		</c:if>
       		    		<c:if test="${not (empty usertable) }">
       		    		<a href="MyagricultureServlet" class="denglu">我的收藏</a>
       		    		</c:if>
       		    		</td>
       		    		<td width="80px">
       		    		<c:if test="${empty usertable}">
       		    		<a href="logincollectServlet1" class="denglu">反馈中心</a>
       		    		</c:if>
       		    		<c:if test="${not (empty usertable) }">
       		    		<a href="feedback.jsp" class="denglu">反馈中心</a>
       		    		</c:if>
       		    		</td>
       		    	</tr>
       		    	<tr>
       		    	<c:if test="${empty usertable}" >
       		    		<td><a href="/huacheng/login.jsp" class="denglu">用户登录|</a></td>
       		    		<td colspan="2"><a href="/huacheng/register.jsp" class="denglu">注册新用户</a></td>
       		    		</c:if>
       		    		<c:if test="${not (empty usertable) }">
       		    		<td>欢迎您的登录:<br>
       		    		${usertable.userName}</td>
       		    		<td><a href="backloginServlet">退出登录</a></td>
       		    		</c:if>
       		    	</tr>
       		    </table>
       		</div>
       	</div>
       	<div id="main">
       		<div id="main-left">
       			<table  border="0" cellpadding="0" cellspacing="0" width="100%">
       			<tr>
       			<td><a href="ProductServlet">全部</a></td>
       			
       			</tr>
       				<tr>
       					<td>
       					<a href="SearchproductServlet?ptypeName=蔬菜类">蔬菜类</a><br/>
       					<span>辣椒</span>
       					<span>苦瓜</span>
       					<span>白菜</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=瓜果类">瓜果类</a><br/>
       					<span>黄瓜</span>
       					<span>茄子</span>
       					<span>西红柿</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=水果类">水果类</a><br/>
       					<span>草莓</span>
       					<span>香橙</span>
       					<span>葡萄</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=水产类">水产类</a><br/>
       					<span>龙虾</span>
       					<span>扇贝</span>
       					<span>鱿鱼</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=禽蛋类">禽蛋类</a><br/>
       					<span>鸡蛋</span>
       					<span>鸭蛋</span>
       					<span>皮蛋</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=肉类及制品">肉类及制品</a><br/>
       					<span>牛肉</span>
       					<span>鸡肉</span>
       					<span>猪肉</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=粮油制品">粮油制品</a><br/>
       					<span>面条</span>
       					<span>玉米面</span>
       					<span>黑米酥</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=豆制品">豆制品</a><br/>
       					<span>豆腐</span>
       					<span>豆干</span>
       					<span>豆皮</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=熟食">熟食</a><br/>
       					<span>猪蹄</span>
       					<span>鸭脖</span>
       					<span>牛肉</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=土特产">土特产</a><br/>
       					<span>花菇</span>
       					<span>香菇</span>
       					<span>豆腐干</span>
       					</td>
       				</tr>
       				<tr>
       					<td>
                        <a href="SearchproductServlet?ptypeName=土特产">零食</a><br/>
       					<span>糖果</span>
       					<span>梅子干</span>
       					<span>薯条</span>
       					</td>
       				</tr>
       			</table>
       		</div>
       		
       		
       		
       		<div id="main-center">
       		 <div class="s">
       		 <div class="type1">
       		 <form name="f1" action="SearchproductServlet" method="post">
       		     类别：<input type="text" name="ptypeName" onfocus="hightLight('important')" onblur="NOLight('important')" class="typestyle"/>
       		     <input type="submit" style="width:60px;height:25px;background:url(images/search.jpg);padding-top:5px;cursor:pointer;" value="" />
       		     <a href="index.jsp"><img src="images/undo.png" width="25" height="25"/></a>
       		 </form>
       		 
       		</div>
             <div id="important"></div>
       		 </div>
       			<table border="0" cellspacing="2" cellpadding="2" width="100%" class="pro">
       			<tr>
       			<td >图片</td>
       			<td >产品编号</td>
       			<td >产品名称</td>
       			<td >产品价格</td>
       			<td >产品库存量</td>
       			<td >收藏</td>
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
               <a href="ProductServlet?how=${page}">第${page}页</a> 
       		   </c:forEach>
       		   <a href="ProductServlet?how=${fn:length(pagecounts)}">尾页</a>
       		    共有【${fn:length(pagecounts)}】页
       		   -->
       		  <a href="ProductServlet?showpage=1">首页</a> 
       		  <a href="ProductServlet?showpage=${showpage-1}" >上一页</a>
       		  <a href="ProductServlet?showpage=${showpage+1}" >下一页</a>
       		  <a href="ProductServlet?showpage=${pagecount }" >尾页</a>
       		    共有【${pagecount }】页
       		   <span><a href="javascript:history.go(-1)">返回</a></span>
               </td>
             </tr>
              </table>
       		</div>
       		<div id="main-right">
       		
       		<div id="newsbox">
<div class="news"><a href="AgriinfoServlet">农资新闻</a></div>
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
       			    城市:
       			  <select id="city" name="city">
       				<option>请选择</option>
       				    <c:forEach items="${wlist}" var="w">
       				    <option value="${w.city}">${w.city}</option>
       				    </c:forEach>
       				</select>
       				</c:if>
       					<input type="submit" value="提交" style=" cursor:pointer; background-color:#049B01; color:white;"/>
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
       			    <td >城市：</td>
       			    <td  >${defaultweather.city }</td>
       			    </tr>
       			    <tr>
       			    <td>温度：</td>
       			    <td>${defaultweather.temperature }</td>
       			    </tr>
       			     <tr>
       			    <td>最高温度：</td>
       			    <td>${defaultweather.maxTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td>最低温度：</td>
       			    <td>${defaultweather.minTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td>湿度：</td>
       			    <td>${defaultweather.wetLevel }</td>
       			    </tr>
       			     <tr>
       			    <td>紫外线：</td>
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
       			    <td >城市：</td>
       			    <td  >${weather.city }</td>
       			    </tr>
       			    <tr>
       			    <td>温度：</td>
       			    <td>${weather.temperature }</td>
       			    </tr>
       			     <tr>
       			    <td>最高温度：</td>
       			    <td>${weather.maxTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td>最低温度：</td>
       			    <td>${weather.minTemparature }</td>
       			    </tr>
       			     <tr>
       			    <td>湿度：</td>
       			    <td>${weather.wetLevel }</td>
       			    </tr>
       			     <tr>
       			    <td>紫外线：</td>
       			    <td>${weather.ultraviolet }</td>
       			    </tr>
       			   </table>
       			   </div>
       			    </c:if>
       		    </div>
             

       		</div>
       	</div>
       	<div id="fonter">
      <a href="#">关于我们</a>
        |<a href="#">安全保障</a>
        |<a href="#">360招聘</a>|
        <a href="#">联系我们</a><br>
     <a href="#">荆州农资网举报中心</a>
     电话：010-58541935 举报邮箱：239report@239.cn
    
     </div>
       </div>
  </body>
</html>