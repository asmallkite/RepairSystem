<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="Spare.Spare"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>





<!DOCTYPE html>
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
<div id="container">

<form action="handleSpaServlet?service=delete2" target="_self"
			name="userForm" method="post">

<div id="header">
<h1></h1>
</div>

<div id="menu">
<h2></h2>
<ul>

</ul>

</div>

<div id="content">

<table background="/Repair/spare/table10.jpg"   border="0" cellspacing="0">
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
   <% Spare Display = (Spare)request.getAttribute("findSpa_another"); %>
  <table width="589"" bordercolor="#66CCCC"  border="0">

<tr>
  <th  bgcolor="#9AD0D8">备件名称:</th>
  <td><input type="text" name="spare_name" value =<%=Display.getSpare_name() %>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">备件型号:</th>
  <td><input type="text" name="CustomerId" value =<%=Display.getSpare_typw() %>></td>
</tr>
<tr>
  <th bgcolor="#9AD0D8">备件数量:</th>
  <td ><input type="text" name="ProductType" value =<%=Display.getSpare_count()%>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">备件单价</th>
  <td style="width:350px"><input type="text" name="TroubleType"value =<%=Display.getSpare_price()%>></td>
</tr>


  </table>
  </div>
    <div id=kong3>
  </div>
  <div>
    <div id=Button1>
     <div id=Button3>
      <input type="submit" name="Submit" value="出库" onclick="check()" background-color=" #9AD0D8" style="height:40px;width:80px; background:#9AD0D8"/>
     </div>
     
  </div>
    
  
  <div id=Button2>
 


  </table>
  </form>
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

