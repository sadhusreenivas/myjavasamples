interface Printable{
	void print();
}

interface Showable extends Printable{  // Inheritance among interfaces
    void show();
}

class X implements Showable{  
 public void print(){
 System.out.println("Printing.....");
 }

 public void show(){
 System.out.println(" Showing.....");
 }

 public static void main(String[] args) {
  Showable x1=new X(); //
  x1.print();
  x1.show();

 }
}


// multiple inheritance : A B - C is not possible with classes

// multiple inheritance is possible with interfaces