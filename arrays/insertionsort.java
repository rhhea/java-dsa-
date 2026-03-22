 /*How It Works
1.Start from the second element (index 1), since the first element is trivially sorted.
2.Compare it with the elements before it.
3.Shift all larger elements one position to the right.
4.Insert the current element into the correct position.
5.Repeat for all elements.
*/
public class insertionsort {
    public static void main(String args[])
    {
        int[] arr = {2,4,9,1,6,70};
        insertion(arr);
        System.out.print("Sorted array: ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertion(int arr[])
    {
        for(int i = 1;i<arr.length;i++)//outer loop for no.of passes
        {
            int key = arr[i];
            int j = i-1;// Start comparing with the previous elements
            // Shift elements of arr[0..i-1], that are greater than key,
            while(j>=0 && arr[j]>key) // Ensure j does not go out of bounds
            {
                arr[j + 1] = arr[j]; // Shift the larger element to the right
                j--; // Move to the previous element
            }
            arr[j + 1] = key; // Insert the key at its correct position
            // After the inner loop, the key is placed in its correct position
        }
    }
}
