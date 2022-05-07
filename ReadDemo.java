import java.io.Console;

public class ReadDemo{
	
	public static void main(String[] args) {

	Console br=System.console(); // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
    System.out.println("Enter username");
    String uname=br.readLine();
    System.out.println(uname);
   
    try{
    System.out.println("Enter age");
    int age=Integer.parseInt(br.readLine());
     System.out.println(age);
    }
     catch(Exception e){ System.out.println(e);
     }

     System.out.println("Enter password:");
     char[] pwd=br.readPassword();
     System.out.println(pwd);

	}
}