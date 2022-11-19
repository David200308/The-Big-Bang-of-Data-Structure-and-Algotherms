public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addFirst(0);

        System.out.println(ll.size());

        var list = ll.toArray();
        System.out.print("Data: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();

        System.out.println(ll.indexOf(30));
        System.out.println(ll.contains(30));

        ll.removeFirst();
        System.out.println(ll.contains(0));

        ll.removeLast();
        System.out.println(ll.contains(40));

        System.out.println(ll.size());

        var list1 = ll.toArray();
        System.out.print("Data: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(list1[i] + " ");
        }
    }
}
