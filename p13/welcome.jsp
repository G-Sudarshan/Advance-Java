<html>
    <head>
        <title>Welcome Page</title>
    </head>
    <body>
        <center>
            <h1><% String name = request.getParameter("uname");
                out.print("Welcome "+name);
                out.println("</h1><br><h2>This is example of jsp page</h2>");
                 %>
        </center>
    </body>
</html>