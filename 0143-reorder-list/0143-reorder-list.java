class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode cur = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        ListNode first = head;
        ListNode second = prev;
        
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;

        while (second != null) {
            result.next = first;
            first = first.next;
            result = result.next;

            result.next = second;
            second = second.next;
            result = result.next;
        }
        
        if (first != null) {
            result.next = first;
        }
    }
}
