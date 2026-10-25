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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();
        for(ListNode head: lists) {
            ListNode temp = head;
            while(temp != null) {
                arr.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(arr);
        return convert(arr);
    }

    ListNode convert(List<Integer> arr){
        if(arr.isEmpty()){
            return null;
        }
        ListNode head = new ListNode(arr.get(0));
        ListNode temp = head;
        for(int i = 1 ; i<arr.size();i++) {
            ListNode newNode = new ListNode(arr.get(i));
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }
}