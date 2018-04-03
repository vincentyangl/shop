<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发货人信息管理</title>
<link rel="stylesheet" type="text/css" href="/common/layui/css/layui.css"
	media="all">
<link rel="stylesheet" type="text/css"
	href="/common/bootstrap/css/bootstrap.css" media="all">
<link rel="stylesheet" type="text/css" href="/common/global.css"
	media="all">
<link rel="stylesheet" type="text/css" href="/css/personal.css"
	media="all">
</head>
<body>
	<section class="layui-larry-box">
	<div class="larry-personal">
		<div class="layui-tab">
			<blockquote class="layui-elem-quote news_search">
				<div class="layui-inline">
					<a href="/shipInformationAdd.jsp" class="layui-btn layui-btn-normal newsAdd_btn">添加发货信息</a>
				</div>
			</blockquote>
			<div
				class="layui-tab-content larry-personal-body clearfix mylog-info-box">
				<!-- 操作日志 -->
				<div class="layui-tab-item layui-field-box layui-show">
					<table class="layui-table table-hover" lay-even="" lay-skin="nob">
						<thead>
							<tr>
								<th>ID</th>
								<th>发货人</th>
								<th>联系方式</th>
								<th>发货地址</th>
								<th>是否默认</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list }" var="ship" varStatus="stat">
								<tr>
									<td>${stat.index+1 }</td>
									<td>${ship.shipName }</td>
									<td>${ship.shipPhoneNum }</td>
									<td>${ship.shipSite }</td>
									<c:if test="${ship.defaults==0 }">
										<td>否</td>
									</c:if>
									<c:if test="${ship.defaults==1 }">
										<td>是</td>
									</c:if>
									<td><a
										href="/consignor/getShipInformationById/${ship.shipId }"
										class="btn btn-default ">修改</a><a
										href="/consignor/deleteShipInformationById/${ship.shipId }"
										class="btn btn-default ">删除</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>
	<script type="text/javascript" src="/common/layui/layui.js"></script>
	<script type="text/javascript">
		layui.use([ 'jquery', 'layer', 'element', 'laypage' ], function() {
			window.jQuery = window.$ = layui.jquery;
			window.layer = layui.layer;
			var element = layui.element(), laypage = layui.laypage;

			laypage({
				cont : 'page',
				pages : 10 //总页数
				,
				groups : 5 //连续显示分页数
				,
				jump : function(obj, first) {
					//得到了当前页，用于向服务端请求对应数据
					var curr = obj.curr;
					if (!first) {
						//layer.msg('第 '+ obj.curr +' 页');
					}
				}
			});

			laypage({
				cont : 'page2',
				pages : 10 //总页数
				,
				groups : 5 //连续显示分页数
				,
				jump : function(obj, first) {
					//得到了当前页，用于向服务端请求对应数据
					var curr = obj.curr;
					if (!first) {
						//layer.msg('第 '+ obj.curr +' 页');
					}
				}
			});
		});
	</script>

</body>
</html>