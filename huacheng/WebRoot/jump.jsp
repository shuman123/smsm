<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    
    <title>2222消息推送</title>
 <style type="text/css">
 body{
   background:url("images/jumpbg2.jpg");
 }
 .mtitle{
 width:250px;
 height:40px;
 font-size:22px;
 text-align:center;
 font-family:黑体;
 padding-top:15px;
 }
 .t{
  width:250px;
 height:30px;
 font-size:20px;
 font-family:黑体;
padding-top:20px;
 }
#clock{
 width:250px;
 height:100px;
 font-size:18px;
 text-align:center;
 font-family:黑体;
padding-top:5px;
 }
 </style>
<script language="javascript">
function realSysTime(clock){
var now=new Date(); //创建Date对象
var year=now.getFullYear(); //获取年份
var month=now.getMonth(); //获取月份
var date=now.getDate(); //获取日期
var day=now.getDay(); //获取星期
var hour=now.getHours(); //获取小时
var minu=now.getMinutes(); //获取分钟
var sec=now.getSeconds(); //获取秒钟
month=month+1;
var arr_week=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
var week=arr_week[day]; //获取中文的星期
var time=year+"年"+month+"月"+date+"日 "+week+" "+hour+":"+minu+":"+sec; //组合系统时间
clock.innerHTML=time; //显示系统时间
}
window.onload=function(){
window.setInterval("realSysTime(clock)",0); //实时获取并显示系统时间
}
</script> 

  </head>
  
  <body>
  <div>
  <c:if test="${empty usertable}">
     <div class="mtitle"> 欢迎进入首页！！！</div>
  </c:if>
  <c:if test="${not (empty usertable) }">
   <div class="mtitle">欢迎您的登录:<br>
   ${usertable.userName} </div>
  </c:if>
 
  </div>  
  <div class="t">
  当前时间：
  </div>
  
<div id="clock">
 
</div>
  </body>
</html>
