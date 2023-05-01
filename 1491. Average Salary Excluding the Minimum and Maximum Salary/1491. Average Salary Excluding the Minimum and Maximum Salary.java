class Solution {
    public double average(int[] salary) {
         
        Arrays.sort(salary);
        
        
        double sum = 0;
        for(int i = 0; i < salary.length; i++) {
            sum = sum + salary[i];
        }
        
        
        return (sum - (salary[0] + salary[salary.length - 1])) / (salary.length - 2);
    }
}
