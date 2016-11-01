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
</head>
<body>
<form action="insetCardCoupon" method="post">
  卡券名字：<input type="text" name="cardName"><br/>
  卡券大图：<input type="file" name="cardBigPicUrl"><br/>
  卡券小图：<input type="file" name="cardSmallPicUrl"><br/>
  卡券类型：<input type="text" name="cardTypeId"><br/>
  卡券生效时间：<input type="datetime-local" name="cardStartTime"><br/>
  卡券结束时间：<input type="datetime-local" name="cardEndTime"><br/>
  卡券库存：<input type="text" name="cardStock"><br/>
  卡券领取限制：<input type="text" name="cardRestrict"><br/>
  <input type="submit" value="新增卡券">
</form>

</body>
</html>
