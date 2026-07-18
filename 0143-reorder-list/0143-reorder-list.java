class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode sh=slow.next;
          slow.next=null;
       ListNode rev=reverse(sh);
        
      

        ListNode first=head;
        ListNode second=rev;
           
        while(first!=null && second !=null){
               ListNode fn=first.next;
               ListNode sn=second.next;
              
              first.next = second;
    second.next = fn;
               second=sn;
               first=fn;


        }
        

        
         


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
