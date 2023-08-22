package standerd;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","adc111");

        //将 k-V 存储到文件中即可
        try {
            properties.store(new FileOutputStream("/Users/su/Downloads/"),null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("保存成功");
    }
}
