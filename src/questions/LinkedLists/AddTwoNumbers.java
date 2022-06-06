package questions.LinkedLists;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //create a head
        ListNode head = new ListNode(0);

        //check if the list is empty
        if (l1 == null && l2 == null) {
            return head;
        }

        //create a pointer node
        ListNode res = head;
        int carry = 0;

        //loop until one of the list is exhausted
        while (l1 != null && l2 != null) {
            int sum = carry + l1.val + l2.val;
            if (sum > 9) {
                int r = sum % 10;
                res.next = new ListNode(r);
                res = res.next;
                carry = 1;
            } else {
                res.next = new ListNode(sum);
                carry = 0;
                res = res.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        //loop for the remaining elements of the list
        while (l2 != null) {
            int sum = carry + l2.val;
            if (sum > 9) {
                int r = sum % 10;
                res.next = new ListNode(r);
                res = res.next;
                carry = 1;
            } else {
                res.next = new ListNode(sum);
                carry = 0;
                res = res.next;
            }
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = carry + l1.val;
            if (sum > 9) {
                int r = sum % 10;
                res.next = new ListNode(r);
                res = res.next;
                carry = 1;
            } else {
                res.next = new ListNode(sum);
                carry = 0;
                res = res.next;
            }
            l1 = l1.next;
        }

        //adding the carry to the last of the list
        if (carry > 0) {
            res.next = new ListNode(carry);
        }
        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
