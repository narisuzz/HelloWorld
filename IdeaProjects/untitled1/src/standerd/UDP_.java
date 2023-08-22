package standerd;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP_ {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(6666);
        byte[] buf = new byte[64 * 1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data,0,length);
        String answer = "";
       if ("四大名著是哪些".equals(s)) {
           answer = "四大名著（红楼梦）（三国演义）（西游记）（水浒传）";
       }else {
           answer = "what?";
       }
        socket.close();
    }
}
