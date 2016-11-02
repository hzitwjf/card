<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/29
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>SpringBoot上传文件</title>
  <style>
    #push{
      width: 300px;
      height: 100px;
      display: none;
      padding: 50px;
      border: 1px solid silver;
    }
  </style>
</head>
<body>
上传大图：<input type="button" class="btn" value="上传" ><br/>
<img id="msg" src=><br/>
<div id="push">
  选择要上传的文件：<input type="file" name="file" id="file"><br/>
  <input type="hidden" name="name" value="上传卡券图片" id="name"><br/>
  <input type="button" value="上传图片" id="start">
</div>
上传小图：<input type="button" class="btn" value="上传"  >
<%--<span id="msg"></span>--%>
<hr/>
<form method="post" enctype="multipart/form-data" action="/hand/upload">
  选择要上传的文件：<input type="file" name="file"><br/>
  <input type="submit" value="上传">
</form>

<script src="js/jquery-3.0.0.js"></script>
<script src="js/ajaxfileupload.js"></script>
<script language="JavaScript">
  $(function(){
    $(".btn").click(function(){
      var show = $('#push').css('display');
      if(show=="none"){
        $('#push').css('display','block');
      }else{
        $('#push').css('display','none');
      }
    });
  });
  $(function(){
    $("#start").click(function(){
      ajaxFileUpload();
    });
  });
  function ajaxFileUpload() {
    $.ajaxFileUpload({
      url: '/hand/upload',
      type: 'post',
      secureuri: false, //一般设置为false
      fileElementId: 'file', // 上传文件的id、name属性名
      dataType: 'text', //返回值类型，一般设置为json、application/json
      success: function(data, status){
        //$("#msg").html(data)
        $('#push').css('display','none');
        //alert(data);
        $("#msg").attr("src",data)
      },
      error: function(data, status, e){
        //$("#msg").html(data)
        alert(data+status+e);
      }
    });
  }
</script>
</body>
</html>
