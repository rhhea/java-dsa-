package functions;

public class maxsumsubarray {
    public static void main(String args[])
    {
        int [] nums = {1,-3,2};
        int result = maxSumSubArray(nums);
        System.out.println("Maximum sum = " + result);
    }
    public static int maxSumSubArray(int nums[])
    {
        int maxs = Integer.MIN_VALUE;
        int curs;
        for(int i =0;i<nums.length;i++) //This loop chooses the starting index of the subarray.
        {
            int start = i;
            for(int j = i;j<nums.length;j++)//This loop chooses the ending index of the subarray.
                                            //Since it starts from i, it ensures the subarrays are contiguous.
                                            //So if i = 0:
            {                //The first subarray is from index 0 to 0, then from 0 to 1, and so on.
                int end = j;
                curs = 0;
                for(int k = start;k<=end;k++) //This loop iterates through the subarray from start to end.
                {
                    //System.out.print(nums[k] + " "); to print the subarray
                    curs += nums[k]; //Calculates the sum of the current subarray.
                }
                if(curs>maxs)
                    maxs = curs;
            }
        }
        return maxs;
    }
    
}
