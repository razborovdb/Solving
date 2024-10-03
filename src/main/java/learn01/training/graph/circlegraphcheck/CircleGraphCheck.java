package learn01.training.graph.circlegraphcheck;

import java.util.HashSet;
import java.util.Set;

public class CircleGraphCheck {
    public static void main(String[] args) {
        int[][] connections = new int[][] { {1}, {2}, {3,4}, {4}, {0} };
        System.out.println(solution(connections));

        connections = new int[][] { {1}, {2}, {3,4}, {4}, {} };
        System.out.println(solution(connections));
    }

    public static boolean solution(int[][] connections) {
        for (int i = 0; i < connections.length; i++) {
            if (dft(connections, i, new HashSet<Integer>())) {
                return true;
            }
        }
        return false;
    }

    public static boolean dft(int[][] connections, int next, Set<Integer> visited) {
        if (visited.contains(next)) return true;
        Set<Integer> newVisited = new HashSet<>(visited);
        newVisited.add(next);
        for (int i: connections[next]) {
            if(dft(connections, i, newVisited)) {
                return true;
            }
        }
        return false;
    }
}
