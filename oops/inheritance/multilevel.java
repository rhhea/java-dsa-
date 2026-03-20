package oops.inheritance;

public class multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat(); // method from Animal class
        p.legs(); // method from Mammal class
        p.bark(); // method from Dog class
        p.weep(); // method from Puppy class
        
    }
}
class Animal{
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Mammal extends Animal {
    void legs() {
        System.out.println("Mammal has legs");
    }
}
class Dog extends Mammal {
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping");
    }
}
