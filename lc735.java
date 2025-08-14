import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class lc735 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int top = stack.peek();
                if (Math.abs(top) < Math.abs(asteroid)) {
                    stack.pop(); 
                } else if (Math.abs(top) == Math.abs(asteroid)) {
                    stack.pop(); 
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; 
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;  
 
    }
    public static void main(String[] args) {
    int [] asteroids = {5,10,-5};
    String str=Arrays.toString(asteroidCollision(asteroids));
    System.out.println(str);
    }
}
