package standerd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
            // 从文件加载属性
            properties.load(fileInputStream);

            // 读取配置项的值
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            int port = Integer.parseInt(properties.getProperty("port"));

            // 打印读取的配置项
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Port: " + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
