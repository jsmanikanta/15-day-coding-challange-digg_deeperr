import java.util.Stack;

public class lc1209 {
    public static String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                int newCount = countStack.pop() + 1;
                if (newCount == k) {
                    sb.delete(sb.length() - k + 1, sb.length());
                } else {
                    countStack.push(newCount);
                    sb.append(c);
                }
            } else {
                sb.append(c);
                countStack.push(1);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s= "abcd";
        int k=2;
        System.out.println(removeDuplicates(s, k));
    }
}
