package recursion;

public class friendspairing {
    public static void main(String args[])
    {
        System.out.println(friendpair(4));
        System.out.println(friendpair(3));
    }
    public static int friendpair(int n)
    {
        //base case
        if(n==1 || n == 2)
            return n;
        //single choice
        int single = friendpair(n-1);
        //pair choice
        int paired = (n-1) * friendpair(n-2);
        int totalways = single + paired;
        return totalways;
        //one line code would be 
        // return friendpair(n-1) + (n-1) * friendpair(n-2);
    }
}
