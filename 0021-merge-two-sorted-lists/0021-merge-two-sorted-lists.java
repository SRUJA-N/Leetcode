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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode left=list1;
        ListNode  right=list2;
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        while(left!=null && right!=null){
           if(left.val>=right.val){
           
             res.next=right;
             
              right=right.next;
           }else{
             
            res.next=left;
            
              left=left.next;
           }
           res=res.next;
        }
        while(left!=null){
             
            res.next=left;
            
              left=left.next;
              res=res.next;
        }
        while(right!=null){
             res.next=right;
            right=right.next;
             
              res=res.next;
        }
      
        return dummy.next;
    }
}