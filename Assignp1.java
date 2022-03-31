/*A program at a video store calculates the cost of renting a certain number of DVD's. 
Some members have purchased a special Rewards Program membership that allows them to rent 
DVDs for only $3.59 per DVD.
For all other customers, DVD rentals are $4.99 per DVD 
unless they rent more than 4 DVDs at one time,
 in which case the cost per DVD rental is $3.99.
Write the part of the program that calculates the sub total before taxes.*/

import java.util.Scanner;

public class Assignp1{

	public static void main(String[] args) {
		
    // building or creating scanner object
	  Scanner in=new Scanner(System.in);
      System.out.println("Enter number of DVDs:");
      int numDvds=in.nextInt(); // read no of DVDs and placed in a variable numDvds

       System.out.println("Is customer in Rewards Program? Type Y/y for YES and N/n for NO");
       String rewardsMember=in.next();

       double subTotal=0.0;// initializing subTotal

       if(rewardsMember.equalsIgnoreCase("Y")){ // string comparison
       subTotal=numDvds*3.59; // rent for a DVDs for a rewards member is $3.59 
       }
       else{
        if(numDvds<=4)
        	subTotal=numDvds*4.99; //rent for a DVDs for a non-rewards member is $4.99
        else
        	subTotal=numDvds*3.99; //rent for a DVDs for a non-rewards member is $3.99 where DVDs>4
       }
       
       System.out.printf("Sub Total %.2f \n",subTotal); // after decimal point, prints 2 digits only
	}
}
