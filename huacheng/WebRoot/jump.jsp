<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    
    <title>��Ϣ����</title>
 <style type="text/css">
 body{
   background:url("images/jumpbg2.jpg");
 }
 .mtitle{
 width:250px;
 height:40px;
 font-size:22px;
 text-align:center;
 font-family:����;
 padding-top:15px;
 }
 .t{
  width:250px;
 height:30px;
 font-size:20px;
 font-family:����;
padding-top:20px;
 }
#clock{
 width:250px;
 height:100px;
 font-size:18px;
 text-align:center;
 font-family:����;
padding-top:5px;
 }
 </style>
<script language="javascript">
function realSysTime(clock){
var now=new Date(); //����Date����
var year=now.getFullYear(); //��ȡ���
var month=now.getMonth(); //��ȡ�·�
var date=now.getDate(); //��ȡ����
var day=now.getDay(); //��ȡ����
var hour=now.getHours(); //��ȡСʱ
var minu=now.getMinutes(); //��ȡ����
var sec=now.getSeconds(); //��ȡ����
month=month+1;
var arr_week=new Array("������","����һ","���ڶ�","������","������","������","������");
var week=arr_week[day]; //��ȡ���ĵ�����
var time=year+"��"+month+"��"+date+"�� "+week+" "+hour+":"+minu+":"+sec; //���ϵͳʱ��
clock.innerHTML=time; //��ʾϵͳʱ��
}
window.onload=function(){
window.setInterval("realSysTime(clock)",0); //ʵʱ��ȡ����ʾϵͳʱ��
}
</script> 

  </head>
  
  <body>
  <div>
  <c:if test="${empty usertable}">
     <div class="mtitle"> ��ӭ������ҳ������</div>
  </c:if>
  <c:if test="${not (empty usertable) }">
   <div class="mtitle">��ӭ���ĵ�¼:<br>
   ${usertable.userName} </div>
  </c:if>
 
  </div>  
  <div class="t">
  ��ǰʱ�䣺
  </div>
  
<div id="clock">
 
</div>
  </body>
</html>
