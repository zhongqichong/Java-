package test119;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String filename = "e:/test.txt";

        // 生成10个复数对象
        List<Complex> complexList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            complexList.add(new Complex(i, i + 1));
        }

        // 将复数对象序列化写入文件
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(complexList);
            System.out.println("10个复数对象已写入到文件：" + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 从文件中读入复数对象
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<Complex> deserializedComplexList = (List<Complex>) ois.readObject();
            System.out.println("从文件中读入的复数对象：");
            for (Complex complex : deserializedComplexList) {
                System.out.println(complex);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
