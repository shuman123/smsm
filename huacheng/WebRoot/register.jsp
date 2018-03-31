<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<html>
  <head>
   <title>注册</title> 
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
        var code ; //在全局定义验证码   
//产生验证码  
       function createCode(){  
       code = "";   
       var codeLength = 4;//验证码的长度  
       var checkCode = document.getElementById("code");   
       var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',  
     'S','T','U','V','W','X','Y','Z');//随机数  
       for(var i = 0; i < codeLength; i++) {//循环操作  
        var index = Math.floor(Math.random()*36);//取得随机数的索引（0~35）  
        code += random[index];//根据索引取得随机数加到code上  
          }  
          checkCode.value = code;
       }  
       
//校验验证码  
     function validate(){ 
       var inputCode = document.getElementById("input").value.toUpperCase(); //取得输入的验证码并转化为大写        
       if(inputCode.length <= 0) { //若输入的验证码长度为0  
        alert("请输入验证码！"); //则弹出请输入验证码  
        return false;
      }         
        else if(inputCode != code) { //若输入的验证码与产生的验证码不一致时  
        alert("验证码输入错误!"); //则弹出验证码输入错误  
        return false;
        createCode();//刷新验证码  
        document.getElementById("input").value = "";//清空文本框  
        }         
        else { //输入正确时  
               //alert("^-^");
               return true; //弹出^-^  
       }  
                  
     }  
     //验证用户名的格式
    function checkName(){
       var namePatten=/^\w{6,20}$/;
       var username=document.getElementById("userName").value;
       if(!namePatten.test(username)){
         document.getElementById("nameEorror").innerHTML="用户名格式不正确！";
         document.getElementById("nameEorror").style.color="red";
         return false;
       }
        document.getElementById("nameEorror").innerHTML="用户名格式正确！";
         document.getElementById("nameEorror").style.color="green";
         return true;
    }
     //验证密码的格式
    function checkPwd(){
       var namePatten=/^[A-Za-z0-9]{6,20}$/;
       var username=document.getElementById("pwd").value;
       if(!namePatten.test(username)){
         document.getElementById("pwdEorror").innerHTML="密码格式不正确！";
         document.getElementById("pwdEorror").style.color="red";
         return false;
       }
         document.getElementById("pwdEorror").innerHTML="密码格式正确！";
         document.getElementById("pwdEorror").style.color="green";
         return true;
    }
    //验证确认密码的格式
     function checkrePwd(){
       var pwd=document.getElementById("pwd").value;
       var repwd=document.getElementById("repwd").value;
       if(pwd!=repwd){
         document.getElementById("repwdEorror").innerHTML="密码不一致！";
         document.getElementById("repwdEorror").style.color="red";
         return false;
       }
         return true;
    }
    //验证邮箱的格式
     function checkEmail(){
       var mailPatten= /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
       var email=document.getElementById("email").value;
       if(!mailPatten.test(email)){
         document.getElementById("emailEorror").innerHTML="邮箱格式不正确！";
         document.getElementById("emailEorror").style.color="red";
         return false;
       }
         document.getElementById("emailEorror").innerHTML="邮箱格式正确！";
         document.getElementById("emailEorror").style.color="green";
         return true;
    }
    //验证整个表单
    function checkForm(){
       
      if(validate()&&checkName()&&checkPwd()&&checkrePwd()&&checkEmail()){
       // alert("表单提交成功！！！");
        return true;
      }else{
         // alert("表单提交失败！！！");
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
                              用&nbsp;户&nbsp;注&nbsp;册</td>
          <tr>
            <td class="b1">
            <label>用　户　名</label>
            </td>
            <td class="b2">
            <input type="text" name="userName" id="userName" class="b6" onblur="checkName();">
            <div class="ba"> 支持字母、数字、"-"、"_"的组合，6到20个字符</div></td>
            <td class="b10">
            <div class="bb" id="nameEorror"></div> </td>
           
            </tr>
            
            <tr>
            <td  class="b1">
            <label>设置密码</label></td>
            <td>
            <input type="password" name="pwd" id="pwd"  class="b6" onblur="checkPwd();">
             <div class="ba"> 建议使用字母、数字的组合，6到20个字符</div>
            </td>
            <td  class="b10">
            <div class="bb" id="pwdEorror"></div></td>
           
            </tr>
            
            <tr>
            <td  class="b1">
            <label>确认密码</label></td>
            <td>
            <input type="password" name="repwd" id="repwd"  class="b6" onblur="checkrePwd();">
             <div class="ba"> 请再次输入密码</div>
            </td>
            <td  class="b10">
             <div class="bb" id="repwdEorror"></div></td>
           
            </tr>
            
            <tr>
            <td  class="b1">
            <label>请输入邮箱</label></td>
            <td >
            <input type="text" name="email" id="email"  class="b6" onblur="checkEmail();">
            <div class="ba">邮箱的后缀为@163.com、@qq.com、@126.com</div>
            </td><td  class="b10">
             <div class="bb" id="emailEorror"></div></td>
            
            </tr>
            <tr>
            <td >
            <label>请输入验证码</label></td>
            <td colspan="2">
            <input type = "text" id="input" class="b6"/>  
            <input type = "button" id="code" class="b8"/>  
            <input type="button"  value="换一个验证码" onclick="createCode()" class="b9"/>
            </td>     
            </tr>
            <tr>
            <td colspan="3" class="b3">
            <input type="checkbox" name="read" id="read" checked/>&nbsp;我已阅读并同意<a href="#">《荆州农资网用户注册协议》</a>
            </td>
            </tr>
            <tr >
            <td colspan="3" class="b4">
             <input type="submit" value="立即注册" class="b5" />
            </td>
            </tr>
          </table>
        </form>
       </div>
</body>
</html>   
           
