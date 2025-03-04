package amazon.addtwonumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = makeListNode(new int[] {2, 4, 3});
        ListNode l2 = makeListNode(new int[] {5, 6, 4});
        ListNode result = addTwoNumbers(l1, l2);
        printListNode(result);
        System.out.println();
        l1 = makeListNode(new int[] {9,9,9,9,9,9,9});
        l2 = makeListNode(new int[] {9,9,9,9});
        result = addTwoNumbers(l1, l2);
        printListNode(result);
    }

    public static ListNode makeListNode(int[] values) {
        ListNode ln = null;
        ListNode tail = null;
        for (int val: values) {
            ListNode next = new ListNode(val);
            if (ln == null) {
                ln = next;
                tail = ln;
            } else {
                tail.next = next;
                tail = tail.next;
            }
        }
        return ln;
    }

    public static void printListNode(ListNode ln) {
        while (ln != null) {
            System.out.print(" " + ln.val);
            ln = ln.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultTail = null;
        ListNode result = null;
        int left = 0;
        while (l1 != null && l2 != null) {
            ListNode nextNode = new ListNode((l1.val + l2.val + left) % 10);
            left = (l1.val + l2.val + left) / 10;
            if (resultTail == null) {
                resultTail = nextNode;
                result = resultTail;
            } else {
                resultTail.next = nextNode;
                resultTail = resultTail.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            ListNode nextNode = new ListNode((l1.val + left) % 10);
            left = (l1.val + left) / 10;
            resultTail.next = nextNode;
            resultTail = resultTail.next;
            l1 = l1.next;

        }

        while (l2 != null) {
            ListNode nextNode = new ListNode((l2.val + left) % 10);
            left = (l2.val + left) / 10;
            resultTail.next = nextNode;
            resultTail = resultTail.next;

            l2 = l2.next;
        }

        if (left != 0) {
            ListNode nextNode = new ListNode(left % 10);
            resultTail.next = nextNode;
        }

        return result;


    }
}
