package oops;

public class methodoverriding {
    public static void main(String[] args) {
      Deer d = new Deer();
      d.eat();//since it was deer's obj uska method hi call hua naaki animal ka  
    }
}
class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}
class Deer extends Animal{
    void eat(){
        super.eat();
        System.out.println("eat grass");
    }
}

