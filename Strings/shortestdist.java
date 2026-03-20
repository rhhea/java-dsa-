package Strings;

public class shortestdist {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.print("Shortest path is: "+shortest(path));
    }
    public static double shortest(String path){
        int x=0,y=0;
        double dist = 0;
        for(int i = 0;i<path.length();i++){
            char letter = path.charAt(i);
            if(letter == 'N')
                y++;
            else if(letter == 'S')
                y--;
            else if(letter == 'E')
                x++;
            else if(letter == 'W')
                x--;
        }
        dist = Math.sqrt(x*x + y*y);
        return dist;
    }
}
