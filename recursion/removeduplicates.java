package recursion;

public class removeduplicates {
    public static void main(String args[])
    {
        String str = "rhhea";
        StringBuilder newstr = new StringBuilder("");
        boolean map[] = new boolean[26]; //for 26 characters
        removeduplicate(str, 0, newstr, map);
    }
    public static void removeduplicate(String str,int index, StringBuilder newstr, boolean map[])
    {
        //base condition
        if(str.length() == index)
        {
            System.out.println(newstr);
            return;
        }
        //kaam
        char curentchar = str.charAt(index);
        if(map[curentchar - 'a'] == true) //already present inside map array
        {
            removeduplicate(str, index+1 , newstr, map);
        }
        else {
            map[curentchar - 'a'] = true;
            removeduplicate(str, index+1, newstr.append(curentchar), map);
        }
    }
}
