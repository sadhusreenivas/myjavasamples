
import java.util.Scanner; // to read input from console - KB

public class MainClass{

	public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in); // biulding a scanner object

    System.out.println("How many rows and cols:");
    int rows=s.nextInt(); // reading integers
    int cols=s.nextInt();
    
    int[][] A=new int[rows][cols]; // defining 2 - D array
   
    System.out.println("Enter "+(rows*cols)+" elements");

    // reading matrix elements into array
    for(int i=0;i<rows;i++){ //i for rows
    	for(int j=0;j<cols;j++){ // j for cols
    		A[i][j]=s.nextInt();
    	}
    }

 System.out.println("Matrix "+rows+" X "+cols+" elements:");// Matrix 3X4 elements
    
        for(int i=0;i<rows;i++){ //i for rows
           System.out.println(); // new line
    	   for(int j=0;j<cols;j++){ // j for cols
    		System.out.print(A[i][j]+" ");
    	}
    }
    System.out.println();// new line

	}// main
}// class



