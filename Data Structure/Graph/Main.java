public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
//        graph.addNode("David");
//        graph.addNode("Tommy");
//        graph.addNode("Tom");
//        graph.addNode("Stone");
//        graph.addNode("Max");
//        graph.addEdge("David", "Tommy");
//        graph.addEdge("Max", "David");
//        graph.addEdge("Tom", "Stone");
//        graph.addEdge("Stone", "Tom");
//        graph.addEdge("Tommy", "Max");
//        graph.print();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");
        graph.addEdge("A", "D");
        graph.print();
//        System.out.println();
//        graph.removeEdge("B", "C");
//        graph.print();
//        System.out.println();
//        graph.removeNode("C");
//        graph.print();

        System.out.println("---------------------------------");

        System.out.println("Traverse Depth First (Recursive):");
        graph.traverseDepthFirst_Recursive("A");

        System.out.println();
        System.out.println("---------------------------------");

        System.out.println("Traverse Depth First (Iterative):");
        graph.traverseDepthFirst_Iterative("A");

        System.out.println();
        System.out.println("---------------------------------");

        System.out.println("Traverse Breadth First:");
        graph.traverseDepthFirst("A");

        System.out.println();
        System.out.println("---------------------------------");

        Graph graph1 = new Graph();
        graph1.addNode("X");
        graph1.addNode("A");
        graph1.addNode("B");
        graph1.addNode("P");
        graph1.addEdge("X", "A");
        graph1.addEdge("X", "B");
        graph1.addEdge("A", "P");
        graph1.addEdge("B", "P");

        System.out.println("Topological Sorting:");
        var list = graph1.topologicalSorting();
        System.out.println(list);

        System.out.println("---------------------------------");

        Graph graph2 = new Graph();
        graph2.addNode("A");
        graph2.addNode("B");
        graph2.addNode("C");
        graph2.addNode("D");
        graph2.addEdge("A", "B");
        graph2.addEdge("B", "C");
        graph2.addEdge("C", "A");
        graph2.addEdge("A", "D");
        System.out.println("Has Cycle? - " + graph2.hasCycle());

    }
}
