public class lc1544 {
    public static String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            int size = stack.length();
            if (size > 0 && Math.abs(stack.charAt(size - 1) - c) == 32) {
                stack.deleteCharAt(size - 1); // Remove the last character
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}
