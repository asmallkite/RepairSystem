<%@page import="CustomerManage.Customer"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
<meta content="text/html" charset="utf-8">



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

<body background="/Repair/Customer/beijing.jpg" >
<div id=top>
<table background="/Repair/Customer/top.jpg"   border="0" cellspacing="0">
<tr>
  <td width="1900" height="160">
 <div id=top1></div>
 <div id=top11></div>
 
 
  <div id=top12>
  
  <table   border="0" cellspacing="0">
<link rel="stylesheet" href="/Repair/Customer/css/style.css" type="text/css" media="screen">

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
 <form action="deleteServlet2" method="post">

<div id="header">
<h1></h1>
</div>

<div id="menu">
<h2></h2>
<ul>

</ul>

</div>
<div id="content"><table background="/Repair/Customer/table18.jpg"   border="0" cellspacing="0">
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
<% Customer Display = (Customer)request.getAttribute("findCus_another"); %>
<tr>
  <th  bgcolor="#9AD0D8">客户编号:</th>
  <td><input type="text" name="customer_number" value =<%=Display.getCustomer_number() %>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">身份编号:</th>
  <td><input type="text" name="customer_id" value = <%=Display.getCustomer_id() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">客户送机时间:</th>
  <td><input type="text" name="customer_send_mac" value = <%=Display.getCustomer_send_mac() %>></td>
</tr>

<tr>
  <th height="68" bgcolor="#9AD0D8">客户性质:</th>
  <td> <input type="text" name="customer_nature" value = <%=Display.getCustomer_nature() %>>  </td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">单位名称:</th>
  <td><input type="text" name="customer_unit" value = <%=Display.getCustomer_unit() %>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">客户座机:</th>
  <td><input type="text" name="customer_tel" value = <%=Display.getCustomer_tel() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">移动电话:</th>
  <td><input type="text" name="customer_phone" value = <%=Display.getCustomer_phone() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">客户地址:</th>
  <td><input type="text" name="customer_address" value = <%=Display.getCustomer_address() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">客户邮编:</th>
  <td><input type="text" name="customer_postcode" value = <%=Display.getCustomer_id() %>></td>
</tr>


<tr>
  <th bgcolor="#9AD0D8">联系人:</th>
  <td ><input type="text" name="customer_contacts" value = <%=Display.getCustomer_contacts() %>></td>
</tr>
<tr>
  <th bgcolor="#9AD0D8">email:</th>
  <td ><input type="text" name="customer_email" value = <%=Display.getCustomer_email() %>></td>
</tr>

  </table>
  </div>
    <div id=kong3>
  </div>
   <div>
    <div id=Button1>
     <div id=Button3></div>
    
       <input type="submit" name="action" value="删除"  onclick="alert('不要狠心抛弃我嘛··')" background-color=" #9AD0D8" style="height:40px;width:80px; background:#9AD0D8"/>
       
  </div>
  </div> 
  <div id=Button2></div>
  </table>
</div>
  </form>
 
<div id="footer"></div>
<table background="/Repair/Customer/123.jpg" border="0">
<tr>
<td width="500" height="200">

</td>
</tr>
</table>
</div>
</body>
</html>
