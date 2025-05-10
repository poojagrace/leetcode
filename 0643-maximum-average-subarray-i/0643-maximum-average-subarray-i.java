class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double maxsum = Integer.MIN_VALUE;
        
        int i = 0; int j = 0;
            while(j<nums.length) {
                sum += nums[j];
                if(j-i+1<k) {
                    j++;
                }
                else if(j-i+1==k) {
                    maxsum = Math.max(maxsum,sum);
                    sum -= nums[i];
                    i++;j++;
                    
                }
            }
              return (double) maxsum/k;
    }
}


                
                

                
            
            
        

        
        
    
