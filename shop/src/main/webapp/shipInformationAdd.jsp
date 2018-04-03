<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发货人信息添加</title>
<link rel="stylesheet" type="text/css" href="/common/layui/css/layui.css"
	media="all">
<link rel="stylesheet" type="text/css"
	href="common/bootstrap/css/bootstrap.css" media="all">
<link rel="stylesheet" type="text/css" href="/common/global.css"
	media="all">
<link rel="stylesheet" type="text/css" href="/css/personal.css"
	media="all">
</head>
<body>
	<section class="layui-larry-box">
	<div class="larry-personal">
		<header class="larry-personal-tit"> <span>发货人信息添加</span> </header>
		<!-- /header -->
		<div class="larry-personal-body clearfix changepwd">
			<form class="layui-form col-lg-4" method="post"
				action="/consignor/saveShipInformation">
				<div class="layui-form-item">
					<label class="layui-form-label">发货人</label>
					<div class="layui-input-block">
						<input type="text" name="shipName" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">联系方式</label>
					<div class="layui-input-block">
						<input type="text" name="shipPhoneNum" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">发货地址</label>
					<div class="layui-input-block">
						<input type="text" name="shipSite" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">是否默认</label>
					<div class="layui-input-block">
						<input type="radio" name="defaults" value="1" title="是"
							checked="checked">
						<div class="layui-unselect layui-form-radio layui-form-radioed">
							<i class="layui-anim layui-icon"></i><span>是</span>
						</div>
						<input type="radio" name="defaults" value="0" title="否">
						<div class="layui-unselect layui-form-radio">
							<i class="layui-anim layui-icon"></i><span>否</span>
						</div>
					</div>
				</div>
				<div class="layui-form-item change-submit">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	</section>
	<script type="text/javascript" src="/common/layui/layui.js"></script>
	<script type="text/javascript">
		layui.use([ 'form', 'upload' ], function() {
			var form = layui.form();
		});
	</script>

</body>
</html>