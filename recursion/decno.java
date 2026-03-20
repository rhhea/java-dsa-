package recursion;

public class decno {
    public static void main(String[] args) {
        int n=10;
        printDec(n);
        System.out.println();
        printInc(n);
    }
    public static void printDec(int n){
        if(n==1)//base condition
        {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1); // Recursive call
    }

    public static void printInc(int n){
        if(n==1)
        {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
}
