import java.util.Scanner;
public class test03 {
    public static void main(String[] args) {
        byte b1 = (byte) 0xaa; // 示例数值，你可以替换成实际数值
        byte b2 = (byte) 0xbb;
        byte b3 = (byte) 0xcc;
        byte b4 = (byte) 0xdd;

        int i = ((b4<<24)|(b3<<16)|(b2<<8)|(b1));
        System.out.println("拼接后的int值为：" + i);
    }
}
