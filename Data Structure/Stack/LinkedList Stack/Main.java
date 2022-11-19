public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Size: " + stack.size());
        System.out.println();

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println();

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println();

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println();

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println();

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println();

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println();

        System.out.println("Is Empty? - " + stack.isEmpty());

    }



}
