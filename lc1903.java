public class lc1903 {
    public static String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String num="52";
        System.out.println(largestOddNumber(num));
    }
}