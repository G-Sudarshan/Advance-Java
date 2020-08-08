import java.net.*;
import java.io.*;

public class Server
{
    private Socket socket;
    private ServerSocket server;
    private DataInputStream in;

    public Server(int port)
    {
        try {
            server = new ServerSocket(port);
            System.out.println("Server Started....");
            System.out.println("Waiting for client....");
            socket = server.accept();
            System.out.println("Cleint accepted....");

            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";
            while(!line.equals("over"))
            {
                try {
                    line = in.readUTF();
                    System.out.println(line);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            System.out.println("Closing cnnection");
            socket.close();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Server obj = new Server(5000);
    }
}