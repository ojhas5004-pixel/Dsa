public class searchinsortedmetrix{


    public static void search(int arr[][],int key){
         int coll=arr[0].length-1;
        int row=0;
         while(row<arr.length && coll>=0){
            if(arr[row][coll]==key){
                System.out.println("key is found at"+row+" "+coll);

            }
            else if(key>arr[row][coll]){
                row++;
            }
            else{
                coll--;
            }
         }
    }
    public static void main(String[] args){
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

                    int key=11;
                    search(arr,key);

    }
}