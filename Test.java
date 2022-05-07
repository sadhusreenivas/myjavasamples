import java.io.*;

class Test{
public static void main(String[] args) throws IOException {
	
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter name");
String name=br.readLine(); // IOException
System.out.println("Enter age");

try{
int age=Integer.parseInt(br.readLine()); // "27" -- 27
System.out.println(age);
}
catch(ArithmeticException e){
	System.err.println(e);
}
finally{ // always gets executed
	System.out.println("Closing resources");
    br.close();
}
System.out.println(name);
System.out.println("Rest of the code!!!!");


}
  }



