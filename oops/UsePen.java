package oops;
//classes and objects
public class UsePen {
    public static void main(String[] args) {
        //creating obj reference
        Pen p;
        p = new Pen(); //creating object
        System.out.println("Pen's default color and tip size is "+p.getColor()+p.getTip());
        //setting values
        p.setColor("Blue");
        System.out.println("Color of pen is: " + p.getColor());
        p.setTip(5);
        System.out.println("Tip of pen is: " + p.getTip());
        //other way to assing values without calling methods
        p.setColor("Red");
        System.out.println("Color of pen is: " + p.getColor());
    }
}
class Pen{
    private String color;
    private int tip;
    //constructor
    Pen(){
        this.color = "Black"; //default color
        this.tip = 0; //default tip size
    }
    //setter methods
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
    //getter methods
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
