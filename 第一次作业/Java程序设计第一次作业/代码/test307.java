import java.util.Scanner;
public class test307 {
    public static void main(String[] args){
        for(int i=20;i>0;i--){
            for(int j=i-1;j>0;j--){
                for(int k=j-1;k>0;k--){
                    for(int l=k-1;l>0;l--){
                        if(1.0/i+1.0/j+1.0/k+1.0/l==1)
                            System.out.println(i + " " + j +" " +k + " " +l);
                    }
                }
            }
        }
    }
}
