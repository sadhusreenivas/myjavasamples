import java.io.*;

public class RWStream{
	public static void main(String[] args) throws Exception{


        FileInputStream fis = new FileInputStream("RWStream.java");  // read

		FileOutputStream fos = new FileOutputStream("xyz.txt",true); // write
        BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		int i;

		while((i=fis.read())!=-1){
			System.out.print((char)i);
			bos.write((byte)i);
		}

		String s="Java is OOP language";
		byte[] b=s.getBytes();
		bos.write(b);


		bos.close();
		fis.close();

	}
}