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
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev;
        if(fast==null){
         rev=reverse(slow);
        }else{
        rev=reverse(slow.next);
        }
        ListNode first=head;
        while(rev!=null){
            if(first.val != rev.val){
                return false;
            }
            first=first.next;
            rev=rev.next;
        }
        return true;
        
    }
    public ListNode reverse(ListNode cur){
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