package bitmanipulation;

public class countsetbits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countset(n));
    }
    public static int countset(int n){
        int count = 0;
        while(n>0)
        {
            //calculate lsb if its 1 add 1 to count else countinue
            if((n&1)==1)
              count += 1;
            n = n >> 1;
        }
        return count;
    }
}
