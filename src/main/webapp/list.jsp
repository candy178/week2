<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询页面</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	
	<table>
		<tr>
			<td colspan="7">
				<form action="list" method="post">
					阵容：<select id="zr">
							
						 </select>
					状态：<select>
							<option value="0">未拥有</option>
							<option value="1">已拥有</option>
						</select>
					价格：<input type="text" name="min"> ~ <input type="text" name="max">
					<input type="submit" value="查询"> 
					<a href="add.jsp">添加</a>
				</form>
			</td>
		</tr>
		<tr>
			<td>编号</td>
			<td>英雄</td>
			<td>售价</td>
			<td>状态</td>
			<td>图片</td>
			<td>阵容</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${plist.list}" var="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.hname}</td>
				<td>${s.price}</td>
				<td>${s.isHave==0?"未拥有":"已拥有"}</td>
				<td>${s.picurl}</td>
				<td>${s.cname}</td>
				<td>
					<a href="show?id=${s.id}">详情</a>
					<a href="add?id=${s.id}">购买</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7">
				当前${plist.pageNum}/${plist.pages}页，共${plist.total}页；
				<a href="list?pageNum=${plist.firstPage}">首页</a>
				<a href="list?pageNum=${plist.prePage}">上一页</a>
				<a href="list?pageNum=${plist.nextPage}">下一页</a>
				<a href="list?pageNum=${plist.lastPage}">末页</a>
			</td>
		</tr>
	</table>
	
</body>
</html>