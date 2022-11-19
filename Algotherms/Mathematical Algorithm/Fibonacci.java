public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int[] fibonacci = new int[n];
        fibonacci = fibonacci(n);

        for (var fibo : fibonacci) {
            System.out.print(fibo + " ");
        }
    }

    public static int[] fibonacci(int n) {
        int[] fibonacci = new int[n];
        int firstItem = 0;
        int secondItem = 1;
        System.out.println("Fibonacci for " + n + " terms: ");

        for (int i = 0; i < n; i++) {
            fibonacci[i] = firstItem;

            int nextTerm = firstItem + secondItem;
            firstItem = secondItem;
            secondItem = nextTerm;
        }
        return fibonacci;
    }
}