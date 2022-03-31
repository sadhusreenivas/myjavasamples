import java.util.Scanner; // import

public class ArrayDemo{
	
	public static void main(String[] args) {
    
        Scanner in=new Scanner(System.in);

        int[] marks=new int[7]; 
        System.out.println(" Size of marks array: "+marks.length); 

        System.out.println("Enter 7 marks:");

        for(int i=0;i<marks.length;i++)
        marks[i]=in.nextInt(); // marks[0], marks[1]......marks[6]
       
       int sum=0; // to find sum

       for(int i=0;i<marks.length;i++){
       	sum=sum+marks[i]; //
       }
      
       System.out.println("SUM: "+sum);

       double avg=sum/marks.length;
       
       System.out.println("Average: "+avg);
             
        


	}
}


