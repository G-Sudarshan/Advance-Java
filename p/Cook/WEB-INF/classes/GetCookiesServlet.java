package mycookies;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetCookiesServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        Cookie[] cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<b>");
        for(int i = 0 ; i < cookies.length ; i++ )
        {
            String name = cookies[i].getName();
            String value = cookies[i].getValue();
            out.println("name : "+name+" <br/>value : "+value+"<br/>");
        }
        out.println("</b>");
        out.close();
    }
}