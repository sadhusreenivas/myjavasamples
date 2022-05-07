public class Outer{ // public ( default)
	
	private String name="Java";
    
    class Inner{  // private , protected, static
    int age=27;

    void msg(){
    	System.out.println(name+" "+age);
    	disp();

    }
    } // Inner end

    void disp(){
    	System.out.println("Im outer method");
    }


    public static void main(String[] args) {
    
     Outer out=new Outer();
     Outer.Inner in=out.new Inner();
     in.msg();	
     out.disp();
    }
}