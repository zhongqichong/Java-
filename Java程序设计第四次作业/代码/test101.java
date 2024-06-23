import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class test101 {

    public static void fileCopy(String src,String dsc)
            throws Exception
    {
        DataInputStream dis=new DataInputStream(
                new FileInputStream(src)
        );
        DataOutputStream dos=new DataOutputStream(
                new FileOutputStream(dsc)
        );
        byte[] buf=new byte[4*1024*1024];
        int n;
        while( (n=dis.read(buf))!=-1 )
        {
            dos.write(buf,0,n);
        }
        dis.close();
        dos.close();

    }

    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        fileCopy("E:/待完成.txt","d:/adb_1.exe");
    }
}
