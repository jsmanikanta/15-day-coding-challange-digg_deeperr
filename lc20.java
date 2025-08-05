import java.util.Stack;

public class lc20 {
    public static boolean isValid(String str) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(s.isEmpty()){
                s.push(curr);
            } else{
                char frmstack=s.peek();// removed element
                if( curr==')'&&frmstack=='(' ||
                    curr==']'&&frmstack=='['||
                   curr=='}'&&frmstack=='{'
                  ) {
                    s.pop();
                } else{
                    s.push(curr);
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
