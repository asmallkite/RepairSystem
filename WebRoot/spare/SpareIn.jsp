<%@ page language="java" import="java.util.*" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %> 
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
  var spare_name_check=document.getElementById("spare_name").value;
  var spare_type_check=document.getElementById("spare_type").value;
  var spare_to_lib_time_check=document.getElementById("spare_to_lib_time").value;
  var spare_price_check=document.getElementById("spare_price").value;
  var spare_count_check=document.getElementById("spare_count").value;
  var spare_alert_count_check=document.getElementById("spare_alert_count").value;
  var pass_identify=0;
  if(spare_name_check.length==0)
  {
    alert("备件名称未填写");
    pass_identify++;
  }
    ;
  if(spare_type_check.length==0)
  {
    alert("备件型号未填写");
    pass_identify++;
  }

  if(spare_price_check.length!=0&&(spare_price_check<0||spare_price_check>1000000))
  {
    alert("输入备件单价不合法");
    pass_identify++;
  }

  if(spare_count_check.length!=0&&spare_count_check<0)
  {
    alert("输入备件数量不合法");
    pass_identify++;
  }

  if(spare_to_lib_time_check.length!=""&&spare_to_lib_time_check.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/)==null)
  {
    alert("日期不合法");
    pass_identify++;
   }

    if(spare_alert_count_check.length!=0&&(spare_alert_count_check<0||spare_alert_count_check>1000000))
  {
    alert("输入警戒数量不合法");
    pass_identify++;
  }

  if(pass_identify==0)
    alert("登记成功");
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
div#kong2 {background-color:#EEEEEE;height:240px;width:500px;float:left;}
div#kong3 {height:40px;width:700px;}
div#Button1 {height:40px;width:550px;float:left;}
div#Button2 {height:40px;width:150px;float:left;}
div#Button3 {height:40px;width:400px;float:left;}
div#content {height:1000px;width:900px;float:left;}
div#footer {clear:both;text-align:center;}
</style>
</head>

<body background="/Repair/account/beijing.jpg" >
<div id=top>
<table background="/Repair/account/top.jpg"   border="0" cellspacing="0">
<tr>
  <td width="1900" height="160">
 <div id=top1></div>
 <div id=top11></div>
 
 
  <div id=top12>
  
  <table   border="0" cellspacing="0">
<link rel="stylesheet" href="/Repair/account/css/style.css" type="text/css" media="screen">

<div class="example">
    <ul id="nav">
        <li class="current"><a href="/Repair/account/Introduction.html">简介</a></li>
		
		        <li><a href="/Repair/Customer/AddUser.jsp">客户管理</a>
                    <ul>
                        <li><a href="/Repair/Customer/FindCus.jsp">查询客户信息</a></li>
                        <li><a href="/Repair/Customer/AddUser.jsp">新增客户信息</a></li>
                        <li><a href="/Repair/Customer/update.jsp">修改客户信息</a></li>
                        <li><a href="/Repair/Customer/DeleCus.jsp">删除客户信息</a></li>
                    </ul>
                </li>
       
	   
	   
	   
        <li><a href="/Repair/ToRepair/FindToRepair.jsp">报修管理</a>
            <ul>
                <li><a href="/Repair/ToRepair/UpdateToRepair.jsp">维护保修任务</a>
                    <ul>
 <li><a href="/Repair/ToRepair/AddToRepair.jsp">新增报修信息</a></li>
                        <li><a href="/Repair/ToRepair/UpdateToRepair.jsp">修改报修任务</a></li>
                        <li><a href="/Repair/ToRepair/FindToRepair.jsp">查询报修任务</a></li>
                        <li><a href="/Repair/ToRepair/DeleToRepair.jsp">删除报修任务</a></li>
                                        </ul>
                </li>
				<li><a href="/Repair/Customer/FindCus.jsp">打印客户确认单</a></li>
				<li><a href="/Repair/Customer/FindCus.jsp">提交客户确认单</a></li>
               
            </ul>
        </li>
		 <li><a href="/Repair/Repair/AddRepair.jsp">维修管理</a>
            <ul>
                <li><a href="/Repair/Repair/AddRepair.jsp">分配维修任务</a></li>
				   <li><a href="/Repair/Repair/FindRepair.jsp">查询维修任务</a></li>
                <li><a href="/Repair/Repair/UpdateRepair.jsp">维护维修任务</a>
                    <ul>
                        <li><a href="/Repair/Repair/UpdateRepair.jsp">修改维修任务</a></li>
                        <li><a href="/Repair/Repair/DeleteRepair.jsp">删除维修任务</a></li>
                    </ul>
                </li>
            </ul>
        </li>
       
        <li><a href="/Repair/account/RegisterAccount.jsp">结算管理</a>
		
		             <ul>
                        <li><a href="/Repair/account/RegisterAccount.jsp">登记结算信息</a></li>
                        <li><a href="/Repair/account/AccountInquire.jsp">查询结算信息</a></li>
                     </ul>
		
		</li>
           <li><a href="/Repair/spare/SpareInquire.jsp">备件管理</a>
		   
		             <ul>
                        <li><a href="/Repair/spare/SpareDelete.jsp">出库</a></li>
                        <li><a href="/Repair/spare/SpareIn.jsp">入库</a></li>
						 <li><a href="/Repair/spare/SpareInquire.jsp">查询库存</a></li>

                     </ul>
		   
		   
		   </li>
              <li><a >运营监督管理</a>
			  
			   <ul>
			   
                       	<li><a href="/Repair/Customer/FindCus.jsp">查询客户信息</a></li>
                       	<li><a href="/Repair/ToRepair/FindToRepair.jsp">查询报修任务</a></li>
                       	 <li><a href="/Repair/Repair/FindRepair.jsp">查询维修任务</a></li>
                       	 <li><a href="/Repair/account/AccountInquire.jsp">查询结算信息</a></li>
						 <li><a href="/Repair/spare/SpareInquire.jsp">查询库存</a></li>
						
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
<form action="../handleSpaServlet?service=add" target="_self"
			name="userForm" method="post">
<table background="table9.jpg"   border="0" cellspacing="0">
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

<tr>
  <th  bgcolor="#9AD0D8">备件名称:</th>
  <td><input type="text" name="spare_name" id="spare_name"><span style="color:red">*</span></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">备件型号:</th>
  <td><input type="text" name="spare_typw" id="spare_type"><span style="color:red">*</span></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">备件数量:</th>
  <td style="width:350px"><input type="text" name="spare_count" id="spare_count"></td>
</tr>

<tr>
  <th bgcolor="#9AD0D8">备件单价:</th>
  <td ><input type="text" name="spare_price" id="spare_price"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">入库时间:(例:2016-11-11)</th>
  <td style="width:350px"><input type="text" name="spare_to_lib_time" id="spare_to_lib_time"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">警戒数量:</th>
  <td style="width:350px"><input type="text" name="spare_alert_count" id="spare_alert_count"></td>
</tr>


  </table>
  </div>
    <div id=kong3>
  </div>
  <div>
    <div id=Button1>
     <div id=Button3></div>
       <input type="submit" name="Submit" value="确认" onclick="check()" background-color=" #9AD0D8" style="height:40px;width:80px; background:#9AD0D8"/>
  </div>
    
  
  <div id=Button2>
 


  </table>
  
</div>
<div id="footer"></div>
<table background="123.jpg" border="0">
<tr>
<td width="500" height="200">

</td>
</tr>
</table>
</div>
</body>
</html>

                   。
