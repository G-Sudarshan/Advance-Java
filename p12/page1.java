import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class page1 extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();   
        String s = request.getParameter("uname");
        Cookie ck = new Cookie("username",s);
        response.addCookie(ck);
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>");
        out.println("Servlet page 1");
        out.println("</title></head><body><center>");
        out.println("<h3>Welcome <b>"+s+"</b> to first servlet page</h3>");
        out.println("<br/><form action='page2' method='POST'>");
        out.println("<input type='submit' value = 'go to next page'/>");
        out.println("</form></center>");
        out.println("</body></html>");
        out.close();

    }
}