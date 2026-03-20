package recursion.practicequestions;

//here i have to find the number of ways or the number of substrings
// that can be formed from a given string
public class contiguoussubstring {
    public static int subst(String str,int si,int ei,int n) //here n is the length of the string
    {
        //base case
       if(n == 1)
            return n;
        if(n <=0)
            return 0;
        //kaam
        int res = subst(str,si+1,ei,n-1) + subst(str,si,ei-1,n-1) - subst(str,si+1,ei-1,n-2);
        //ensuring the starting and ending char is same i.e. for substring a and aa
        if(str.charAt(si) == str.charAt(ei))
            res++;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(subst("abaca",0,4,5));
    }
    
}
