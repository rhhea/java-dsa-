package recursion;

public class lastoccur {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        int key = 3;
        System.out.println("Last occurrence of " + key + " is at index: " + lastOccurrence(arr, key, 0));
    }
    public static int lastOccurrence(int arr[],int key,int index)
    {
        if(index == arr.length)//base condition
            return -1;
        int res = lastOccurrence(arr, key, index + 1); // recursive call
        if (res != -1)
            return res;
        if(arr[index] == key ) // check if current index is the last occurrence
            return index;
        return -1;
    }
}
