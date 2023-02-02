class Solution {
	long largestcycle = -1;

	void DFS(int node, int[] Edge, boolean visited[], boolean pathvisited[]) {
		visited[node] = true;
		pathvisited[node] = true;

		if (Edge[node] != -1) {
			int adj = Edge[node];
			if (!visited[adj]) {
				DFS(adj, Edge, visited, pathvisited);
			} else if (pathvisited[adj]) {
				int curr = adj;
				long sum = 0;
				do {
					sum += curr;
					curr = Edge[curr];
				} while (curr != adj);
				largestcycle = Math.max(largestcycle, sum);
			}
		}

		pathvisited[node] = false;
	}

	long largesSumCycle(int N, int[] Edge) {
		boolean[] visited = new boolean[N];
		boolean[] pathvisited = new boolean[N];
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				DFS(i, Edge, visited, pathvisited);
			}
		}
		return largestcycle;
	}
}
