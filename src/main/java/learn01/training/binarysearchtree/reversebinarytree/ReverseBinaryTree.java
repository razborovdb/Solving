package learn01.training.binarysearchtree.reversebinarytree;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseBinaryTree {
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

        printTree(tree);
        System.out.println();
        Tree<Integer> result = solution(tree);
        System.out.println("______________");
        printTree(tree);
//        printReverseTree(result);
    }

    public static Tree<Integer> solution(Tree<Integer> tree) {
        Queue<Tree<Integer>> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            Tree<Integer> curTree = queue.poll();
            Tree<Integer> temp = curTree.left;
            curTree.left = curTree.right;
            curTree.right = temp;
            if (curTree.left != null) queue.add(curTree.left);
            if (curTree.right != null) queue.add(curTree.right);
        }
        return tree;
    }

    public static void printTree(Tree<Integer> tree) {
        Queue<Tree<Integer>> queue = new LinkedList<>();
        Queue<Integer> levelQueue = new LinkedList<>();
        Integer curLevel = 0;
        queue.add(tree);
        levelQueue.add(curLevel);
        while (!queue.isEmpty() && !levelQueue.isEmpty()) {
            Tree<Integer> curTree = queue.poll();
            Integer level = levelQueue.poll();
            if (level != curLevel) {
                System.out.println();
                curLevel = level;
            }
            System.out.print(" " + curTree.value);
            if (curTree.left != null) {
                queue.add(curTree.left);
                levelQueue.add(level + 1);
            }
            if (curTree.right != null) {
                queue.add(curTree.right);
                levelQueue.add(level + 1);
            }
        }
    }
}
