class maxsubarraysum2{

   public static void maxsum2(int arr[]){
    int maxsum=Integer.MIN_VALUE,currsum=0;
     int prefix[]=new int[arr.length];
     prefix[0]=arr[0];
     for(int i=1;i<arr.length;i++){
     prefix[i]=prefix[i-1]+arr[i];
     }

     for(int j=0;j<arr.length;j++){
        for(int k=j;k<arr.length;k++){
           currsum=j==0?prefix[k]:prefix[k]-prefix[j-1];
                   if(maxsum<currsum){
            maxsum=currsum; 
              System.out.print(currsum+" ");
        }
         System.out.println();
        }
     }
     System.out.println("maxsum="+maxsum);
     
   }
   public static void main(String[] args) {
       int arr[]={3,5,3,2};
       maxsum2(arr);
   }
}