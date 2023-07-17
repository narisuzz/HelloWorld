package file;

import java.io.*;

public class File_ {
    public static void main(String[] args) {
        String sourceFilePath = "";
        String targetFilePath = "";

        // 使用字节流读取并写入文件
        try (InputStream inputStream = new FileInputStream(sourceFilePath);
             OutputStream outputStream = new FileOutputStream(targetFilePath)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 使用字符流读取并写入文件
        try (Reader reader = new FileReader(sourceFilePath);
             Writer writer = new FileWriter(targetFilePath)) {

            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
