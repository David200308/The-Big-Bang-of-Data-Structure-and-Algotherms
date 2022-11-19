public class MinHeap {
    public static void heapify(int[] array) {
        var lastParentIndex = array.length / 2 - 1;
        for (int i = lastParentIndex; i >= 0; i--) {
            heapify(array, i);
        }
    }

    private static void heapify(int[] array, int index) {
        int minIndex = index;
        int leftIndex = index * 2 + 1;
        int rightIndex = index * 2 + 2;

        if (leftIndex < array.length && array[leftIndex] < array[minIndex]) {
            minIndex = leftIndex;
        }

        if (rightIndex < array.length && array[rightIndex] < array[minIndex]) {
            minIndex = rightIndex;
        }

        if (index == minIndex) {
            return;
        }

        swap(array, index, minIndex);

        heapify(array, minIndex);
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int getKthSmallest(int[] array, int k) {
        if (k < 1 || k > array.length) {
            throw new IllegalArgumentException();
        }

        var heap = new Heaps();
        for (var number : array) {
            heap.insert(number);
        }
        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }
        return array[k - 1];
    }
}
