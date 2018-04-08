<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单管理</title>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单管理</title>
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
<script src="locale/bootstrap-table-zh-CN.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<form action="/order/soindex" method="post">

	<div class="col-md-4 col-md-offset-4">
		<div class="layui-inline">
			<div class="layui-input-inline">
				<input type="text" name="order_code" value="${name}" placeholder="请输入订单编号"
					class="layui-input search_input">
			</div>
			<input type="submit" value="查询" class="layui-btn search_btn" /><br />
		</div>

	</div>

	<!-- 操作日志 -->
	<div class="layui-form news_list">
		<table class="layui-table">
			<colgroup>
				<col width="8">
				<col width="8%">
				<col width="8%">
				<col width="8%">
				<col width="8%">
				<col width="14%">
				<col width="8%">
				<col width="8%">
				<col width="8%">
				<col width="8%">
				<col width="14%">
			</colgroup>
			<thead>
				<tr>
					<th>编号</th>
					<th>ID</th>
					<th>订单编号</th>
					<th>买家姓名</th>
					<th>订单金额</th>
					<th>下单日期</th>
					<th>订单状态</th>
					<th>支付状态</th>
					<th>支付方式</th>
					<th>配送状态</th>
					<th>操作</th>
				</tr>
				
				<c:forEach items="${list }" var="t" varStatus="stat">
					<tr>
						<th>${stat.index+1 }</th>
						<th>${t.order_id }</th>
						<th>${t.order_code }</th>
						<th>${t.member_ids.member_username }</th>
						<th>${t.order_price }</th>
						<th>${t.create_time }</th>
						<c:if test="${t.order_status ==0}">
						<th>未确认</th>
						</c:if>
						<c:if test="${t.order_status ==1}">
						<th>已确认</th>
						</c:if>
						
						<c:if test="${t.payment_status ==0}">
						<th>未支付</th>
						</c:if>
						<c:if test="${t.payment_status ==1}">
						<th>已支付</th>
						</c:if>
						
						<th>${t.payment_way }</th>
						
						<c:if test="${t.shipping_status==0 }">
						<th>未发货</th>
						</c:if>
						<c:if test="${t.shipping_status==1 }">
						<th>已发货</th>
						</c:if>
						<th>
							<a href="/order/sodelete?order_id=${t.order_id }" class="layui-btn layui-btn-danger layui-btn-mini news_del" >删除</a> 
							<a href="/order/sogetById?order_id=${t.order_id }" class="layui-btn layui-btn-mini news_edit">修改</a>
						</th>
					</tr>
				</c:forEach>
			</thead>
		</table>
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