package training6.binarysearchtree.depthfirstsearch;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }
    public int getValue() {
        return value;
    }
}
