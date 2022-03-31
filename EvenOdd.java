import java.util.Scanner;

public class EvenOdd{

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    int[][] x=new int[3][3];

    for(int i=0;i<3;i++){

    	for(int j=0;j<3;j++)
    		x[i][j]=sc.nextInt();
}

for(int i=0;i<3;i++){
System.out.println();
    	for(int j=0;j<3;j++)
    	System.out.print(x[i][j]+" ");
	}
}

}

