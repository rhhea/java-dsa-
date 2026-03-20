package oops;

public class abstractionconstr {
    public static void main(String[] args) {
       Mustang m = new Mustang(); 
    }
}
abstract class Animall {
    Animall(){
        System.out.println("Animal constructor called");
    }
}
class Horsee extends Animall {
    Horsee(){
        System.out.println("horse constructor calledd");}
}
class Mustang extends Horsee{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}