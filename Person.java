//import java.lang.*; // by default 

import java.util.Scanner; // read from console - KB

public class Person{
    // data part
	String name; // referene varaible - instance - object
	private int age; //primitive - instance - object
    private static String country="India"; // reference - class variables
    
   // methods part
   public void setPerson(){ 
   Scanner in=new Scanner(System.in);// create scanner object in
   System.out.println("Enter name and age of person");
   name=in.next(); // read string 
   age=in.nextInt();// read integers
   }

  public void getPerson(){
  	System.out.println(name+"  "+age+" "+country);
  }

  public static void main(String[] args) { // JVM - start execution
  	// creating 5 objects
    
    Person[] p=new Person[2]; // creating array of 5 persons;

    for(int i=0;i<p.length;i++){
      p[i]=new Person(); // create object - new - Person()
      p[i].setPerson();
      p[i].getPerson();
    }
   
  }

}