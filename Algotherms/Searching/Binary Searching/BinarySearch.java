public class BinarySearch {

    public int RecursiveBinarySearch(int[] array, int target) {
        return RecursiveBinarySearch(array, target, 0, array.length - 1);
    }

    public int RecursiveBinarySearch(int[] array, int target, int left, int right) {

        if (right < left) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == target) {
            return middle;
        }

        if (target < array[middle]) {
            return RecursiveBinarySearch(array, target, left, middle - 1);
        }

        return RecursiveBinarySearch(array, target, middle + 1, right);
    }

    public int IterativeBinarySearch(int[] array, int target) {
        var left = 0;
        var right = array.length - 1;

        while (left <= right) {
            var middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (target < array[middle]) {
                return middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
