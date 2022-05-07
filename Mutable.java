class Mutable{
	
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.append(" Java");
		System.out.println(sb1);

		StringBuilder sb2=new StringBuilder("Welcome");
		sb2.append(" Java");
		System.out.println(sb2);
	}
}