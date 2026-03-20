public class charpattern {
    public static void main(String args[])
    {
        char ch = 'A';
        // Print a right-angled triangle pattern of characters
        for(int i = 1;i<=4;i++)
        {
            for(int j =1;j<=i;j++)
            {
                // Print the character and increment it
                System.out.print(ch);
                ch++;
            }
    System.out.println();
    }     
    }
}
