<%--
  Created by IntelliJ IDEA.
  User: su
  Date: 2023/08/06
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> iu真好看</h1>
<%
    request.setAttribute("n1", 10);
    request.setAttribute("n2", 20);
%>
${n1 + n2}
</body>
</html>
