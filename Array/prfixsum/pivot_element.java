public class pivot_element{
     
    public static int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i:nums){
            totalsum+=i;
        }
         System.out.println("totalsum= "+ totalsum);
        int leftsum=0;
        for(int j=0;j<nums.length;j++){
            int rightsum=totalsum-leftsum-nums[j];
            if(leftsum==rightsum){
                return j;
            }
            else{ 
                leftsum+=nums[j];
        }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
       System.out.println(pivotIndex(arr));
        
    }
}