public class lc125 {
    public static  boolean isPalindrome(String s) {
        if((s==null||s.length()==0)){
            return true;
        }
        s=s.toLowerCase();
        int l=0,r=s.length()-1;
        while(l<r){
            char lc=s.charAt(l);
            char rc=s.charAt(r);
            if(!Character.isLetterOrDigit(lc)){
                l++;
            } else if (!Character.isLetterOrDigit(rc)){
                r--;
            } else if(lc!=rc){
                return false;
            } else{
                l++;
                r--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    } 
}
