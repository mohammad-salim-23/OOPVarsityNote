/*
 * What is an Interface in Java?
An interface in Java is a blueprint that contains abstract methods (methods without a body) and constants (public static final variables). It is used to achieve full abstraction and multiple inheritance in Java.
 */
/*
 *  Key Features of an Interface
✔ All methods are abstract by default (before Java 8).
✔ Cannot have constructors (because you cannot create objects of an interface).
✔ A class implements an interface using the implements keyword.
✔ Supports multiple inheritance (a class can implement multiple interfaces).
 */
interface  Animal {
    static int ans = 2;
    void makeSound();  //Abstract method (no body)

    // Default method 
    default  void sleep() {
        System.out.println ("Sleeping...");
    }
    // static method (introduced in java 8)
    static void info() {
        System.out.println("Animals are living beings.");
    }
}
 
class Dog implements Animal {
    @Override
    public  void makeSound() {
        System.out.println("Woof Woof !");
    }
}
public class Interface {
    public static void main(String[] args) {
         // creating an object of Dog
     Dog myDog = new Dog();
     myDog.makeSound();// Woof Woof!
     myDog.sleep(); //sleeping
     Animal.info();
    }
}
