package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class json1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write(" <script>\n");
      out.write("            \n");
      out.write("            d = new Date();\n");
      out.write("            document.write(d);\n");
      out.write("            person = {\"name\":\"amit\",\"age\":20}; //object\n");
      out.write("            str = JSON.stringify(person);\n");
      out.write("            \n");
      out.write("            document.write(str);\n");
      out.write("            document.write(\"<br/>\" + person);\n");
      out.write("            document.write(\"<br/>\" +person.name +\"<br/>\" + person['age']);\n");
      out.write("            document.write(\"<br/>\" + str['name']); //Error\n");
      out.write("            document.write(\"<br/>\" + str[0]); // {\n");
      out.write("            \n");
      out.write("            json = '{\"name\":\"amit\",\"age\":20}';\n");
      out.write("            obj = JSON.parse(json);\n");
      out.write("            document.write(\"<br/> The name is :\"+ obj.name);\n");
      out.write("            \n");
      out.write("            //array of object :\n");
      out.write("            jsonStr = '[ {\"name\":\"ram\",\"rollno\":\"101\"}, {\"name\":\"mohan\",\"rollno\":\"102\"},{\"name\":\"amit\",\"rollno\":\"103\"}]' ;\n");
      out.write("            \n");
      out.write("            students = JSON.parse(jsonStr);\n");
      out.write("            //showing data-\n");
      out.write("            for (i=0; i<students.length; i++)\n");
      out.write("                document.write(\"<hr/>\" + students[i].rollno + \" :\" + students[i].name);\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            //using for-each \n");
      out.write("            for (i in students)\n");
      out.write("                document.write(\"<hr/>\" + students[i].rollno + \" :\" + students[i].name);\n");
      out.write("            \n");
      out.write("            //Array inside Object/key :\n");
      out.write("            \n");
      out.write("            cities ={\"mp\": [\"rewa\",\"bhopal\",\"gwalior\"],\n");
      out.write("                \"up\": [\"allahabad\",\"kanpur\"],\n");
      out.write("                \"cg\":[\"raipur\",\"bilaspur\"]};\n");
      out.write("            document.write(cities);  //object object\n");
      out.write("            document.write(\"<br/>\");\n");
      out.write("                    \n");
      out.write("            for(c in cities)\n");
      out.write("                document.write(\"<br/>\" + c);  //mp , up, cg  \n");
      out.write("            \n");
      out.write("            for (c in cities)\n");
      out.write("                document.write(\"<br/>\" + cities[c]);\n");
      out.write("             \n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
