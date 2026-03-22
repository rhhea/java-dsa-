package arrays;
public class arraysspract {
    public static void main(String[] args) {
        int arr[] = {2,5,69,1,3,27};
        System.out.println(linearsearch(arr,39));
        System.out.println(binsearch(arr,2));
    }
    public static int linearsearch(int arr[],int key)
    {
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static int binsearch(int arr[],int key)
    {
        int si = 0 ,ei = arr.length -1;
        while(si<=ei)
        {
            int mid = si+ (ei-si)/2;
            if(arr[mid] == key)
                return mid;
            else if(arr[mid]>key)
                ei = mid -1;
            else
                si = mid +1;
        }
        return -1;
    }
}
