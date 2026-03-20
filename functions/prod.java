package functions;
public class prod {
    public static int product(int a,int b)
    {
        return a*b;
    }
    public static void main(String args[])
    {
        int a,b;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.err.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(product(a,b));
        sc.close();
    }
}
