class Person {
    String name;

    Person(String name){
        this.name = name;
    }
    //Override toString() method
    @Override
     public String toString(){
          return "Peron Name: "+name ;
    
    }
  @Override
  public boolean equals (Object obj){
    if(this == obj) return true; // jodi eki refference hoy
    if( obj == null || getClass() != obj.getClass()){
        return false;
    }
    Person person = (Person) obj;
    return this.name.equals(person.name);
  }
  @Override
  public int hashCode(){
    return  name.hashCode();
  }
}
public class ObjectClass {
     public static void main(String[] args) {
         Person p1 = new Person("Salim");
         Person p2 = new Person("alim");
         Person p3 = new Person("dalim");

         System.out.println(p1);
         System.out.println(p3.toString());


         System.out.println(p1.equals(p2));
         System.out.println(p1.equals(p3));

         System.out.println(p1.hashCode()); // "Salim" এর হ্যাশকোড
         System.out.println(p2.hashCode()); 
     }
}
