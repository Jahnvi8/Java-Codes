/* Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.

Example 1:
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]

Example 2:
Input: head = [2,1], x = 2
Output: [1,2]
 
Constraints:
The number of nodes in the list is in the range [0, 200].
-100 <= Node.val <= 100
-200 <= x <= 200
______________________________________________________________________________________________________________________________________________
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
    public ListNode partition(ListNode head, int x) {
        if(head == null) 
            return null;
        
        ListNode l1 = new ListNode(0);               // This l1 node is made for values less than x.
        ListNode l2 = new ListNode(0);               //This l2 node is made for values greater than x.
        
        ListNode curr = head;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        
        while(curr!=null) {
            if(curr.val<x) {
                curr1.next = new ListNode(curr.val);
                curr1 = curr1.next;
            } else {
                curr2.next = new ListNode(curr.val);
                curr2 =curr2.next;
            }
            curr = curr.next;
        }
        curr1.next = l2.next;                             //this line basically connects the tail of dummy1 to next node of dummy 2.
        
        return l1.next;
    }
}
