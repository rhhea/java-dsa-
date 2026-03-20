package recursion;

public class firstocc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        int key = 3;
        System.out.println("First occurrence of " + key + " is at index: " + firstOccurrence(arr, key, 0));
    }
    public static int firstOccurrence(int[] arr, int key, int index) {
        if(index == arr.length)
            return -1;
        if(arr[index] == key)
            return index;
        return firstOccurrence(arr,key,index+1);//recursive call
}
}