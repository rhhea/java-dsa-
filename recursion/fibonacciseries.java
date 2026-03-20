package recursion;

public class fibonacciseries {
    public static void main(String[] args) {
        int n = 6; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:"+fibo(n));
    }
    public static int fibo(int n)
    {
        if(n==0 || n==1)
            return n;
        return fibo(n-1) + fibo(n-2); // Recursive call
    }
}
