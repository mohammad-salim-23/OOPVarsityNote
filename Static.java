/*Static:
 * Key Points:

Static variables are shared across all objects of the class.
Static methods can be called without creating an object.
Static blocks are executed only once when the class is loaded.
Static methods can't access non-static variables directly.

 */
class Counter {
    static {
        System.out.println("just one time run");
    }
    static int count = 0;
    int cnt = 2;
    Counter(){
      count++;
    }

     void showCount(){
        // System.out.println(cnt); error
        System.out.println("Count: "+count);
    }
    static int add(){
        return count+count;
    }
}
public class Static {
     public static void main(String[] args) {
         Counter obj1 = new Counter();
          Counter obj2 = new Counter();
         System.out.println();
          obj2.showCount();
          System.out.println(Counter.add());
     }
}
