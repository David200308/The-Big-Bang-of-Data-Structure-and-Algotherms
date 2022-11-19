public class Main {
    public static void main(String[] arg) {
        QueueStack queue_stack = new QueueStack();
        queue_stack.push(10);
        queue_stack.push(20);
        queue_stack.push(30);
        System.out.println(queue_stack.top());
        System.out.println(queue_stack.toString());
        queue_stack.pop();
        System.out.println(queue_stack.toString());
    }
}
