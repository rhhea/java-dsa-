package Strings.practiceproblems;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are the two strings anagrams? " + areAnagrams(str1, str2));
    }
    public static boolean areAnagrams(String str1,String str2){
        //first check if the lengths are equal
        if(str1.length() != str2.length()){
            return false;
        }
        //convert them to lowercasee
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //sort the characters string cannot be sorted using 
        //inbuilt() in java so convert the strings into 
        //character arrays and then apply sorting fn
        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //compare the sorted arrays
        return Arrays.equals(arr1,arr2);
    }
}
