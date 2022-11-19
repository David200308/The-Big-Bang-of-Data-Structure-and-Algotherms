public class BinaryTreeOnlyLeftOrRight {
    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insertLeft(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Node current = root;
        while(true) {
            if (current.left == null) {
                current.left = node;
                break;
            }
            current = current.left;
        }
    }

    public void insertRight(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Node current = root;
        while(true) {
            if (current.right == null) {
                current.right = node;
                break;
            }
            current = current.right;
        }
    }


    public void traversePreOrder() {
        traversePreOrder(root);
    }
    private void traversePreOrder (Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }
    private void traverseInOrder (Node root) {
        if (root == null) {
            return;
        }
        traverseInOrder(root.left);
        System.out.print(root.value + " ");
        traverseInOrder(root.right);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }
    private void traversePostOrder (Node root) {
        if (root == null) {
            return;
        }
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.print(root.value + " ");
    }

    public boolean find_for_left(int target) {
        Node current = root;
        while(current != null) {
            if (target != current.value) {
                current = current.left;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean find_for_right(int target) {
        Node current = root;
        while(current != null) {
            if (target != current.value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
