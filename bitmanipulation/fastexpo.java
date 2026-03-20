package bitmanipulation;

public class fastexpo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fastexp(n,5));
    }
    public static int fastexp(int a,int b){
        int ans = 1;//b power hai aur a base hai
        while(b > 0){
            if((b & 1) == 1){ // If the last bit of b is set
                ans *= a; // Multiply the current answer by a
            }
            a *= a; // Square a for the next iteration
            b >>= 1; // Right shift b to process the next bit
        }
        return ans;
    }
}
