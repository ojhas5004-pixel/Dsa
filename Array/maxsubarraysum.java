
 
class maxsubarraysum{

public static void maxsum(int arr[]){
int maxsum=0,currsum;
for(int i=0;i<arr.length;i++){

   for(int j=i;j<arr.length;j++){
       currsum=0;
    for(int k=i;k<=j;k++){
        currsum+=arr[k];
    if(currsum>maxsum){
        maxsum=currsum;
        // currsum=0;
    }
}
 System.out.print(currsum+" ");
 System.out.println(); 
   }
}
System.out.println("Maxsum="+maxsum);
}
public static void main(String[] args) {
    int arr[]={2,4,5,3};
    maxsum(arr);

}
}