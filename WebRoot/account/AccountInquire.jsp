<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta content="text/html" charset="utf-8">
     <script type="text/javascript">
    function validate_required(field,alerttxt)
    {
        with (field)
    {
        if (value==null||value=="")
    {
        alert(alerttxt);return false
    }
        else {return true}
    }
    }

function validate_form(thisform)
{
    with (thisform)
    {
        if (validate_required(repair_number,"编号未填写!")==false)
    {
        repair_number.focus();return false}
    }
}
</script>

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
    <div id="content"><table background="/Repair/account/table8.jpg"   border="0" cellspacing="0">
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
     <form action="../handleAcountServlet?service=find" target="_self"
			name="userForm" method="post">
    <p><font size="4" face="Verdana" color="#66CCCC" >
    <B>请输入维修编号:</B>
    </font>   
    <input type="text" name="se_repair_number" size="30">
    <input type="submit" name="Submit" value="查询" background-color=" #9AD0D8" style="height:40px;width:80px; background:#9AD0D8"> 
    </p>
    </form>
 
         <table width="589" bordercolor="#66CCCC"  border="0">
        <tr>
            <th  bgcolor="#9AD0D8">维修编号:</th>
            <td><input type="text" name="repair_number"></td>
        </tr>
        <tr>
            <th  bgcolor="#9AD0D8">维修费用:</th>
            <td><input type="text" name="se_repair_cost"></td>
        </tr>
        <tr>
            <th bgcolor="#9AD0D8">材料费用:</th>
            <td ><input type="text" name="se_meterial_cost"></td>
        </tr>
        <tr>
            <th  bgcolor="#9AD0D8">维修时间:</th>
            <td style="width:350px"><input type="text" name="se_time"></td>
        </tr>
        <tr>
      <th  bgcolor="#9AD0D8">注意事项:</th>
      <td style="width:350px"><input type="text" name="se_attention"></td>
        </tr>

        <tr>
            <th  bgcolor="#9AD0D8">结算日期:</th>
            <td style="width:350px"><input type="text" name="se_time"></td>
        </tr>
    </table>
    </div>
    <div id=kong3>
    </div>
            </table>
        </div>
        <div id="footer"></div>
        <table background="/Repair/account/123.jpg" border="0">
            <tr>
                <td width="500" height="200">

                </td>
            </tr>
        </table>
    </div>
</body>
</html>

。
