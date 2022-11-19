import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 10, 1, 4, 2};
        var heap = new Heaps();
        for (var number : numbers) {
            heap.insert(number);
        }
        System.out.println("From Big to Small: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = heap.remove();
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        int[] numbers1 = {5, 3, 10, 1, 4, 2};
        var heap1 = new Heaps();
        for (var number1 : numbers1) {
            heap1.insert(number1);
        }
        System.out.println("From Small to Big: ");
        for (int i = numbers1.length - 1; i >= 0; i--) {
            numbers1[i] = heap1.remove();
        }
        System.out.println(Arrays.toString(numbers1));
    }
}
