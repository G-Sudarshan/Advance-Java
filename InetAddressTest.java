import java.net.*;

class InetAddressTest 
{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress Address[] = InetAddress.getAllByName("www.sumagoinfotech.com");
        
     for(int i = 0 ; i < Address.length ; i++)
     {
         System.out.println(Address[i]);
     }
    }
}