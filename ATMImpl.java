abstract class ATM{  // use?
	void disp(){
		System.out.println("NCR ATM");
	}
}


public class ATMImpl extends ATM{

public static void main(String[] args) {
	
	ATM a=new ATMImpl();
	a.disp();
}
} 