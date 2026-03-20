package recursion.practicequestions;

public class num2word {
    public static void convert(int number,String digit[] )
    {
        //base case
        if( number == 0)
            return;
        //kaam
        int lastdigit = number % 10;
        System.out.print(digit[lastdigit] + " ");
        convert(number/10 , digit);
    }
    public static void main(String[] args) {
        int number = 2005;
        String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        convert(number,digit);
    }
}
