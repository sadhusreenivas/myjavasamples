public class TechEmp extends Emp{
	
// all the non - private memebrs are available - here (eid, name, basicPay)
int bonus;
public TechEmp(int eid, String name, double basicPay, int bonus){
// invoke parent class class - cons
	super(eid,name,basicPay); // 
	this.bonus=bonus;
}

@Override // inform compiler that tis is a parent method ...is been re-defined
public void calSalary(){  // re - defined - overriding  - 
double da=34;
double hra=30;
double ta=8;
double pf=12.5;

double sal=basicPay+(basicPay*da)/100+(basicPay*hra)/100+(basicPay*ta)/100+(basicPay*pf)/100+bonus;
System.out.println("Salary is: "+sal); // printf

}
@Override
void getEmp(){
System.out.println("EID: "+eid+"\nName: "+name+"\nBasic Pay: "+basicPay+"\nCompany: "+org+"\nBonus: "+bonus);
}
	public static void main(String[] args) {
		
		TechEmp te1=new TechEmp(321,"qwerty",100000,15000);
		te1.getEmp();
		te1.calSalary(); // overriden method will be called
		
	}

}