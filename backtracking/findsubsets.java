package backtracking;

public class findsubsets {
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findsubset(str,ans,0); 
    }
    public static void findsubset(String str,String ans,int i)
    {
        //base case
        if(i == str.length()) //saare letters ne apni choice deddi hai
        {
            System.out.print(ans + " ");
            return;
        }
        //recursion call
        //agar letter ne haa bola
        findsubset(str,ans + str.charAt(i), i +1);
        //agar letter ne na bola 
        findsubset(str,ans,i+1);
    }
}
