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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        
       
        while(fast!=null && fast.next!=null){
            slow=slow.next;
        
            fast=fast.next.next;
        }
        ListNode reversed=reverse(slow.next);
        slow=head;
        while(reversed != null){
            if(reversed.val != slow.val){
                return false;
            }
            reversed=reversed.next;
            slow=slow.next;
        }
        
        return true;

    }

    public ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        return prev;
        

    }
}