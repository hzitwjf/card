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
  <script src="js/jquery-3.0.0.js"></script>
  <script src="js/ajaxfileupload.js"></script>
  <script language="JavaScript">
    $(function () {
      $("#btn").click(function () {
        //alert("jquery引入成功！");
        function ajaxFileUpload() {
          $.ajaxFileUpload(
                  {url: '/batch/upload', //用于文件上传的服务器端请求地址
                    secureuri: false, //是否需要安全协议，一般设置为false
                    fileElementName: 'file', //文件上传域的ID
                    dataType: 'json', //返回值类型 一般设置为json
                    success: function (data, status)  //服务器成功响应处理函数
                    {
                      if (typeof (data.error) != 'undefined') {
                        if (data.error != '') {
                          alert(data.error);
                        } else {
                          alert(data.msg);
                        }
                      }
                    },
                    error: function (data, status, e)//服务器响应失败处理函数
                    {
                      alert(e);
                    }
                  }
          )
          return false;
        }
      });
    });
  </script>
</head>
<body>

选择要上传的大图：<input type="file"  name="file"><br/>
选择要上传的大图：<input type="file"  name="file"><br/>
<input type="button" id="btn" value="上传图片" />
<%--<form method="post" enctype="multipart/form-data" action="/batch/upload">
  选择要上传的第一个文件：<input type="file" name="file"><br/>
  选择要上传的第二个文件：<input type="file" name="file"><br/>
  <input type="submit" value="上传">
</form>--%>

</body>
</html>
