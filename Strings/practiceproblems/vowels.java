package Strings.practiceproblems;

public class vowels {
    public static void main(String[] args) {
        String str = "Rhhea";
        int count = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            c = Character.toLowerCase(c);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        System.out.println("Number of vowels in the string "+str+": " + count);
    }
    
}
