public class mergesort {
    public static void main(String args[]){
        int arr[] = {12,6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        //printing sorted array
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si >= ei)
            return;
        //calculating mid
        int mid = si + (ei - si) /2;
        mergeSort(arr,si,mid); //left tree
        mergeSort(arr, mid + 1, ei); //right tree
        merge(arr,si,mid,ei); //merging
    }
    public static void merge(int arr[],int si,int mid,int ei)
    {
        //creating temp array
        int temp [] = new int[ei-si + 1];
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; //for traversing inside temp array
        while(i <= mid && j<= ei)
        {
            if(arr[i] < arr[j]) //right bada hai toh append left
            {
                temp[k] = arr[i];
                k++;
                i++;
            }
            else{
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        //for remaining elements in left part 
        while(i <= mid)
            temp[k++] = arr[i++];
        //for remaining elements in right part
        while(j <= ei)  
            temp[k++] = arr[j++];
        //copying elements from temp to original array
        for(k = 0 , i = si; k < temp.length ; k++, i++)
             arr[i] = temp[k];
    }
}
