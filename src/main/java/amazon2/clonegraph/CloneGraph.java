package amazon2.clonegraph;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public static Map<Node, Node> assignedNodes = new HashMap<>();
    public static Node cloneGraph(Node node) {
        if (node == null) return node;
        if (assignedNodes.containsKey(node)) {
            return assignedNodes.get(node);
        }
        Node newNode = new Node(node.val);
        assignedNodes.put(node, newNode);
        for (Node n: node.neighbors) {
            newNode.neighbors.add(cloneGraph(n));
        }
        return newNode;
    }
}
