<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<html>
  <head>
   <title>ע��</title> 
<style type="text/css">
#register{
     width:700px;
     height:auto;
     margin:0px auto; 
     border:1px solid gray;
}
.regtitle{
   font-size:28px;
   text-align:center;
}
td{
    padding-left:40px;
    height:50px;
}
.b1{
  width:200px;
  padding-bottom:20px;
  font-size:18px;
 
}
.b2{
  width:320px;
  padding-right:0px;
}
.b3{
  font-size:12px;
}
.b4{
  text-align:center;
}
.b5{
  width:200px;
  height:50px;
  font-size:20px;
  background-color:#ff2200;
  cursor:pointer;
}
a{
 text-decoration: none;
}
.b6{
  width:280px;
  height:38px;
}
.b7{
  height:38px;
  width:140px;
}
.b8{
  width:50px;
  height:38px;
}
.b9{
  width:95px;
  height:38px;
}
.b10{
  height:38px;
  width:160px;
  font-size:12px;
  padding-left:0px;
  vertical-align:middle;
}
.bb{
  font-size:9px;
  height:30px;
  width:160px;
  text-align:left;
  color:gray;
  vertical-align:middle;
}
.ba{

  font-size:9px;
  height:30px;
  width:280px;
  text-align:left;
  color:gray;
  
}
</style>
<script type="text/javascript">
        var code ; //��ȫ�ֶ�����֤��   
//������֤��  
       function createCode(){  
       code = "";   
       var codeLength = 4;//��֤��ĳ���  
       var checkCode = document.getElementById("code");   
       var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',  
     'S','T','U','V','W','X','Y','Z');//�����  
       for(var i = 0; i < codeLength; i++) {//ѭ������  
        var index = Math.floor(Math.random()*36);//ȡ���������������0~35��  
        code += random[index];//��������ȡ��������ӵ�code��  
          }  
          checkCode.value = code;
       }  
       
//У����֤��  
     function validate(){ 
       var inputCode = document.getElementById("input").value.toUpperCase(); //ȡ���������֤�벢ת��Ϊ��д        
       if(inputCode.length <= 0) { //���������֤�볤��Ϊ0  
        alert("��������֤�룡"); //�򵯳���������֤��  
        return false;
      }         
        else if(inputCode != code) { //���������֤�����������֤�벻һ��ʱ  
        alert("��֤���������!"); //�򵯳���֤���������  
        return false;
        createCode();//ˢ����֤��  
        document.getElementById("input").value = "";//����ı���  
        }         
        else { //������ȷʱ  
               //alert("^-^");
               return true; //����^-^  
       }  
                  
     }  
     //��֤�û����ĸ�ʽ
    function checkName(){
       var namePatten=/^\w{6,20}$/;
       var username=document.getElementById("userName").value;
       if(!namePatten.test(username)){
         document.getElementById("nameEorror").innerHTML="�û�����ʽ����ȷ��";
         document.getElementById("nameEorror").style.color="red";
         return false;
       }
        document.getElementById("nameEorror").innerHTML="�û�����ʽ��ȷ��";
         document.getElementById("nameEorror").style.color="green";
         return true;
    }
     //��֤����ĸ�ʽ
    function checkPwd(){
       var namePatten=/^[A-Za-z0-9]{6,20}$/;
       var username=document.getElementById("pwd").value;
       if(!namePatten.test(username)){
         document.getElementById("pwdEorror").innerHTML="�����ʽ����ȷ��";
         document.getElementById("pwdEorror").style.color="red";
         return false;
       }
         document.getElementById("pwdEorror").innerHTML="�����ʽ��ȷ��";
         document.getElementById("pwdEorror").style.color="green";
         return true;
    }
    //��֤ȷ������ĸ�ʽ
     function checkrePwd(){
       var pwd=document.getElementById("pwd").value;
       var repwd=document.getElementById("repwd").value;
       if(pwd!=repwd){
         document.getElementById("repwdEorror").innerHTML="���벻һ�£�";
         document.getElementById("repwdEorror").style.color="red";
         return false;
       }
         return true;
    }
    //��֤����ĸ�ʽ
     function checkEmail(){
       var mailPatten= /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
       var email=document.getElementById("email").value;
       if(!mailPatten.test(email)){
         document.getElementById("emailEorror").innerHTML="�����ʽ����ȷ��";
         document.getElementById("emailEorror").style.color="red";
         return false;
       }
         document.getElementById("emailEorror").innerHTML="�����ʽ��ȷ��";
         document.getElementById("emailEorror").style.color="green";
         return true;
    }
    //��֤������
    function checkForm(){
       
      if(validate()&&checkName()&&checkPwd()&&checkrePwd()&&checkEmail()){
       // alert("���ύ�ɹ�������");
        return true;
      }else{
         // alert("���ύʧ�ܣ�����");
          return false;
      }
    
    }
    </script>
  </head>
  <%
  request.setCharacterEncoding("UTF-8");
   %>
  <body onload="createCode()">
       <div id="register"> 
        <form name="form1" action="/huacheng/registerServlet" method="post" onsubmit="return checkForm();">
          <table border="0" cellpadding="0" cellspacing="0"  width="700px">
          <tr >
           <td colspan="3" class="regtitle">
                              ��&nbsp;��&nbsp;ע&nbsp;��</td>
          <tr>
            <td class="b1">
            <label>�á�������</label>
            </td>
            <td class="b2">
            <input type="text" name="userName" id="userName" class="b6" onblur="checkName();">
            <div class="ba"> ֧����ĸ�����֡�"-"��"_"����ϣ�6��20���ַ�</div></td>
            <td class="b10">
            <div class="bb" id="nameEorror"></div> </td>
           
            </tr>
            
            <tr>
            <td  class="b1">
            <label>��������</label></td>
            <td>
            <input type="password" name="pwd" id="pwd"  class="b6" onblur="checkPwd();">
             <div class="ba"> ����ʹ����ĸ�����ֵ���ϣ�6��20���ַ�</div>
            </td>
            <td  class="b10">
            <div class="bb" id="pwdEorror"></div></td>
           
            </tr>
            
            <tr>
            <td  class="b1">
            <label>ȷ������</label></td>
            <td>
            <input type="password" name="repwd" id="repwd"  class="b6" onblur="checkrePwd();">
             <div class="ba"> ���ٴ���������</div>
            </td>
            <td  class="b10">
             <div class="bb" id="repwdEorror"></div></td>
           
            </tr>
            
            <tr>
            <td  class="b1">
            <label>����������</label></td>
            <td >
            <input type="text" name="email" id="email"  class="b6" onblur="checkEmail();">
            <div class="ba">����ĺ�׺Ϊ@163.com��@qq.com��@126.com</div>
            </td><td  class="b10">
             <div class="bb" id="emailEorror"></div></td>
            
            </tr>
            <tr>
            <td >
            <label>��������֤��</label></td>
            <td colspan="2">
            <input type = "text" id="input" class="b6"/>  
            <input type = "button" id="code" class="b8"/>  
            <input type="button"  value="��һ����֤��" onclick="createCode()" class="b9"/>
            </td>     
            </tr>
            <tr>
            <td colspan="3" class="b3">
            <input type="checkbox" name="read" id="read" checked/>&nbsp;�����Ķ���ͬ��<a href="#">������ũ�����û�ע��Э�顷</a>
            </td>
            </tr>
            <tr >
            <td colspan="3" class="b4">
             <input type="submit" value="����ע��" class="b5" />
            </td>
            </tr>
          </table>
        </form>
       </div>
</body>
</html>   
           
