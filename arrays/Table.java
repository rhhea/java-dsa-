import java.util.Scanner;
public class Table {
    public static void main(String args[])
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table: ");
        n = sc.nextInt();
        for(int i =1;i<=12;i++)
        System.out.println(n + " x " + i + " = " + (n*i));
    }
}
