package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        // 定义文件路径
        String filePath = "/Users/su/Downloads/output.txt";

        // 创建 BufferedReader 对象
        BufferedReader reader = null;

        try {
            // 打开文件进行读取
            reader = new BufferedReader(new FileReader(filePath));

            // 逐行读取文件内容
            String line;
            while ((line = reader.readLine()) != null) {
                // 处理每行文件内容
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在 finally 块中关闭 BufferedReader，确保始终关闭
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
