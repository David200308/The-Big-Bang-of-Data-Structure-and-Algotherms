import java.util.ArrayList;
import java.util.Arrays;

public class Expressions {
    public boolean isBalance(String input) {
        Stack stack = new Stack();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }

            if (isRightBracket(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                var top = stack.pop();
                if (!bracketsMatch((char) top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{' || ch == '<';
    }

    private boolean isRightBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}' || ch == '>';
    }

    private boolean bracketsMatch(char left, char right) {
        return (left == ')' && right != '(') || (left == '}' && right != '{') || (left == ']' && right != '[') || (left == '>' && right != '<');
    }
}
