package india;

import hyd.*;  // A - implicit
import hyd.mnk.B;  // B - explicit

public class D 
{
	
	public static void main(String[] args){

     A a1=new A();
     a1.readPersonalInfo();
     a1.getPersonalInfo();

     B b1=new B();
     b1.setData();
     b1.getData();

     hyd.mnk.ab.C c1=new hyd.mnk.ab.C(); // C - FQN
     c1.setData();
     c1.getData();
 
	}
}