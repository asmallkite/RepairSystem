<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	var repair_number_check=document.getElementById("repair_number").value;
	var customer_number_check=document.getElementById("customer_number").value; 
	var to_repair_time_check=document.getElementById("to_repair_time").value;
	var pass_identify=0;
	if(repair_number_check.length==0)
	{
		alert("维修编号未填写");
        pass_identify++;
	}
    
    if(repair_number_check.match(/\D/))
    {
    	alert("输入维修编号不合法");
    	pass_identify++;
    }

    if(customer_number_check.match(/\D/))
    {
    	alert("输入客户编号不合法");
    	pass_identify++;
    }

	if(customer_number_check.length==0)
	{
		alert("客户编号未填写");
		pass_identify++;
	}

    if(to_repair_time_check.length!=""&&to_repair_time_check.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/)==null)
    {
		alert("日期不合法")
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
div#kong2 {background-color:#EEEEEE;height:240px;width:500px;float:left;}
div#kong3 {height:40px;width:700px;}
div#Button1 {height:40px;width:550px;float:left;}
div#Button2 {height:40px;width:150px;float:left;}
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

<div id="container" >


<div id="header" background="beijing.jpg" >
<h1></h1>
</div>
<div id="menu">
<h2></h2>
<ul>

</ul>

</div>
<div id="content">


<table background="table3.jpg"   border="0" cellspacing="0">
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





  <div class="mes" id=kong2;>
<form>
  <table id="mytable" width="589" bordercolor="#66CCCC"  border="0">
  <br>
  <br>
  <br>

<tr>
  <th bgcolor="#9AD0D8">维修编号:</td>
  <td><input type="text" name="repair_number" id="repair_number" id="repair_number"><span style="color:red">*</span></td>
</tr>

<tr>
  <th bgcolor="#9AD0D8">客户编号:</td>
  <td><input type="text" name="customer_number" id="customer_number"><span style="color:red">*</span></td>
</tr>

<tr>
  <th height="68" bgcolor="#9AD0D8">产品类型:</th>
  <td>  <select name="to_repair_product_type" id="to_repair_product_type">   
        <option value="1">台式机</option>   
        <option value="2">笔记本</option>   
        <option value="3">投影仪</option>   
         <option value="4">打印机</option>
           <option value="5">其他</option>
      </select>   <span style="color:red">*</span></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">机器品牌:</th>
  <td><input type="text" name="to_repair_mac_brand" id="to_repair_mac_brand"></td>
</tr>

<tr>
  <th bgcolor="#9AD0D8">机器型号:</th>
  <td ><input type="text" name="to_repair_mac_type" id="to_repair_mac_type"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">系列号：</th>
  <td style="width:350px"><input type="text" name="to_repair_serial" id="to_repair_serial"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">缺少零件：</th>
  <td style="width:350px"><input type="text" name="to_repair_lack_part" id="to_repair_lack_part"></td>
</tr>

<tr>
  <th height="91" bgcolor="#9AD0D8"><p>机器故障</p>
    <p>现象:</p>
  </th>
  
  <td>	
  <div>
    <textarea name="to_repair_trouble_phen" id="to_repair_trouble_phen" cols=40 rows=4 onmouseover=this.focus();this.select();  
           onclick="if(value==defaultValue){value='';this.style.color='#070707'}"   
           onBlur="if(!value){value=defaultValue;this.style.color='#BBB7B7'}"}">请写下您机器的故障现象</textarea>
           <span style="color:red">*</span>
  </div>
  </td>
</tr>

<tr>
  <th height="68" bgcolor="#9AD0D8">故障类型:</th>
  <td>  <select name="to_repair_trouble_type" id="to_repair_trouble_type">   
        <option value="1">固定性故障</option>   
        <option value="2">间隙性故障</option>   
      </select> <span style="color:red">*</span>  </td>
</tr>

  <th  bgcolor="#9AD0D8">开机口令：</th>
  <td style="width:350px"><input type="text" name="to_repair_start_cmd" id="to_repair_start_cmd"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">重要资料：</th>
  <td style="width:350px"><input type="text" name="to_repair_impo_files" id="to_repair_impo_files"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">HDD：</th>
  <td style="width:350px"><input type="text" name="to_repair_hdd" id="to_repair_hdd"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">外置PC卡：</th>
  <td style="width:350px"><input type="text" name="to_repair_pc" id="to_repair_pc"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">AC适配器：</th>
  <td style="width:350px"><input type="text" name="to_repair_ac" id="to_repair_ac"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">器件电池：</th>
  <td style="width:350px"><input type="text" name="to_repair_battery" id="to_repair_battery"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">外接光驱：</th>
  <td style="width:350px"><input type="text" name="to_repair_cd_driver" id="to_repair_cd_driver"></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">外接软驱：</th>
  <td style="width:350px"><input type="text" name="to_repair_floppy" id="to_repair_floppy"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">报修时间:(例:1111-11-11)</th>
  <td style="width:350px"><input type="text" name="to_repair_time" id="to_repair_time"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">预估价格：</th>
  <td style="width:350px"><input type="text" name="to_repair_price" id="to_repair_price">
  </td>
</tr>

<tr>
    <th height="68" bgcolor="#9AD0D8">报修状态:</th>
    <td>  <select name="to_repair_state" id="to_repair_state">
    <option value="1">未打印</option>
    <option value="2">打印</option>
    <option value="3">提交</option>
    </select>  <span style="color:red">*</span> </td>
    
</tr>

<td><input type="button" name="Submit" value="确认" onclick=check() background-color=" #9AD0D8" style="height:40px;width:80px; background:#9AD0D8"/>
    </td>
</table>
</form>

</div>
    

<div id="footer">
</div>
<table background="123.jpg" border="0">
<tr>
<td width="500" height="200">

</td>
</tr>
</table>
</div>
</body>
</html>