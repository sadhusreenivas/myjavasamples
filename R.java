package hyd.mnk;

import mypack1.*; // implicit
import mypack1.subpack1.subsubpack.Q; // explicit

public class R{
	
	public static void main(String[] args) {
		
     P p=new P();
     p.sayHello();

     Q q=new Q();
     q.sayHi();

	}
}