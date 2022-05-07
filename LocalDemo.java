public class LocalDemo{
	
	private String name="Java";

    void disp(){
    	System.out.println("Hello Java");
    }

	void display(){ // inside method - 

		class Local{
			int age=27;
			void msg(){
				System.out.println(name+" "+age);
				disp();
			}

		} // local class end

		Local l=new Local();
		l.msg();

	} // method end

	public static void main(String[] args) {
		LocalDemo ld=new LocalDemo();
		ld.display(); // Local object
	}
}