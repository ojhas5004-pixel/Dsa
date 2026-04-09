
import java.util.Scanner;

public class Creation{

    
   
public static void takeinput(int [][]arr,int n,int m){
    Scanner sc=new Scanner(System.in);
 

    for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
        
    }
}

public static void find (int arr[][],int num,int n,int m) {

    for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
           if(num==arr[i][j]){
            System.out.print("Element+"+arr[i][j]+"is found at"+i+""+j);
         }
        }
         
        
    }
    
}
    
    public static void main(String[] args) {
        int arr[][]=new int [3][3];
          int n=arr.length;
    int m=arr[0].length;
    
        takeinput(arr,n,m);
        find(arr,66, n, m);
    }
}