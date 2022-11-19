import java.util.Stack;

public class StackQueue {
    Stack<Integer> stack_1 = new Stack<Integer>();
    Stack<Integer> stack_2 = new Stack<Integer>();

    public void enqueue(int item) {
        while (!stack_1.isEmpty()) {
            stack_2.push(stack_1.pop());
        }

        stack_1.push(item);

        while (!stack_2.isEmpty()) {
            stack_1.push(stack_2.pop());
        }
    }

    public int dequeue() {
        int x = stack_1.peek();
        stack_1.pop();
        return x;
    }

    public String toString() {
        return stack_1.toString();
    }
}
