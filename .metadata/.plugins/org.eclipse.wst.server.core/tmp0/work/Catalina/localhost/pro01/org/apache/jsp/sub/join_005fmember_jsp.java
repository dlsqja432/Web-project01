/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-05 08:23:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sub;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_005fmember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1712133318278L));
    _jspx_dependants.put("/head.jsp", Long.valueOf(1712132056755L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1712036494839L));
    _jspx_dependants.put("jar:file:/D:/janginbeom/pro01/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro01/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/janginbeom/pro01/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro01/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1712305019796L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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
      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      boolean _jspx_th_c_005fset_005f0_reused = false;
      try {
        _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fset_005f0.setParent(null);
        // /sub/join_member.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setVar("path0");
        // /sub/join_member.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setValue(request.getContextPath() );
        int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
        if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        _jspx_th_c_005fset_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      boolean _jspx_th_c_005fset_005f1_reused = false;
      try {
        _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fset_005f1.setParent(null);
        // /head.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f1.setVar("ipath");
        // /head.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f1.setValue(request.getContextPath() );
        int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
        if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
        _jspx_th_c_005fset_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
      }
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ipath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ipath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ipath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"subject\" content=\"부평동 소개(Bupyeongdong Intro)\" />\r\n");
      out.write("<meta name=\"description\" content=\"부평동, 문화의 거리, 맛집, 교통, 소개\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"부평동, 문화의 거리, 맛집, 교통, 소개\" />\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ipath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/favicon.png\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ipath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/favicon.png\" />\r\n");
      out.write("<meta property=\"og:type\" content=\"website\" />\r\n");
      out.write("<meta property=\"og:title\" content=\"bupyeongdong\" />\r\n");
      out.write("<meta property=\"og:description\" content=\"부평동, 문화의 거리, 맛집, 교통, 소개\" />\r\n");
      out.write("<meta property=\"og:image\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ipath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/site.png\" />\r\n");
      out.write("<meta property=\"og:url\" content=\"http://localhost:8091\" />\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".container {width:1400px; }\r\n");
      out.write(".page { clear:both; height:100vh; }\r\n");
      out.write(".page_title { font-size:36px; padding-top:2em; text-align:center; }\r\n");
      out.write("#page1 { background-color:#ececec }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      boolean _jspx_th_c_005fset_005f2_reused = false;
      try {
        _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
        _jspx_th_c_005fset_005f2.setParent(null);
        // /header.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f2.setVar("hpath");
        // /header.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f2.setValue(request.getContextPath() );
        int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
        if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
        _jspx_th_c_005fset_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f2_reused);
      }
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("	<div class=\"logo_wrap\">\r\n");
      out.write("		<a href=\"/pro01\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/Logo.png\" alt=\"부평동 로고\" /></a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<nav id=\"tnb\">\r\n");
      out.write("		<ul>\r\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<nav id=\"gnb\">\r\n");
      out.write("		<ul class=\"main_menu\">\r\n");
      out.write("			<li><a href=\"\">커뮤니티</a>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/NotiList.do\">공지사항</a></li>\r\n");
      out.write("					<li><a href=\"\">자료실</a></li>\r\n");
      out.write("					<li><a href=\"\">묻고 답하기</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<hr>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"contents\" class=\"container-fluid\">\r\n");
      out.write("	<section class=\"page\" id=\"page1\">\r\n");
      out.write("		<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path0 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/JoinMember.do\" method=\"post\">\r\n");
      out.write("			 <div class=\"container\">\r\n");
      out.write("            <h2>회원가입을 위해<br>정보를 입력해주세요.</h2>\r\n");
      out.write("\r\n");
      out.write("            <!-- input도 inline요소중에 하나다. -->\r\n");
      out.write("            <!-- inline이란 하나의 태그가 레코드(가로)방향을 모두 차지하는게 아니라, 자신이 속한 영역만 가지게 되는 것이다. -->\r\n");
      out.write("            <label for=\"email\">* 이메일<br>\r\n");
      out.write("                <input type=\"text\" id=\"email\"><br><br>\r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"name\">* 이름<br>\r\n");
      out.write("                <input type=\"text\" id=\"name\"><br><br>\r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"password1\">* 비밀번호<br>\r\n");
      out.write("                <input class=\"pw\" id=\"password1\" type=\"password\"><br><br>\r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"password2\">* 비밀번호 확인<br>\r\n");
      out.write("                <input class=\"pw\" id=\"password2\" type=\"password\"><br><br> </label>\r\n");
      out.write("\r\n");
      out.write("            <!-- 선택 영역 두번째 -->\r\n");
      out.write("            <!-- name을 부여함으로 인하여 radio의 선택 가능한 것들을 하나의 그룹으로 묶어준다. -->\r\n");
      out.write("            <form>\r\n");
      out.write("                <input type=\"radio\" class=\"radio\" name=\"gender\">&nbsp 여성\r\n");
      out.write("                <input type=\"radio\" class=\"radio\" name=\"gender\">&nbsp 남성\r\n");
      out.write("            </form>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <form>\r\n");
      out.write("                <input type=\"checkbox\" class=\"agree\">&nbsp 이용약관 개인정보 수집 및 정보이용에 동의합니다.\r\n");
      out.write("            </form>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <button>가입하기</button>\r\n");
      out.write("            <!-- 기능자체는 input의 타입을 button으로 하면 사용은 가능하지만, 굳이 button 태그를 사용하는 이유는 -->\r\n");
      out.write("            <!-- 커스터마이징이 button 태그가 더 용이하기 때문이다. -->\r\n");
      out.write("            <!-- <input type=\"button\" value=\"가입하기\"> -->\r\n");
      out.write("        </div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</section>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<hr>\r\n");
      out.write("<footer>\r\n");
      out.write("	<h2>푸터 영역</h2>\r\n");
      out.write("	\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /header.jsp(12,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sid }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/\">로그인</a></li>\r\n");
          out.write("			<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/sub/join_member.jsp\">회원가입</a></li>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /header.jsp(16,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty sid }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/\">로그아웃</a></li>\r\n");
          out.write("			<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/\">회원정보</a></li>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /header.jsp(20,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sid.equals('admin') }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hpath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/admin/\">관리자로</a></li>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
