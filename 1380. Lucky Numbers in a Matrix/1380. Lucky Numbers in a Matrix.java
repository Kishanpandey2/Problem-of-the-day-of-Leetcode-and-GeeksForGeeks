class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int []minRow = new int[matrix.length];
        Arrays.fill(minRow,Integer.MAX_VALUE);
        int []mxCol = new int[matrix[0].length];
        Arrays.fill(mxCol,Integer.MIN_VALUE);

        for(int r =0 ;r<matrix.length;r++){
            for(int c = 0;c<matrix[0].length;c++)
            {
                minRow[r] = Math.min(minRow[r],matrix[r][c]);
                mxCol[c] = Math.max(mxCol[c],matrix[r][c]);
            }
        }

         for(int r =0 ;r<matrix.length;r++){
            for(int c = 0;c<matrix[0].length;c++)
            {
              int ele = matrix[r][c];

              if(ele == minRow[r] && ele == mxCol[c])
               return Collections.singletonList(ele);
            
            }

        }

        return new ArrayList<>();
    }
}
