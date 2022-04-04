public class SBI implements ATM{

 public void withdraw(){ 
  System.out.println("withdraw success");
 }
 public void deposit(){
  System.out.println("deposit success");
 }
 public void transfer(){
 System.out.println("transfer success");
 }

 public void disp(){
 System.out.println("SBI ATM" + rateOfInterest);
 }

public static void main(String[] args) {
	
	ATM a=new SBI();
	a.withdraw();
	a.transfer();
	a.deposit();

	SBI s=new SBI();
	s.disp();
	
}
} 