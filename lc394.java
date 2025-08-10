import java.util.Stack;

public class lc394 {
    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                counts.push(k);
                resultStack.push(currentString);
                k = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {
                int repeatTimes = counts.pop();
                StringBuilder decodedString = resultStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
