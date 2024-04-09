import static java.lang.Math.sqrt;

public class test302 {
    public static void main(String[] args){
        for(int i=0;i<sqrt(9999);i++)
        {
            if(if_aabb(i*i))
                System.out.print(i+" ");
        }
    }

    public static boolean if_aabb(int i)
    {
        if(i<1000)
            return false;
        int a=i/1000;
        int aa=(i%1000)/100;
        int aab=(i%100)/10;
        int aabb=(i%10);
        if(a==aa&&aab==aabb)
            return true;
        else
            return false;
    }
}
//1234