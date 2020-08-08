<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title>Marksheet Page</title>
    </head>
    <body>
        <%
        try{
            String name = request.getParameter("uname");
            int m1 = Integer.parseInt(request.getParameter("m1"));
            int m2=Integer.parseInt(request.getParameter("m2"));
        int m3=Integer.parseInt(request.getParameter("m3"));
        int m4=Integer.parseInt(request.getParameter("m4"));
        int m5=Integer.parseInt(request.getParameter("m5"));
            int total = m1+m2+m3+m4+m5;
            String grade=" ";
            if(total>=450)
            {
                grade="A";
            }
            else if(total>=400)
            {
                grade="B";
            }
            else if(total>=300)
            {
                grade="C";
            }
            else if(total>=200)
            {
                grade="D";
            }
            else
            {
                grade="Fail";
            }

            out.println("<cener><h2>Name: "+name);
            out.println("Your Total : "+total);
            out.println("Your Grade : "+grade+"</h2></cener>");

        }catch(Exception e)
        {
            out.println(e);
        }

        %>
    </body>
</html>