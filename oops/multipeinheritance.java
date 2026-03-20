package oops;
//implementing multiple inheritance in java using interfaces
public class multipeinheritance {
    public static void main(String[] args) {
    Bear b = new Bear();
     b.eat();
    // Bear can eat both plants and meat, demonstrating multiple inheritance   
    } 
}
interface herbivore {
    void eat();
}
interface carnivore {
    void eat();
}
class Bear implements herbivore,carnivore {
    public void eat(){
        System.out.println("Bear eats plants and meat");
    }
}
