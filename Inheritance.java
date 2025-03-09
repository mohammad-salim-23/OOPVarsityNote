/*
 * Inheritance is a feature of Object-Oriented Programming (OOP) where a child class (subclass) acquires the properties and behaviors (variables and methods) of a parent class (superclass).

This helps in code reusability and avoiding redundancy.
 */
class Animal {
    String name;

    void eat(){
        System.out.println(name + " is eating");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println(name + " is barking");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Trump";
        myDog.eat();
        myDog.bark();
    }
}
 /*
  * Key Points About Inheritance
extends keyword → Used to inherit from a class.
Child class gets access to parent class properties
 and methods.
Encourages code reusability → No need to rewrite the 
same code.
A child class can have additional methods and properties.
Types of Inheritance: Single, Multilevel, 
Hierarchical (Java does not support multiple inheritance 
with classes).
  */
