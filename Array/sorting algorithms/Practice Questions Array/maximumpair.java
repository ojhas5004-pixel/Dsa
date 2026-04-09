import java.util.Arrays;
public class maximumpair{

    public static void sol(int []nums){
        int count1=0;
        int count2=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           max=Math.max(nums[i], max);
        }
        int sortarr[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            sortarr[nums[i]]++;
        }
        for(int i=0;i<sortarr.length;i++){
            
            if(sortarr[i]%2==0){
             count1+=sortarr[i]/2;
            }
            else{
              count1+=sortarr[i]/2;
              count2+=sortarr[i]%2;
            }
        }
        int arr[]={count1,count2};
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int nums[]={1,3,2,1,3,2,2};
        sol(nums);
    }
}