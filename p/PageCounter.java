import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PageCounter extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    
    {
       try{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Welcome<br/><br/>");
            HttpSession session = request.getSession();
            int pc = 1;
            //(int)session.getAttribute("pageCount");
            if(pc==0)
            {
                session.setAttribute("pageCount",0);
                pc=0;
            }
            pc++;
            session.setAttribute("pageCount",pc);
            out.println("You have visted this page in this session : <b>"+pc+"</b>");
            out.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    
}