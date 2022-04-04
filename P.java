package mypack1;

public class P{
	private String name="ABC";

	public void sayHello(){
		System.out.println("Helloo...."+name);
	}

	public static void main(String[] args) {
		P p1=new P();
		p1.sayHello(); // Helloo ABC
	}
} 


// javac -d . P.java

// -d  . P.java  ----- P.class - mypack1


// java mypack1.P