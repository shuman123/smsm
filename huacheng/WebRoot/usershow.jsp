<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
       
    <title>�������ϱ༭</title>
    <style type="text/css">
     #main3{
        	border:1px solid black;
        	margin: 20px auto;
        	height:500px;
        	width:600px;
        }
    #main3 td{
         
          height:45px;
        }
        .a1{
          
         font-size:26px;
         text-align:center;
        }
        .imagestyle{
          width:200px;
          height:32px;
        }
        .b1{
         width:180px;
         padding-left:100px;
         font-size:20px;
        }
       .b4{
     padding-left:230px;
     }
    .b5{
     width:160px;
     height:38px;
     font-size:20px;
     background-color:#ff2200;
     cursor:pointer;
    }
    .b6{
      padding-left:150px;
    }
    </style>
  </head>  
  <body>
      <div id="main3">
       	   <form name="f3" action="usershowServlet" method="post">
       	   <table border="0" cellpadding="0" cellspacing="0" width="600px">
       	   <tr>
       	   <td colspan="2" class="a1">�༭��������</td>
       	  
       	   </tr>
       	   <tr>
       	   <td  class="b1">�ǳƣ�</td><td ><input type="text" name="nickName" class="imagestyle"/></td>
       	   
       	   </tr>
       	   <tr><td class="b1">�Ա�</td><td><input type="radio" name="sex" value="��"/>��&nbsp;&nbsp;
       	   <input type="radio" name="sex"  value="Ů"/>Ů</td></tr>
       	   <tr><td class="b1">���䣺</td><td><input type="text" name="age" class="imagestyle"/></td></tr>
       	    <tr>
       	   <td class="b1">������</td><td><input type="text" name="cons" class="imagestyle"/></td>
       	   </tr>
       	   <tr> <td class="b1">ְҵ��</td><td><input type="text" name="job" class="imagestyle"/></td></tr>
       	    <tr>
       	   <td class="b1">��˾��</td><td><input type="text" name="company" class="imagestyle"/></td>
       	   </tr>
       	   <tr><td class="b1">ѧУ��</td><td><input type="text" name="school" class="imagestyle"/></td></tr>
       	    <tr>
       	   <td class="b1">���ڵأ�</td><td><input type="text" name="address" class="imagestyle"/></td>
       	   </tr>
       	  
       	   <tr>
       	   <td class="b1">��Ȥ��</td><td><input type="checkbox" value="�˶�" name="interest"/>�˶�
       	   <input type="checkbox" value="����" name="interest"/>����
       	   <input type="checkbox" value="����" name="interest"/>����
       	   <input type="checkbox" value="�赸" name="interest"/>�赸
       	   </td>
       	   </tr>
       	   <tr >
            <td colspan="2" class="b4">
             <input type="submit" value="����" class="b5" />
             <span class="b6"></span><a href="javascript:history.go(-1);">����</a></span>
            </td>
            </tr>
       	   </table>
       	   </form>   
       	   </div>
  </body>
</html>
       	   