import java.util.Arrays;
public class Trappingrainwater{
    
   public static int trappedwater(int arr[]){

    //leftmax boundry
    int leftmax[]=new int[arr.length];
    leftmax[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        leftmax[i]=Math.max(arr[i],leftmax[i-1]);
    }
    System.out.println("leftmax arr"+Arrays.toString(leftmax));
    
    //Right max boundry
       int n=arr.length-1;
       int rightmax[]=new int[arr.length];
    rightmax[n]=arr[n];
    for(int i=n-1;i>=0;i--){
       rightmax[i]=Math.max(arr[i],rightmax[i+1]);
    }
    System.out.println("leftmax arr"+Arrays.toString(leftmax));
    
    //Trapped water
    int trappedwater=0;
    for(int i=0;i<arr.length;i++){
        trappedwater+=Math.min(leftmax[i],rightmax[i])-arr[i];
    }
     return trappedwater;
   }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("trapped water="+trappedwater(height));

    }

}