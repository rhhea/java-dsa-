package bitmanipulation;

public class getsetclearbit {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(getbit(n,2));
        System.out.println(setbit(10,2));
        System.out.println(clearbit(10,3));
        System.out.println(updatebit(10,2,1));
        System.out.println(clearlastith(10,2));
        System.out.println(clearrange(10,1,3));
        //Using bitwise operators to get, set and clear a bit at a given position
    }
    public static int getbit(int n,int i)
    {
        int bitmask = 1<<i;
        if(bitmask == 0)
            return 0;
        else
            return 1;
    }
    public static int setbit(int n,int i)
    {
        int bitmask = 1<<i;
        return n | bitmask; //(n or change)
    }
    public static int clearbit(int n,int i){
        int bitmask = 1<<i;
        return n & ~bitmask; // (n and not change)
    }
    public static int updatebit(int n,int i,int newbit){
        n = clearbit(n, i); // Clear the bit at position i
        int bitmask = newbit << i; // Create a bitmask with the new bit at position i
        return n | bitmask; // Set the new bit at position i
    }
    public static int clearlastith(int n,int i){
        int bitmask = (-1)<<i; // Create a bitmask with the last i bits set to 0
        return n & bitmask;
    }
    public static int clearrange(int n,int i,int j){
        int a = (-1) << (j + 1); // Create a bitmask with bits from j+1 to 0 set to 0
        int b = (1 << i) - 1; // Create a bitmask with bits from 0 to i-1 set to 0
        int bitmask = a | b; // Combine the two masks
        return n & bitmask; // Clear the bits in the range [i, j] i.e. original bits from j+1 and i-1 and cleared bits from i to j
    }
}
