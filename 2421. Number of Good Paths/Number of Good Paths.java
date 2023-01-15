class Solution {

	private int[] prnt, vals;

	private int[][] mxcnt;

	public int numberOfGoodPaths(int[] vals, int[][] edges) {
		int n = vals.length;
		this.prnt = new int[n];
		this.mxcnt = new int[n][2];
		for (int i = 0; i < n; i++) {
			
			prnt[i] = -1;
			
			mxcnt[i][0] = vals[i];

			mxcnt[i][1] = 1;
		}

		this.vals = vals;

		Arrays.sort(edges, Comparator.comparingInt(e -> Math.max(vals[e[0]], vals[e[1]])));

		int count = n;
		for (int[] e : edges) {
			count += union(e[0], e[1]);
		}
		return count;
	}

	private int find(int u) {
		return prnt[u] < 0 ? u : (prnt[u] = find(prnt[u]));
	}

	private int union(int u, int v) {
		int pu = find(u), pv = find(v);
		if (pu == pv) {
			return 0;
		}

		prnt[pu] = pv;

		int maxVal = Math.max(vals[u], vals[v]);
		int freqU = mxcnt[pu][0] == maxVal ? mxcnt[pu][1] : 0;
		int freqV = mxcnt[pv][0] == maxVal ? mxcnt[pv][1] : 0;

		mxcnt[pv][0] = maxVal;
		mxcnt[pv][1] = freqV + freqU;
		return freqV * freqU;
	}
}
