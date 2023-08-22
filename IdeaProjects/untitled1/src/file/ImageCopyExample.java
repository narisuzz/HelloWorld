package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;

public class ImageCopyExample {
    public static void main(String[] args) {
        String sourceFile = "/Users/su/Downloads/123.png";
        String destinationFile = "/Users/su/Downloads321.png";

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int bytesRead;

            // 读取源文件的字节数据，并写入目标文件
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            // 关闭流
            fis.close();
            fos.close();

            System.out.println("图片拷贝完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
   // 用  ObjectOutputputStream序列化和反序列化   写一段代码 并加上中文注释