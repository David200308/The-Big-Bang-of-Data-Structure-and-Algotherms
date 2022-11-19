import java.util.*;

public class BST {
    private class Node {
        private Node left;
        private Node right;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = node;
                    break;
                }
                current = current.left;
            }

            if (value > current.value) {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }
    }

    public boolean find(int value) {
        Node node = new Node(value);
        var current = root;

        while(current != null) {
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else if (value == root.value) {
                return true;
            } else {
                return true;
            }
        }
        return false;
    }
    int res;

    public int findKthMinValue(int k) {
        return findKthMinValue(root, k);
    }

    private int findKthMinValue(Node root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return -1;
        }
        if (k > BST_high() + 1) {
            return -1;
        }
        list = traversalInOrder(root);
        return list.get(k - 1);
    }

    public int findKthMaxValue(int k) {
        return findKthMaxValue(root, k);
    }

    private int findKthMaxValue(Node root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return -1;
        }
        if (k > BST_high() + 1) {
            return -1;
        }
        list = traversalInOrder(root);
        return list.get(list.size() - k);
    }


    private List<Integer> traversalInOrder(Node root) {
        List<Integer> list = new ArrayList<Integer>();

        if (root == null) {
            return list;
        }

        list.addAll(traversalInOrder(root.left));
        list.add(root.value);
        list.addAll(traversalInOrder(root.right));

        return list;
    }

    public int BST_high() {
        return BST_high(root);
    }
    private int BST_high(Node root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }

        return 1 + Math.max(BST_high(root.left), BST_high(root.right));
    }

}

















