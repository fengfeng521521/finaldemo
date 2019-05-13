<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/7
  Time: 8:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>GET VIDEO</title>
    <meta charset="utf-8">
<style>
    #bt{
        width: 60px;
        height: 60px;
        background-color: #52dcc9;


    }




</style>
</head>
<body>
<div>
    <input type="button" title="开启摄像头" value="开启摄像头" onclick="getMedia();" />
    <video id="video" width="500px" height="500px" autoplay="autoplay"></video>
    <canvas id="canvas" width="500px" height="500px" name="image"></canvas>
    <button id="snap" onclick="takePhoto();">拍照</button>

    <form action="/home"  method="post">
        <input type="hidden" name="img" id="bei">
        <input type="submit" value="上传">
    </form>



</div>


</body>
<script type="javascript" src="js/jquery-1.8.3.js"></script>
<script >


    var base64Img =null;
    function getMedia() {
    alert("你好欢迎采集头像");

        alert("nihao")
        var constraints = {
            video: {width: 500, height: 500},
            audio: true
        };
        //获得video摄像头区域
        var video = document.getElementById("video");
        //这里介绍新的方法，返回一个 Promise对象
        // 这个Promise对象返回成功后的回调函数带一个 MediaStream 对象作为其参数
        // then()是Promise对象里的方法
        // then()方法是异步执行，当then()前的方法执行完后再执行then()内部的程序
        // 避免数据没有获取到
        var promise = navigator.mediaDevices.getUserMedia(constraints);
        promise.then(function (MediaStream) {
            video.srcObject = MediaStream;
            video.play();
        });
    };






    function takePhoto() {        //获得Canvas对象

        //获得Canvas对象
        var video = document.getElementById("video");
        var canvas = document.getElementById("canvas");
        var ctx = canvas.getContext('2d');
        ctx.drawImage(video, 0, 0, 500, 500);
        base64Img =canvas.toDataURL();
        //alert(base64Img);
        //document.getElementById("bei").valueOf(base64Img+"");
    };




    function upLode(){
     alert("已经进来");

    if(base64Img=!null){

        alert("base64Img 不为空");
    $.ajax({
        /*
        *{pageContext.request.contextPath}
        * */

        url: "${pageContext.request.contextPath}/home",
        data:"base64Img="+base64Img,
        //data:{othername:othername,benname:benname,sendNeiyong:sendNeiyong},
        type:"post",
        dataType:"json",
        success:function(obj){
            if(obj.state==1){
                alert("有信息");
            }else{
                alert("没有信息");
            }
        }

    });

    };
    }

</script>
</html>
