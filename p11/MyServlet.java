import javax.servlet.*;
import java.io.*;

public class MyServlet extends GenericServlet
{
    public void service(ServletRequest req, ServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>");
        out.println("Practical 11");
        out.println("</title></head><body><center>");
        out.println("This is example of servlet");
        out.println("</center></body></html>");
        out.close();
    }
}