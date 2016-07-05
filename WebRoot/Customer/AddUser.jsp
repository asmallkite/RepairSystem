<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta content="text/html" charset="utf-8">


<SCRIPT LANGUAGE="JavaScript">
<!--
function check()
{
	var customer_id_check=document.getElementById("customer_id").value;
	var arg1 = /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$/;
	var arg2 = /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])((\d{4})|\d{3}[A-Z])$/;
	var customer_send_mac_check=document.getElementById("customer_send_mac").value;
  var customer_tel_check=document.getElementById("customer_tel").value;
  var customer_phone_check=document.getElementById("customer_phone").value;
  var pass_identify=0;

	if(customer_id_check.length==0)
	{
		alert("身份编号未填写");
    pass_identify++;
	}
	else if(customer_id_check.match(arg1) == null && customer_id_check.match(arg2) == null)
	{
		alert("身份编号不合法");
    pass_identify++;
	}

  if(customer_send_mac_check.length!=""&&customer_send_mac_check.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/)==null)
  {
		alert("日期不合法");
    pass_identify++;
   }
   
  if(customer_tel_check.length!=0&&customer_tel_check.match(/^\d{3}-\d{8}|\d{4}-\d{7}$/)==null)
  {
    alert("输入电话号码有误");
    pass_identify++;
  }

  if(customer_phone_check.length!=0&&customer_phone_check.match(/^\d13\d{9}$/)==null)
  {
    alert("输入手机号码有误");
    pass_identify++;
  }

  if(pass_identify==0)
    alert("添加成功");
}
//-->
</SCRIPT>

<style type="text/css">
div#container{width:1900px}
div#header {}
div#top{width:1900px;height:160px}
div#top1{width:1900px;height:60px}
div#top11{width:900px;height:100px;float:left;}
div#top12{width:600px;height:100px;float:left;}
div#top13{width:400px;height:100px;float:left;}
div#menu {height:650px;width:450px;float:left;}
div#kong1 {height:240px;width:200px;float:left;}
div#kong2 {background-color:#EEEEEE;height:270px;width:500px;float:left;}
div#kong3 {height:40px;width:700px;}
div#Button1 {height:40px;width:550px;float:left;}
div#Button2 {height:40px;width:150px;float:left;}
div#Button3 {height:40px;width:400px;float:left;}
div#content {height:1000px;width:900px;float:left;}
div#footer {clear:both;text-align:center;}
</style>
</head>

<body background="beijing.jpg" >


<div id=top>
<table background="top.jpg"   border="0" cellspacing="0">
<tr>
  <td width="1900" height="160">
 <div id=top1></div>
 <div id=top11></div>
 
 
  <div id=top12>
  
  <table   border="0" cellspacing="0">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">

<div class="example">
    <ul id="nav">
        <li class="current"><a href="Introduction.html">简介</a></li>
		
		        <li><a href="AddUser.html">客户管理</a>
                    <ul>
                        <li><a href="InquirieUser.html">查询客户信息</a></li>
                        <li><a href="AddUser.html">新增客户信息</a></li>
                        <li><a href="ChangeUser.html">修改客户信息</a></li>
                        <li><a href="DeleteUser.html">删除客户信息</a></li>
                    </ul>
                </li>
       
	   
	   
	   
        <li><a href="http://www.script-tutorials.com/category/resources/">报修管理</a>
            <ul>
                <li><a href="http://www.script-tutorials.com/category/resources/">维护保修任务</a>
                    <ul>
 <li><a href="AddRepair.html">新增报修信息</a></li>
                        <li><a href="ChangeRepairIn.html">修改报修任务</a></li>
                        <li><a href="InquirieRepairIn.html">查询报修任务</a></li>
                        <li><a href="DeleteRepairIn.html">删除报修任务</a></li>
                                        </ul>
                </li>
				<li><a href="http://www.script-tutorials.com/tag/captcha/">打印客户确认单</a></li>
				<li><a href="http://www.script-tutorials.com/tag/captcha/">提交客户确认单</a></li>
               
            </ul>
        </li>
		 <li><a href="http://www.script-tutorials.com/">维修管理</a>
            <ul>
                <li><a href="DistributRepair.html">分配维修任务</a></li>
				   <li><a href="InquirieRepair.html">查询维修任务</a></li>
                <li><a href="DefendRepair.html">维护维修任务</a>
                    <ul>
                        <li><a href="ChangeRepair.html">修改维修任务</a></li>
                        <li><a href="DeleteRepair.html">删除维修任务</a></li>
                    </ul>
                </li>
            </ul>
        </li>
       
        <li><a href="http://www.script-tutorials.com/creating-css3-dropdown-menu/">结算管理</a>
		
		             <ul>
                        <li><a href="RegisterAccount.html">登记结算信息</a></li>
                        <li><a href="AccountInquire.html">查询结算信息</a></li>
                     </ul>
		
		</li>
           <li><a href="http://www.script-tutorials.com/creating-css3-dropdown-menu/">备件管理</a>
		   
		             <ul>
                        <li><a href="SpareOut.html">出库</a></li>
                        <li><a href="SpareIn.html">入库</a></li>
						 <li><a href="SpareInquire.html">查询库存</a></li>
						 <li><a href="StockState.html">查询库存状态</a></li>
                     </ul>
		   
		   
		   </li>
              <li><a href="http://www.script-tutorials.com/creating-css3-dropdown-menu/">运营监督管理</a>
			  
			   <ul>
                        <li><a href="SpareOut.html">出库</a></li>
                        <li><a href="SpareIn.html">入库</a></li>
						 <li><a href="SpareInquire.html">查询库存</a></li>
						 <li><a href="StockState.html">查询库存状态</a></li>
                     </ul>
			  
			  
			  </li>
    </ul>
</div>
  </table>
   <div id=top13></div>
  </div>

  
  </td>
</tr>
</table>
</div>


<div id="container">

<div id="header">
<h1></h1>
</div>

<div id="menu">
<h2></h2>
<ul>

</ul>
</div>

<div id="content">

<form action="../insertCusServlet" method="post">
<input type="hidden" name="Action" value="Insert_pager">
<table background="table1.jpg"   border="0" cellspacing="0">
<tr>
  <td width="900" height="650">
  
  <div height:160px;width:600px>
    <table>
   <td width="30" height="57"></td>
  <td width="30"></td>
  <td width="26"></td>
  </table>
 <div id=kong3>
  </div>
  
   <div id="kong1";>
     <table>
   <td width="30" height="57"></td>
  <td width="30"></td>
  <td width="26"></td>
  </table> 
  
  </div>
  <div id=kong2;>
  <table width="589"" bordercolor="#66CCCC"  border="0">

<br>
<br>
<br>
<br>

<tr>
  <th  bgcolor="#9AD0D8">客户编号:</th>
  <td><input type="text" name="customer_number" id="customer_number"></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">身份编号:</th>
  <td><input type="text" name="customer_id" id="customer_id"><span style="color:red">*</span></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">客户送机时间:(例：2016-11-11)</th>
  <td><input type="text" name="customer_send_mac" id="customer_send_mac"></td>
</tr>

<tr>
  <th height="48" bgcolor="#9AD0D8">客户性质:</th>
  <td>  <select name="customer_nature" id="customer_nature" id="customer_nature">   
        <option value="1">家庭用户</option>   
        <option value="2">单位用户</option>   
        <option value="3">代理商</option>   
         <option value="4">签约用户</option>
      </select>   </td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">单位名称:</th>
  <td><input type="text" name="customer_unit" id="customer_unit"></td>
</tr>



<tr>
  <th  bgcolor="#9AD0D8">客户座机:</th>
  <td><input type="text" name="customer_tel" id="customer_tel"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">移动电话:</th>
  <td><input type="text" name="customer_phone" id=customer_phone></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">客户地址:</th>
  <td><input type="text" name="customer_address" id=customer_address></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">客户邮编:</th>
  <td><input type="text" name="customer_postcode" id="customer_postcode"></td>
</tr>


<tr>
  <th bgcolor="#9AD0D8">联系人:</th>
  <td ><input type="text" name="customer_contacts" id="customer_contacts"></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">email:</th>
  <td style="width:350px"><input type="text" name="customer_email" id="customer_email"></td>
</tr>
  </table>
  </div>
    <div id=kong3>
  </div>
  <div>
    <div id=Button1>
     <div id=Button3></div>
       <input type="submit" name="Submit" value="确认" onclick=check() background-color=" #9AD0D8" style="height:40px;width:80px; background:#9AD0D8"/>
  </div>
  </div>
  
  </table>

</form>
  
<div id="footer"></div>


</body>
</html>


