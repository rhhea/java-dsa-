package recursion.practicequestions;

public class lengthofstring {
    public static int length(String str)
    {
        //base case
        if(str.length() == 0)
            return 0;
        //kaam
        return length(str.substring(1))+1; //ek character kam ho gaya isiliye +1
    }
    public static void main(String[] args) {
        System.out.println(length("rhhea")); //4
    }
}
