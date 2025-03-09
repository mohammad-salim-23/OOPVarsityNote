class Address {
    String street;
    String city;
    String country;

    //constructor
    Address ( String street, String city, String country){
       this.street = street;
       this.city = city;
       this.country = country;
    }
    void displayAddress (){
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}
// class 2 :Person
 class Person {
    String name ;
    //Constructor
    Person (String name){
        this.name = name;
    }
    // Method to return Address object
    Address getAddress (){
        Address address = new Address("Jotorpur", "Sylhet", "Bangladesh");
        return address;
    }
    void displayInfo(){
        System.out.println("Name "+name);
    }
 }
public class ObjectParam {
     public static void main(String args[]){
        Person person1 = new Person("Salim");
        Address personAddress = person1.getAddress();

        person1.displayInfo();
        personAddress.displayAddress();
     }
}
