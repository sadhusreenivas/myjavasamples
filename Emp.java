public class Emp{ // parent class
protected int eid;
protected String name;
protected double basicPay;
static String org="Google";

public Emp(int eid,String name, double basicPay){  // constructor - param
	this.eid=eid;
	this.name=name;
	this.basicPay=basicPay;
}

public void calSalary(){
double da=34;
double hra=30;
double ta=8;
double pf=12.5;

double sal=basicPay+(basicPay*da)/100+(basicPay*hra)/100+(basicPay*ta)/100+(basicPay*pf)/100;
System.out.println("Salary is: "+sal); // printf

}
void getEmp(){
System.out.println("EID: "+eid+"\nName: "+name+"\nBasic Pay: "+basicPay+"\nCompany: "+org);
}

public static void main(String[] args) {
Emp e1=new Emp(111,"ABC",80000);
e1.getEmp();
e1.calSalary();

}
}