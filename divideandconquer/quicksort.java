public class quicksort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,7,8};
        quickSort(arr,0,arr.length-1);
        //printing sorted array
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int arr[],int si,int ei)
    {
        //base case
        if(si>=ei)
            return;
        //choosing pivot in my case to be first
        int pivot = partition(arr,si,ei);
        quickSort(arr,si,pivot-1);
        quickSort(arr,pivot+1,ei);
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot = arr[si];
        int low = si+1;
        int high = ei;
        
        while (low <= high) {
            // move low forward while <= pivot
            while (low <= ei && arr[low] <= pivot) {
                low++;
            }
            // move high backward while > pivot
            while (high >= si && arr[high] > pivot) {
                high--;
            }

            if (low < high) {
                swap(arr, low, high);
            }
        }

        // place pivot at correct position
        swap(arr, si, high);

        return high; // pivot index
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }}
