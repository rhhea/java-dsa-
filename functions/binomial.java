package functions;

public class binomial {
    public static int factorial(int n)
    {
        int fact = 1;
        for(int i = 1;i<=n;i++)
            fact *= i;
        return fact;
    }
    public static int bino(int a,int b)
    {
        return factorial(a)/(factorial(b)*factorial(a-b));
    }
    public static void main(String args[])
    {
        System.out.print(bino(10,2));
    }
}
