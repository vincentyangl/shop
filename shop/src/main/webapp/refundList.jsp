<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>退货/退款订单</title>
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
					<div class="layui-input-inline">
						<input value="" placeholder="请输入关键字"
							class="layui-input search_input" type="text">
					</div>
					<a class="layui-btn search_btn">查询</a>
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
								<th>退款流水号</th>
								<th>订单编号</th>
								<th>会员名</th>
								<th>下单日期</th>
								<th>退款类型</th>
								<th>申请时间</th>
								<th>状态</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list }" var="l" varStatus="stat">
								<tr>
									<td>${stat.index+1 }</td>
									<td>${l.retSerialNum }</td>
									<td>${l.shop_Order.order_code }</td>
									<td>${l.shop_Order.member_ids.member_id }</td>
									<td>${l.shop_Order.create_time }</td>
									<td>${l.retType }</td>
									<td>${l.retTime }</td>
									<td>${l.retState }</td>
									<td><a
										href="/returnOrder/getById/${l.retId }"
										class="btn btn-default ">详情</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="larry-table-page clearfix">
						<a href="javascript:;" class="layui-btn layui-btn-small"><i
							class="iconfont icon-shanchu1"></i>删除</a>
						<div id="page" class="page"></div>
					</div>
				</div>
				<!-- 登录日志 -->
				<div class="layui-tab-item layui-field-box">
					<table class="layui-table table-hover" lay-even="" lay-skin="nob">
						<thead>
							<tr>
								<th><input type="checkbox" id="selected-all"></th>
								<th>ID</th>
								<th>管理员账号</th>
								<th>状态</th>
								<th>最后登录时间</th>
								<th>上次登录IP</th>
								<th>登录IP</th>
								<th>IP所在位置</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><input type="checkbox"></td>
								<td>110</td>
								<td>admin</td>
								<td>后台登录成功</td>
								<td>2016-12-19 14:26:03</td>
								<td>127.0.0.1</td>
								<td>127.0.0.1</td>
								<td>Unknown</td>
							</tr>
						</tbody>
					</table>
					<div class="larry-table-page clearfix">
						<a href="javascript:;" class="layui-btn layui-btn-small"><i
							class="iconfont icon-shanchu1"></i>删除</a>
						<div id="page2" class="page"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	<script type="text/javascript" src="common/layui/layui.js"></script>
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