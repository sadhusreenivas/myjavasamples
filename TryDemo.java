/**
@author Sadhu Sreenivas
@version first
*to illustrate try with resources

*/
import java.io.*;
public class TryDemo {
public static void main(String[] args) throws IOException {
try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){ 
System.out.println("Enter Name:");
String name= br.readLine();
System.out.println("Hi "+name);
} }
}