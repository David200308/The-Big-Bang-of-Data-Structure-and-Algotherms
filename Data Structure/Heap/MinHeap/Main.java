import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {5, 3, 8, 4, 1, 2};
        MinHeap minheap = new MinHeap();
        minheap.heapify(numbers1);
        System.out.println(Arrays.toString(numbers1));
        int k_min = 1;
        System.out.println(minheap.getKthSmallest(numbers1, k_min));
    }
}