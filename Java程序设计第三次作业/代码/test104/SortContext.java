package test104;

public class SortContext {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sortArray(int[] array) {
        if (sortStrategy != null) {
            sortStrategy.sort(array);
        } else {
            System.out.println("No sort strategy set!");
        }
    }
}
