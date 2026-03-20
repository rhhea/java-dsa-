package bitmanipulation.practiceproblems;

public class swap {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        // Swapping using bitwise XOR
        a = a ^ b; // Step 1: a now holds the XOR of a and b
        b = a ^ b; // Step 2: b now holds the original value of a
        a = a ^ b; // Step 3: a now holds the original value of b
        System.out.println("After swap: a = " + a + ", b = " + b );
    }
    
}
