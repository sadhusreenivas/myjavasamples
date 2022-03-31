import java.util.Scanner;
public class SalesJunk
{
public static void main(String[] args) {
// get a sales amount from the user using a Scanner object
Scanner in=new Scanner(System.in);
System.out.println("Enter Sales Amount:");
double salesAmount=in.nextDouble();

// get a commission rate from the user (e.g. 5 for 5%)
System.out.println("Enter Commission rate in %:");
int commissionRate=in.nextInt();

// calculate and display (on the console) the amount of commission the
// sales person should be paid (sales * comm) - format to 2 decimal places
double amountOfCommission=salesAmount*commissionRate/100;

System.out.printf("Amount of Commission for the Sales Person: $ %.2f\n",amountOfCommission);
}
}