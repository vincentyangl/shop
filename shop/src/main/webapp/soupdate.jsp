<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
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
<body>
	<!-- 	<table border="1" width="100%"> -->
	<!-- 		<tr> -->
	<!-- 			<td>商品编号</td> -->
	<!-- 			<td>商品名称</td> -->
	<!-- 			<td>购买价格</td> -->
	<!-- 			<td>商品价格</td> -->
	<!-- 		</tr> -->
	<%-- 		<c:forEach items="${shop_Order }" var="${so}" > --%>
	<!-- 			<tr> -->
	<%-- 				<td>${so.order_code }</td> --%>
	<%-- 				<td>${so. }</td> --%>
	<!-- 				<td></td> -->
	<!-- 				<td></td> -->
	<!-- 			</tr> -->
	<%-- 		</c:forEach> --%>
	<!-- 	</table> -->

	<form class="form-horizontal" action="soupdate" method="post">
		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label"></label>
			<div class="col-sm-4">
				<input type="hidden" class="form-control"
					value="${shop_Order.order_id}" name="order_id" id="order_id" />
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">订单编号:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="order_code"
					value="${shop_Order.order_code }" />
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">订单金额:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" name="order_price"
					value="${shop_Order.order_price }" />
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">下单日期:</label>
			<div class="col-sm-4">
				<input type="date" class="form-control" name="create_time"
					value="${shop_Order.create_time }" />
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">结单日期:</label>
			<div class="col-sm-4">
				<input type="date" class="form-control" name="finished_time"
					value="${shop_Order.finished_time }" />
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">会员ID:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" name="member_username" value="${shop_Order.member_ids.member_username}" />
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">订单状态:</label>
			<div class="col-sm-4">
				<c:if test="${shop_Order.order_status==0 }">
					<input type="text" class="form-control" value="未确认"/>
				</c:if>
				<c:if test="${shop_Order.order_status==1 }">
					<input type="text" class="form-control" value="已确认"/>
				</c:if>
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">支付状态:</label>
			<div class="col-sm-4">
				<c:if test="${shop_Order.payment_status==0 }">
					<input type="text" class="form-control" value="未支付" />
				</c:if>
				<c:if test="${shop_Order.payment_status==1 }">
					<input type="text" class="form-control" value="已支付"/>
				</c:if>
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">配送状态:</label>
			<div class="col-sm-4">
				<c:if test="${shop_Order.shipping_status==0 }">
					<input type="text" class="form-control" value="未发货"/>
				</c:if>
				<c:if test="${shop_Order.shipping_status==1 }">
					<input type="text" class="form-control" value="已发货"/>
				</c:if>
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">支付方式:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" name="payment_way" value="${shop_Order.payment_way }" />
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">收货人地址:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" name="receive_address" value="${shop_Order.receive_ids.receive_address }" />
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">电话:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" name="receive_phone" value="${shop_Order.receive_ids.receive_phone }" />
			</div>
		</div>


		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-4">
				<button type="submit" class="btn btn-default">确定</button>
			</div>
		</div>
	</form>
</body>
</html>