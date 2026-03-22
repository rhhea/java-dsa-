import java.util.Scanner;
class evenoddsum
{
    public static void main(String args[])
    {
        int evensum =0;
        int oddsum = 0;
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        do
        {
            System.out.println("Enter a number (0 to exit): ");
            num = sc.nextInt();
            if (num%2==0)
            evensum += num;
            else
            oddsum += num;
            System.out.println("Do you want to continue? (1 for yes, 0 for no): ");
            choice = sc.nextInt();
            if (choice == 0)
            {
                System.out.println("Sum of even numbers: " + evensum);
                System.out.println("Sum of odd numbers: " + oddsum);
                break;
            }
        } while (choice == 1);
    }
}