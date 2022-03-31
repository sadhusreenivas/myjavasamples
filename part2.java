// Using while loop, write a program that finds the factorial of any integer number entered by the user. 
//(Factorial of n = 1*2*3...*n)

import java.util.Scanner;

public class Part2{

public static void main(String[] args) {

Scanner in=new Scanner(System.in);

System.out.println("Please enter an integer to finds its factorial value:");
int number=in.nextInt();

long fact=1; // this is going hold final factorial value and long is to hold large integers

int i=1; // initilization of loop variable i

while(i<=number){ // since we need to multiply fact starting from 1 to number times 

fact=fact*i;

i++; // incrementing i value till it reaches the number and when it is greater than number, exit the loop

}

System.out.println("The factorial of "+number+ "is : "+ fact);

}

}



