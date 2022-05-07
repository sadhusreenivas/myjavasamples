import java.io.*;

public class FWDemo{
	
	public static void main(String[] args) throws Exception{
		
		File f=new File("abc.txt");
		FileWriter fw=new FileWriter(f,true); // true - append 
 
		String s="\nJava is my favourite language";
        int i=12345;
		fw.write(s);
		fw.write("\nMy roll no is: "+i);
		

		fw.close();

		System.out.println("File written sucessfully");
	}
}