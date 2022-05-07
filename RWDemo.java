import java.io.*;

public class RWDemo{
	
	public static void main(String[] args) throws Exception{

		FileReader fr=new FileReader("RWDemo.java");
		BufferedReader br=new BufferedReader(fr);

		BufferedWriter bw=new BufferedWriter(new FileWriter("rw.txt"));

        String line=br.readLine();

        while(line!=null){
        	bw.write(line);
        	System.out.println(line);
        	line=br.readLine();
        }

		br.close();
		bw.close();
	}
}