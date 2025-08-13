import java.util.ArrayList;

public class lc234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        return helper(al);
    }
    public boolean helper(ArrayList<Integer> al){
        int i=0;
        int j=al.size()-1;
        while(i<j){
            if(al.get(i)!=al.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
