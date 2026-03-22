package arrays;
public class bubblesort {
    public static void main(String args[])
    {
        int[] arr = {2,4,9,1,6,70};
        bubbleesort(arr);
        System.out.print("Sorted array: ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleesort(int arr[])
    {
        for(int i =0;i<arr.length-1;i++)//outer loop for no.of passes
        {
            for(int j =0;j<arr.length-1-i;j++)//inner loop for adjacent comparisons
            {
                if(arr[j]>arr[j+1])
                {int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; // Swap if the current element is greater than the next
                }
            }
        }
    }
    
}
