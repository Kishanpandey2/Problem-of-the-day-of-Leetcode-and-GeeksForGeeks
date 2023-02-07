
class Solution {
    public int totalFruit(int[] fruits) {
        int count[] = new int [fruits.length];
        int type = 0;
        int ansMax =0;
        int curransMax = 0;
        int start = 0;
        for(int i=0;i<fruits.length;i++){
            if(count[fruits[i]]==0){
                type++;
            }
            count[fruits[i]]++;
            curransMax++;
            while(type>2 && start<i){
                count[fruits[start]]--;
                if(count[fruits[start]]==0){
                    type--;
                }
                start++;
                curransMax--;
            }
            ansMax = Math.max(ansMax,curransMax);
        }
        return ansMax;
    }
}
