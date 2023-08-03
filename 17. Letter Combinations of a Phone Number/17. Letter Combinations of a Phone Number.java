class Solution {
    List<String>ans = null;
    String []mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>() ;
        if(digits.length() == 0) return ans;
        dfs(0,digits, new StringBuilder());
        return ans;
    }
    private void dfs(int length, String digits, StringBuilder temp){
        if(length == digits.length())
        {
            ans.add(temp.toString()) ; return ;
        }

        char ch = digits.charAt(length) ;
        String str = mapping[ch-'0'] ;

        for(char c :str.toCharArray()){
            temp.append(c) ;
            dfs(length+1,digits, temp);
            temp.deleteCharAt(temp.length()-1) ;
        }
    }
}
