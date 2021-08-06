// Problem Description

// Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

// Try solving it using constant additional space.

// Example:

// Input: 


//               ______
//              |     |
//              \/    |
//     1 -> 2 -> 3 -> 4


// Return the node corresponding to node 3. 



// Note:You only need to implement the given function. Do not read input, instead use the arguments to the function. 
//Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.
_____________________________________________________________________________________________________________________________________________
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int flag=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
              flag++;
              break;
            }  
          
        }
        if(flag==0) return null;
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

	}
}

