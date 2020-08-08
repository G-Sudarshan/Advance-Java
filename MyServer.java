import java.net.*;
import java.io.*;

class MyServer
{
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        System.out.println("Waiting for client..... ");
        Socket s = ss.accept();
        System.out.println("Connected");
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";
        while(!str.equals("bye"))
        {
            str = din.readUTF();
            System.out.println("Client says : "+str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }

        din.close();
        s.close();
        ss.close();
    }
}