public class ArrayEx{
	
	public static void main(String[] args) {
		double x=Math.random();
	try{
		int[] arr=new int[7];
		arr[1]=10;
		arr[5]=20;
		//arr[7]=30;
        System.out.println(arr[1]/x+" "+arr[5]+" "+arr[0]);
       
        System.out.println("going to next try");

		String name= "QWERTY";
		name= null;
		System.out.println(name.length());
     	}

     	catch(NullPointerException e){
     		System.out.println(e);
     	}

     	catch(ArithmeticException e){
     		System.out.println(e);
     	}
     	catch(Exception e){
     		System.out.println(e);
     	}



       System.out.println("Rest of the code follows........");
	}
}