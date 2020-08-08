import java.net.*;

public class URLDemo
{
    public static void main(String[] args)throws MalformedURLException {
        URL cms = new URL("http://localhost:80/cms/config.txt");

        System.out.println("Protocol : "+cms.getProtocol());
        System.out.println("Port : "+cms.getPort());
        System.out.println("Host : "+cms.getHost());
        System.out.println("File : "+cms.getFile());
       }
}