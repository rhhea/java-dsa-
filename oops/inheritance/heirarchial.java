package oops.inheritance;

public class heirarchial {
    public static void main(String[] args) {
       fish f = new fish();
       f.eat(); // method from Animal class
       f.swim(); // method from fish class
       Bird b = new Bird();   
       b.eat(); // method from Animal class
       b.fly(); // method from Bird class
       Mammal m = new Mammal();
       m.eat(); // method from Animal class
       m.walk(); // method from Mammal class 
    }
}
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class fish extends Animal {
    void swim() {
        System.out.println("Fish is swimming");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}
