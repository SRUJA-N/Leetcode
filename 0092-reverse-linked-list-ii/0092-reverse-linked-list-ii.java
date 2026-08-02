/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
   
        if(left==right || head==null){
            return head;
        }
         ListNode dummy = new ListNode(0);
        dummy.next = head;

       ListNode before=dummy;
        for(int i=0;i<left-1;i++)
        {
            before =before.next;
        }
        ListNode b=before;
        ListNode st=before.next;
         ListNode stt=before.next;
        ListNode prev=null;

        for(int i=0;i<right-left+1;i++){
            ListNode nextNode=st.next;
            st.next=prev;
            prev=st;
            st=nextNode;
        }
        b.next=prev;
        stt.next=st;
        return dummy.next;

    }
}