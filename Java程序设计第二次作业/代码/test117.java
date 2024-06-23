import java.util.Scanner;
public class test117 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要寻找的数值：");
        int target=scan.nextInt();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("数组内容是：");
        arr_print(arr);
        System.out.print("该数值在中的下标是：" + search(arr,target));

    }
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void arr_print(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
