import java.util.Scanner;
class Duplicate{

	public static long duplicateDigits(long n){ // method definition
   
    long m=n; // assigning n to m as n is getting changed to 0
    int countDigits=0; // to keep track of number of digits

    while (n>0){ // to count digits of number // 123 
        n=n/10;
        countDigits++; //3
    } 
    
    int[] digits=new int[2*countDigits]; // an array with double the size of digits - to accommodate duplicates
    
    int i=digits.length-1; 
    int j=digits.length/2 - 1;

    // Extracting the digits of the number and placing digits twice in appropriate array slots
     while(m>0){
     	digits[i]=(int) m%10;
        digits[j]=(int) m%10;
     	m=m/10;
     	i--;
     	j--;
     }
    
    long dupNumber=0; // its going to hold the result - duplicate digits number

    // to calculate the duplicate digits number
    for(int k=0;k<digits.length;k++){
    	dupNumber=dupNumber*10+digits[k]; // 
      	}

    return dupNumber; // returning the result back to the method
	}

	public static void main(String[] args) {
    Scanner in=new Scanner(System.in); //  to read a number 

    System.out.println("Enter a number");
    long number=in.nextInt(); // reading integer

    if(number<0) // number should be positive and less than a million
      System.out.println(number+" is not positive! Please enter a positive number");
    else if(number>1000000)
      System.out.println(number+" is greater than 1 million! Please enter a number less than 1 million");
    else
    {
    long duplicateDigitsNumber=duplicateDigits(number);// method call
    System.out.println("The duplicate digits number is:"+duplicateDigitsNumber); // printing the outcome - duplicate digits number
	}
}
}