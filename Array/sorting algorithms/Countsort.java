import java.util.Arrays;
public class Countsort{


    public static void sort(int[] arr) {
        int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
         largest=Math.max(largest,arr[i]);
    }
     int count[]=new int[largest+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
        }

        //sorting part
        int j=0;
        for(int i=0;i<count.length;i++){
             
              while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
              }
        }
    
    }
    public static void main(String[] args) {
        int arr[]={0,0,2,3,1,1,2,2,4,5,6,6,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}