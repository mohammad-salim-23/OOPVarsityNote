/*Method Overriding (Simple Explanation)
Method Overriding occurs when a subclass (child class) provides a specific implementation of a method that is already defined in its parent class. The method in the child class must have:
✔ Same name
✔ Same parameters
✔ Different implementation

 */
class Animal {
    void makeSound(){
        System.out.println("Some animals make a sound");
    }
}
// Child class (overrides makeSound() method)
 class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks : Woof Woof!");
    }
 }
public class OverRiding {
     public static void main(String[] args) {
          Animal myAnimal = new Animal();
          myAnimal.makeSound();

          Animal myDog = new Dog();
          myDog.makeSound();
     }
}

