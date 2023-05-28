package HomeWork2;

public class Task2Main {
    public static void main(String[] args) {
        System.out.println("\nTask2");
        BubbleSort SortedArray = new BubbleSort();
        int[] randomNumsArray = SortedArray.createArray(10);
        System.out.println("Before sorting: ");
        SortedArray.printArray(randomNumsArray);
        SortedArray.sortArray(randomNumsArray);
        System.out.println("After sorting: ");
        SortedArray.printArray(randomNumsArray);
    }
}
