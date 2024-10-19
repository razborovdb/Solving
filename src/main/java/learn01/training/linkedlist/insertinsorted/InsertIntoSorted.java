package learn01.training.linkedlist.insertinsorted;

public class InsertIntoSorted {
    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(3);
        ListNode<Integer> next2 = new ListNode<>(4);
        ListNode<Integer> tail = new ListNode<>(6);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> sol = solution(head, 5);
        printNodes(sol);

    }
    public static void printNodes(ListNode<Integer> head) {
        ListNode<Integer> curNode = head;
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    public static ListNode<Integer> solution(ListNode<Integer> head, int value) {
        ListNode<Integer> newNode = new ListNode<Integer>(value);
        if (head.value > value) {
            newNode.next = head;
            return newNode;
        }
        ListNode<Integer> prev = head;
        ListNode<Integer> next = head.next;
        while (next != null) {
            if (next.value > value) {
                prev.next = newNode;
                newNode.next = next;
                return head;
            }
            prev = next;
            next = next.next;
        }
        prev.next = newNode;
        return head;
    }
}
