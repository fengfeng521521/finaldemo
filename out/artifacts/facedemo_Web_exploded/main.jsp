<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>聊天室主页</title>
	
	<link rel="stylesheet" href="../CSS/main.css">
	
</head>
<body>

	
		
<div id="all">
	<div id="hengfu">
	<h1>聊天室</h1>
	<jsp:include page="userInfo.jsp"></jsp:include>
	</div>
	
		<jsp:include page="left.jsp"></jsp:include>
		<div id="yRight">
		<h1>right</h1>
		</div>
		<jsp:include page="online.jsp"></jsp:include>
		<jsp:include page="safe.jsp"></jsp:include>
		<div id="sendtext">
			<form method="post" action="/user/toSendMess.do" id="sendfrom">
			<div id="fasongyu">
				
			<img src="../images/bq.png" alt=""><input type="text" name="telltext" id="sendtextid">
				
			&nbsp&nbsp&nbsp
			<input type="button" class="bt"  value="发送" onclick="showReciveMessage()">
			
			<input type="button" class="bt" value="退出" id="tiubt" onclick="tuichu();">
			
			<!--普通按钮设置请求  -->
			
			
			
			
			
			
			
			
			</div>
		</form>

	</div>
		
		
		
	</div>
	
	
	
	
	


</body>
<script src="../js/jquery-3.1.1.min.js"></script>


<script>



function showReciveMessage(){
	
	var yLetf=$("#yLetf");//letf 的ID
	var yRight=$("#yRight");	
	var benname=$("#benname").html();
	var onlineid=$("#onlineid").val();	
	var sendNeiyong=$("#sendtextid").val();
		
	
	
	yRight.html(benname+"说:"+sendNeiyong);	
	//alert(benname+" "+sendNeiyong);	
	
	$.ajax({
		url:"${pageContext.request.contextPath}/user/toSendMess.do",
		data:"benname="+benname+"&onlineid="+onlineid+"&sendNeiyong="+sendNeiyong,
		//data:{othername:othername,benname:benname,sendNeiyong:sendNeiyong},
	  type:"post",
	  dataType:"json",
	  success:function(obj){
		  if(obj.state==1){
			  			  			  
		  			
		   	   //yLetf.html(obj.data);			
			  		  
		  }else{
			  
			  alert("没有信息");			  
		  }		  
	  }
	   						
	});
	
	
}








//定时器
window.setInterval("showOnLine();showotherMessage();",1000);
$(function(){
	showotherMessage();
	showOnLine();
	
	
});
//显示在线人员列表
function showOnLine(){
	// 异步发送请求 获取在线人员列表
	// Jquery发送异步请求
	$.post("${pageContext.request.contextPath}/web/online.jsp?"+new Date().getTime(),function(data){
		// $("#online") == document.getElementById("online");
		$("#online").html(data);
	});
}
//显示其他人发来的消息
function showotherMessage(){
	//var yLetf=$("#yLetf");//letf 的ID
	// Jquery发送异步请求
	$.post("${pageContext.request.contextPath}/web/left.jsp?"+new Date().getTime(),function(data){
		// $("#online") == document.getElementById("online");
		$("#yLetf").html(data);
		
		
		
});

}


/* 思考向一个人发送消息怎么获取这个的人 */





/* function (){
	
	 $.ajax({
        	 url:"../user/login.do",
        	 data:"username="+$("#username").val()+
        	      "&password="+$("#password").val(),
       	 type:"post",
       	 dataType:"json",
       	 success:function(obj){
       		 if(obj.state==0){
       			 alert(obj.message);
       		 }else{
       			 Save();
       			 //登录成功,跳转到首页
       			 location="../main/showIndex.do";
       		 }
       	 }
        });
	
	
}
 */
 
 
   function tuichu(){
	 
	 window.location.href="tuichu.user/exit.do?id=${user.id}";
	 
	 
 }

</script>


</html>