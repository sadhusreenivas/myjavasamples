public class Book {
String name; // instance
int pages; // instance

public Book(String name, int pages){  // constructing object by taking data using local variables
 this.name=name;
 this.pages=pages;
}

//getter method
void getBook() {
    System.out.println(name+ "\t" + pages);       
   }

public static void main(String[] args) {

        Book b1=new Book("Java",350); // parameterized cons
        Book b2=new Book("C++",250); //  parameterized cons
        
        b1.getBook();
        b2.getBook();
        
       }
}