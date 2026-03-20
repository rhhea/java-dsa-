package practicequestions;
//majority element is the element that appears in the array MORE than n/2 times 
public class majorityelement {
    //let us first understand through the brute force approach
    public static int bruteForce(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int count = 0;
            for(int j = 0;j < arr.length ; j++)
             {    if(arr[i] == arr[j])
                        count++;
             }
             if(count > arr.length/2)
                return arr[i];
        }
        return -1;
    }
    //using moore's voting algorithm 
    public static int Moore(int arr[])
    {
        return -1; //not found case
    }
    //using divide and conquer 
    public static int meDQ(int arr[],int low,int high)
    {
        //base case : there is only one element  in the array
        if(low == high)
            return arr[low];
        //recurse on left and right halves of the array
        int mid = low + (high - low)/2;
        int left = meDQ(arr,low,mid);
        int right = meDQ(arr,mid+1,high);

        //if both halves return the same elemnent return
        if(left == right)
            return left;
        //otherwise count each element and return the one which occurs more
        int leftCount = countRange(arr,left,low,high);
        int rightCount = countRange(arr,right,low,high);

        return (leftCount > rightCount) ? left : right;
    }
    public static int countRange(int arr[],int num,int low,int high)
    {
        int count =  0;
        for(int i = low;i<=high;i++)
        {
            if(arr[i] == num)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(bruteForce(arr));
        System.out.println(meDQ(arr,0,arr.length-1));
    }
}
