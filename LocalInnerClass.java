class Outer {
    void outerMethod() {
        class Inner {
            void display() {
                System.out.println("Hello from Local Inner Class");
            }
        }
        Inner inner = new Inner();
        inner.display();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        new Outer().outerMethod();
    }
}
