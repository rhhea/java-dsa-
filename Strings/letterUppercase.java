package Strings;

public class letterUppercase {
    public static void main(String[] args) {
        String str = "hey, i am rhhea";
        System.out.println("Result is : "+upper(str));
    }
    public static String upper(String str)
    {
        StringBuilder res = new StringBuilder("");
        //first letter is always upperrcase
        res.append(Character.toUpperCase(str.charAt(0)));
        //loop through the string
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){ //if space is found and not at the end
                res.append(str.charAt(i)); //append space 
                i++;
                res.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                res.append(str.charAt(i));
        }
        return res.toString();
    }
}
