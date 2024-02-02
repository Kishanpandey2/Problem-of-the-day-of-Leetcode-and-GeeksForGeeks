class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
            List<Integer>list = new ArrayList<>() ;
            int lowLen = String.valueOf(low).length();
            int highLen = String.valueOf(high).length();

        for(int i  = lowLen ;i<=highLen ;i++)
        {
            for(int j = 0;j<10-i;j++)
            {
                int no = Integer.parseInt(digits.substring(j,j+i)) ;
                if(no<=high && no>=low)
                list.add(no) ;
            }
        }

        return list;
    }
}
