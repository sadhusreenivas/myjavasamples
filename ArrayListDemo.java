import java.util.*;

class ArrayListDemo{
	public static void main(String[] args) {
		
     ArrayList<Integer> al=new ArrayList(); // <Integer> list  - Generics

     al.add(10);
     al.add(20);
     al.add(5);
     al.add(10);
     al.add(3);
     al.add(1);

     System.out.println(al);

     Collections.sort(al); //

     Iterator itr=al.iterator(); //

     while(itr.hasNext()){
     	System.out.println(itr.next());
     }

	}
}