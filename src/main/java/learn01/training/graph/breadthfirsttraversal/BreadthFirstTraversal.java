package learn01.training.graph.breadthfirsttraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {
    public static void main(String[] args) {
        int[][] connections = new int[][] { {1}, {2,3}, {4}, {}, {0} };
        print(solution(connections,1));

    }

    public static void print(int[] result) {
        for (int i: result) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[][] connections, int start) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[connections.length];
        queue.add(start);
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            if(!isVisited[cur]) {
                result.add(cur);
                isVisited[cur] = true;
                for (int i: connections[cur]) {
                    if(!isVisited[i]) {
                        queue.add(i);
                    }
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
