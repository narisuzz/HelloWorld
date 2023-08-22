package standerd;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9997);
        System.out.println("服务端 在9997端口监听 等待链接" );
        Socket socket = serverSocket.accept();
        System.out.println("服务器端socket =" + serverSocket.getClass());
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        /*byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }*/
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("熏悟空  字符流");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        /*outputStream.write("熏悟空".getBytes());*/
        //socket.shutdownOutput();
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
