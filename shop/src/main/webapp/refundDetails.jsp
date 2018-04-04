<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>退货/退款详情</title>
<link rel="stylesheet" type="text/css"
	href="/common/layui/css/layui.css" media="all">
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
		<header class="larry-personal-tit"> <span>订单信息</span> <a
			href="/returnOrder/listReturnOrder" class="btn btn-default ">返回</a>
		</td>
		</header>
		<!-- /header -->
		<div class="larry-personal-body clearfix">
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">订单编号</label> <label
						class="col-sm-4">${returnOrder.shop_Order.order_code }</label> <label
						class="col-sm-2 control-label">下单日期</label> <label
						class="col-sm-4">${returnOrder.shop_Order.create_time}</label>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">订单状态</label> <label
						class="col-sm-4">${returnOrder.shop_Order.order_status }</label> <label
						class="col-sm-2 control-label">支付状态</label> <label
						class="col-sm-4">${returnOrder.shop_Order.payment_status }</label>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">配送状态</label> <label
						class="col-sm-4">${returnOrder.shop_Order.shipping_status }</label>
					<label class="col-sm-2 control-label">配送方式</label> <label
						class="col-sm-4">快递</label>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">商品总金额</label> <label
						class="col-sm-4">${returnOrder.shop_Order.order_price }</label> <label
						class="col-sm-2 control-label">运费</label> <label class="col-sm-4">快递</label>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">订单总金额</label> <label
						class="col-sm-4">${returnOrder.shop_Order.order_price }</label> <label
						class="col-sm-2 control-label">支付方式</label> <label
						class="col-sm-4">支付宝</label>
				</div>
			</div>
		</div>
	</div>
	
	<div class="larry-personal">
		<header class="larry-personal-tit"> <span>退款详情</span> 
		</td>
		</header>
		<!-- /header -->
		<div class="larry-personal-body clearfix">
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">订单编号</label> <label
						class="col-sm-4">${returnOrder.shop_Order.order_code }</label> <label
						class="col-sm-2 control-label">下单日期</label> <label
						class="col-sm-4">${returnOrder.shop_Order.create_time}</label>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">订单状态</label> <label
						class="col-sm-4">${returnOrder.shop_Order.order_status }</label> <label
						class="col-sm-2 control-label">支付状态</label> <label
						class="col-sm-4">${returnOrder.shop_Order.payment_status }</label>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">配送状态</label> <label
						class="col-sm-4">${returnOrder.shop_Order.shipping_status }</label>
					<label class="col-sm-2 control-label">配送方式</label> <label
						class="col-sm-4">快递</label>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">商品总金额</label> <label
						class="col-sm-4">${returnOrder.shop_Order.order_price }</label> <label
						class="col-sm-2 control-label">运费</label> <label class="col-sm-4">快递</label>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="form-group">
					<label class="col-sm-2 control-label">订单总金额</label> <label
						class="col-sm-4">${returnOrder.shop_Order.order_price }</label> <label
						class="col-sm-2 control-label">支付方式</label> <label
						class="col-sm-4">支付宝</label>
				</div>
			</div>
		</div>
	</div>
	
	</section>
</body>
</html>