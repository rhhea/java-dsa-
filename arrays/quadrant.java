import java.util.Scanner;
public class quadrant {
    public static void main(String[] args) {
        Scanner rhhea = new Scanner(System.in);
        System.out.println("enter x and y coordinates");
        int x = rhhea.nextInt();
        int y = rhhea.nextInt();
        if (x > 0 && y > 0){
            System.out.println("Quadrant 1");
        }
        else if (x > 0 && y <0){System.out.println("Third Quadrant");}
        else if (x < 0 && y > 0){System.out.println("Second Quadrant");}
        else if (x < 0 && y < 0){System.out.println("Fourth Quadrant");}
        else if (x == 0 && y == 0){System.out.println("Origin");}
        else if (x == 0 && y != 0){System.out.println("Y-axis");}
        else if (x != 0 && y == 0){System.out.println("X-axis");}
        else{System.out.println("Invalid input");}
    }
    
}
