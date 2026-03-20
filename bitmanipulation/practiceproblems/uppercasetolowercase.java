package bitmanipulation.practiceproblems;

public class uppercasetolowercase {
    public static void main(String[] args) {
        for(char ch = 'A';ch<='Z';ch++)
        {
            System.out.print((char)(ch | ' '));
        }
    }
}
