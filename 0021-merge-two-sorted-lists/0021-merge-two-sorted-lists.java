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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp1 != null) {
            arr.add(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            arr.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(arr);
        ListNode head = convertLL(arr);
        return head;
    }

    ListNode convertLL(List<Integer> arr) {
        if(arr.isEmpty()) {
            return null;
        }
        ListNode head = new ListNode(arr.get(0));
        ListNode mover = head;
        for(int i = 1 ; i < arr.size() ; i++) {
            ListNode temp = new ListNode(arr.get(i));
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}