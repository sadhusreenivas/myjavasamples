import java.io.*;

public class FRDemo{
	
	public static void main(String[] args) throws Exception{

		FileReader fr=new FileReader("abc.txt");

		int i;

		while( (i=fr.read())!=-1){
			System.out.print((char)i);

			// logic... no of lines, no of words, no of chars
		}

		// write them in separate file with ur name date etc...

		fr.close();

	}

}