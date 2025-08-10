import java.util.Stack;

public class lc71 {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(part);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }
        return simplifiedPath.toString();
    }
    public static void main(String[] args) {
        String path = "/home/";
        System.out.println(simplifyPath(path));
    }
}
