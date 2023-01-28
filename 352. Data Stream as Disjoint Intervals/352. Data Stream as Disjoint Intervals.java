class SummaryRanges {
    private Set<Integer>nos ;
    public SummaryRanges() {
        nos = new TreeSet() ;

    }
    
    public void addNum(int value) {
        nos.add(value) ;
    }
    
    public int[][] getIntervals() {
        List<int []>disjointInterval = new ArrayList<>() ;
        for(int n:nos){
            int size = disjointInterval.size() ;
            if(size>0 && disjointInterval.get(size-1)[1]+1==n)
            disjointInterval.get(size-1)[1] = n;
            else
            disjointInterval.add(new int[]{n,n}) ;
        }
        return disjointInterval.toArray(new int[0][]);
    }

}

Time complexity : O(n)
