public class ExDemo{
	public static void main(String[] args) {
		
		int a=(int) (Math.random()*5); // 0 - 4
		int b=(int) (Math.random()*5);

		System.out.println(a +" "+b);
       
       try{
		Integer c=a/b; // AE - terminates abnormally
		System.out.println(c);
        }
        catch(ArithmeticException e){
        	e.printStackTrace();
        }
        
		int d= a+b;
		int e=a*b;

		System.out.println(d+"  "+e);

	}
	
}