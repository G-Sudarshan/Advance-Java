import java.net.*;
import java.io.*;

class PortDemo{
    public static void main(String a[])throws Exception{
        URL obj = new URL("https://www.sanfoundry.com");
        System.out.println(obj.getPort());
        int c;
        URL hp = new URL("demourl");
        URLConnection hpCon = hp.openConnection();

        System.out.println("=== Content ===");
        InputStream input = hpCon.getInputStream();
        int i = hpCon.getContentLength();

        while(((c = input.read()) != -1)){
            System.out.print((char) c);
        } 

        input.close();
    }
}