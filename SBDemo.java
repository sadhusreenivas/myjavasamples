class SBDemo{
	
	public static void main(String[] args) {
		
     StringBuilder sb=new StringBuilder("Java"); // default length - 20
     System.out.println(sb.capacity()); 

     sb.append(" Python");

     System.out.println(sb); // 

     System.out.println(sb.capacity()); 
     	
    

	}
}