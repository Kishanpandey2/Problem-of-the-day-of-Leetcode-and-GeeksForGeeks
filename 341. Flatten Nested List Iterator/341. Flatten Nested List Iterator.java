/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    List<Integer> flatten = null ;
    int cnt = 0 ;
    public NestedIterator(List<NestedInteger> nestedList) {
        flatten = new ArrayList<>()  ;
        for(NestedInteger value  : nestedList){
            help(value) ;
        }
    }

    @Override
    public Integer next() {
        return flatten.get(cnt++) ;
    }

    @Override
    public boolean hasNext() {
        return  cnt<flatten.size() ;
    }

    private void help(NestedInteger value){
        if(value.isInteger())
        flatten.add(value.getInteger()) ;
        else
        {
             for(NestedInteger v  : value.getList()){
            help(v) ;
        }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
