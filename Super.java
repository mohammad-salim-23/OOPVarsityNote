class Animal{
    String name;

    //constructor of animal class
     Animal( String name) {
        this.name = name;
         System.err.println("Name :"+ name);
    }

    void makeSound() {
        System.out.println(name + "makes a sound...");
    }
    
}
class Dog extends Animal{

    Dog(String name){
        super(name);
        System.out.println("Dog contructor: "+name);
    }
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println(name + " says : ভউ ভউ... ");
    }

}
public class Super {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tommy");
        myDog.makeSound();
    }
}
