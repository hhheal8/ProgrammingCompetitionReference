import java.util.HashMap;
import java.util.Stack;

public class App {

    public static boolean isValid(String val) {

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(Character c: val.toCharArray()) {

            switch(c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                break;

                case ')':
                case '}':
                case ']':
                    if(stack.isEmpty() || stack.pop() != map.get(c)) {
                        return false;
                    }
            }

        }

        return stack.isEmpty();

    }

    public static void main(String[] args) throws Exception {
        System.out.println(isValid("[()]"));
    }
}
