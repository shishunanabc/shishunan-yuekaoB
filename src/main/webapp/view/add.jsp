<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%String path=request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<%-- <link  href="<%=request.getContextPath() %>/css/index3.css"     rel="stylesheet"   type="text/css">
 --%><script type="text/javascript"  src="<%=request.getContextPath() %>/js/jquery-3.2.1.js"></script>
<link rel="stylesheet" type="text/css"href="/bootstrap-4.4.1-dist/css/bootstrap.min.css" />
<script type="text/javascript"src="/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script> 
<script type="text/javascript"  src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js"></script> 
</head>
<body>
	<form:form action="/add" method="post" modelAttribute="h" enctype="multipart/form-data">
		<table class="table">
			<tr>
				<td>推送日期</td>
				<td>
					<input type="text" name="bsdate">
				</td>
			</tr>
			<tr>
				<td>制造部</td>
				<td>
					<input type="text" name="zhizaobu">
				</td>
			</tr>
			<tr>
				<td>制造部编号</td>
				<td>
					<input type="text" name="zhizaoId">
				</td>
			</tr>
			<tr>
				<td>配件名称</td>
				<td>
					<input type="text" name="peijianId">
				</td>
			</tr>
			<tr>
				<td>报送日期</td>
				<td>
					<input type="text" name="">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>