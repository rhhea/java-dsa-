public class countingsort {
    public static void main(String args[])
    {
        int[] arr = {4,5,8,9,4,2,1,3,6,7};
        countinggsort(arr);
        System.out.print("Sorted array: ");
        for(int i=0;i<arr.length;i++)
        System.out.print(" "+arr[i]+" ");
    }
    public static void countinggsort(int arr[])
    {
        int largestno = Integer.MIN_VALUE;
        //finding largest number
        for(int i =0;i<arr.length;i++)
        {
            largestno = Math.max(largestno,arr[i]);
        }
        //calculating freq of each element in count array
        int[] count = new int[largestno+1];
        for(int i=0;i<arr.length;i++)
            count[arr[i]]++;
        //actual sorting
        int j = 0;
        for(int i = 0;i<count.length;i++)
        {
            while(count[i]>0) //while the count of the current element is greater than 0
            {
                arr[j] = i; //place the element in the original array
                j++; //move to the next position in the original array
                count[i]--; //decrease the count of the current element
            }
        }
    }
}
