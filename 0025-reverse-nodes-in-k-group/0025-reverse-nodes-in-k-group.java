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
      public ListNode reverse(ListNode head,int times){
        ListNode cur=head;
        ListNode prev = null;
        if(head==null || head.next==null){
            return cur;
        }
        for(int i=0;i<times;i++){
            ListNode nextNode = cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextNode;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
          ListNode left=head;
        ListNode right=null;
        ListNode prevLeft=null;
        ListNode res=null;
        int size=k;
        if(head==null || head.next==null){
            return head;
        }
        while(left!=null){
            right=left;
            for(int i=0;i<size-1;i++){
                if(right==null){
                    break;
                }
                right=right.next;
            }
            if(res==null){
                res=right;
            }
            if(right!=null){
                ListNode nextNode=right.next;
                reverse(left,size);
                if(prevLeft!=null){
                    prevLeft.next=right;
                }
                left.next=nextNode;
                prevLeft=left;
                left=nextNode;
         
            }else{
                prevLeft.next=left;
                break;
            }
        }
        return res;
    }
}