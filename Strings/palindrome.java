package Strings;

public class palindrome {
    public static void main(String[] args) {
        String str = "rhhea";
        int flag = 1; // 1 for palindrome, 0 for not palindrome
        for(int i=0,j=str.length()-1; i<j ; i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

    }
    
}
