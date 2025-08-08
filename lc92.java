class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;
    }
}
public class lc92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || right==left){
            return head;
        }
        ListNode temp = new ListNode(0); 
        temp.next = head;
        ListNode prev = temp;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        ListNode next = null;
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return temp.next;
    }
}
