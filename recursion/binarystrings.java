package recursion;

public class binarystrings {
    public static void main(String args[]){
        int n=3;
        printbin(n,new StringBuilder(""),1);
    }
    public static void printbin(int n,StringBuilder str,int lastplace){
        //base case
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        //kaam
        printbin(n-1,  new StringBuilder(str).append("0"), 0); //new kyuki new string banani hai
                        // str.append means previous sequence mei hi voh add kar rha hai 
        if(lastplace == 1){
        printbin(n-1,  new StringBuilder(str).append("1"), 1);
        }
    }
    
}
