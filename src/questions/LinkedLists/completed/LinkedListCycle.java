package questions.LinkedLists.completed;

import java.util.HashMap;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        boolean res = false;
        HashMap<ListNode, Integer> hm = new HashMap<>();
        ListNode i = head;
        int fq;
        while (i != null) {
            fq = hm.getOrDefault(i, 0);
            if (fq > 1) {
                res = true;
                return res;
            } else {
                hm.put(i, fq + 1);
            }
            i = i.next;
        }
        return res;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
