public class Main_BinaryTreeOnlyLeftOrRight {
    public static void main(String[] args) {
        System.out.println("Binary Tree:");

        BinaryTreeOnlyLeftOrRight binaryTree1 = new BinaryTreeOnlyLeftOrRight();
        binaryTree1.insertLeft(1);
        binaryTree1.insertLeft(2);
        binaryTree1.insertLeft(3);
        binaryTree1.insertLeft(4);
        binaryTree1.insertLeft(5);
        binaryTree1.insertLeft(6);
        binaryTree1.insertLeft(7);
        binaryTree1.insertLeft(8);
        System.out.println("Only Left Binary Tree Insert Done");

        BinaryTreeOnlyLeftOrRight binaryTree2 = new BinaryTreeOnlyLeftOrRight();
        binaryTree2.insertRight(1);
        binaryTree2.insertRight(2);
        binaryTree2.insertRight(3);
        binaryTree2.insertRight(4);
        binaryTree2.insertRight(5);
        binaryTree2.insertRight(6);
        binaryTree2.insertRight(7);
        binaryTree2.insertRight(8);
        System.out.println("Only Right Binary Tree Insert Done");

        System.out.println("Traverse Pre Order (for Only Left): ");
        binaryTree1.traversePreOrder();
        System.out.println();
        System.out.println("Traverse Pre Order (for Only Right): ");
        binaryTree2.traversePreOrder();
        System.out.println();

        System.out.println("Traverse In Order (for Only Left): ");
        binaryTree1.traverseInOrder();
        System.out.println();
        System.out.println("Traverse In Order (for Only Right): ");
        binaryTree2.traverseInOrder();
        System.out.println();

        System.out.println("Traverse Post Order (for Only Left): ");
        binaryTree1.traversePostOrder();
        System.out.println();
        System.out.println("Traverse Post Order (for Only Right): ");
        binaryTree2.traversePostOrder();
        System.out.println();

        int target = 6;
        System.out.println(binaryTree1.find_for_left(target));
        System.out.println(binaryTree2.find_for_right(target));
    }
}