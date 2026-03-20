package functions;

public class subarray {
    public static void main(String args[])
    {
        int[] numbers = {1,3,-2};
        subarray(numbers);
    }
    public static void subarray(int numbers[])
    {
        for(int i = 0;i<numbers.length;i++)
        {
            for(int j = i;j<numbers.length;j++)
            {
                for(int k = i;k<=j;k++)
                {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
