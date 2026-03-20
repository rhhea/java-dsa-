package recursion;

public class issorted {
    public static void main(String[] args) {
        int[] arr = {51, 2, 3, 4, 5};
        System.out.println("Array sorted: " + sorted(arr, 0));
    }
    public static boolean sorted(int arr[],int i)
    {
        if(i == arr.length -1)//reached end of array
              return true;
        if(arr[i]>arr[i+1]) //base condn
            return false;
        return sorted(arr,i+1);
    }
}
