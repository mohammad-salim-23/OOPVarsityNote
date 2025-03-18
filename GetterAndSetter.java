class Person{
    private String name;
    private int age;

    //constructor
    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    //Getter Method
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //Setter Method
    public void setName(String name){
        this.name = name;
    }
    public void setAge (int age){
       if(age > 0){
        this.age = age;
       }
    }
}
public class GetterAndSetter{
    public static void main(String[] args) {
        
        Person person = new Person("Salim", 24);

        //getter diye date read kora
        System.out.println(person.getName());

        person.setName("mohammad salim");
        
        System.out.println(person.getName());
    }
}