/* Write a program that prompts the user to enter the total amount due for the medical visit,
 then find out if the client has paid the deductible. 
 If they have, then ask the user which type of visit the client had.
  Display the appropriate reimbursement amount percentage based on the table. 
  Write the most efficient code possible
  Doctor - 50% Hospital-80% Lab-70%
   */

import java.util.Scanner;
public class Assignp2{
	
public static void main(String[] args) {
	
	//creating Scanner object to read data from user
	Scanner in=new Scanner(System.in);

	System.out.println("Please enter total amount due for medical visit");
	double totalAmountDue=in.nextDouble();
	System.out.println("Please enter deductible paid status (type in true / false)");
    boolean deductible=in.nextBoolean();// to read boolean true or false in any case
    String typeOfVisit=null;
    int reimbursementPercentage=0;
    double reimbusementAmount=0.0;

    if(deductible){
    	//true block
    	System.out.println("Please enter the type of visit (type in Doctor / Hospital / Lab)");
        typeOfVisit=in.next();// reads a string as it is

    	if(typeOfVisit.equalsIgnoreCase("Doctor")){
    		reimbursementPercentage=50;
    		reimbusementAmount=totalAmountDue*reimbursementPercentage/100; // reimbursement percantage 50% for Doctor visit
    		System.out.printf("Total Reimbusement Amount:$ %.2f \n",reimbusementAmount);
    		System.out.println("Reimbursement Percentage: "+reimbursementPercentage+"%");
    	}

    	else if(typeOfVisit.equalsIgnoreCase("Hospital")){
    		reimbursementPercentage=80;
    		reimbusementAmount=totalAmountDue*reimbursementPercentage/100; // reimbursement percentage 80% for Hospital visit
    	    System.out.printf("Total Reimbusement Amount:$ %.2f \n",reimbusementAmount);
    		System.out.println("Reimbursement Percentage: "+reimbursementPercentage+"%");
    	}

    	else{
    		reimbursementPercentage=70;
    		reimbusementAmount=totalAmountDue*reimbursementPercentage/100; // reimbursement percentage 70% for Lab visit
            System.out.printf("Total Reimbusement Amount:$ %.2f \n",reimbusementAmount);
    		System.out.println("Reimbursement Percentage: "+reimbursementPercentage+"%");
            }
    }

    else{
        reimbursementPercentage=0;
    	reimbusementAmount=totalAmountDue; // reimbursement percentage 0% - deductible status is not met
        System.out.printf("Total Reimbusement Amount:$ %.2f \n",reimbusementAmount);
    	System.out.println("Reimbursement Percentage: "+reimbursementPercentage+"%");
       }
    
}

}