public class arrayoccurences {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,1,1};
        boolean res = false;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    res = true;
                    System.out.println("Element " + arr[i] + " occurs more than once.");
                    break; // Exit inner loop if a duplicate is found
                }
            }
            if(res) break; // Exit outer loop if a duplicate is found
        }
    }
    
}
