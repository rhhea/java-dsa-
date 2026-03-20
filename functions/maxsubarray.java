package functions;
//using prefix sum method to find maximum subarray sum
// This code implements a method to find the maximum subarray sum using the prefix sum technique.
public class maxsubarray {
    public static void main(String args[])
    {
        int[] arr = {1,-3,2};
        int res = maxSubbArray(arr);
        System.out.println("Maximum subarray sum = " + res);
    }
    public static int maxSubbArray(int arr[])
    {
        int maxs = Integer.MIN_VALUE; // Initialize maxs to the smallest possible integer value.
        int curs = 0; // Initialize curs to 0, which will hold the current subarray sum.
        int[] prefix = new int[arr.length];
        //calculate prefix array
        prefix[0] = arr[0]; // Initialize the first element of the prefix array with the first element of the input array.
        for(int i = 1;i<arr.length;i++) // Loop through the input array starting from the second element.
        {
            prefix[i] = prefix[i-1] + arr[i]; // Calculate the prefix sum by adding the current element to the previous prefix sum.
        }
        for(int i =0;i<arr.length;i++)
        {
            int start = i;
            for(int j =i;j<arr.length;j++)
            {
                int end = j;
             curs = start==0 ? prefix[end] : prefix[end] - prefix[start-1]; // Calculate the current subarray sum using the prefix array.
            // If start is 0, the current subarray sum is simply the prefix sum at end.
            }
            if(curs > maxs) 
            maxs = curs;
        }
    return maxs;
            
        }
    }
