/*
 * An abstract class is an incomplete class, meaning it can have abstract methods that do not have a body (implementation).

🔹 Why is it used?

If we want some methods to be present in all subclasses but with different implementations, we use abstract.
It provides a guideline for other classes through inheritance.
 */
abstract class Animal {
    abstract void makeSound();

    void sleep(){
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal {
    @Override
    void makeSound(){
        System.out.println("Woof Woof!");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();// Woof Woof!
        myDog.sleep(); // sleeping...
    }
}
/*
 * 🔹 Key Points
✔ You cannot create an object of an abstract class.
✔ A subclass must complete the abstract methods.
✔ Abstract classes can have normal methods too.
 */
