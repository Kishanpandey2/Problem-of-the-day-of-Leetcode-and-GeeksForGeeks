class UndergroundSystem {
 Map<Integer,ArrivalInfo>arrivals ;
 Map<String,double[]>totals ;
 class ArrivalInfo{ 
     int id  ;
     String stationName ;
     int t ;
     ArrivalInfo(int id, String stationName, int t){
         this.id = id ;
         this.stationName = stationName ;
         this.t = t ;
     }

 }
    public UndergroundSystem() {
        arrivals = new HashMap<>() ;
        totals = new HashMap<>() ;

    }
    
    public void checkIn(int id, String stationName, int t) {
        arrivals.put(id,new ArrivalInfo(id,stationName,t)) ;
    }
    
    public void checkOut(int id, String stationName, int t) {
        ArrivalInfo arrival = arrivals.get(id) ;
        String key = arrival.stationName+"_"+ stationName ;
        double pair[] = totals.getOrDefault(key,new double[2]) ;
        int time = t - arrival.t ;
        pair[0] += time ;
        pair[1]++ ;
        totals.put(key,pair);

    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation+ "_" + endStation ;
        double pair[] = totals.get(key);
        return pair[0]/pair[1] ;
    }
}
