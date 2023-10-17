class Solution {
    ///TC O(N) SC - O(N)
    public boolean validateBinaryTreeNodes(int n, int[] left, int[] right) {

        int root = findParent(n,left,right);
    
        if(root==-1){
            return false;
        }
      
        Queue<Integer> qe = new ArrayDeque<>();

        boolean[]vis = new boolean[n];

        qe.add(root);

        int count =0;

        while(qe.size()>0){
           int size = qe.size();
           while(size-->0){
              int node = qe.remove();
    //checking the cycles and if there are two or more parent for a child
              if(vis[node]){
                  return false;
              }
              vis[node] = true;
          ///counting the nodes 
              count++;

              if(left[node]!=-1){
                  qe.add(left[node]);
              }
              if(right[node]!=-1){
                  qe.add(right[node]);
              }
           }
        }

   ///if our count has all the elements of tree or n then we can make one valid tree otherwise that is not possible

        return count==n?true:false;

    }
    int findParent(int n,int[]left,int[]right){

        boolean[]vis = new boolean[n];

        for(int i=0;i<n;i++){
            if(left[i]!=-1){
                vis[left[i]]=true;
            }
            if(right[i]!=-1){
                vis[right[i]] = true;
            }
        }

        int root = -1;

        for(int i=0;i<n;i++){
           if(vis[i]==false){
               root = i;
           }
        }

        return root;
    }
}
