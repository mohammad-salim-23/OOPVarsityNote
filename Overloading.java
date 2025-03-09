
// Method Overloading in Java (OOP Concept)
// Method Overloading means defining multiple methods with the same name in a class but with different parameters (different number or type of parameters). The return type can be the same or different, but overloading is determined by parameters.

// Key Points:
// Methods must have the same name but different parameter lists.
// Overloading helps improve code readability and reusability.
// The compiler determines which method to call based on arguments passed.
class MathOperations {
    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b, int c){
        return a+b+c;
    }
    double add( double a , double b){
        return a+b;
    }

}
public class Overloading {
   public static void main(String args[]){
     MathOperations math = new MathOperations();
     System.out.println(math.add(4,5));
     System.out.println(math.add(4,5,1));
     System.out.println(math.add(4.5,4.5));
   }
}