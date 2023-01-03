class Solution {
    public int minDeletionSize(String[] strs) {
        if(strs.length == 0)
        return 0;
        int col = strs[0].length();
        int result = 0 ;
        for(int i =0 ;i<col ;i++)
        {
            for(int j =1 ;j<strs.length;j++)
            {
                if(strs[j-1].charAt(i)>strs[j].charAt(i))
                {
                    result++;
                    break;
                }
            }
        }
        return result ;
    }
}


Time complexity -> O(n2) 
Space complexity -> O(1)
