package standerd;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress byName = InetAddress.getByName("sunoMacBook-Pro");
        System.out.println(byName);

        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1 );


    }
}
