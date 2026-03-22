package arrays;
public class halfpyramid {
    public static void main(String args[])
    {
        int r,c;
        r = 7;
        for(int i=1;i<=r;i++)
        {
            for(c = 1; c<=i;c++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
