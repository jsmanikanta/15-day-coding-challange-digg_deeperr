public class lc2220 {
    public static int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;
        while (xor != 0) {
            count += xor & 1; 
            xor >>= 1; 
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(minBitFlips(10, 7));
    }
}
