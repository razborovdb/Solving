package learn01.training.graph.shortestway;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestWay {

    public static void main(String[] args) {
        int[][] connections = new int[][] { {4,6}, {4,2,6}, {3,1}, {4,2,5}, {1,0,3}, {3}, {0,1}, {} };
        System.out.println();
        print(solution(connections,3, 0));
    }

    public static void print(int[] result) {
        for (int i: result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printList(List<Integer> result) {
        for (int i: result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[][] connections, int start, int end) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] isVisited = new boolean[connections.length];
        List<Integer> curList =  new ArrayList<>();
        curList.add(start);
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(curList);
        while (!queue.isEmpty()) {
            List<Integer> nextList =  queue.poll();
            int last = nextList.get(nextList.size() - 1);
            if (!isVisited[last]) {
                isVisited[last] = true;
                for (int i: connections[last]) {
                    if (i == end) {
                        List<Integer> way = new ArrayList<>(nextList);
                        way.add(i);
                        result.add(way);
                    }
                    if (!isVisited[i]) {
                        List<Integer> way = new ArrayList<>(nextList);
                        way.add(i);
                        queue.add(way);
                    }

                }
            }
        }
        int minList = result.get(0).size();
        int index = 0;
        for (int i = 0; i < result.size(); i++) {
            printList(result.get(i));
            if (minList > result.get(i).size()) {
                minList = result.get(i).size();
                index = i;
            }
        }
        return result.get(index).stream().mapToInt(Integer::intValue).toArray();
    }
}
