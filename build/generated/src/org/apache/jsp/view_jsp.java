package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.controllers.UserController;
import java.util.ArrayList;
import com.beans.User;
import com.daos.UserDao;
import java.sql.*;;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            UserDao ud=new UserDao();
             
            int start=0;
            int end = 3;
            int total=ud.getRecordsCount();
            
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>List of Users</title>\n");
      out.write("        <link rel=\"icon\" href=\"assets/images/favicon.ico\" type=\"image/x-icon\"/>\n");
      out.write("         \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\"> \n");
      out.write("            function confirmation(){\n");
      out.write("               if(confirm(\"Do you Really want to Remove this record ??\"))\n");
      out.write("               {\n");
      out.write("                   return true;\n");
      out.write("               }\n");
      out.write("               else{\n");
      out.write("                   return false;\n");
      out.write("               }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div  class=\"row\">\n");
      out.write("                    <div class=\"col col-md-12\">\n");
      out.write("                        <center>\n");
      out.write("                            <h2>list of Users</h2>\n");
      out.write("                            <table class=\"table table-hover\">\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("                                    <th>ID</th>\n");
      out.write("                                    <th>Name</th>\n");
      out.write("                                    <th>Father's Name</th>\n");
      out.write("                                    <th>UserId</th>\n");
      out.write("                                    <th>DOB</th>\n");
      out.write("                                    <th>Gender</th>\n");
      out.write("                                    <th>Hobbies</th>\n");
      out.write("                                    <th>Photo</th>\n");
      out.write("                                    <th>Operations</th>\n");
      out.write("                                </tr>\n");
      out.write("                            ");

                                if (request.getParameter("start")!=null)
                                    start = Integer.parseInt(request.getParameter("start"));
                                ArrayList<User> records = ud.getRecordByLimit(start, end);
                                
                   for (User user : records) {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(user.getId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getName());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getFname());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getUserId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getDob());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getGender());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getHobbies());
      out.write("</td>\n");
      out.write("                                <td><img src=\"");
      out.print(user.getPhoto());
      out.write("\" style=\"width:64px; height: 64px;\" class=\"img img-thumbnail\"/></td>\n");
      out.write("                                <td><a href=\"edit.jsp?id=");
      out.print(user.getId());
      out.write("\" class=\"btn btn-success\"> <i class=\"fa fa-pencil\" aria-hidden=\"true\"></i>\n");
      out.write(" </a>   <a href=\"UserController?op=delete&id=");
      out.print(user.getId());
      out.write("\" class=\"btn btn-danger\" onclick=\"return confirmation();\"><i class=\"fa fa-trash\"></i></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                            <span>\n");
      out.write("                                <center>\n");
      out.write("                                <a href=\"view.jsp?start=");
      out.print(start-end);
      out.write("\" class=\"btn btn-primary ");
if(start==0)out.println(" disabled"); 
      out.write("\" style=\"float:left\"><< Previous</a>\n");
      out.write("                                <a href=\"view.jsp?start=");
      out.print(start+end);
      out.write("\" class=\"btn btn-primary ");
if(total-start <= end) out.println(" disabled");
      out.write("\" style=\"float: right\">Next >></a>\n");
      out.write("                                \n");
      out.write("                                ");
for(int i=0; i<=total/end;i++){
      out.write("\n");
      out.write("                                <a href=\"view.jsp?start=");
      out.print(i*end);
      out.write("\" class=\"btn btn-success ");
if(i==Math.floor(start/end))out.println(" btn-dark");
      out.write("\">Page");
      out.print(i+1);
      out.write("</a>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                </center>\n");
      out.write("                            </span>      \n");
      out.write("                        <br/>\n");
      out.write("                        <br/><br/>\n");
      out.write("                        <a href=\"reg1.jsp\" class=\"btn btn-primary\"><i class=\"fa fa-plus\"> Add More Records </i></a>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
