package recursion;

public class fact {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    } 
    public static int factorial(int n){
        //base condition
        if(n==0 || n==1)
            return 1;
        //recursive call
        return n * factorial(n-1);
    }
}
