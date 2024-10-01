package learn01.training.binarysearchtree.search;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public static void main(String[] args) {
        Integer level = 0;
        Tree<Integer> tree = new Tree<>(25);
        Tree<Integer> treeL = new Tree<>(17);
        Tree<Integer> treeR = new Tree<>(42);
        tree.left = treeL;
        tree.right = treeR;
        Tree<Integer> treeL_L = new Tree<>(15);
        Tree<Integer> treeL_R = new Tree<>(19);
        treeL.left = treeL_L;
        treeL.right = treeL_R;
        Tree<Integer> treeR_L = new Tree<>(40);
        Tree<Integer> treeR_R = new Tree<>(44);
        treeR.left = treeR_L;
        treeR.right = treeR_R;

        int targetValue = 44;
        System.out.println(solution(tree, targetValue));
        System.out.println();


        System.out.println("______________");
        printTree(tree);
    }

    public static boolean solution(Tree<Integer> tree, int targetValue) {
        if (tree == null) {
            return false;
        }
        if(tree.value == targetValue) {
            return true;
        }
        if(tree.value < targetValue) {
            return solution(tree.right, targetValue);
        }
        return solution(tree.left, targetValue);
    }
    public static void printTree(Tree<Integer> tree) {
        if (tree == null) {
            return;
        }
        Queue<Tree<Integer>> queueTree = new LinkedList<>();
        Queue<Integer> queueLevel = new LinkedList<>();
        Integer curLevel = 0;
        queueTree.add(tree);
        queueLevel.add(curLevel);
        while(!queueTree.isEmpty()) {
            Tree<Integer> nextTree = queueTree.poll();
            Integer nextLevel = queueLevel.poll();
            if (curLevel != nextLevel) {
                System.out.println();
                curLevel = nextLevel;
            }
            System.out.print(" " + nextTree.value);
            if (nextTree.left != null) {
                queueLevel.add(nextLevel + 1);
                queueTree.add(nextTree.left);
            }
            if (nextTree.right != null) {
                queueLevel.add(nextLevel + 1);
                queueTree.add(nextTree.right);
            }
        }
    }
}
