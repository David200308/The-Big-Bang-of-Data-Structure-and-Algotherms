public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Tree:");

        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println("-------------------");
        System.out.println("Tree Insert Done");

        System.out.println("-------------------");
        int num = 4;
        System.out.println("Find " + num + " in Tree: " + tree.find(num));

        System.out.println("-------------------");
        System.out.println("Traverse Pre Order");
        tree.traversePreOrder();

        System.out.println();
        System.out.println("Traverse In Order");
        tree.traverseInOrder();

        System.out.println();
        System.out.println("Traverse Post Order");
        tree.traversePostOrder();

        System.out.println();
        System.out.println("Traverse Level Order");
        tree.traverseLevelOrder();

        System.out.println("-------------------");
        System.out.println("Height: " + tree.height());

        System.out.println("-------------------");
        System.out.println("Minimum Value: " + tree.minimum());

        System.out.println("-------------------");
        System.out.println("Maximum Value: " + tree.maximum());

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);

        System.out.println("-------------------");
        System.out.println("Equality Checking(compare tree & tree2): " + tree.equals(tree2));

        System.out.println("-------------------");
        System.out.println("Validating Binary Search Trees: " + tree.isBinarySearchTree());
        tree.swapRoot();
        System.out.println("Validating Binary Search Trees (after swap): " + tree.isBinarySearchTree());

        System.out.println("-------------------");
        System.out.println("Nodes at K Distance: ");
        var list = tree.getNodesAtDistance(1);
        for (var item : list) {
            System.out.print(item + " ");
        }



//        Recursion recursion = new Recursion();
//        System.out.println(recursion.factorial(4));

    }
}
