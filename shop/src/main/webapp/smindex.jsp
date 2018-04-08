<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<link rel="stylesheet" type="text/css" href="/common/layui/css/layui.css"
	media="all">
<link rel="stylesheet" type="text/css"
	href="common/bootstrap/css/bootstrap.css" media="all">
<link rel="stylesheet" type="text/css" href="/common/global.css"
	media="all">
<link rel="stylesheet" type="text/css" href="/css/personal.css"
	media="all">
<link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
<script src="js/jquery-3.0.0.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>

<link rel="stylesheet" type="text/css" href="/bootstrap-table.css" />
<script src="bootstrap-table.js" type="text/javascript" charset="utf-8"></script>
<script src="locale/bootstrap-table-zh-CN.js" type="text/javascript"
	charset="utf-8"></script>
</head>

<script type="text/javascript">

function fun() {
	document.forms[0].action="";
	document.forms[0].submit();
}
</script>
<body>
<form action="/member/smindex" method="post">
	<a class="layui-btn search_btn" href="/smsave.jsp">添加用户</a>
	
	<div class="col-md-4 col-md-offset-4">
		<div class="layui-inline">
			<div class="layui-input-inline">
				<input type="text" name="member_username" value="${name }" placeholder="请输入关键字" class="layui-input search_input" >
			</div>
			<input type="submit" value="查询" class="layui-btn search_btn"/><br/>
		</div>

	</div>
	</div>
	<!-- 操作日志 -->
	<div class="layui-form news_list">
		<table class="layui-table">
			<colgroup>
				<col width="20">
				<col width="15%">
				<col width="15%">
				<col width="15%">
				<col width="15%">
				<col width="15%">
				<col width="20%">
			</colgroup>
			<thead>
				<tr>
					<th>编号</th>
					<th>ID</th>
					<th>用户名</th>
					<th>密码</th>
					<th>电子邮箱</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list }" var="t" varStatus="stat">
					<tr>
						<th>${stat.index+1 }</th>
						<th>${t.member_id }</th>
						<th>${t.member_username }</th>
						<th>${t.member_pwd }</th>
						<th>${t.member_email }</th>
						<th><a href="/member/smdelete?member_id=${t.member_id }">删除</a>
							<a href="/member/smgetById?member_id=${t.member_id }">修改</a></th>
					</tr>
				</c:forEach>
			</thead>
			</table>
			</div>
			</div>
			</div>

		
			</section>
			<script type="text/javascript" src="common/layui/layui.js"></script>
			<script type="text/javascript" src="js/newslist.js"></script>
			<script type="text/javascript">
			layui
				.use(
					['jquery', 'layer', 'element',
						'laypage'
					],
					function() {
						window.jQuery = window.$ = layui.jquery;
						window.layer = layui.layer;
						var element = layui.element(),
							laypage = layui.laypage;

						laypage({
							cont: 'page',
							pages: 10 //总页数
								,
							groups: 5 //连续显示分页数
								,
							jump: function(obj, first) {
								//得到了当前页，用于向服务端请求对应数据
								var curr = obj.curr;
								if(!first) {
									//layer.msg('第 '+ obj.curr +' 页');
								}
							}
						});

						laypage({
							cont: 'page2',
							pages: 10 //总页数
								,
							groups: 5 //连续显示分页数
								,
							jump: function(obj, first) {
								//得到了当前页，用于向服务端请求对应数据
								var curr = obj.curr;
								if(!first) {
									//layer.msg('第 '+ obj.curr +' 页');
								}
							}
						});
					});
		</script>
		
			</form>
</body>

</html>