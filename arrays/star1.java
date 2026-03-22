package arrays;
public class star1 {
    public static void main(String args[])
    {
        // Print a right-angled triangle pattern of stars
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
