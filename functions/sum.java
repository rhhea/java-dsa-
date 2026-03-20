package functions;
import java.util.Scanner;
public class sum {
    public static int sumab(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(sumab(a,b));
    }
}
