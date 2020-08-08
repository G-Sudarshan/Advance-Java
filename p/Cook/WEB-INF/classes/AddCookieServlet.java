package mycookies;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddCookieServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        String data = request.getParameter("text1");
        Cookie cook = new Cookie("MyCookie",data);
        response.addCookie(cook);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>my cookie has been set to : "+data+"</h2>");
        out.close();
    }
}