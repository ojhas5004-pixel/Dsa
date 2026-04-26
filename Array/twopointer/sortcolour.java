import java.util.Arrays;

public class sortcolour{

    public static void swap(int arr[],int a,int b){
            int temp;
            temp=arr[b];
            arr[b]=arr[a];
            arr[a]=temp;
}
public static void sort(int[]arr){
         int j=0;
         int i=0;
         int k=arr.length-1;
        while(j<=k){
            if(arr[j]==1){
                j++;
            }
            else if(arr[j]==0){
                swap(arr,i,j);
                i++;
                
            }
            else if(arr[j]==2){
                swap(arr,j,k);
                k--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int arr[]={1,2,2,1,0,0,1};
        sort(arr);
    }
}