public class shortestpath{

    public static float shortestpath(String s){
        int x=0,y=0;
        for(int i=0; i<s.length();i++){
            char dir=s.charAt(i);

        switch (dir) {
            case 'n' ->  y++;
            
             case 'e' ->  x++;
        
             case 'w' ->  x--;
            
             case 's' ->  y--;

             default -> System.out.print("Invalid direction");
             
        }
        }

        float shortdistance=(float)Math.sqrt((x*x + y*y));

       return shortdistance;
    }
    public static void main(String[] args) {
        String s="wneenesennn";
        System.out.println("Shortest distance is ="+shortestpath(s));
    }
}