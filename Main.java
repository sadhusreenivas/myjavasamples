
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner keyIn=new Scanner(System.in);
        int sum=0;

        System.out.println("Enter a number");
        int number=keyIn.nextInt();
    
        while(number!=0){ // 0 is sentinel valau

        sum=sum+number;

        System.out.println("Enter a number");
        number=keyIn.nextInt();

        }

        System.out.println("Sum:"+sum);
}
}