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
    public ListNode sortList(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        head = convert(arr);
        return head;
    }

    public ListNode convert(List<Integer> arr) {
        if(arr.size() == 0) {
            return null;
        }
        ListNode head = new ListNode(arr.get(0));
        ListNode temp = head;
        for(int i = 1;i<arr.size() ; i++) {
            ListNode temp1 = new ListNode(arr.get(i));
            temp.next = temp1;
            temp = temp1;
        }
        return head;
    }
}
