package oops;

public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.setColor("brown");
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();    
        c.walk();
        // Animal a = new Animal(); // this will give an error because Animal is abstract and obj cannot be created pf abstract classes
    }
}
abstract class Animal {
    String color;
    Animal(){
        System.out.println("Animal constructor called");
        color = "white"; // default color
    }
    // abstract class can have both abstract and non-abstract methods
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk(); //it gives the child class a contract to implement this method
}
class Horse extends Animal {
    @Override
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void setColor(String c){
        color = c;
    }
}
class Chicken extends Animal {
    @Override
    void walk(){
        System.out.println("walks on 2 legs");
    }
    void setColor(String c){
        color = c;
    }
}
