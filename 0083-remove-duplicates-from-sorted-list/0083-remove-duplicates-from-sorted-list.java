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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode i = head;
        ListNode j = head.next;
        while(j != null) {
            
            if(i.val == j.val) {
                j = j.next;
                
            }else {
                i.next = j;
                j = j.next;
                i = i.next;
            }
            
        }    
        if(j == null) {
            i.next = null;
        }    
        return head;
    }
}