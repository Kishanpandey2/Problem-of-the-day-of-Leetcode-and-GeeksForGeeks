class Solution {
public int largestPathValue(String colors, int[][] edges) {
int n = colors.length();
int[] indegrees = new int[n];
List<List<Integer>> graph = new ArrayList<>();
for (int i = 0; i < n; i++) {
graph.add(new ArrayList<Integer>());
}
for (int[] edge : edges) {
graph.get(edge[0]).add(edge[1]);
indegrees[edge[1]]++;
}
Queue<Integer> zeroIndegree = new LinkedList<>();
for (int i = 0; i < n; i++) {
if (indegrees[i] == 0) {
zeroIndegree.offer(i);
}
}
int[][] counts = new int[n][26];
for (int i = 0; i < n; i++) {
counts[i][colors.charAt(i) - 'a']++;
}
int maxCount = 0;
int visited = 0;
while (!zeroIndegree.isEmpty()) {
int u = zeroIndegree.poll();
visited++;
for (int v : graph.get(u)) {
for (int i = 0; i < 26; i++) {
counts[v][i] = Math.max(counts[v][i], counts[u][i] + (colors.charAt(v) - 'a' == i ? 1 : 0));
}
indegrees[v]--;

if (indegrees[v] == 0) {
zeroIndegree.offer(v);
}
}
maxCount = Math.max(maxCount, Arrays.stream(counts[u]).max().getAsInt());
}
return visited == n ? maxCount : -1;
}
}
