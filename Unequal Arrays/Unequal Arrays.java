

class Solution {
    public static long solve(int N, int[] A, int[] B) { 
        
       long suma = 0;
        long sumb = 0;
        ArrayList<Integer> evenA = new ArrayList<>();
        ArrayList<Integer> evenB = new ArrayList<>();
        
        ArrayList<Integer> oddA = new ArrayList<>();
        ArrayList<Integer> oddB = new ArrayList<>();
        
        for(int i = 0 ; i < N; i++){
            suma+= A[i];
            sumb+= B[i];
            
            if(A[i] % 2 == 0){
                evenA.add(A[i]);
            }
            else{
                oddA.add(A[i]);
            }
            if(B[i] % 2 == 0){
                evenB.add(B[i]);
            }
            else{
                oddB.add(B[i]);
            }
        }
        if(suma != sumb || evenA.size() != evenB.size()){
            return -1;
        }
        Collections.sort(evenA);
        Collections.sort(oddA);
        Collections.sort(evenB);
        Collections.sort(oddB);
        long ans = 0;
        for(int i = 0; i < evenA.size(); i++){
            int diff = Math.abs(evenA.get(i)- evenB.get(i));
            ans+= diff;
        }
        for(int i = 0; i < oddA.size(); i++){
            int diff = Math.abs(oddA.get(i)- oddB.get(i));
            ans+= diff;
        }
        return ans/4;
    }
}
        
