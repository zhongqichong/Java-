package test104;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        SortContext context = new SortContext();

        int[] array = {5, 2, 9, 1, 5, 6};

        // 使用冒泡排序
        context.setSortStrategy(new BubbleSort());
        context.sortArray(array);
        System.out.println("Bubble Sorted: " + Arrays.toString(array));

        // 使用选择排序
        context.setSortStrategy(new SelectionSort());
        array = new int[]{5, 2, 9, 1, 5, 6};  // 重置数组
        context.sortArray(array);
        System.out.println("Selection Sorted: " + Arrays.toString(array));

        // 使用插入排序
        context.setSortStrategy(new InsertionSort());
        array = new int[]{5, 2, 9, 1, 5, 6};  // 重置数组
        context.sortArray(array);
        System.out.println("Insertion Sorted: " + Arrays.toString(array));
    }
}
