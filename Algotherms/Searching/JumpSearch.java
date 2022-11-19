public class JumpSearch {
    public int search(int[] array, int target) {
        int blocksize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blocksize;

        while (start < array.length && array[next - 1] < target) {
            start = next;
            next += blocksize;

            if (next > array.length) {
                next = array.length;
            }
        }

        for (var i = start; i < next; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
