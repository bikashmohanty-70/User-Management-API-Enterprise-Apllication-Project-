/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-01-28 13:41:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resgister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\n");
      out.write("\tintegrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("\tintegrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\n");
      out.write("\tintegrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\n");
      out.write("\tintegrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container register-label mb-3\">\n");
      out.write("\t\t<h3>Please fill in with your details.</h3>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<form class=\"needs-validation form-design\" action=\"webapi/usersRegistration/addUsers\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"validationCustom01\">First name</label> <input\n");
      out.write("\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"validationCustom01\"\n");
      out.write("\t\t\t\t\t\tname=\"fname\" placeholder=\"First name\" required>\n");
      out.write("\t\t\t\t\t<div class=\"valid-feedback\">Looks good!</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"validationCustom02\">Last name</label> <input\n");
      out.write("\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"validationCustom02\"\n");
      out.write("\t\t\t\t\t\tname=\"lname\" placeholder=\"Last name\" required>\n");
      out.write("\t\t\t\t\t<div class=\"valid-feedback\">Looks good!</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"validationCustomUsername\">Username</label>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\" id=\"inputGroupPrepend\">@</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"validationCustomUsername\" name=\"uname\" placeholder=\"Username\"\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"inputGroupPrepend\" required>\n");
      out.write("\t\t\t\t\t\t<div class=\"invalid-feedback\">Please choose a username.</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-4 mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\" id=\"inputGroupPrepend\"><i\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"material-icons\"> lock </i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"exampleInputPassword1\" name=\"password\" placeholder=\"Password\"\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"inputGroupPrepend\" required>\n");
      out.write("\t\t\t\t\t\t<div class=\"invalid-feedback\" id=\"passwordErrorSection\">Please choose a Password.</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-4 mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"exampleInputPassword2\">Password</label>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\" id=\"inputGroupPrepend\"><i\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"material-icons\"> lock </i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"exampleInputPassword2\" name=\"confirm-password\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Confirm Password\"\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"inputGroupPrepend\" required>\n");
      out.write("\t\t\t\t\t\t<div class=\"invalid-feedback\">Please choose a Password.</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t<label for=\"exampleFormControlInput1\">Email address</label>\n");
      out.write("\t\t\t\t<div class=\"input-group mb-3\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-text\" id=\"inputGroupPrepend\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"material-icons\"> mail </i></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<input type=\"email\" class=\"form-control\" name=\"mail\"\n");
      out.write("\t\t\t\t\t\tid=\"exampleFormControlInput1\" placeholder=\"name@example.com\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 mb-2\">\n");
      out.write("\t\t\t\t\t<label for=\"validationCustom03\">City</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"validationCustom03\" name=\"city_name\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"City\" required>\n");
      out.write("\t\t\t\t\t<div class=\"invalid-feedback\">Please provide a valid city.</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"validationCustom04\">State</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"validationCustom04\" name=\"state_name\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"State\" required>\n");
      out.write("\t\t\t\t\t<div class=\"invalid-feedback\">Please provide a valid state.</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"validationCustom05\">Zip</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"validationCustom05\" name=\"pincode\"\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Zip\" required>\n");
      out.write("\t\t\t\t\t<div class=\"invalid-feedback\">Please provide a valid zip.</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<div class=\"form-check\">\n");
      out.write("\t\t\t\t\t<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\n");
      out.write("\t\t\t\t\t\tid=\"invalidCheck\" required> <label\n");
      out.write("\t\t\t\t\t\tclass=\"form-check-label\" for=\"invalidCheck\"> Agree to\n");
      out.write("\t\t\t\t\t\tterms and conditions </label>\n");
      out.write("\t\t\t\t\t<div class=\"invalid-feedback\">You must agree before\n");
      out.write("\t\t\t\t\t\tsubmitting.</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<button class=\"btn btn-primary\" id=\"submitBtn\" type=\"submit\">Submit\n");
      out.write("\t\t\t\tform</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<script>\n");
      out.write("\t\t// Example starter JavaScript for disabling form submissions if there are invalid fields\n");
      out.write("\t\t(function() {\n");
      out.write("\t\t\t'use strict';\n");
      out.write("\t\t\twindow.addEventListener('load',\n");
      out.write("\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t// Fetch all the forms we want to apply custom Bootstrap validation styles to\n");
      out.write("\t\t\t\t\t\tvar forms = document\n");
      out.write("\t\t\t\t\t\t\t\t.getElementsByClassName('needs-validation');\n");
      out.write("\t\t\t\t\t\t// Loop over them and prevent submission\n");
      out.write("\t\t\t\t\t\tvar validation = Array.prototype.filter.call(forms,\n");
      out.write("\t\t\t\t\t\t\t\tfunction(form) {\n");
      out.write("\t\t\t\t\t\t\t\t\tform.addEventListener('submit', function(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tevent) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (form.checkValidity() === false) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tevent.stopPropagation();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\tform.classList.add('was-validated');\n");
      out.write("\t\t\t\t\t\t\t\t\t}, false);\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}, false);\n");
      out.write("\t\t})();\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("</body>\n");
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
}
