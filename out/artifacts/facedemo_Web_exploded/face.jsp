<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>GET VIDEO</title>
    <meta charset="utf-8">


</head>
<body>
<div>
    <input type="button" title="开启摄像头" value="开启摄像头" onclick="getMedia();" />
    <video id="video" width="500px" height="500px" autoplay="autoplay"></video>
    <canvas id="canvas" width="500px" height="500px"></canvas>
    <button id="snap" onclick="takePhoto();">拍照</button>
    <button id="bt" onclick="show()" value="show"></button>



</div>


</body>
<script type="javascript" src="js/jquery-1.8.3.js"></script>
<script >
    function getMedia() {
        alert("nihao");
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

    function takePhoto() {
        //获得Canvas对象
        var video = document.getElementById("video");
        var canvas = document.getElementById("canvas");
        var ctx = canvas.getContext('2d');
        ctx.drawImage(video, 0, 0, 500, 500);
    };

    function show() {
        alert("asdadasdasdasdad");
    }


</script>
</html>