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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int length=1;
        ListNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
            length+=1;
        }
         k=k%length;
        if(k==0){
            return head;
        }
 ListNode last=head;
        for(int i=0;i<k;i++){
            ListNode prev=null;
             last=head;
            while(last.next!=null){
                prev=last;
                last=last.next;
                
            }
            last.next=head;
            prev.next=null;
            head=last;
        }

        return last;
    }
}