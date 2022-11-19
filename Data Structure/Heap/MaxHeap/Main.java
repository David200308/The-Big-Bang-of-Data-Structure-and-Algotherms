import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 1, 2};
        MaxHeap maxheap = new MaxHeap();
        maxheap.heapify(numbers);
        System.out.println(Arrays.toString(numbers));
        int k_max = 2;
        System.out.println(maxheap.getKthLargest(numbers, k_max));
    }
}