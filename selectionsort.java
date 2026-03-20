/*How It Works (Step-by-Step)
1.Start at the beginning of the array.
2.Find the smallest element in the unsorted part.
3.Swap it with the first element of the unsorted part.
4.Move the boundary of the sorted part one step forward.
5.Repeat until the array is sorted. */
public class selectionsort {
    public static void main(String args[])
    {
        int[] arr = {5,4,1,3,2};
        selection(arr);
        System.out.print("Sorted array: ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selection(int arr[])
    {
        for(int i =0;i<arr.length-1;i++)//outer loop for no.pf passes
        {
            int minindx = i;//assume i as the minimum index
            //traverse through the unsorted part of the array to find the minimum element's index
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindx]) //if current element is less than the assumed minimum
                    minindx = j; //update the minimum index
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minindx];
            arr[minindx] = temp; // Swap the found minimum element with the first element of the unsorted part
        }
    }
}
