package recursion;

public class power {
    public static void main(String[] args) {
        System.out.println("Power of 2 raised to 3 is: " + powerOf(2, 3));
    }
    public static int powerOf(int base,int power)
    {
        if(power == 0)
            return 1;
        return base * powerOf(base,power-1);
    }
}
