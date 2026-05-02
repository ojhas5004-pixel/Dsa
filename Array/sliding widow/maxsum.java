import java.util.HashMap; 
class maxsum {
    public long maximumSubarraySum(int[] nums, int k) {
         HashMap<Integer,Integer>map=new HashMap<>();
        long maxsum=0;
        long currsum=0;
        for(int i=0;i<nums.length;i++){
               currsum+=nums[i];
               map.put(nums[i],map.getOrDefault(nums[i],0)+1);
               if(i>=k-1){
                if(map.size()==k)maxsum= Math.max(currsum,maxsum);
                
                currsum-=nums[i-k+1];
                map.put(nums[i-k+1],map.get(nums[i-k+1])-1);
               if(map.get(nums[i-k+1])==0) map.remove(nums[i-k+1]);
            
               }
           
        }
         
        
        return maxsum;
    }
}