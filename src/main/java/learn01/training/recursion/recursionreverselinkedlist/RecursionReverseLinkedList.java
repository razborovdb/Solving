package learn01.training.recursion.recursionreverselinkedlist;

public class RecursionReverseLinkedList {
    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(3);
        ListNode<Integer> next2 = new ListNode<>(4);
        ListNode<Integer> tail = new ListNode<>(6);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> sol = solution(head);
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

    public static ListNode<Integer> solution(ListNode<Integer> head) {
        if (head == null) return head;
        ListNode<Integer> prev = null;
        ListNode<Integer> cur = head;
        ListNode<Integer> next = head.next;
//        while (next != null) {
//            cur.next =  prev;
//            prev = cur;
//            cur = next;
//            next = cur.next;
//        }
//        cur.next = prev;
//        return cur;
        return recursion(prev, cur, next);
    }

    public static ListNode<Integer> recursion(ListNode<Integer> prev, ListNode<Integer> cur, ListNode<Integer> next) {
        if (next == null) {
            cur.next = prev;
            return cur;
        }
        cur.next =  prev;
        prev = cur;
        cur = next;
        next = cur.next;
        return recursion(prev, cur, next);

    }
}
