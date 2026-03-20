package recursion;

public class tillingprobl {
    public static void main(String args[])
    {
        //assuming tile size to be 2x1 and floor size as 2xn
        System.out.println(tiling(3));
    }
    public static int tiling(int n)
    {
        //base case
        if(n==0 || n==1)
            return 1;
        //vertical choice
        int fnm1 = tiling(n-1);
        //horizontal choice
        int fnm2 = tiling(n-2);
        int totalways = fnm1 + fnm2;
        return totalways; 
    }
}
