// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

class maxoneII {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int count_zero=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                count_zero++;
            }
            if(count_zero>k){
                if(nums[i]==0){
                    count_zero--;
                }
                i++;
            }

        }
        return nums.length-i;
    }
}