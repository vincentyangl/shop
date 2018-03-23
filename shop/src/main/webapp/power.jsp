<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="ztree/css/zTreeStyle/zTreeStyle.css"/>
<script src="js/jquery.js" type="text/javascript" charset="utf-8"></script>
<script src="ztree/js/jquery.ztree.all.js" type="text/javascript" charset="utf-8"></script>
<title>Insert title here</title>

<script type="text/javascript">
   $(document).ready(function(){
	   var setting = {
			   /* view : {
		            showIcon : false,
		            selectedMulti : true,     //可以多选
		            showLine : false,
		            expandSpeed : 'fast',
		            dblClickExpand : false
		        },
		        check : {
		            enable : true,
		            chkStyle : "checkbox",    //复选框
		            chkboxType : {
		                "Y" : "s",
		                "N" : "ps"
		            }
		        }, */
				data : {
					simpleData : {
						enable : true,
						idKey : "pid",
						pIdKey : "powerId",
						rootPId : "0"
					},
			
					key: {
						name: "powerName"
					}
				}
			};
	   $.post("IndexServlet?state=getPower",function(data){
	   	$.fn.zTree.init($("#myTree"),setting,data);
	   },"json");
	   
   });
</script>

</head>
<body>

<div><ul class="ztree" id="myTree"></ul></div>

</body>
</html>