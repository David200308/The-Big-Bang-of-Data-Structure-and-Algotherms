public class Heaps {
    private int[] items = new int[10];
    private int size;

    public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        items[size++] = value;
        bubbleUp();
    }

    public boolean isFull() {
        return size == items.length;
    }

    private void bubbleUp() {
        int index = size - 1;
        while (index > 0 && items[index] > items[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        var root = items[0];
        items[0] = items[--size];
        int index = 0;
        if (index <= size) {
            while (!isValidParent(index)) {
                int largerIndex = largeIndex(index);
                swap(index, largerIndex);
                index = largerIndex;
            }
        }
        return root;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int largeIndex(int index) {
        if (!hasLeft(index)) {
            return index;
        }
        if (!hasRight(index)) {
            return leftIndex(index);
        }

        return left(index) > right(index) ? leftIndex(index) : rightIndex(index);
    }

    private boolean hasLeft(int index) {
        return leftIndex(index) <= size;
    }

    private boolean hasRight(int index) {
        return rightIndex(index) <= size;
    }

    private boolean isValidParent(int index) {
        if (!hasLeft(index)) {
            return true;
        }

        var isValid = items[index] >= left(index);

        if (!hasRight(index)) {
            return isValid &= items[index] >= right(index);
        }

        return isValid;
    }

    private int left(int index) {
        return items[leftIndex(index)];
    }

    private int right(int index) {
        return items[rightIndex(index)];
    }

    private int leftIndex(int index) {
        return index * 2 + 1;
    }

    private int rightIndex(int index) {
        return index * 2 + 2;
    }

}
