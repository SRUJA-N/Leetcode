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
        
    
       ListNode end=head;
        for(int i=0;i<length-k-1;i++){
            
            end=end.next;
        }
           ListNode last=end.next;
        end.next=null;
        cur.next=head;

        return last;
    }
}