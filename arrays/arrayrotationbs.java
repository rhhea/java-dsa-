
public class arrayrotationbs {
    public static void main(String args[])
    {
        int[] nums = {4,5,6,7,0,1,2};//the sorted array has been rotated so now find if it is present or not using bs
        //bs requires sorted array but after rotation it is not sorted
        //so we will use modified binary search
        int target = 0;
        System.out.println("Element found at index "+search(nums,target));
    }
    public static int search(int nums[],int target)
    {
        int low = 0;
        int high = nums.length -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]==target)
                 return mid;
            else if(nums[low]<=nums[mid])//left side is sorted
            {
                if(target>=nums[low] && target<nums[mid])//target lies in the left side
                {
                    high = mid - 1;
                }
                else//target lies in the right side
                {
                    low = mid + 1;
                }
            }
            else//right side is sorted
            {
                if(target>nums[mid] && target<=nums[high])//target lies in the right side
                {
                    low = mid + 1;
                }
                else//target lies in the left side
                {
                    high = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }
}
