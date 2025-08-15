public class lc231 {
    public static boolean isPowerOfTwo(int n) {
      if((n&n-1)==0 && n>0){
          return true;
      }   
        return false;  
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
}
