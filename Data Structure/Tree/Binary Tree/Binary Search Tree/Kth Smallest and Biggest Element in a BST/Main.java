public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(7);
        bst.insert(3);
        bst.insert(9);
        bst.insert(2);
        bst.insert(5);
        bst.insert(1);
        bst.insert(4);
        bst.insert(8);
        bst.insert(13);

        System.out.println("BST Insert Done");

        int target = 2;
        System.out.println("Search " + target + ": " + bst.find(target));

        System.out.println("BST High: " + bst.BST_high());

        int k_min = 1;
        System.out.println("BST Min Value (Using Traversal): " + bst.findKthMinValue(k_min));

        int k_max = 2;
        System.out.println("BST Max Value (Using Traversal): " + bst.findKthMaxValue(k_max));
    }
}
