import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 7, 3, 1, 4, 6, 2, 3 };
        var bsort = new bubbleSort();
        bsort.sort(numbers);
        System.out.println("Bubble Sort: " + Arrays.toString(numbers));

        int[] numbers1 = { 7, 3, 1, 4, 6, 2, 3 };
        var ssort = new selectionSort();
        ssort.sort(numbers1);
        System.out.println("Selection Sort: " + Arrays.toString(numbers1));

        int[] numbers2 = { 7, 3, 1, 4, 6, 2, 3 };
        var isort = new insertionSort();
        isort.sort(numbers2);
        System.out.println("Insertion Sort: " + Arrays.toString(numbers2));

        int[] numbers3 = { 7, 3, 1, 4, 6, 2, 3 };
        var msort = new mergeSort(); // O(n log n)
        msort.sort(numbers3);
        System.out.println("Merge Sort: " + Arrays.toString(numbers3));

        int[] numbers4 = { 7, 3, 1, 4, 6, 2, 3 };
        var qsort = new quickSort();
        qsort.sort(numbers4);
        System.out.println("Quick Sort: " + Arrays.toString(numbers4));

        int[] numbers5 = { 7, 3, 1, 4, 6, 2, 3 };
        var csort = new countingSort();
        csort.sort(numbers5, 7);
        System.out.println("Counting Sort: " + Arrays.toString(numbers5));

        int[] numbers6 = { 7, 3, 1, 4, 6, 2, 3 };
        var bucketsort = new bucketSort();
        bucketsort.sort(numbers6, 3);
        System.out.println("Counting Sort: " + Arrays.toString(numbers6));
    }
}
