class Solution {
    long[] countZero(int N, int k, int[][] arr){
        Set<Integer>row = new HashSet<>() ;
        Set<Integer>col = new HashSet<>() ;
        int r= N, c = N ;
        long cur_ans = N*N ;
        long []res = new long[k] ;
        for(int i = 0 ;i<k;i++){
            int x = arr[i][0] , y = arr[i][1] ;
            if(!row.contains(x) && !col.contains(y))
            {cur_ans = cur_ans - r-c+1 ;
            r-- ;c-- ;
            }
            if(row.contains(x) && !col.contains(y))
           { cur_ans = cur_ans - r ;
            c-- ;
           }
           if(!row.contains(x) && col.contains(y))
           { cur_ans = cur_ans - c ;
            r-- ;
           }
           res[i]= cur_ans ;
           row.add(x) ; col.add(y) ;
        }
        return res ;
    }
}
