class Parent{
private String secret; // inherited
protected String car;
protected double amount;
public String house;

public void setSecret(String sec){
secret=sec;
}
public void getSecret(){
	System.out.println(secret);
}
public void setParent(String c, double amt,String h){
car=c;
amount=amt;
house=h;
}

public void getParent(){
	System.out.println(car+" "+amount+" "+house);
}

} 

public class Child extends Parent{
	private String flat;
	private double deposits;
    // car, amount and house - parent
 
    void setChild(String f, double d){
    	flat=f;
    	deposits=d;
    }

    void getChild(){
    	System.out.println(flat+" "+deposits);
    }

	public static void main(String[] args) {
	
	Child c1=new Child();
	c1.setParent("Maruti",1234565,"ASDF");
	c1.setChild("GR",700000);

	c1.getParent();
	c1.getChild();

	}

}