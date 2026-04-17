
import java.util.Scanner;

public class palindrome{

    public static Boolean ispalindrome(String s){
        for(int i=0; i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
       System.out.println( ispalindrome(s));
    }
}