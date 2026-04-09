public class Bubblesort{

    public static void bubblesort(int []arr){
        int temp=0;
      for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
    if(arr[j]>arr[j+1]){
          temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
    }
        }
      
    }
}
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
         
    }
        
    
    public static void main(String[] args) {
        int arr[]={5,6,3,2,7,1};
         bubblesort(arr);
         print(arr);
    }
}