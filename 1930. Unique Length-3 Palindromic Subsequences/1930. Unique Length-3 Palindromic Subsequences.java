class Solution {
   public int countPalindromicSubsequence(String s) {
		int indices[][] = new int[26][2];
		for(int arr[]:indices){
			Arrays.fill(arr,-1);
		}
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(indices[ch - 'a'][0]==-1){
				indices[ch-'a'][0] = i;
			}else{
				indices[ch-'a'][1] = i;
			}
		}
		int total = 0;
		for(int[] index:indices){
			int l=index[0]+1, r=index[1]-1;
			int[] isPresent = new int[26];
			Arrays.fill(isPresent,0);
			for(int i=l;i<=r;i++){
				isPresent[s.charAt(i) - 'a'] = 1;
			}
			total += Arrays.stream(isPresent).sum();
		}
		return total;
	}
}
