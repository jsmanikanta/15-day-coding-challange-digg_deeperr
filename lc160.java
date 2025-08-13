public class lc160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode tempa=headA;
        ListNode tempb=headB;
        while(tempa!=tempb){
           if (tempa == null) {
            tempa = headB;
            } else {
                tempa = tempa.next;
            }
            if (tempb == null) {
            tempb = headA;
            } else {
                tempb = tempb.next;
            }
        }
        return tempa;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
       next = null;
    }
}
