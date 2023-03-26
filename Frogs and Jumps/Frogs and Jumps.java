class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
    
    BitSet visited = new BitSet(leaves + 1);

     
    for (int frog : frogs) {
        
        if (frog <= leaves && !visited.get(frog)) {
           
            for (int j = frog; j <= leaves; j += frog) {
                visited.set(j);
            }
        }
    }

    
    int unvisited = leaves- visited.cardinality();
   
   
    return unvisited;
    }
}
