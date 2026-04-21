public class qstring{

    public static String uppercase(String s){
        StringBuilder sb=new StringBuilder("");
 
        sb.append(Character.toUpperCase(s.charAt(0)));

        for(int i=1;i<s.length();i++){
            if (s.charAt(i)==' ' && i<s.length()-1){
               sb.append(s.charAt(i));
               i++;
                sb.append(Character.toUpperCase(s.charAt(i)));

            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="hello, saurabh ojha sir";
       System.out.println(uppercase(s));
    }
}