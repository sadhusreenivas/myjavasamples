public class Customer{

	int balance=1000;
	
	void withdraw(int amt) throws InsufficientFundsException{

		if(amt>balance)
			throw new InsufficientFundsException("Funds are insufficient");
		else
			balance=balance-amt;
	}
	void disp(){
		System.out.println(balance);
    }

    public static void main(String[] args) {
    	Customer c1=new Customer();
    	int amt= (int) (Math.random()*10+992);


    	try{
    		c1.withdraw(amt);
    		c1.disp();
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
    }
}