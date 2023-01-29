class LFUCache {
    private int cap ;
    private int min ;
    Map<Integer,Integer>keyValueMap = new HashMap<>() ;
    Map<Integer,Integer>keyFreqMap = new HashMap<>() ;
    Map<Integer,LinkedHashSet<Integer>>freqKeyMap= new HashMap<>() ;
    public LFUCache(int capacity) {
        cap = capacity ;
        freqKeyMap.put(1,new LinkedHashSet<>() ) ;
    }
    
    public int get(int key) {
        if(!keyValueMap.containsKey(key))
        return -1 ;
        int freq = keyFreqMap.get(key) ;
        freqKeyMap.get(freq).remove(key);
        if(freq==min  && freqKeyMap.get(freq).size()==0)
        min++;
        if(!freqKeyMap.containsKey(freq+1))
        freqKeyMap.put(freq+1,new LinkedHashSet<>() );
        freqKeyMap.get(freq+1).add(key) ;
        keyFreqMap.put(key,freq+1) ;
        return keyValueMap.get(key) ;
    }
    
    public void put(int key, int value) {
        if(cap<=0)
        return ;
        if(keyValueMap.containsKey(key)){
            keyValueMap.put(key,value) ;
            get(key) ;
            return ;
        }
        if(keyValueMap.size()>=cap){
            int evictedKey = freqKeyMap.get(min).iterator().next();
            freqKeyMap.get(min).remove(evictedKey) ;
            keyValueMap.remove(evictedKey) ;
            keyFreqMap.remove(evictedKey);
        }
        keyValueMap.put(key,value) ;
        keyFreqMap.put(key,1);
        min = 1;
        freqKeyMap.get(1).add(key);
    }
}
