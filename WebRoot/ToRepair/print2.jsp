<%@ page language="java" import="java.util.*" %>
<%@page import="CustomerManage.Customer"%>
<%@page import="to_repair.To_repair_stament"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %> 
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
<form action="addToRepairServlet?service=print2" target="_self"
			name="userForm" method="post">
    <div id="header" background="/Repair/ToRepair/beijing.jpg" >
        <h1></h1>
    </div>
    <div id="menu">
        <h2></h2>
        <ul>

        </ul>

    </div>
    <div id="content">
    
    
    <table background="/Repair/ToRepair/table55.jpg"   border="0" cellspacing="0">
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
                   <% Customer Display = (Customer)request.getAttribute("findCus_another"); %>
                    <% To_repair_stament return_to_sta = (To_repair_stament)request.getAttribute("to_and_to");%>
                  
                        <table width="589" bordercolor="#66CCCC"  border="0">

        <tr>
  <th  bgcolor="#9AD0D8">维修编号:</th>
  <td><input type="text" name="repair_number2" value=<%=return_to_sta.getTo_repair_number() %>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">客户编号:</th>
  <td><input type="text" name="customer_number" value=<%=return_to_sta.getCustomer_number() %>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">客户送机时间:</th>
  <td><input type="text" name="customer_send_mac" value = <%=Display.getCustomer_send_mac() %>></td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">移动电话:</th>
  <td><input type="text" name="customer_phone" value = <%=Display.getCustomer_phone() %>></td>
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
  <td><input type="text" name="to_repair_mac_brand" value=<%=return_to_sta.getTo_repair_mac_type() %>></td>
</tr>
<tr>
  <th height="68" bgcolor="#9AD0D8">故障类型:</th>
  <td>  <select name="to_repair_trouble_type" id="to_repair_trouble_type">   
        <option value="1">固定性故障</option>   
        <option value="2">间隙性故障</option>   
      </select>   </td>
</tr>
<tr>
  <th  bgcolor="#9AD0D8">报修时间：</th>
  <td style="width:350px"><input type="text" name="to_repair_time" value=<%=return_to_sta.getTo_repair_time() %>></td>
</tr>
<tr>
  <th bgcolor="#9AD0D8">联系人:</th>
  <td ><input type="text" name="customer_contacts" value = <%=Display.getCustomer_contacts() %>></td>
</tr>
    </table>
    </div>
    
    <div id=kong3>



        <table background="/Repair/ToRepair/beijing.jpg" border="1">
        </table>

    </div>
    <div>


     <div id=Button2>

        </div>
           

<input type="submit" name="Submit" value="打印提交" background-color=" #9AD0D8" style="height:40px;width:80px; background:#9AD0D8"> 
                    

        <div id=Button2>
        
        </div>
        
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
</div>
</body>
</html>
