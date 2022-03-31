import java.util.Scanner;

public class Conditional{
	
public static void main(String[] args) {
	
Scanner in=new Scanner(System.in);

System.out.println("Enetr three nos");
int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();

int big=(a>b && a>c)?a:(b>c?b:c);

System.out.println("Big: "+big);


}

}