public class lc227 {
    public static int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        int len = s.length();
        int currentNumber = 0;
        char operation = '+'; 
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }
            if ((!Character.isDigit(currentChar) && currentChar != ' ') || i == len - 1) {
                switch (operation) {
                    case '+':
                        stack.push(currentNumber);
                        break;
                    case '-':
                        stack.push(-currentNumber);
                        break;
                    case '*':
                        stack.push(stack.pop() * currentNumber);
                        break;
                    case '/':
                        int top = stack.pop();
                        stack.push(top / currentNumber);
                        break;
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        int result = 0;
        for (int num : stack) {
            result += num;
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s));
    }
}