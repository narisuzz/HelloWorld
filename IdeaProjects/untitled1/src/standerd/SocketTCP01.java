package standerd;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9997);
        System.out.println("客户端socket返回=" + socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        /*outputStream.write("哪吒".getBytes());*/
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("哪吒，字符流");
        bufferedWriter.newLine();//换行符  表示写入的内容结束
        bufferedWriter.flush();//刷新
        //socket.shutdownOutput();  字节流 结束符
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        /*byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0,readLen));
        }*/
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
