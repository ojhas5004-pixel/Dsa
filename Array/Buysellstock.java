
public class Buysellstock{
  
    public static  int stockprices(int []prices){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
         

        for(int i=0; i<prices.length;i++){
           
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }
            else{
                maxprofit=Math.max(prices[i]-buyprice,maxprofit);
            }
        }
        return maxprofit;
    } 


    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("maxprofit="+stockprices(prices));
    }
} 