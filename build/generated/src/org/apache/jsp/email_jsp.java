package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.utilities.EmailSender;

public final class email_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col col-md-6\" style=\"text-align:left\">\n");
      out.write("                    <form method=\"post\" class=\"form\">Mail:\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"recipents\" pattern=\"^(\\s?[^\\s,]+@[^\\s,]+\\.[^\\s,]+\\s?,)*(\\s?[^\\s,]+@[^\\s,]+\\.[^\\s,]+)$\" ></input>\n");
      out.write("                    <br/>\n");
      out.write("                    Enter Subject:<input type=\"text\" name=\"subject\" class=\"form-control\"><br/>\n");
      out.write("                    Enter Message:<br/>\n");
      out.write("                    <textarea name=\"message\" row=\"10\" cols=\"20\" class=\"form-control\"></textarea>  \n");
      out.write("                    <input type=\"submit\" value=\"send\" name=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 if (request.getParameter("submit") !=null){
                String host;
                String port;
                String user;
                String pass;
                //read SMTP server setting from web.xml file
                ServletContext context=config.getServletContext();
                host=getInitParameter("host");
                port=getInitParameter("port");
                user=getInitParameter("user");
                pass=getInitParameter("pass");
                
                String recipients[]= request.getParameter("recipents").split(",");
                String subject= request.getParameter("subject");
                String message=request.getParameter("message");
                
                if(EmailSender.sendEmail(host, port, user, pass,recipients , subject, message))
                out.println("Mail sent successfully");
                else
                out.println("<font color='red'>Mail could not be sent!!</font>");
                
        
        }
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
