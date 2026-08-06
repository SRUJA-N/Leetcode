class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       PriorityQueue<ListNode> minheap=new PriorityQueue<>((a,b)-> a.val-b.val);
        for(ListNode head:lists){
            if(head!=null)
            {
                minheap.offer(head);
            }
        }
       ListNode dummy=new ListNode();
       ListNode res=dummy;
       while(!minheap.isEmpty())
       {
            ListNode cur=minheap.poll();
            res.next=cur;
            res=res.next;

            if(cur.next!=null){
                minheap.offer(cur.next);
            }
       }
       return dummy.next;
    }
}