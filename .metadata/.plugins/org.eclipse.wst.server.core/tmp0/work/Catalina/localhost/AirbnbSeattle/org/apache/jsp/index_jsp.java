/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-12 00:06:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1658114728000L));
    _jspx_dependants.put("jar:file:/Users/brian/Desktop/5200GroupProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/AirbnbSeattle/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1426003870000L));
    _jspx_dependants.put("jar:file:/Users/brian/Desktop/5200GroupProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/AirbnbSeattle/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1426003870000L));
    _jspx_dependants.put("jar:file:/Users/brian/Desktop/5200GroupProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/AirbnbSeattle/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1426003870000L));
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<link\n");
      out.write("  href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.3.0/mdb.min.css\"\n");
      out.write("  rel=\"stylesheet\"\n");
      out.write("  />\n");
      out.write("\n");
      out.write("<link\n");
      out.write("  href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"\n");
      out.write("  rel=\"stylesheet\"\n");
      out.write("/>\n");
      out.write("<link\n");
      out.write("  href=\"css/main.css\"\n");
      out.write("  rel=\"stylesheet\"\n");
      out.write("/>\n");
      out.write("<link\n");
      out.write("  href=\"css/responsive.css\"\n");
      out.write("  rel=\"stylesheet\"\n");
      out.write("/>\n");
      out.write("<title>SeattleTraveler</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg sticky-top navbar-light bg-light\">\n");
      out.write("  <!-- Container wrapper -->\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Toggle button -->\n");
      out.write("    <button\n");
      out.write("      class=\"navbar-toggler\"\n");
      out.write("      type=\"button\"\n");
      out.write("      data-mdb-toggle=\"collapse\"\n");
      out.write("      data-mdb-target=\"#navbarSupportedContent\"\n");
      out.write("      aria-controls=\"navbarSupportedContent\"\n");
      out.write("      aria-expanded=\"false\"\n");
      out.write("      aria-label=\"Toggle navigation\"\n");
      out.write("    >\n");
      out.write("      <i class=\"fas fa-bars\"></i>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <!-- Collapsible wrapper -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <!-- Navbar brand -->\n");
      out.write("      <a class=\"navbar-brand mt-2 mt-lg-0\" href=\"#\">\n");
      out.write("        Seattle Traveler\n");
      out.write("      </a>\n");
      out.write("      <!-- Left links -->\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#Intrduction\">Introduction</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#AboutUs\">About Us</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <!-- Left links -->\n");
      out.write("    </div>\n");
      out.write("    <!-- Collapsible wrapper -->\n");
      out.write("  </div>\n");
      out.write("  <!-- Container wrapper -->\n");
      out.write("</nav>\n");
      out.write("<!-- Navbar -->\n");
      out.write("<div class=\"bg-image\" style=\"height:100vh;\">\n");
      out.write("  <img src=\"img/seattle-bg.jpg\" class=\"w-100\" />\n");
      out.write("  <div class=\"mask\" style=\"background: linear-gradient(45deg, rgba(29, 236, 197, 0.5), rgba(91, 14, 214, 0.5) 100%);\">\n");
      out.write("  <div class=\"d-flex flex-column  justify-content-center align-items-center h-100\">\n");
      out.write("  	  <h1 class=\"text-white\" >Welcome to Seattle Traveler</h1>\n");
      out.write("      <h6 class=\"text-white\">You can find the Best traveling advice right here</h6>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container text-center\" style=\"padding-top:2vw; height:70vh;\" id=\"Introduction\">\n");
      out.write("	<!-- top property with most review -->\n");
      out.write("	<h3>Introduction</h3>\n");
      out.write("	<div class=\"row\">\n");
      out.write("	  <div class=\"col-md-4\">\n");
      out.write("	  		<p aria-hidden=\"true\">\n");
      out.write("			  Accommodation\n");
      out.write("			</p>	  \n");
      out.write("	  		<img\n");
      out.write("			  src=\"img/hotel-bg.jpg\"\n");
      out.write("			  class=\"img-thumbnail\"\n");
      out.write("			  alt=\"Hollywood Sign on The Hill\"\n");
      out.write("			  style=\"width:50vw; height:17vw;\"\n");
      out.write("			/>\n");
      out.write("	  		<p>4,883 properties \n");
      out.write("			We offer more than 4800 reported accommodation listings in Seattle area.\n");
      out.write("			</p>	  \n");
      out.write("	  </div>\n");
      out.write("	  <div class=\"col-md-4\">\n");
      out.write("	  		<p aria-hidden=\"true\">\n");
      out.write("			  Host\n");
      out.write("			</p>\n");
      out.write("	  		<img\n");
      out.write("			  src=\"img/host.jpg\"\n");
      out.write("			  class=\"img-thumbnail\"\n");
      out.write("			  alt=\"Hollywood Sign on The Hill\"\n");
      out.write("			  style=\"width:50vw; height:17vw;\"\n");
      out.write("			/>					  \n");
      out.write("			<p>2,734 hosts \n");
      out.write("			We provide more than 2700 reported hosts in Seattle area.\n");
      out.write("			</p> \n");
      out.write("		  \n");
      out.write("	  </div>\n");
      out.write("	  <div class=\"col-md-4\">\n");
      out.write("	  		<p aria-hidden=\"true\">\n");
      out.write("			  Experience Seattle\n");
      out.write("			</p>\n");
      out.write("	  		<img\n");
      out.write("			  src=\"img/ThingsToDo.jpg\"\n");
      out.write("			  class=\"img-thumbnail\"\n");
      out.write("			  alt=\"Hollywood Sign on The Hill\"\n");
      out.write("			  style=\"width:50vw; height:17vw;\"\n");
      out.write("			/>			\n");
      out.write("	  		<p>4,299 restaurants & 396 parks\n");
      out.write("	  		Enjoy food and nature in Seattle.\n");
      out.write("			</p>	  \n");
      out.write("						\n");
      out.write("	  </div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top:2vw; height: 50vh;\">\n");
      out.write("	<div class=\"row\">\n");
      out.write("		<div class=\"card col-md-6 text-center\" style=\"width:30vw; margin: auto;\">\n");
      out.write("		  <div class=\"card-body\">\n");
      out.write("		    <h5 class=\"card-title\">User</h5>\n");
      out.write("		    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("		    <a href=\"findusers\" class=\"btn btn-primary\">Enter to Find User</a>\n");
      out.write("		    <p><a href=\"usercreate\" > New user? create here</a></p>\n");
      out.write("		  </div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"card col-md-6 text-center\" style=\"width:30vw; margin: auto;\">\n");
      out.write("		  <div class=\"card-body\">\n");
      out.write("		    <h5 class=\"card-title\">Host</h5>\n");
      out.write("		    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("		    <a href=\"findhosts\" class=\"btn btn-primary\">Find Host</a>\n");
      out.write("		    <p><a href=\"hostcreate\" > New host? create here</a></p>\n");
      out.write("		  </div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container text-center\" style=\"padding-top:2vw; height:50vh;\" id=\"AboutUs\">\n");
      out.write("	<!-- top property with most review -->\n");
      out.write("	<h3>About Us</h3>\n");
      out.write("	<p>Seattle Traveler is an online travel agency that combines rentals, and things to do searches all at one place, provides attraction suggestions within the Greater Seattle area, and sends out email subscriptions for travelers, Seattle Visitors or anyone who need a short term stay and are currently using several other platforms to search for their next accommodation. Our mission is to make it easier for travelers to experience Seattle. We help travelers to find the right pathways through millions of possibilities to reach the best possible outcome.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"bg-white text-center\">\n");
      out.write("  <!-- Grid container -->\n");
      out.write("  <div class=\"container p-4\">\n");
      out.write("    <!-- Section: Social media -->\n");
      out.write("    <section class=\"mb-4\">\n");
      out.write("      <!-- Facebook -->\n");
      out.write("      <a class=\"me-4 text-reset\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-facebook-f\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Twitter -->\n");
      out.write("      <a class=\"me-4 text-reset\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-twitter\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Google -->\n");
      out.write("      <a class=\"me-4 text-reset\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-google\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Instagram -->\n");
      out.write("      <a class=\"me-4 text-reset\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-instagram\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Linkedin -->\n");
      out.write("      <a class=\"me-4 text-reset1\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-linkedin-in\"></i\n");
      out.write("      ></a>\n");
      out.write("\n");
      out.write("      <!-- Github -->\n");
      out.write("      <a class=\"me-4 text-reset\" href=\"#!\" role=\"button\"\n");
      out.write("        ><i class=\"fab fa-github\"></i\n");
      out.write("      ></a>\n");
      out.write("    </section>\n");
      out.write("    <!-- Section: Social media -->\n");
      out.write("\n");
      out.write("    <!-- Section: Form -->\n");
      out.write("    <section class=\"\">\n");
      out.write("      <form action=\"\">\n");
      out.write("        <!--Grid row-->\n");
      out.write("        <div class=\"row d-flex justify-content-center\">\n");
      out.write("          <!--Grid column-->\n");
      out.write("          <div class=\"col-auto\">\n");
      out.write("            <p class=\"pt-2\">\n");
      out.write("              <strong>Sign up for our newsletter</strong>\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("          <!--Grid column-->\n");
      out.write("\n");
      out.write("          <!--Grid column-->\n");
      out.write("          <div class=\"col-md-5 col-12\">\n");
      out.write("            <!-- Email input -->\n");
      out.write("            <div class=\"form-outline mb-4\">\n");
      out.write("              <input type=\"email\" id=\"form5Example21\" class=\"form-control\" />\n");
      out.write("              <label class=\"form-label\" for=\"form5Example21\">Email address</label>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!--Grid column-->\n");
      out.write("\n");
      out.write("          <!--Grid column-->\n");
      out.write("          <div class=\"col-auto\">\n");
      out.write("            <!-- Submit button -->\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary mb-4\">\n");
      out.write("              Subscribe\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <!--Grid column-->\n");
      out.write("        </div>\n");
      out.write("        <!--Grid row-->\n");
      out.write("      </form>\n");
      out.write("    </section>\n");
      out.write("    <!-- Section: Form -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Section: Links -->\n");
      out.write("    <section class=\"\">\n");
      out.write("      <!--Grid row-->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-unstyled mb-0\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 1</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 2</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 3</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 4</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-unstyled mb-0\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 1</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 2</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 3</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 4</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-unstyled mb-0\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 1</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 2</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 3</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 4</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("\n");
      out.write("        <!--Grid column-->\n");
      out.write("        <div class=\"col-lg-3 col-md-6 mb-4 mb-md-0\">\n");
      out.write("          <h5 class=\"text-uppercase\">Links</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-unstyled mb-0\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 1</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 2</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 3</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#!\" >Link 4</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--Grid column-->\n");
      out.write("      </div>\n");
      out.write("      <!--Grid row-->\n");
      out.write("    </section>\n");
      out.write("    <!-- Section: Links -->\n");
      out.write("  </div>\n");
      out.write("  <!-- Grid container -->\n");
      out.write("\n");
      out.write("  <!-- Copyright -->\n");
      out.write("  <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("    ?? 2022 Copyright:\n");
      out.write("    <a  href=\"\">SeattleTraveler.com</a>\n");
      out.write("  </div>\n");
      out.write("  <!-- Copyright -->\n");
      out.write("</footer>\n");
      out.write("<!-- Footer -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script\n");
      out.write("  type=\"text/javascript\"\n");
      out.write("  src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.3.0/mdb.min.js\"\n");
      out.write("></script>\n");
      out.write("<script\n");
      out.write("  type=\"text/javascript\"\n");
      out.write("  src=\"js/main.js\"\n");
      out.write("></script>\n");
      out.write("</html>\n");
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
