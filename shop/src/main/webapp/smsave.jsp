<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="common/layui/css/layui.css"
	media="all">
<link rel="stylesheet" type="text/css"
	href="common/bootstrap/css/bootstrap.css" media="all">
<link rel="stylesheet" type="text/css" href="common/global.css"
	media="all">
<link rel="stylesheet" type="text/css" href="css/personal.css"
	media="all">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<script src="js/jquery-3.0.0.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>

<link rel="stylesheet" type="text/css" href="bootstrap-table.css" />
<script src="bootstrap-table.js" type="text/javascript" charset="utf-8"></script>
<script src="locale/bootstrap-table-zh-CN.js" type="text/javascript"
	charset="utf-8"></script>
</head>
<body>
	<form class="form-horizontal" action="/member/smsave" method="post">
		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">用户名:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" placeholder="请输入用户名"
					name="member_username" />
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">密码:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" placeholder="请输入密码"
					name="member_pwd">
			</div>
		</div>

		
		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">电子邮箱:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" placeholder="请输入邮箱"
					name="member_email">
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">注册时间:</label>
			<div class="col-sm-4">
				<input type="date" class="form-control" 
					name="member_birth">
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">电话号码:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" placeholder="请输入电话"
					name="member_phone">
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">真实姓名:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" placeholder="请输入真实姓名"
					name="member_truename">
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">性别:</label>
			<div class="col-sm-4">
				<label class="radio-inline"> <input type="radio"
					name="member_sex" id="inlineRadio1" checked="checked" value="男"> 男
				</label> <label class="radio-inline"> <input type="radio"
					name="member_sex" id="inlineRadio2" value="女"> 女
				</label>
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">头像:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" placeholder="请输入头像"
					name="member_image">
			</div>
		</div>

		<div class="form-group">
			<label for="inputtext" class="col-sm-2 control-label">生日:</label>
			<div class="col-sm-4">
				<input type="date" class="form-control" 
					name="member_birthday">
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