public class StaticNestedDemo{
	
private static String name="Java";

static class StaticNested{

	static int age=27;
	static void msg(){
		System.out.println(name+"  "+age);
	}
} // end 

public static void main(String[] args) {
	
	StaticNestedDemo.StaticNested.msg();
	
}

}