/*
Using loop statement write a program that prompts the user to enter 5 integer values: 
i. Find and display the Largest and Smallest number
ii. Display whether the number is Even or Odd
iii. Display whether the number is negative, positive or zero
iv. Calculate the Sum and Average of the Even numbers
*/

import java.util.Scanner; // importing Scanner 

public class Part1{

public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);  // creating a Scanner object to read input values

    System.out.println("Please enter 5 integer values");
    int i;
    int number;
    int sum=0;
    double average;
    int count=0; // counting number of Even numbers 
    int largest=0,smallest=0;

    for(i=1;i<=5;i++){  // for loop iterates for 5 times 

     number=in.nextInt(); // reading 5 numbers one after other in the loop

    // (i) finding largest and smallest number
 
       if(i==1){  // the largest and smallest are initilized with number only once 
       largest=number;
       smallest=number;
       }

       if(number>largest)   // to find largest number every time
       	largest=number; 

       if(number<smallest)  // to find smallest number every time
       	smallest=number;

    // (ii) checking whether number is Even or Odd

    if(number%2==0){
    	System.out.println(number+" is Even"); // displaying Even number
    	// (iv) calculate sum and average
    	count++; // keep track of number of even numbers
        sum=sum+number;

        if(number==0)
        	count--; // eliminating zero while counting even numbers for finding the average
    }
    else{
        System.out.println(number+ " is Odd");  // displaying od number
    }

    // (iii) checking whether the number is negative, positive or zero

    if(number<0)
    	System.out.println(number+" is Negative");
    else if(number>0)
    	System.out.println(number+" is Positive");
    else
    	System.out.println(number+" is Zero");

    } // loop end

    System.out.println("Largest Number is: "+largest);
    System.out.println("Smallest numbers is: "+smallest);

    if(count!=0){
       System.out.println("Sum of Even numbers is: "+sum);
    // (iv) calculating average and display
       average=sum/count;
       System.out.println("Average of Even numbers is: "+ average);
    }
    else{
    	System.out.println("Sum of Even numbers is: "+sum);
    	System.out.println("Average of Even numbers is: "+sum);
    }
    
}

}