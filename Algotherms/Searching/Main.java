public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Searching: ");
        LinearSearch lsearch = new LinearSearch();
        int[] numbers = { 7, 3, 1, 4, 6, 2 };
        int target = 3;
        var Index= lsearch.search(numbers, target);
        System.out.println("Index of " + target + ": " + Index);

        System.out.println();
        System.out.println("Binary Searching (Recursive): "); // O(log n) (Binary Search only search for sorted items)
        BinarySearch bsearch = new BinarySearch();
        int[] numbers1 = { 1, 2, 3, 4, 5, 6 };
        int target1 = 3;
        var Index1 = bsearch.RecursiveBinarySearch(numbers1, target1);
        System.out.println("Index of " + target1 + ": " + Index1);

        System.out.println();
        System.out.println("Binary Searching (Iterative): "); // O(log n) (Binary Search only search for sorted items)
        BinarySearch bsearch1 = new BinarySearch();
        int[] numbers2 = { 1, 2, 3, 4, 5, 6 };
        int target2 = 3;
        var Index2 = bsearch1.IterativeBinarySearch(numbers2, target2);
        System.out.println("Index of " + target2 + ": " + Index2);

        System.out.println();
        System.out.println("Ternary Searching: ");
        TernarySearch tsearch = new TernarySearch();
        int[] numbers3 = { 7, 3, 1, 4, 6, 2 };
        int target3 = 3;
        var Index3 = tsearch.search(numbers3, target3);
        System.out.println("Index of " + target3 + ": " + Index3);

        System.out.println();
        System.out.println("Jump Searching: ");
        JumpSearch jsearch = new JumpSearch();
        int[] numbers4 = { 7, 3, 1, 4, 6, 2 };
        int target4 = 3;
        var Index4 = jsearch.search(numbers4, target4);
        System.out.println("Index of " + target4 + ": " + Index4);

        System.out.println();
        System.out.println("Exponential Searching: ");
        ExponentialSearch esearch = new ExponentialSearch();
        int[] numbers5 = { 1, 2, 3, 4, 5, 6 };
        int target5 = 3;
        var Index5 = esearch.search(numbers5, target5);
        System.out.println("Index of " + target5 + ": " + Index5);
    }
}
