import java.net.*;

class InetAddressDemo 
{
    public static void main(String[] args)throws UnknownHostException {
        InetAddress a = InetAddress.getLocalHost();
        System.out.println("getLocalHost() : "+a);
        a = InetAddress.getByName("Sudarshan");
        System.out.println("getByName() : "+a);
        String str =  a.getHostAddress();
        System.out. println("getHostAddress() : "+str);
        str = a.getHostName();
        System.out.println("getHostNAme() : "+str);     
        boolean b = a.isMulticastAddress();
        System.out.println("isMulticastAddress() : "+b);
    }
}