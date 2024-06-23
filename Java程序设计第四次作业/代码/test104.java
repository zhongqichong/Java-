import java.io.FileInputStream;
import java.io.IOException;

public class test104 {
    public static int byteArrayToInt(byte[] bytes, int offset) {
        return (bytes[offset + 3] & 0xFF) << 24 |
                (bytes[offset + 2] & 0xFF) << 16 |
                (bytes[offset + 1] & 0xFF) << 8 |
                (bytes[offset] & 0xFF);
    }

    public static short byteArrayToShort(byte[] bytes, int offset) {
        return (short) ((bytes[offset + 1] & 0xFF) << 8 | (bytes[offset] & 0xFF));
    }

    public static void main(String[] args) throws Exception {
        String filePath = "d:/test.bmp";
        FileInputStream fin = new FileInputStream(filePath);

        byte[] fileHeader = new byte[14];
        fin.read(fileHeader);

        short bfType = byteArrayToShort(fileHeader, 0);
        System.out.println("bfType：" + bfType);

        int bfSize = byteArrayToInt(fileHeader, 2);
        System.out.println("bfSize：" + bfSize);

        short bfReserved1 = byteArrayToShort(fileHeader, 6);
        System.out.println("bfReserved1：" + bfReserved1);

        short bfReserved2 = byteArrayToShort(fileHeader, 8);
        System.out.println("bfReserved2：" + bfReserved2);

        int bfOffBits = byteArrayToInt(fileHeader, 10);
        System.out.println("bfOffBits：" + bfOffBits);

        byte[] bitmapInfoHeader = new byte[40];
        fin.read(bitmapInfoHeader);

        int biSize = byteArrayToInt(bitmapInfoHeader, 0);
        System.out.println("biSize：" + biSize);

        int biWidth = byteArrayToInt(bitmapInfoHeader, 4);
        System.out.println("biWidth：" + biWidth);

        int bfHeight = byteArrayToInt(bitmapInfoHeader, 8);
        System.out.println("bfHeight：" + bfHeight);

        short bfPlanes = byteArrayToShort(bitmapInfoHeader, 12);
        System.out.println("bfPlanes：" + bfPlanes);

        short bfBitcount = byteArrayToShort(bitmapInfoHeader, 14);
        System.out.println("bfBitcount：" + bfBitcount);

        int bfCompression = byteArrayToInt(bitmapInfoHeader, 16);
        System.out.println("bfCompression：" + bfCompression);

        int bfSizeImage = byteArrayToInt(bitmapInfoHeader, 20);
        System.out.println("bfSizeImage：" + bfSizeImage);

        int bfXPelsPerMeter = byteArrayToInt(bitmapInfoHeader, 24);
        System.out.println("bfXPelsPerMeter：" + bfXPelsPerMeter);

        int bfYPelsPerMeter = byteArrayToInt(bitmapInfoHeader, 28);
        System.out.println("bfYPelsPerMeter：" + bfYPelsPerMeter);

        int bfClrused = byteArrayToInt(bitmapInfoHeader, 32);
        System.out.println("bfClrused：" + bfClrused);

        int bfClrImportant = byteArrayToInt(bitmapInfoHeader, 36);
        System.out.println("bfClrImportant：" + bfClrImportant);

        fin.close();
    }
}