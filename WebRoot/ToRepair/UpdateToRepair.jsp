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
<div id="container" >
<form action="../addToRepairServlet?service=update" target="_self"
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
                    <form action="submitpage.htm" onsubmit="return validate_form(this)" method="post">
                        <p><font size="4" face="Verdana" color="#66CCCC" >
                        <B>请输入要修改的名称:</B>
                        </font>   
                    <input type="text" name="repair_number" size="30">
                    <input type="submit" name="Submit" value="查询" background-color=" #9AD0D8" style="height:40px;width:80px; background:#9AD0D8"> 
                    </p>
                    </form>
                        <table width="589" bordercolor="#66CCCC"  border="0">

        <tr>
  <th  bgcolor="#9AD0D8">维修编号:</th>
  <td><input type="text" name="repair_number2"></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">客户编号:</th>
  <td><input type="text" name="customer_number"></td>
</tr>

<tr>
  <th height="68" bgcolor="#9AD0D8">产品类型:</th>
  <td>  <select name="to_repair_trouble_type" id="selectAge">   
        <option value="1">台式机</option>   
        <option value="2">笔记本</option>   
        <option value="3">投影仪</option>   
         <option value="4">打印机</option>
           <option value="5">其他</option>
      </select>   </td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">机器品牌:</th>
  <td><input type="text" name="to_repair_mac_brand"></td>
</tr>
<tr>
  <th bgcolor="#9AD0D8">机器型号:</th>
  <td ><input type="text" name="to_repair_mac_type"></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">系列号：</th>
  <td style="width:350px"><input type="text" name="to_repair_serial"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">缺少零件：</th>
  <td style="width:350px"><input type="text" name="to_repair_lack_part"></td>
</tr>
<tr>
  <th height="91" bgcolor="#9AD0D8"><p>机器故障</p>
    <p>现象:</p></th>
  <td>	<div>
    <textarea name="to_repair_trouble_phen" cols=40 rows=4>
		请写下您机器的故障现象
		</textarea>
</div></td>
</tr>


<tr>
  <th height="68" bgcolor="#9AD0D8">故障类型:</th>
  <td>  <select name="to_repair_trouble_type" id="to_repair_trouble_type">   
        <option value="1">固定性故障</option>   
        <option value="2">间隙性故障</option>   
      </select>   </td>
</tr>


<tr>
  <th  bgcolor="#9AD0D8">机器外观检查</th>
  <td style="width:350px"><input type="text" name="to_repair_facial_check"></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">开机口令：</th>
  <td style="width:350px"><input type="text" name="to_repair_start_cmd"></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">重要资料：</th>
  <td style="width:350px"><input type="text" name="to_repair_impo_files"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">HDD：</th>
  <td style="width:350px"><input type="text" name="to_repair_hdd"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">外置PC卡：</th>
  <td style="width:350px"><input type="text" name="to_repair_pc"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">AC适配器：</th>
  <td style="width:350px"><input type="text" name="to_repair_ac"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">器件电池：</th>
  <td style="width:350px"><input type="text" name="to_repair_battery"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">外接光驱：</th>
  <td style="width:350px"><input type="text" name="to_repair_cd_driver"></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">外接软驱：</th>
  <td style="width:350px"><input type="text" name="to_repair_floppy"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">报修时间：</th>
  <td style="width:350px"><input type="text" name="to_repair_time"></td>
</tr>

<tr>
  <th  bgcolor="#9AD0D8">预估价格：</th>
  <td style="width:350px"><input type="text" name="to_repair_price"></td>
        <tr>
            <th height="68" bgcolor="#9AD0D8">报修状态:</th>
            <td>  <select name="selectAge" id="selectAge">
                <option value="1">未打印</option>
                <option value="2">打印</option>
                <option value="3">提交</option>

            </select>   </td>
        </tr>
    </table>
    </div>
    <div id=kong3>



        <table background="beijing.jpg" border="1">
        </table>

    </div>
    <div>


        <div id=Button1>

        </div>
        



        <div id=Button2>
        
        </div>

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
