class LibaryItem {
    String title;
    String author;
    // static method to count items (simplified version)
    static int totalItems = 0;
    //constructor 
    public LibaryItem(String title, String author){
        this.title = title;
        this.author = author;
        totalItems++;
    }
    // Method to display details (Overridden in child class)
    public void displayInfo(){
        System.out.println("Title: "+title + ", Author: "+author);

    }
    // Static method to get total library items
    public static int getTotalItems (){
        return totalItems;
    }
    //Method Overloading
    public void displayInfo(boolean showCount){
        displayInfo();
        if(showCount){
            System.out.println("Total Items in Libary : "+ totalItems);
        }
    }
    public void displayInfo(String category){
        System.out.println("Category: "+ category);
        displayInfo();
    }
}
 //child class : Book (inherits LibaryItem)
 class Book extends  LibaryItem{
    private String genre;

    //constructor (using suuper)
    public Book(String title, String author, String genre){

            super(title, author);
            this.genre = genre;
        
    }
    //overriding displayInfo method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Genre: "+genre);
    }
    //Method returning an object
    public static Book createBook (Book book){
        return new Book(book.title , book.author, book.genre);
    }

    //Method accepting an object as a parameter
    public void compareBooks(Book otherBook){
      if(this.title.equals(otherBook.title) && this.author.equals(otherBook.author)){
        System.out.println("These books are the same");
      }else{
        System.out.println("These are different books.");
      }
    }

 }
public class MixedProblem1 {
    public static void main(String[] args) {
        LibaryItem item1 = new LibaryItem("Unknown Book", "Unknown author");
        System.out.println();
        System.out.println();
        item1.displayInfo(true);
        item1.displayInfo("General Catrgory");

        Book book1 = new Book("Java Basics", "John Doe", "Programming");
        book1.displayInfo();// calls overriden method

        //using return object
        Book book2 = Book.createBook(book1);
        book2.displayInfo();

        //passing object as parameter
        book1.compareBooks(book2);
        System.out.println("Total Libary Items: "+ LibaryItem.getTotalItems());
    }
}
