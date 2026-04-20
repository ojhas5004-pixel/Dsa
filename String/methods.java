public class methods{
    public static String longeststring(String []s){
        String longest=s[0];
        for (int i =1; i <s.length; i++) {
            if(longest.compareTo(s[i])<0){
                longest=s[i];
            };
        }
   return longest;
    }
    
    public static void main(String[] args) {
        String s[]={"mango","banana","potato"};
       System.out.println(longeststring(s));  
    }
}