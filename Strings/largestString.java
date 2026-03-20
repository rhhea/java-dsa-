package Strings;

public class largestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","banana","mango"};
        String largest = fruits[0];
        for(int i = 1; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i])<0)//fruit[i] is greater than largest{
                largest = fruits[i];
            }
        System.out.println("Largest String is: " + largest);
    }
    }
    

