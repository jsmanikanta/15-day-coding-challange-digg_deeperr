import java.util.Arrays;

public class lc455 {
    public  static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); 
        Arrays.sort(s);  
        int i = 0; 
        int j = 0; 
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
    public static void main(String[] args) {
        int [] s={1,1};
        int [] g={1,2,3};
        System.out.println(findContentChildren(g, s));
    }
}
