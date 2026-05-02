import java.util.HashMap;
// class Solution {
//     public int totalFruit(int[] nums) {
        //Brute force
//         int ans=0;
//         for(int i=0;i<nums.length;i++){
//           HashMap<Integer,Integer>map=new HashMap<>();
//           int count=0;
//           for(int j=i;j<nums.length;j++){
//             map.put(nums[j],map.getOrDefault(nums[j],0)+1);
//             if(map.size()>2){
//                 break;
//             }
//             else{
//                 count++;
//                 ans=Math.max(count,ans);
//             }
//           }
//         }
//         return ans;
//     }
// }
class maxfruit {
    public static  int totalFruit(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
              
             while(map.size()>2){
               map.put(nums[j],map.get(nums[j])-1);
               if(map.get(nums[j])==0){
                map.remove(nums[j]);
               }
               j++;
             }
             ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[]={0,1,2,2};
         
        System.out.println(totalFruit(arr));
    }
}