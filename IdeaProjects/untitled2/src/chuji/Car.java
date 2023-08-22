package chuji;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Car类实现Serializable接口，表示该类可以被序列化
public class Car implements Serializable {
    private String make; // 车型
    private int year; // 生产年份
    private static final long serialVersionUID = 1L; // 序列化版本号，用于兼容性检查

    // 构造函数，用于创建Car对象
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // toString()方法，返回Car对象的字符串表示
    public String toString() {
        return String.format("Car make is: %s, Car year is: %d", this.make, this.year);
    }

    // 主方法
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // 创建两个Car对象：toyota和honda
        Car toyota = new Car("Toyota", 2021);
        Car honda = new Car("Honda", 2020);

        // 创建文件输出流和对象输出流，将toyota和honda对象序列化到文件"cars.txt"中
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);
        objectOutputStream.close(); // 关闭对象输出流

        // 创建文件输入流和对象输入流，从文件"cars.txt"中反序列化对象
        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // 分别读取两个Car对象的副本
        Car toyotaCopy = (Car) objectInputStream.readObject();
        Car hondaCopy = (Car) objectInputStream.readObject();
        objectInputStream.close(); // 关闭对象输入流

        // 检查是否为同一个对象
        boolean isSameObject = toyotaCopy == toyota;

        // 打印输出结果
        System.out.println("Toyota (Copy) - " + toyotaCopy);
        System.out.println("Toyota (Original) - " + toyota);
        System.out.println("Is same object: " + isSameObject);
    }
}
