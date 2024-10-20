package learn01.training.linkedlist.merge;

public class MergeLinkedList {
    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(19);
        ListNode<Integer> next2 = new ListNode<>(145);
        ListNode<Integer> tail = new ListNode<>(543);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> head2 = new ListNode<>(14);
        ListNode<Integer> next21 = new ListNode<>(16);
        ListNode<Integer> next22 = new ListNode<>(123);
        ListNode<Integer> tail2 = new ListNode<>(432);

        head2.next = next21;
        next21.next = next22;
        next22.next = tail2;

        ListNode<Integer> sol = solution(head2, head);
        printNodes(sol);

    }
    public static void printNodes(ListNode<Integer> head) {
        ListNode<Integer> curNode = head;
        if (curNode == null) {
            System.out.println("null");
        }
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    public static ListNode<Integer> solution(ListNode<Integer> head1, ListNode<Integer> head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        ListNode<Integer> result = null;
        if (head1.value > head2.value) {
            result = head2;
            head2 = head2.next;
        }
        else {
            result = head1;
            head1 = head1.next;
        }
        ListNode<Integer> cur = result;
        while (head1 != null && head2 != null) {
            if (head1.value > head2.value) {
                cur.next = head2;
                head2 = head2.next;
            }
            else {
                cur.next = head1;
                head1 = head1.next;
            }
            cur = cur.next;
        }
        if (head1 != null) {
            cur.next = head1;
        }
        if (head2 != null) {
            cur.next = head2;
        }
        return result;
    }
}
