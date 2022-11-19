public class LinearSearch {
    public int search(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                break;
            }
            count++;
        }
        return count;
    }

}
