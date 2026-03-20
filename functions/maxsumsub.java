package functions;
//using kadane's algorithm to find maximum subarray sum
// This code implements Kadane's algorithm to find the maximum subarray sum in a given array.
public class maxsumsub {
    public static void main(String args[])
    {
        int arr[] = {-1,-3,-2};
        int result = kadane(arr);
        System.out.println("Maximum sum = " + result);
    }
    public static int kadane(int arr[])
    {
        //if arr contains only negative numbers, return the smallest negative number
        if (NegcontainsOnlyNegative(arr) == true)
            return findSmallestNegative(arr);
        
        else{
        int ms = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value.
        int cs = 0; // Initialize currentSum to 0, which will hold the current subarray sum.
        for(int i = 0;i<arr.length;i++)
        {
            cs += arr[i];
            if (cs<0)   // If currentSum becomes negative, reset it to 0.
                cs = 0;
            ms = Math.max(ms, cs); // Update maxSum if currentSum is greater than maxSum.
        }
        return ms;
    }
    }
    public static boolean NegcontainsOnlyNegative(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                return false; // If any element is non-negative, return false.
            }
        }
        return true; // All elements are negative.
    }
    public static int findSmallestNegative(int arr[]) {
        int smallest = Integer.MIN_VALUE; // Initialize smallest to the smallest possible integer value.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest) {
                smallest = arr[i]; // Update smallest if a smaller negative number is found.
            }
        }
        return smallest; // Return the smallest negative number found in the array.
    }
}
