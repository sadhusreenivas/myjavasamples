package mypack1.subpack1.subsubpack;

public class Q{
	private String name="XYZ";

	 public void sayHi(){ // default - within the package
     System.out.println("Hi....."+name);
	}

public static void main(String[] args) {
	
	Q q=new Q();
	q.sayHi();
}

}