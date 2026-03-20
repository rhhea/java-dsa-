package oops.inheritance;

public class singeinheritance {
    public static void main(String[] args) {
      Dog d = new Dog();
        d.eat(); // method from Animal class
        d.bark(); // method from Dog class  
    }
}
class Animal{
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }
}
