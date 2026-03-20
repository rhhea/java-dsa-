public class trappedrainwater 
{
    public static void main(String args[])
    {
        int tw = 0; // Total water trapped
        int wl ; // Water level
        int width = 1; // Width of each bar, assuming uniform width
        // Example input: heights of the bars
        int[] height = {4,2,0,3,2,5};
        //calculate left max and right max boundary
        int [] leftmax = new int[height.length];
        int [] rightmax = new int[height.length];
        for(int i = 0;i<height.length;i++)
        {
            if(i==0)
            {leftmax[i] = height[i];}
            else
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }
        //calculating right max auxiliary array
        for(int i = height.length-1;i>=0;i--)
        {
            if(i == height.length -1)
            rightmax[i] = height[i];
            else
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }
        for(int i =0;i<height.length;i++)
        {
            // Water level is the minimum of left max and right max
            wl = Math.min(leftmax[i],rightmax[i]);
            // Water trapped at current index is water level minus height at that index
            tw += (wl-height[i])*width;
        }
        System.out.println("Total water trapped: " + tw);
    }
}
