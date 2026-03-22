package arrays;
import java.util.Scanner;
public class week {
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter week name:");
    String day = sc.nextLine();
    switch(day.toLowerCase())
    {
        case "sunday":case "saturday":
                                    System.out.println("Weekend");
                                    break;
        
        case "monday":case "tuesday" : case "wednesday" : case "thursday": case "friday":
        
            System.out.println("Weekday");
            break;
        
        default:
        
            System.out.println("Invalid input");
            break;
        
    }
}    
}
