package learn01.training.graph.connectedcomponents;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {
    public static void main(String[] args) {
        int[][] connections = new int[][] { {1,2}, {0}, {0}, {4}, {3} };
        System.out.println(solution(connections));

    }

    public static int solution(int[][] connections) {
        int result = 0;
        boolean[] isVisited = new boolean[connections.length];
        for (int i = 0; i < connections.length; i++) {
            if (!isVisited[i]) {
                result++;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while (!queue.isEmpty()) {
                    int next = queue.poll();
                    if (!isVisited[next]) {
                        isVisited[next] = true;
                        for (int j: connections[next]) {
                            if (!isVisited[j]) {
                                queue.add(j);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
