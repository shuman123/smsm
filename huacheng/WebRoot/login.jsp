<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>��ӭ��¼</title>
<style type="text/css">
#login{
     width:500px;
     height:auto;
     margin:0px auto; 
     font-family:����;
}
.logintitle{
   font-size:28px;
   text-align:center;
}
td{
    padding-left:20px;
    height:50px;
    
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
a{
 text-decoration: none;
}
.c3{
  width:200px;
  height:40px;
  font-size:22px;
  background-color:#fe2222;
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
</style>
</head>
  <body>
  <div id="login">
  <form name="form2" action="/huacheng/loginServlet" method="post" id="form2"> 
     <table border="1" cellpadding="0" cellspacing="0" width="500px">
     <tr>
     <td colspan="2" class="logintitle">��&nbsp;ӭ&nbsp;��&nbsp;¼</td>
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
  </body>
</html> 
     
