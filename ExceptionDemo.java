import java.util.Scanner;

public class ExceptionDemo{

public static void main(String[] args) {
	
Scanner in=new Scanner(System.in); // crearing object

System.out.println("Enter two nos:");

int x=in.nextInt();
int y=in.nextInt();

try{
int res1=x/y; // y=0  throw new java.lang.ArithmeticException(); // object
System.out.println(res1);
}
catch(ArithmeticException e){
	System.out.println(e); // handling -  notify - user -- java.lang.AE:/by zero
}
// since we handle - program will not terminate...and it continues to execute rest of the code

double res2=Math.sqrt(x);
System.out.println(res2);

}

}
// try catch



