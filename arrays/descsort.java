package arrays;
public class descsort {
    public static void main(String args[])
    {
        int[] arr = {4,5,8,9,4,2,1,3,6,7};
        insertion(arr);
    }
    public static void printarr(int arr[])
    {
        System.out.print("Sorted array in descending order: ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void bubble(int arr[])
    {
        for(int i =0;i<arr.length-1;i++)//outer loop for no.of passses
        {
            for(int j = 0;j<arr.length-1-i;j++)//inner loop for adjacent comparison
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printarr(arr);
    }
    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)//outer loop for no.of passes
        {
            int maxindex = i;
            for(int j = i;j<arr.length;j++)//inner loop for finding max index
            {
                if(arr[j]>arr[maxindex])
                    maxindex = j;
            }
            // Swap the found maximum element with the first element
            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
        }
        printarr(arr);
    }
    public static void insertion(int arr[])
    {
        for(int i =1;i<arr.length;i++)//outer loop for no.of passes
        {
            int key = arr[i];
            int j = i-1;
            // Shift elements of arr[0..i-1], that are smaller than key,
            while(j>=0 && arr[j]<key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; // Insert the key at its correct position
        }
        printarr(arr);
    }
    public static void counting(int arr[])
    {
        int largestno = Integer.MIN_VALUE;
        // Finding the largest number
        for(int i = 0;i<arr.length;i++)
        largestno = Math.max(largestno,arr[i]);
        // Calculating frequency of each element in count array
        int count[] = new int[largestno+1];
        for(int i = 0;i<arr.length;i++)
        count[arr[i]]++;
        // Actual sorting
        int j = 0;
        for(int i = count.length-1;i>=0;i--)
        {
            while(count[i]>0)//while the count of the current element is greater than 0
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        printarr(arr);
    }
}

