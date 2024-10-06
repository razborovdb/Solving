package learn01.training.graph.depthfirsttraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstTraversal {
    public static void main(String[] args) {
        int[][] connections = new int[][] { {1}, {2,3}, {4}, {}, {0} };
        print(solution(connections,0));

    }

    public static void print(int[] result) {
        for (int i: result) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[][] connections, int start) {
        List<Integer> result = new ArrayList<>();
        boolean[] isVisited = new boolean[connections.length];

        Stack<Integer> stack = new Stack<>();
        stack.add(start);
        while (!stack.isEmpty()) {
            int next = stack.pop();
            if (!isVisited[next]) {
                isVisited[next] = true;
                result.add(next);
                for (int i=connections[next].length - 1; i>=0; i--) {
                    if (!isVisited[connections[next][i]]) {
                        stack.add(connections[next][i]);
                    }
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
