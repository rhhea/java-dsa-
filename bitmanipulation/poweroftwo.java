package bitmanipulation;

public class poweroftwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
        //Using bitwise operator to check if a number is a power of two
    }
    public static boolean isPowerOfTwo(int n){
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
