class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
         int currsum=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==1){
                currsum++;
                 max=Math.max(max,currsum);
                
            }
            else{
                 
                currsum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
    System.out.println(findMaxConsecutiveOnes(arr));
    }
}