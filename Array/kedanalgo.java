
public class kedanalgo{

    public static void kedan(int arr[]) {
        int currsum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
           if(currsum<0){
            currsum=0;
           }
           else{
            currsum+=arr[i];
           }
           if(maxsum<currsum){
            maxsum=currsum;
           }
        }
        System.out.println("maxsum="+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        kedan(arr);
    }
}