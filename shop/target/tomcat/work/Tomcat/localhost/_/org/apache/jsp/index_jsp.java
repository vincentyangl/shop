/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-23 06:55:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>LarryCMS后台管理</title>\r\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\">\t\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\t\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\t\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\t\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\t\r\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\">\t\r\n");
      out.write("\t<!-- load css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/common/layui/css/layui.css\" media=\"all\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/common/global.css\" media=\"all\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/adminstyle.css\" media=\"all\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layui-layout layui-layout-admin\" id=\"layui_layout\">\r\n");
      out.write("\t<!-- 顶部区域 -->\r\n");
      out.write("\t<div class=\"layui-header header header-demo\">\r\n");
      out.write("\t\t<div class=\"layui-main\">\r\n");
      out.write("\t\t    <!-- logo区域 -->\r\n");
      out.write("\t\t\t<div class=\"admin-logo-box\">\r\n");
      out.write("\t\t\t\t<a class=\"logo\" href=\"http://www.kuxuebao.net\" title=\"logo\">后台管理系统</a>\r\n");
      out.write("\t\t\t\t<div class=\"larry-side-menu\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-bars\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("            <!-- 顶级菜单区域 -->\r\n");
      out.write("            <div class=\"layui-larry-menu\">\r\n");
      out.write("                 <ul class=\"layui-nav clearfix\">\r\n");
      out.write("                       <li class=\"layui-nav-item layui-this\">\r\n");
      out.write("                 \t   \t   <a href=\"javascirpt:;\"><i class=\"iconfont icon-wangzhanguanli\"></i>内容管理</a>\r\n");
      out.write("                 \t   </li>\r\n");
      out.write("                 \t   <li class=\"layui-nav-item\">\r\n");
      out.write("                 \t   \t   <a href=\"javascirpt:;\"><i class=\"iconfont icon-weixin3\"></i>微信公众</a>\r\n");
      out.write("                 \t   </li>\r\n");
      out.write("                 \t   <li class=\"layui-nav-item\">\r\n");
      out.write("                 \t   \t   <a href=\"javascirpt:;\"><i class=\"iconfont icon-ht_expand\"></i>扩展模块</a>\r\n");
      out.write("                 \t   </li>\r\n");
      out.write("                 </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 右侧导航 -->\r\n");
      out.write("            <ul class=\"layui-nav larry-header-item\">\r\n");
      out.write("            \t\t<li class=\"layui-nav-item\">\r\n");
      out.write("            \t\t\t账户名：广州丹奇日化\r\n");
      out.write("            \t\t</li>\r\n");
      out.write("            \t\t<li class=\"layui-nav-item first\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<cite>默认站点</cite>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"layui-nav-more\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">站点1</a>\r\n");
      out.write("\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\">站点2</a>\r\n");
      out.write("\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\" id=\"lock\">\r\n");
      out.write("                        <i class=\"iconfont icon-diannao1\"></i>\r\n");
      out.write("\t\t\t\t\t\t锁屏</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login.jsp\">\r\n");
      out.write("                        <i class=\"iconfont icon-exit\"></i>\r\n");
      out.write("\t\t\t\t\t\t退出</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 左侧侧边导航开始 -->\r\n");
      out.write("\t<div class=\"layui-side layui-side-bg layui-larry-side\" id=\"larry-side\">\r\n");
      out.write("        <div class=\"layui-side-scroll\" id=\"larry-nav-side\" lay-filter=\"side\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 左侧菜单 -->\r\n");
      out.write("\t\t<ul class=\"layui-nav layui-nav-tree\">\r\n");
      out.write("\t\t\t<li class=\"layui-nav-item layui-this\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" data-url=\"main.jsp\">\r\n");
      out.write("\t\t\t\t    <i class=\"iconfont icon-home1\" data-icon='icon-home1'></i>\r\n");
      out.write("\t\t\t\t\t<span>后台首页</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<!-- 个人信息 -->\r\n");
      out.write("\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t<i class=\"iconfont icon-jiaoseguanli\" ></i>\r\n");
      out.write("\t\t\t\t\t<span>商品信息</span>\r\n");
      out.write("\t\t\t\t\t<em class=\"layui-nav-more\"></em>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<dl class=\"layui-nav-child\">\r\n");
      out.write("                    <dd>\r\n");
      out.write("                        <a href=\"javascript:;\" data-url=\"/productAdd.jsp\">\r\n");
      out.write("                            <i class=\"iconfont icon-geren1\" data-icon='icon-geren1'></i>\r\n");
      out.write("                            <span>商品添加</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </dd>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                        <a href=\"javascript:;\" data-url=\"changepwd.jsp\">\r\n");
      out.write("                            <i class=\"iconfont icon-iconfuzhi01\" data-icon='icon-iconfuzhi01'></i>\r\n");
      out.write("                            <span>修改密码</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </dd>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                        <a href=\"javascript:;\" data-url=\"/index/listProduct\">\r\n");
      out.write("                            <i class=\"iconfont icon-piliangicon\" data-icon='icon-piliangicon'></i>\r\n");
      out.write("                            <span>商品展示</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<!-- 用户管理 -->\r\n");
      out.write("\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t   <i class=\"iconfont icon-jiaoseguanli2\" ></i>\r\n");
      out.write("\t\t\t\t\t   <span>表格表单</span>\r\n");
      out.write("\t\t\t\t\t   <em class=\"layui-nav-more\"></em>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t    <dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\" data-url=\"table.jsp\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-yonghu1\" data-icon='icon-yonghu1'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>有线条表格</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\"  data-url=\"table_1.jsp\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-jiaoseguanli4\" data-icon='icon-jiaoseguanli4'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>无线条输入增加内容框</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\" data-url=\"myloginfo.jsp\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-quanxian2\" data-icon='icon-quanxian2'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>无线条表格</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    </dl>\r\n");
      out.write("\t\t\t    </li>\r\n");
      out.write("\t\t\t<!-- 内容管理 -->\r\n");
      out.write("\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t   <i class=\"iconfont icon-wenzhang1\" ></i>\r\n");
      out.write("\t\t\t\t\t   <span>内容管理</span>\r\n");
      out.write("\t\t\t\t\t   <em class=\"layui-nav-more\"></em>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t   <dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t   \t   <dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\" data-url=\"404.jsp\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-lanmuguanli\" data-icon='icon-lanmuguanli'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>404页面</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-wenzhang2\" data-icon='icon-wenzhang2'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>所有档案列表</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-icon1\" data-icon='icon-icon1'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>待审核的档案</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-word\" data-icon='icon-word'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>我发布的文档</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-pinglun1\" data-icon='icon-pinglun1'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>评论管理</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-tags1\" data-icon='icon-tags1'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>TAGS管理</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-huishouzhan1\" data-icon='icon-huishouzhan1'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>内容回收站</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t   </dl>\r\n");
      out.write("\t\t\t   </li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("                 <!-- 会员管理 -->\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t   <i class=\"iconfont icon-m-members\" ></i>\r\n");
      out.write("\t\t\t\t\t   <span>单页面</span>\r\n");
      out.write("\t\t\t\t\t   <em class=\"layui-nav-more\"></em>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<dl class=\"layui-nav-child\">\r\n");
      out.write("                           <dd>\r\n");
      out.write("                           \t   <a href=\"javascript:;\" data-url=\"404.jsp\">\r\n");
      out.write("\t\t\t\t\t              <i class=\"iconfont icon-zhuti\"  data-icon='icon-zhuti'></i>\r\n");
      out.write("\t\t\t\t\t              <span>404提示页面</span>\r\n");
      out.write("\t\t\t\t\t           </a>\r\n");
      out.write("                           </dd>\r\n");
      out.write("                           <dd>\r\n");
      out.write("                           \t   <a href=\"javascript:;\" data-url=\"tab.jsp\">\r\n");
      out.write("\t\t\t\t\t              <i class=\"iconfont icon-zhuti\"  data-icon='icon-zhuti'></i>\r\n");
      out.write("\t\t\t\t\t              <span>选项卡页面</span>\r\n");
      out.write("\t\t\t\t\t           </a>\r\n");
      out.write("                           </dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t <!-- 后台管理 -->\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t   <i class=\"iconfont icon-m-members\" ></i>\r\n");
      out.write("\t\t\t\t\t   <span>后台管理</span>\r\n");
      out.write("\t\t\t\t\t   <em class=\"layui-nav-more\"></em>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<dl class=\"layui-nav-child\">\r\n");
      out.write("                           <dd>\r\n");
      out.write("                           \t   <a href=\"javascript:;\" data-url=\"UserServlet?state=list\">\r\n");
      out.write("\t\t\t\t\t              <i class=\"iconfont icon-zhuti\"  data-icon='icon-zhuti'></i>\r\n");
      out.write("\t\t\t\t\t              <span>用户管理</span>\r\n");
      out.write("\t\t\t\t\t           </a>\r\n");
      out.write("                           </dd>\r\n");
      out.write("                           <dd>\r\n");
      out.write("                           \t   <a href=\"javascript:;\" data-url=\"RoleServlet?state=list\">\r\n");
      out.write("\t\t\t\t\t              <i class=\"iconfont icon-zhuti\"  data-icon='icon-zhuti'></i>\r\n");
      out.write("\t\t\t\t\t              <span>角色管理</span>\r\n");
      out.write("\t\t\t\t\t           </a>\r\n");
      out.write("                           </dd>\r\n");
      out.write("                           <dd>\r\n");
      out.write("                           \t   <a href=\"javascript:;\" data-url=\"PowerServlet?state=list\">\r\n");
      out.write("\t\t\t\t\t              <i class=\"iconfont icon-zhuti\"  data-icon='icon-zhuti'></i>\r\n");
      out.write("\t\t\t\t\t              <span>权限管理</span>\r\n");
      out.write("\t\t\t\t\t           </a>\r\n");
      out.write("                           </dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t   <i class=\"iconfont icon-shengchengbaogao\" ></i>\r\n");
      out.write("\t\t\t\t\t   <span>网站维护</span>\r\n");
      out.write("\t\t\t\t\t   <em class=\"layui-nav-more\"></em>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t   <dl class=\"layui-nav-child\">\r\n");
      out.write("                           <dd>\r\n");
      out.write("                           \t   <a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t              <i class=\"iconfont icon-zhuti\"  data-icon='icon-zhuti'></i>\r\n");
      out.write("\t\t\t\t\t              <span>网站主题</span>\r\n");
      out.write("\t\t\t\t\t           </a>\r\n");
      out.write("                           </dd>\r\n");
      out.write("                           <dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-database\" data-icon='icon-database'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>数据库管理</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t   \t    <dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-shengchengbaogao\" data-icon='icon-shengchengbaogao'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>生成页面</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-qingchuhuancun\" data-icon='icon-qingchuhuancun'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>更新缓存</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t   </dl>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<!-- 系统设置 -->\r\n");
      out.write("\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t   <i class=\"iconfont icon-xitong\" ></i>\r\n");
      out.write("\t\t\t\t\t   <span>系统设置</span>\r\n");
      out.write("\t\t\t\t\t   <em class=\"layui-nav-more\"></em>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t    <dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-zhandianpeizhi\" data-icon='icon-zhandianpeizhi'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>基本参数设置</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-zhandianguanli1\" data-icon='icon-zhandianguanli1'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>多站点管理</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-anquanshezhi\" data-icon='icon-anquanshezhi'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>安全设置</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-sms\" data-icon='icon-sms'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>短信接口设置</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t   <i class=\"iconfont icon-iconfuzhi01\" data-icon='icon-iconfuzhi01'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t   <span>系统日志管理</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t\t<i class='iconfont icon-SQLServershujuku' data-icon='icon-SQLServershujuku'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t\t<span>SQL命令行工具</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    \t<dd>\r\n");
      out.write("\t\t\t\t\t    \t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t    \t\t\t<i class='iconfont icon-xinxicaiji' data-icon='icon-xinxicaiji'></i>\r\n");
      out.write("\t\t\t\t\t    \t\t\t<span>防采集管理</span>\r\n");
      out.write("\t\t\t\t\t    \t\t</a>\r\n");
      out.write("\t\t\t\t\t    \t</dd>\r\n");
      out.write("\t\t\t\t\t    </dl>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- 友链设置 -->\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t   <i class=\"iconfont icon-youqinglianjie\"  data-icon='icon-youqinglianjie'></i>\r\n");
      out.write("\t\t\t\t\t   <span>友情链接</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 左侧侧边导航结束 -->\r\n");
      out.write("\t<!-- 右侧主体内容 -->\r\n");
      out.write("\t<div class=\"layui-body\" id=\"larry-body\" style=\"bottom: 0;border-left: solid 2px #2299ee;\">\r\n");
      out.write("\t\t<div class=\"layui-tab layui-tab-card larry-tab-box\" id=\"larry-tab\" lay-filter=\"demo\" lay-allowclose=\"true\">\r\n");
      out.write("\t\t\t<div class=\"go-left key-press pressKey\" id=\"titleLeft\" title=\"滚动至最右侧\"><i class=\"larry-icon larry-weibiaoti6-copy\"></i> </div>\r\n");
      out.write("\t\t\t<ul class=\"layui-tab-title\">\r\n");
      out.write("\t\t\t\t<li class=\"layui-this\" id=\"admin-home\"><i class=\"iconfont icon-diannao1\"></i><em>后台首页</em></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"go-right key-press pressKey\" id=\"titleRight\" title=\"滚动至最左侧\"><i class=\"larry-icon larry-right\"></i></div> \r\n");
      out.write("\t\t\t<ul class=\"layui-nav closeBox\">\r\n");
      out.write("\t\t\t\t  <li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t    <a href=\"javascript:;\"><i class=\"iconfont icon-caozuo\"></i> 页面操作</a>\r\n");
      out.write("\t\t\t\t    <dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t  <dd><a href=\"javascript:;\" class=\"refresh refreshThis\"><i class=\"layui-icon\">&#x1002;</i> 刷新当前</a></dd>\r\n");
      out.write("\t\t\t\t      <dd><a href=\"javascript:;\" class=\"closePageOther\"><i class=\"iconfont icon-prohibit\"></i> 关闭其他</a></dd>\r\n");
      out.write("\t\t\t\t      <dd><a href=\"javascript:;\" class=\"closePageAll\"><i class=\"iconfont icon-guanbi\"></i> 关闭全部</a></dd>\r\n");
      out.write("\t\t\t\t    </dl>\r\n");
      out.write("\t\t\t\t  </li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"layui-tab-content\" style=\"min-height: 150px; \">\r\n");
      out.write("\t\t\t\t<div class=\"layui-tab-item layui-show\">\r\n");
      out.write("\t\t\t\t\t<iframe class=\"larry-iframe\" data-id='0' src=\"main.jsp\"></iframe>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 底部区域 -->\r\n");
      out.write("\t<div class=\"layui-footer layui-larry-foot\" id=\"larry-footer\">\r\n");
      out.write("\t\t<div class=\"layui-mian\">  \r\n");
      out.write("\t\t    <p class=\"p-admin\">\r\n");
      out.write("\t\t    \t<span>2017 &copy;</span>\r\n");
      out.write("\t\t    \t 广州普金计算机科技股份有限公司,版权所有\r\n");
      out.write("\t\t    </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 加载js文件-->                                                                                                                                                                                           \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/common/layui/layui.js\"></script> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/larry.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/index.js\"></script>\r\n");
      out.write("<!-- 锁屏 -->\r\n");
      out.write("<div class=\"lock-screen\" style=\"display: none;\">\r\n");
      out.write("\t<div id=\"locker\" class=\"lock-wrapper\">\r\n");
      out.write("\t\t<div id=\"time\"></div>\r\n");
      out.write("\t\t<div class=\"lock-box center\">\r\n");
      out.write("\t\t\t<img src=\"images/userimg.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t<h1>admin</h1>\r\n");
      out.write("\t\t\t<duv class=\"form-group col-lg-12\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder='锁屏状态，请输入密码解锁' id=\"lock_password\" class=\"form-control lock-input\" autofocus name=\"lock_password\">\r\n");
      out.write("\t\t\t\t<button id=\"unlock\" class=\"btn btn-lock\">解锁</button>\r\n");
      out.write("\t\t\t</duv>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
