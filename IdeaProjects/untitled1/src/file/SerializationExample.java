package file;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        // 创建一个要序列化的对象
        Person person = new Person("哪吒", 30);

        // 序列化对象到文件
        serializeObject(person, "person.ser");

        // 从文件中反序列化对象
        Person deserializedPerson = deserializeObject("person.ser");

        // 打印反序列化后的对象
        System.out.println("Deserialized Person:");
        System.out.println("Name: " + deserializedPerson.getName());
        System.out.println("Age: " + deserializedPerson.getAge());
    }

    // 序列化对象到文件
    public static void serializeObject(Object object, String filename) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // 写入对象到输出流
            objectOutputStream.writeObject(object);

            // 关闭流
            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 从文件中反序列化对象
    public static Person deserializeObject(String filename) {
        Person deserializedPerson = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // 从输入流中读取对象
            deserializedPerson = (Person) objectInputStream.readObject();

            // 关闭流
            objectInputStream.close();
            fileInputStream.close();

            System.out.println("Object deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return deserializedPerson;
    }
}

// 可序列化的 Person 类
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
