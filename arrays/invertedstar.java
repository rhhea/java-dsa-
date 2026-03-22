public class invertedstar {
    public static void main(String args[])
    {
        // Print an inverted right-angled triangle pattern of stars
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
