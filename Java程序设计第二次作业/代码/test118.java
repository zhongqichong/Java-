public class test118 {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9,0};
        System.out.print("数组转置前：");
        print_arr(a);
        reverse(a);
        System.out.print("数组转置后：");
        print_arr(a);
    }

    public static void reverse(int a[]){
        for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
    }
    public static void print_arr(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
