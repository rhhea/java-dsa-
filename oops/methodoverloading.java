package oops;

public class methodoverloading {
    public static void main(String[] args) {
        Calc ca = new Calc();
        System.out.println(ca.sum(3,2));
        System.out.println(ca.sum(3.4f,2.5f));
        System.out.println(ca.sum(3,2,4));
    }
}
class Calc{
    int sum(int a,int b){
    return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
