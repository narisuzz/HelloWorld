package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
    public static void main(String[] args) {
        String sourceFile = "/Users/su/Downloads/ssb.doc"; // 源文件路径
        String destinationFile = "destination.txt"; // 目标文件路径

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile))) {
            byte[] buffer = new byte[1024]; // 缓冲区大小

            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead); // 将缓冲区的数据写入目标文件
            }

            System.out.println("文件复制成功。");
        } catch (IOException e) {
            System.out.println("复制文件时出现错误: " + e.getMessage());
        }
    }
}
