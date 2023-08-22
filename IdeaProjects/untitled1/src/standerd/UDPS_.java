package standerd;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPS_ {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(6668);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String question = scanner.next();
        byte[] data = question.getBytes();
        //byte[] data = "我是哪吒".getBytes();
        DatagramPacket packet =
                new DatagramPacket(data,data.length, InetAddress.getByName("192.168.1.127"),6666);
        datagramSocket.send(packet);
        datagramSocket.close();

    }
}
