package Strings;

public class compressstring {
    public static void main(String[] args) {
        String str = "aaabbbcccddeeef";
        System.out.println("Result is : " + compressed(str));
    }
    public static String compressed(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++)
        {
            int count = 1;
            //check for repeatition
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            //append character and count
            sb.append(str.charAt(i));
            if(count > 1)
                sb.append(count);
        }
        return sb.toString();
    }
}
