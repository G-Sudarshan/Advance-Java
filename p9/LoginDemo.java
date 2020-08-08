import java.io.*;
import javax.servlet.*;

public class LoginDemo extends GenericServlet
{
    public void service(ServletRequest request, ServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String u = request.getParameter("uname");
        String p = request.getParameter("pass");
        out.println("Username is : "+u+" Password is : "+p);
        out.close();
    }
}