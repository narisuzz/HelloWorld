package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bw {
    public static void main(String[] args) {
        String filePath = "output.txt"; // 文件路径

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            String data = "Hello, BufferedWriter!"; // 要写入文件的数据

            writer.write(data); // 写入数据到缓冲区
            writer.newLine(); // 写入换行符

            // 追加更多数据
            writer.write("This is a new line.");
            writer.newLine();

            // 注意：数据在缓冲区中，需要调用 flush() 或 close() 才会写入到文件中
            writer.close();
            System.out.println("数据成功写入文件。");
        } catch (IOException e) {
            System.out.println("写入文件时出现错误: " + e.getMessage());
        }
    }
}
