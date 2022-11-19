import java.util.ArrayList;

// Binary Search Tree
public class Tree {
    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while(true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = node;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while(current != null) {
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value){
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null) {
            return;
        }

        traversePreOrder(root.left);
        System.out.println(root.value);
        traversePreOrder(root.right);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null) {
            return;
        }

        traversePreOrder(root.left);
        traversePreOrder(root.right);
        System.out.println(root.value);
    }

    public void traverseLevelOrder() {
        for (var i = 0; i <= height(); i++) {
            var list = getNodesAtDistance(i);
            for (var value : list) {
                System.out.println(value);
            }
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }

        if (isLeaf(root)) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int minimum() {
        return minimum(root);
    }

    private boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    private int minimum(Node root) {
        if (root == null) {
            return -1;
        }
        if (isLeaf(root)) {
            return root.value;
        }

        var left = minimum(root.left);
        var right = minimum(root.right);

        return Math.min(Math.min(left, right), root.value);
    }

    public int maximum() {
        return maximum(root);
    }

    private int maximum(Node root) {
        if (root == null) {
            return -1;
        }
        if (isLeaf(root)) {
            return root.value;
        }

        var left = maximum(root.left);
        var right = maximum(root.right);

        return Math.max(Math.max(left, right), root.value);
    }

    public boolean equals(Tree other) {
        if (other == null) {
            return false;
        }
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null) {
            return true;
        }

        if (first != null && second != null) {
            return first.value == second.value && equals(first.left, second.left) && equals(first.right, second.right);
        }
        return false;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.value < min || root.value > max) {
            return false;
        }

        return isBinarySearchTree(root.left, min, root.value - 1) && isBinarySearchTree(root.right, root.value + 1, max);
    }

    public void swapRoot() {
        var temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public ArrayList<Integer> getNodesAtDistance(int distance) {
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node root, int distance, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        if (distance == 0) {
            list.add(root.value);
            return;
        }

        getNodesAtDistance(root.left, distance - 1, list);
        getNodesAtDistance(root.right, distance - 1, list);
    }

}
