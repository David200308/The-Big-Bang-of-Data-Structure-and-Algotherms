public class Main {
    public static void main(String[] arg) {
        String str = "abcd";
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);
        System.out.println(result);

        String str1 = "(1 + 2)";
        Expressions exp = new Expressions(); // to make sure the lastest character is add or correct
        var result1 = exp.isBalance(str1);
        System.out.println(result1);


        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());


    }
}
