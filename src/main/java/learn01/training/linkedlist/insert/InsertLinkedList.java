package learn01.training.linkedlist.insert;

public class InsertLinkedList {
    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<Integer>(1);
        ListNode<Integer> next1 = new ListNode<Integer>(2);
        ListNode<Integer> tail = new ListNode<Integer>(3);

        head.next = next1;
        next1.next = tail;

        ListNode<Integer> sol = solution(head, 99, 0);
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

    public static ListNode<Integer> solution(ListNode<Integer> head, int value, int index) {
        ListNode<Integer> newNode = new ListNode<Integer>(value);
        if (index <= 0) {
            newNode.next = head;
            return newNode;
        }
        int curIndex = 0;
        ListNode<Integer> curNode = head;
        while (curNode.next != null) {
            curIndex++;
            if (curIndex == index) {
                ListNode<Integer> temp = curNode.next;
                curNode.next = newNode;
                newNode.next = temp;
                return head;
            }
            curNode = curNode.next;
        }
        curNode.next = newNode;
        return head;
    }
}
