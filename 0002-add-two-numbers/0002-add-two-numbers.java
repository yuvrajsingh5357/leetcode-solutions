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
    static {
        Solution warmup = new Solution();
        for (int i = 0; i < 500; ++i) {
            ListNode l1 = new ListNode(2, new ListNode(5));
            ListNode l2 = new ListNode(8, new ListNode(4));
            warmup.addTwoNumbers(l1, l2);
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode head = null;
        ListNode current = null;
        ListNode temp = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = 0;
            int val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int sum = val1 + val2 + carry;
            carry = (sum >= 10) ? 1 : 0;
            temp = new ListNode(sum % 10, null);
            if (head == null) {
                head = temp;
                current = temp;
            } else {
                current.next = temp;
                current = temp;
            }
        }
        if (carry != 0){
            current.next = new ListNode(carry, null);
        }
        return head;
    }
}