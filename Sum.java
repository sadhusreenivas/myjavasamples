// write a program using method to find whether a number is even or odd

import java.util.Scanner;

public class Sum{

 public static void findEvenOdd(int x){
 if(x%2==0)
 	System.out.println(x+" is Even");
 else
 	System.out.println(x+" is odd");
 }


 public static void main(String[] args) {
 	
  Scanner in=new Scanner(System.in);
  System.out.println("Enter a number");
  int n=in.nextInt(); // reading n

  findEvenOdd(n); //method
  findEvenOdd(12345); 
  findEvenOdd(322); 
  findEvenOdd(789); 
  findEvenOdd(99123); 
  
 }

}