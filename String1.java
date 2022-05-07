import java.util.Scanner;

class String1{
	
	public static void main(String[] args) {
		
		// read a char from user;  hint: use charAt()
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a character");
	
		System.out.println(in.next().charAt(0));

	}
}