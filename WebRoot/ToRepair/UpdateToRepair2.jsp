<%@page import="to_repair.To_repair_stament"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  if (validate_required(spare_name,"备件名称未填写!")==false)
    {spare_name.focus();return false}
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
        div#content {height:1000px;width:900px;float:left;}
        div#footer {clear:both;text-align:center;}
    </style>
</head>

<body background="/Repair/ToRepair/beijing.jpg" >
<div id=top>
<table background="/Repair/ToRepair/top.jpg"   border="0" cellspacing="0">
<tr>
  <td width="1900" height="160">
 <div id=top1></div>
 <div id=top11></div>
 
 
  <div id=top12>
  
  <table   border="0" cellspacing="0">
<link rel="stylesheet" href="/Repair/ToRepair/css/style.css" type="text/css" media="screen">

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
<form action="addToRepairServlet?service=update2" target="_self"
			name="userForm" method="post">


    <div id="header" background="/Repair/ToRepair/beijing.jpg" >
        <h1></h1>
    </div>
    <div id="menu">
        <h2></h2>
        <ul>

        </ul>

    </div>
    <div id="content"><table background="/Repair/ToRepair/table18.jpg"   border="0" cellspacing="0">
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
                    <br>
                    <br>
                    <br>
                <% To_repair_stament return_to_sta = (To_repair_stament)request.getAttribute("to_and_to");%>
                        <table width="589" bordercolor="#66CCCC"  border="0">

        <tr>
  <th  bgcolor="#9AD0D8">维修编号:</th>
  <td><input type="text" name="repair_number" value=<%=return_to_sta.getTo_repair_number() %>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">客户编号:</th>
  <td><input type="text" name="customer_number" value=<%=return_to_sta.getCustomer_number() %>></td>
</tr>

<tr>
  <th height="68" bgcolor="#9AD0D8">产品类型:</th>
  <td> value=<%=return_to_sta.getTo_repair_product_type() %>  </td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">机器品牌:</th>
  <td><input type="text" name="to_repair_mac_brand" value=<%=return_to_sta.getTo_repair_mac_type() %>></td>
</tr>
<tr>
  <th bgcolor="#9AD0D8">机器型号:</th>
  <td ><input type="text" name="to_repair_mac_type" value=<%=return_to_sta.getTo_repair_mac_brand()%>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">系列号：</th>
  <td style="width:350px"><input type="text" name="to_repair_serial" value=<%=return_to_sta.getTo_repair_serial() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">缺少零件：</th>
  <td style="width:350px"><input type="text" name="to_repair_lack_part" value=<%=return_to_sta.getTo_repair_lack_part() %>></td>
</tr>
<tr>
  <th height="91" bgcolor="#9AD0D8"><p>机器故障</p>
    <p>现象:</p></th>
  <td>	<div>
    
		<input type="text" name="to_repair_lack_part" value=<%=return_to_sta.getTo_repair_trouble_phen() %>>
		
</div></td>
</tr>


<tr>
  <th height="68" bgcolor="#9AD0D8">故障类型:</th>
  <td>  <input type="text" name="to_repair_lack_part" value=<%=return_to_sta.getTo_repair_trouble_type() %>>   </td>
</tr>


<tr>
  <th  bgcolor="#9AD0D8">机器外观检查</th>
  <td style="width:350px"><input type="text" name="to_repair_facial_check" value=<%=return_to_sta.getTo_repair_facial_check()%>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">开机口令：</th>
  <td style="width:350px"><input type="text" name="to_repair_start_cmd" value=<%=return_to_sta.getTo_repair_start_cmd() %>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">重要资料：</th>
  <td style="width:350px"><input type="text" name="to_repair_impo_files" value=<%=return_to_sta.getTo_repair_impo_files() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">HDD：</th>
  <td style="width:350px"><input type="text" name="to_repair_hdd" value=<%=return_to_sta.getTo_repair_hdd() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">外置PC卡：</th>
  <td style="width:350px"><input type="text" name="to_repair_pc" value=<%=return_to_sta.getTo_repair_pc() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">AC适配器：</th>
  <td style="width:350px"><input type="text" name="to_repair_ac" value=<%=return_to_sta.getTo_repair_ac() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">器件电池：</th>
  <td style="width:350px"><input type="text" name="to_repair_battery" value=<%=return_to_sta.getTo_repair_battery() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">外接光驱：</th>
  <td style="width:350px"><input type="text" name="to_repair_cd_driver" value=<%=return_to_sta.getTo_repair_cd_driver()%>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">外接软驱：</th>
  <td style="width:350px"><input type="text" name="to_repair_floppy" value=<%=return_to_sta.getTo_repair_floppy() %>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">报修时间：</th>
  <td style="width:350px"><input type="text" name="to_repair_time" value=<%=return_to_sta.getTo_repair_time()%>></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">预估价格：</th>
  <td style="width:350px"><input type="text" name="to_repair_price" value=<%=return_to_sta.getTo_repair_price() %>></td>
        <tr>
            <th height="68" bgcolor="#9AD0D8">报修状态:</th>
            <td>  <select name="selectAge" id="selectAge">
                <option value="1">未打印</option>
                <option value="2">打印</option>
                <option value="3" selected>提交</option>

            </select>   </td>
        </tr>
    </table>
    </div>
    <div id=kong3>



        <table background="/Repair/ToRepair/beijing.jpg" border="1">
        </table>

    </div>
    <div>


        <div id=Button1>

        </div>
        



         <div id=Button2>
            <input type="submit" name="Submit" value="修改"  background-color=" #9AD0D8" style="height:40px;width:80px; background:#9AD0D8"/>

        </div>

        </table>
        </form>
    </div>
    <div id="footer">


    </div>
    <table background="/Repair/ToRepair/123.jpg" border="0">
        <tr>
            <td width="500" height="200">

            </td>
        </tr>
    </table>
</body>
</html>