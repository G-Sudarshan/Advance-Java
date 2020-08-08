import java.net.*;
import java.io.*;

public class Client
{
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream out;

    public Client(String address,int port)
    {
        try {
            socket = new Socket(address,port);
            System.out.println("Connected....");
            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());

        } catch (Exception e) {
            System.out.println(e);
        }

        String line="";
        while(!line.equals("over"))
        {
            try
            {
                line = input.readLine();
                out.writeUTF(line);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

        try
        {
            input.close();
            out.close();
            socket.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1",5000);
    }
}