package recursion.practicequestions;

public class occurences {
    public static void occur(int arr[],int target,int index)
    {   //base case
        if(index == arr.length)
            return;
        //kaam
        if(arr[index] == target) //milgaya
            {
                System.out.print(index + " ");
                occur(arr,target,index + 1);;
            }
        else {
            occur(arr,target,index + 1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int target = 2;
        occur(arr,target,0);
    }
}
