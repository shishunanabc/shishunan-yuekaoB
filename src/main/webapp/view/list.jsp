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
	<form action="/list" method="post">
	<input type="button" value="增加"  onclick="tj()">
	联络单号：<input type="text" name="jid" value="${con.jid }">
	制造部编号：<input type="text" name="zhizaoId" value="${con.zhizaoId }">
	制造部：<input type="text" name="zhizaobu" value="${con.zhizaobu }">
	设备部编号：<input type="text" name="sheId" value="${con.sheId }">
	设备部：<input type="text" name="shebu" value="${con.shebu }">
	加工单位：<input type="text" name="danwei" value="${con.danwei }">
	联系人：<input type="text" name="lianperson" value="${con.lianperson }">
	收货确认人：<input type="text" name="shouperson" value="${con.shouperson }">
	验收确认人：<input type="text" name="peiperson" value="${con.peiperson }">
	采购报销人：<input type="text" name="caiperson" value="${con.caiperson }">
	备注：<input type="text" name="biezhu" value="${con.biezhu }">
	报送日期：<input type="date" name="b1" value="${con.b1 }">--
			<input type="date" name="b2" value="${con.b2 }">
			<input type="submit" value="查询">
		<table class="table">
			<tr>
				<td>推送日期</td>
				<td>联络单</td>
				<td>制造部编号</td>
				<td>制造部</td>
				<td>配件编号</td>
				<td>配件名称</td>
				<td>参考单价</td>
				<td>数量</td>
				<td>金额</td>
				<td>设备部编号</td>
				<td>设备部</td>
				<td>具体技术要求</td>
				<td>审核单价</td>
				<td>审核金额</td>
				<td>配件外送时间</td>
				<td>加工检验</td>
				<td>配件送回时间</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${li }" var="c">
				<tr>
					<td>${c.bsdate }</td>
					<td>${c.jid }</td>
					<td>${c.zhizaoId }</td>
					<td>${c.zhizaobu }</td>
					<td>${c.peijianId }</td>
					<td>
						<c:forEach items="${c.parts }" var="m">
							${m.pname }
						</c:forEach>
					</td>
					<td>${c.price }</td>
					<td>${c.num }</td>
					<td>${c.money }</td>
					<td>${c.sheId }</td>
					<td>${c.shebu }</td>
					<td>${c.yaoqiu }</td>
					<td>${c.sprice }</td>
					<td>${c.smoney }</td>
					<td>${c.peijiandate }</td>
					<td>
						<img alt="" src="/img/${c.img }" style="width: 100px;height: 100px">
					</td>
					<td>${c.shdate }</td>
					<td>
						<input type="button" value="修改" onclick="xg(${c.jid})">
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td>
					<button name="page" value="1">首页</button>
					<button name="page" value="${info.prePage==0?1:info.prePage }">上一页</button>
					<button name="page" value="${info.nextPage==0?info.pages:info.nextPage }">下一页</button>
					<button name="page" value="${info.pages }">尾页</button><br>
					当前${info.pageNum }页/共${info.pages }页，共有${info.total }条
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		function tj() {
			location="/view/add.jsp"
		}
		function xg(jid) {
			location="/find?jid="+jid;
		}
	</script>
</body>
</html>