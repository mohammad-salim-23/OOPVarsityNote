// An inner class is a class that is declared inside another class. It helps in grouping related classes and provides better encapsulation.
class Outer {
    private String message = "Hello from Outer Class";
    static String message2 = "Static variable message";
    //Regular Inner Class
     class Inner{
        void display () {
            System.out.println(message);
        }
     }
     static class Innner {
        void display(){
            System.out.println(message2);
        }
     }
}
public class InnerClass {
    public static void main(String[] args) {
        //non-static hole
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // creating inner class object
        inner.display();
        //static hole
        Outer.Innner inr  = new Outer.Innner(); //No need for Outer class object
        inr.display();
    }
}
