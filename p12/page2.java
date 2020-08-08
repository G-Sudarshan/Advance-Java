import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class page2 extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
    response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        Cookie ck[] = request.getCookies();
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>");
        out.println("servlet page 2");
        out.println("</title></head><body>");
        out.println("<center><h3>");
        out.println("Hello " + ck[0].getValue() + " this is second servlet page</h3> ");
        out.println("</center></body></html>");
          
    }
}