
// Problem: Remove Duplicates from Sorted List
// Approach: Optimal (Single Pointer In-Place)
// Time Complexity: O(n) - ek baar poori list traverse
// Space Complexity: O(1) - koi extra space nahi


public class RemoveDuplicatesOptimal {

    // ListNode class - linked list ka ek node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        // Step 1: Agar list empty hai ya sirf ek node hai
        if (head == null || head.next == null) return head;

        // Step 2: Current pointer lo head se start karo
        ListNode current = head;

        // Step 3: Jab tak current aur current.next exist karte hain
        while (current != null && current.next != null) {

            // Step 4: Agar current aur next node ki value same hai
            if (current.val == current.next.val) {

                // Step 5: Next node ko skip karo (duplicate remove)
                // current.next ko current.next.next pe point karo
                current.next = current.next.next;

            } else {

                // Step 6: Agar values alag hain to aage badho
                current = current.next;
            }
        }

        // Step 7: Modified linked list return karo
        return head;
    }

    // Helper method - linked list print karo
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(3);
        System.out.print("Test 1: ");
        printList(deleteDuplicates(head1)); // 1 -> 2 -> 3

        // Test Case 2: 1 -> 1 -> 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        System.out.print("Test 2: ");
        printList(deleteDuplicates(head2)); // 1 -> 2

        // Test Case 3: Single node
        ListNode head3 = new ListNode(1);
        System.out.print("Test 3: ");
        printList(deleteDuplicates(head3)); // 1
    }
}