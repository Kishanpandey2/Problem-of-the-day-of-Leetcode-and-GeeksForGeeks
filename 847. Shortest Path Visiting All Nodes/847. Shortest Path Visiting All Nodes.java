import java.util.*;

class Solution {
    class Node {
        int node;
        int mask;
        int cost;

        Node(int node, int mask, int cost) {
            this.node = node;
            this.mask = mask;
            this.cost = cost;
        }
    }

    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int all = (1 << n) - 1;
        Set<Pair<Integer, Integer>> vis = new HashSet<>();
        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int maskValue = (1 << i);
            Node thisNode = new Node(i, maskValue, 1);
            q.add(thisNode);
            vis.add(new Pair<>(i, maskValue));
        }

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.mask == all) {
                return curr.cost - 1;
            }

            for (int adj : graph[curr.node]) {
                int bothVisitedMask = curr.mask | (1 << adj);
                Node thisNode = new Node(adj, bothVisitedMask, curr.cost + 1);

                if (!vis.contains(new Pair<>(adj, bothVisitedMask))) {
                    vis.add(new Pair<>(adj, bothVisitedMask));
                    q.add(thisNode);
                }
            }
        }

        return -1;
    }
}
