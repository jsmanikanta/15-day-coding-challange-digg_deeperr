public class lc28 {
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            String str=haystack.substring(i,i+needle.length());
            if(str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}
