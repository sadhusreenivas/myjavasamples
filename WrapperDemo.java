import java.util.Scanner;

public class WrapperDemo{
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your favorite number");
		try{
		int n=in.nextInt();
		System.out.println(n);
        }
        catch(Throwable e){
        	System.out.println(e);
        }

		System.out.println("Enter favourite sport");
		String sport=in.next();

		System.out.println("Enter favourite sport");
		String sport1=in.next();

		System.out.println(sport+" "+sport1);
		
	}


}