package backtracking;

public class findpermutation {
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findper(str,ans);
    }
    public static void findper(String str,String ans)
    {
        //base case
        if(str.length() == 0 )
        {
            System.out.print(ans + " ");
            return;
        }
        //recursion call 
        for(int i = 0;i<str.length();i++)
        {
            //take the letter
            char c = str.charAt(i);
            //remove that letter first and then add it to answer
            //to remove use substring ie "abcd" -> "ab" + "d" = "abd"
            String newstr = str.substring(0, i) + str.substring(i+1);
            findper(newstr,ans+c);
        }
    }
}
