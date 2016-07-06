<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
<head>
	<title>登陆和注册</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- font files  -->
	<link href='http://fonts.useso.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
	<link href='http://fonts.useso.com/css?family=Nunito:400,300,700' rel='stylesheet' type='text/css'>
	<!-- /font files  -->
	<!-- css files -->
	<link href="css/style2.css" rel='stylesheet' type='text/css' media="all" />
	<!-- /css files -->
</head>
<body>
<h1>sign-in &&  register</h1>
<div class="log">
	<div class="content1">
		<h2>sign-in</h2>
		<form action="../logServlet?service=login" target="_self"
			name="userForm" method="post">
			<input type="text" name="userid" value="please input your userid" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'USERNAME';}">
			<input type="password" name="psw" value="PASSWORD" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'PASSWORD';}">
			<div class="button-row">
            
				<input type="submit" class="sign-in" value="sign-in">
             
				<input type="reset" class="reset" value="reset">
				<div class="clear"></div>
			</div>
		</form>
	</div>
	<div class="content2">
		<h2>register</h2>
		<form action="../logServlet?service=add" target="_self"
			name="userForm" method="post" >
			<input type="text" name="userid" value="please input userid" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'NAME AND SURNAME';}">
			<input type="password" name="psw" value="PASSWORD" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'PASSWORD';}">
			<input type="submit" class="register" value="register">
		</form>s
	</div>
       <script>
   function check(){
//获取按钮组
     var buttons = document.getElementsByName("注册");
   	 if(buttons.checked)
   	 {
   	  return true;
    }
	alert("恭喜您成功注册了设备维修管理系统");
//如果都没有选择，返回false
return false;
}
   
   </script>
	<div class="clear"></div>
</div>
<div class="footer">
	<p>Copyright &copy; 2016.华中科技大学软件实训中心.</p>
</div>

</body>
</html>